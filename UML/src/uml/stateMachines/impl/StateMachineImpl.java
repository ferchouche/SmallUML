/**
 */
package uml.stateMachines.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonBehavior.impl.BehaviorImpl;

import uml.stateMachines.Pseudostate;
import uml.stateMachines.Region;
import uml.stateMachines.State;
import uml.stateMachines.StateMachine;
import uml.stateMachines.StateMachinesPackage;
import uml.stateMachines.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.impl.StateMachineImpl#getExtendedStateMachine <em>Extended State Machine</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateMachineImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateMachineImpl#getSubmachineState <em>Submachine State</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateMachineImpl#getConnectionPoint <em>Connection Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
	/**
	 * The cached value of the '{@link #getExtendedStateMachine() <em>Extended State Machine</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedStateMachine()
	 * @generated
	 * @ordered
	 */
	protected EList<StateMachine> extendedStateMachine;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected EList<Region> region;

	/**
	 * The cached value of the '{@link #getSubmachineState() <em>Submachine State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> submachineState;

	/**
	 * The cached value of the '{@link #getConnectionPoint() <em>Connection Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<Pseudostate> connectionPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinesPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateMachine> getExtendedStateMachine() {
		if (extendedStateMachine == null) {
			extendedStateMachine = new EObjectResolvingEList<StateMachine>(StateMachine.class, this, StateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE);
		}
		return extendedStateMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, StateMachinesPackage.STATE_MACHINE__REGION, StateMachinesPackage.REGION__STATE_MACHINE);
		}
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getSubmachineState() {
		if (submachineState == null) {
			submachineState = new EObjectWithInverseResolvingEList<State>(State.class, this, StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachinesPackage.STATE__SUBMACHINE);
		}
		return submachineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentWithInverseEList<Pseudostate>(Pseudostate.class, this, StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT, StateMachinesPackage.PSEUDOSTATE__STATE_MACHINE);
		}
		return connectionPoint;
	}

	/**
	 * The cached invocation delegate for the '{@link #lca(uml.stateMachines.Vertex, uml.stateMachines.Vertex) <em>Lca</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lca(uml.stateMachines.Vertex, uml.stateMachines.Vertex)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LCA_VERTEX_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE_MACHINE___LCA__VERTEX_VERTEX).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Region lca(Vertex s1, Vertex s2) {
		try {
			return (Region)LCA_VERTEX_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{s1, s2}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #ancestor(uml.stateMachines.Vertex, uml.stateMachines.Vertex) <em>Ancestor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ancestor(uml.stateMachines.Vertex, uml.stateMachines.Vertex)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ANCESTOR_VERTEX_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE_MACHINE___ANCESTOR__VERTEX_VERTEX).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ancestor(Vertex s1, Vertex s2) {
		try {
			return (Boolean)ANCESTOR_VERTEX_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{s1, s2}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #lcaState(uml.stateMachines.Vertex, uml.stateMachines.Vertex) <em>Lca State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lcaState(uml.stateMachines.Vertex, uml.stateMachines.Vertex)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LCA_STATE_VERTEX_VERTEX__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE_MACHINE___LCA_STATE__VERTEX_VERTEX).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State lcaState(Vertex v1, Vertex v2) {
		try {
			return (State)LCA_STATE_VERTEX_VERTEX__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{v1, v2}));
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
			case StateMachinesPackage.STATE_MACHINE__REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
			case StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubmachineState()).basicAdd(otherEnd, msgs);
			case StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoint()).basicAdd(otherEnd, msgs);
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
			case StateMachinesPackage.STATE_MACHINE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return ((InternalEList<?>)getSubmachineState()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
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
			case StateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return getExtendedStateMachine();
			case StateMachinesPackage.STATE_MACHINE__REGION:
				return getRegion();
			case StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return getSubmachineState();
			case StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return getConnectionPoint();
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
			case StateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				getExtendedStateMachine().clear();
				getExtendedStateMachine().addAll((Collection<? extends StateMachine>)newValue);
				return;
			case StateMachinesPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
				return;
			case StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				getSubmachineState().clear();
				getSubmachineState().addAll((Collection<? extends State>)newValue);
				return;
			case StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
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
			case StateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				getExtendedStateMachine().clear();
				return;
			case StateMachinesPackage.STATE_MACHINE__REGION:
				getRegion().clear();
				return;
			case StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				getSubmachineState().clear();
				return;
			case StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				getConnectionPoint().clear();
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
			case StateMachinesPackage.STATE_MACHINE__EXTENDED_STATE_MACHINE:
				return extendedStateMachine != null && !extendedStateMachine.isEmpty();
			case StateMachinesPackage.STATE_MACHINE__REGION:
				return region != null && !region.isEmpty();
			case StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE:
				return submachineState != null && !submachineState.isEmpty();
			case StateMachinesPackage.STATE_MACHINE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
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
			case StateMachinesPackage.STATE_MACHINE___LCA__VERTEX_VERTEX:
				return lca((Vertex)arguments.get(0), (Vertex)arguments.get(1));
			case StateMachinesPackage.STATE_MACHINE___ANCESTOR__VERTEX_VERTEX:
				return ancestor((Vertex)arguments.get(0), (Vertex)arguments.get(1));
			case StateMachinesPackage.STATE_MACHINE___LCA_STATE__VERTEX_VERTEX:
				return lcaState((Vertex)arguments.get(0), (Vertex)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StateMachineImpl
