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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.RedefinableElement;

import uml.commonBehavior.Behavior;
import uml.commonBehavior.Trigger;

import uml.commonStructure.Constraint;

import uml.commonStructure.impl.NamespaceImpl;

import uml.stateMachines.ConnectionPointReference;
import uml.stateMachines.Pseudostate;
import uml.stateMachines.Region;
import uml.stateMachines.State;
import uml.stateMachines.StateMachine;
import uml.stateMachines.StateMachinesPackage;
import uml.stateMachines.Transition;
import uml.stateMachines.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.stateMachines.impl.StateImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getConnectionPoint <em>Connection Point</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getSubmachine <em>Submachine</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getDeferrableTrigger <em>Deferrable Trigger</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getDoActivity <em>Do Activity</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#isIsOrthogonal <em>Is Orthogonal</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#isIsSimple <em>Is Simple</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#isIsSubmachineState <em>Is Submachine State</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getRedefinedState <em>Redefined State</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link uml.stateMachines.impl.StateImpl#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamespaceImpl implements State {
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
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectionPointReference> connection;

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
	 * The cached value of the '{@link #getSubmachine() <em>Submachine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmachine()
	 * @generated
	 * @ordered
	 */
	protected StateMachine submachine;

	/**
	 * The cached value of the '{@link #getDeferrableTrigger() <em>Deferrable Trigger</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeferrableTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList<Trigger> deferrableTrigger;

	/**
	 * The cached value of the '{@link #getDoActivity() <em>Do Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoActivity()
	 * @generated
	 * @ordered
	 */
	protected Behavior doActivity;

	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected Behavior entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected Behavior exit;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsOrthogonal() <em>Is Orthogonal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORTHOGONAL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsSubmachineState() <em>Is Submachine State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SUBMACHINE_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getRedefinedState() <em>Redefined State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedState()
	 * @generated
	 * @ordered
	 */
	protected State redefinedState;

	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected Constraint stateInvariant;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StateMachinesPackage.Literals.STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__IS_LEAF, oldIsLeaf, isLeaf));
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
	public Region getContainer() {
		if (eContainerFeatureID() != StateMachinesPackage.STATE__CONTAINER) return null;
		return (Region)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(Region newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, StateMachinesPackage.STATE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(Region newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != StateMachinesPackage.STATE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, StateMachinesPackage.REGION__SUBVERTEX, Region.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		// TODO: implement this method to return the 'Outgoing' reference list
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
	public EList<Transition> getIncoming() {
		// TODO: implement this method to return the 'Incoming' reference list
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
	public EList<ConnectionPointReference> getConnection() {
		if (connection == null) {
			connection = new EObjectContainmentWithInverseEList<ConnectionPointReference>(ConnectionPointReference.class, this, StateMachinesPackage.STATE__CONNECTION, StateMachinesPackage.CONNECTION_POINT_REFERENCE__STATE);
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pseudostate> getConnectionPoint() {
		if (connectionPoint == null) {
			connectionPoint = new EObjectContainmentWithInverseEList<Pseudostate>(Pseudostate.class, this, StateMachinesPackage.STATE__CONNECTION_POINT, StateMachinesPackage.PSEUDOSTATE__STATE);
		}
		return connectionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine getSubmachine() {
		if (submachine != null && submachine.eIsProxy()) {
			InternalEObject oldSubmachine = (InternalEObject)submachine;
			submachine = (StateMachine)eResolveProxy(oldSubmachine);
			if (submachine != oldSubmachine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinesPackage.STATE__SUBMACHINE, oldSubmachine, submachine));
			}
		}
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateMachine basicGetSubmachine() {
		return submachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubmachine(StateMachine newSubmachine, NotificationChain msgs) {
		StateMachine oldSubmachine = submachine;
		submachine = newSubmachine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__SUBMACHINE, oldSubmachine, newSubmachine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubmachine(StateMachine newSubmachine) {
		if (newSubmachine != submachine) {
			NotificationChain msgs = null;
			if (submachine != null)
				msgs = ((InternalEObject)submachine).eInverseRemove(this, StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
			if (newSubmachine != null)
				msgs = ((InternalEObject)newSubmachine).eInverseAdd(this, StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
			msgs = basicSetSubmachine(newSubmachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__SUBMACHINE, newSubmachine, newSubmachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getDeferrableTrigger() {
		if (deferrableTrigger == null) {
			deferrableTrigger = new EObjectContainmentEList<Trigger>(Trigger.class, this, StateMachinesPackage.STATE__DEFERRABLE_TRIGGER);
		}
		return deferrableTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getDoActivity() {
		return doActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoActivity(Behavior newDoActivity, NotificationChain msgs) {
		Behavior oldDoActivity = doActivity;
		doActivity = newDoActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__DO_ACTIVITY, oldDoActivity, newDoActivity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoActivity(Behavior newDoActivity) {
		if (newDoActivity != doActivity) {
			NotificationChain msgs = null;
			if (doActivity != null)
				msgs = ((InternalEObject)doActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.STATE__DO_ACTIVITY, null, msgs);
			if (newDoActivity != null)
				msgs = ((InternalEObject)newDoActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.STATE__DO_ACTIVITY, null, msgs);
			msgs = basicSetDoActivity(newDoActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__DO_ACTIVITY, newDoActivity, newDoActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getEntry() {
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntry(Behavior newEntry, NotificationChain msgs) {
		Behavior oldEntry = entry;
		entry = newEntry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__ENTRY, oldEntry, newEntry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntry(Behavior newEntry) {
		if (newEntry != entry) {
			NotificationChain msgs = null;
			if (entry != null)
				msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.STATE__ENTRY, null, msgs);
			if (newEntry != null)
				msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.STATE__ENTRY, null, msgs);
			msgs = basicSetEntry(newEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__ENTRY, newEntry, newEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getExit() {
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExit(Behavior newExit, NotificationChain msgs) {
		Behavior oldExit = exit;
		exit = newExit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__EXIT, oldExit, newExit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExit(Behavior newExit) {
		if (newExit != exit) {
			NotificationChain msgs = null;
			if (exit != null)
				msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.STATE__EXIT, null, msgs);
			if (newExit != null)
				msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StateMachinesPackage.STATE__EXIT, null, msgs);
			msgs = basicSetExit(newExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__EXIT, newExit, newExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		// TODO: implement this method to return the 'Is Composite' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrthogonal() {
		// TODO: implement this method to return the 'Is Orthogonal' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimple() {
		// TODO: implement this method to return the 'Is Simple' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSubmachineState() {
		// TODO: implement this method to return the 'Is Submachine State' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getRedefinedState() {
		if (redefinedState != null && redefinedState.eIsProxy()) {
			InternalEObject oldRedefinedState = (InternalEObject)redefinedState;
			redefinedState = (State)eResolveProxy(oldRedefinedState);
			if (redefinedState != oldRedefinedState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinesPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
			}
		}
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetRedefinedState() {
		return redefinedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRedefinedState(State newRedefinedState) {
		State oldRedefinedState = redefinedState;
		redefinedState = newRedefinedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__REDEFINED_STATE, oldRedefinedState, redefinedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getStateInvariant() {
		if (stateInvariant != null && stateInvariant.eIsProxy()) {
			InternalEObject oldStateInvariant = (InternalEObject)stateInvariant;
			stateInvariant = (Constraint)eResolveProxy(oldStateInvariant);
			if (stateInvariant != oldStateInvariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StateMachinesPackage.STATE__STATE_INVARIANT, oldStateInvariant, stateInvariant));
			}
		}
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(Constraint newStateInvariant) {
		Constraint oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StateMachinesPackage.STATE__STATE_INVARIANT, oldStateInvariant, stateInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Region> getRegion() {
		if (region == null) {
			region = new EObjectContainmentWithInverseEList<Region>(Region.class, this, StateMachinesPackage.STATE__REGION, StateMachinesPackage.REGION__STATE);
		}
		return region;
	}

	/**
	 * The cached invocation delegate for the '{@link #isComposite() <em>Is Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_COMPOSITE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE___IS_COMPOSITE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposite() {
		try {
			return (Boolean)IS_COMPOSITE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isOrthogonal() <em>Is Orthogonal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrthogonal()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ORTHOGONAL__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE___IS_ORTHOGONAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrthogonal() {
		try {
			return (Boolean)IS_ORTHOGONAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSimple() <em>Is Simple</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSimple()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SIMPLE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE___IS_SIMPLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSimple() {
		try {
			return (Boolean)IS_SIMPLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSubmachineState() <em>Is Submachine State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubmachineState()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUBMACHINE_STATE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE___IS_SUBMACHINE_STATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubmachineState() {
		try {
			return (Boolean)IS_SUBMACHINE_STATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate REDEFINITION_CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.STATE___REDEFINITION_CONTEXT).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #containingStateMachine() <em>Containing State Machine</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingStateMachine()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_STATE_MACHINE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.VERTEX___CONTAINING_STATE_MACHINE).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #incoming() <em>Incoming</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #incoming()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCOMING__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.VERTEX___INCOMING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> incoming() {
		try {
			return (EList<Transition>)INCOMING__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #outgoing() <em>Outgoing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #outgoing()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OUTGOING__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.VERTEX___OUTGOING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> outgoing() {
		try {
			return (EList<Transition>)OUTGOING__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isContainedInState(uml.stateMachines.State) <em>Is Contained In State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainedInState(uml.stateMachines.State)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CONTAINED_IN_STATE_STATE__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.VERTEX___IS_CONTAINED_IN_STATE__STATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainedInState(State s) {
		try {
			return (Boolean)IS_CONTAINED_IN_STATE_STATE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{s}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isContainedInRegion(uml.stateMachines.Region) <em>Is Contained In Region</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainedInRegion(uml.stateMachines.Region)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CONTAINED_IN_REGION_REGION__EINVOCATION_DELEGATE = ((EOperation.Internal)StateMachinesPackage.Literals.VERTEX___IS_CONTAINED_IN_REGION__REGION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainedInRegion(Region r) {
		try {
			return (Boolean)IS_CONTAINED_IN_REGION_REGION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{r}));
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
			case StateMachinesPackage.STATE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((Region)otherEnd, msgs);
			case StateMachinesPackage.STATE__CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnection()).basicAdd(otherEnd, msgs);
			case StateMachinesPackage.STATE__CONNECTION_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectionPoint()).basicAdd(otherEnd, msgs);
			case StateMachinesPackage.STATE__SUBMACHINE:
				if (submachine != null)
					msgs = ((InternalEObject)submachine).eInverseRemove(this, StateMachinesPackage.STATE_MACHINE__SUBMACHINE_STATE, StateMachine.class, msgs);
				return basicSetSubmachine((StateMachine)otherEnd, msgs);
			case StateMachinesPackage.STATE__REGION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRegion()).basicAdd(otherEnd, msgs);
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
			case StateMachinesPackage.STATE__CONTAINER:
				return basicSetContainer(null, msgs);
			case StateMachinesPackage.STATE__CONNECTION:
				return ((InternalEList<?>)getConnection()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.STATE__CONNECTION_POINT:
				return ((InternalEList<?>)getConnectionPoint()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.STATE__SUBMACHINE:
				return basicSetSubmachine(null, msgs);
			case StateMachinesPackage.STATE__DEFERRABLE_TRIGGER:
				return ((InternalEList<?>)getDeferrableTrigger()).basicRemove(otherEnd, msgs);
			case StateMachinesPackage.STATE__DO_ACTIVITY:
				return basicSetDoActivity(null, msgs);
			case StateMachinesPackage.STATE__ENTRY:
				return basicSetEntry(null, msgs);
			case StateMachinesPackage.STATE__EXIT:
				return basicSetExit(null, msgs);
			case StateMachinesPackage.STATE__REGION:
				return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
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
			case StateMachinesPackage.STATE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, StateMachinesPackage.REGION__SUBVERTEX, Region.class, msgs);
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
			case StateMachinesPackage.STATE__IS_LEAF:
				return isIsLeaf();
			case StateMachinesPackage.STATE__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case StateMachinesPackage.STATE__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case StateMachinesPackage.STATE__CONTAINER:
				return getContainer();
			case StateMachinesPackage.STATE__OUTGOING:
				return getOutgoing();
			case StateMachinesPackage.STATE__INCOMING:
				return getIncoming();
			case StateMachinesPackage.STATE__CONNECTION:
				return getConnection();
			case StateMachinesPackage.STATE__CONNECTION_POINT:
				return getConnectionPoint();
			case StateMachinesPackage.STATE__SUBMACHINE:
				if (resolve) return getSubmachine();
				return basicGetSubmachine();
			case StateMachinesPackage.STATE__DEFERRABLE_TRIGGER:
				return getDeferrableTrigger();
			case StateMachinesPackage.STATE__DO_ACTIVITY:
				return getDoActivity();
			case StateMachinesPackage.STATE__ENTRY:
				return getEntry();
			case StateMachinesPackage.STATE__EXIT:
				return getExit();
			case StateMachinesPackage.STATE__IS_COMPOSITE:
				return isIsComposite();
			case StateMachinesPackage.STATE__IS_ORTHOGONAL:
				return isIsOrthogonal();
			case StateMachinesPackage.STATE__IS_SIMPLE:
				return isIsSimple();
			case StateMachinesPackage.STATE__IS_SUBMACHINE_STATE:
				return isIsSubmachineState();
			case StateMachinesPackage.STATE__REDEFINED_STATE:
				if (resolve) return getRedefinedState();
				return basicGetRedefinedState();
			case StateMachinesPackage.STATE__STATE_INVARIANT:
				if (resolve) return getStateInvariant();
				return basicGetStateInvariant();
			case StateMachinesPackage.STATE__REGION:
				return getRegion();
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
			case StateMachinesPackage.STATE__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case StateMachinesPackage.STATE__CONTAINER:
				setContainer((Region)newValue);
				return;
			case StateMachinesPackage.STATE__CONNECTION:
				getConnection().clear();
				getConnection().addAll((Collection<? extends ConnectionPointReference>)newValue);
				return;
			case StateMachinesPackage.STATE__CONNECTION_POINT:
				getConnectionPoint().clear();
				getConnectionPoint().addAll((Collection<? extends Pseudostate>)newValue);
				return;
			case StateMachinesPackage.STATE__SUBMACHINE:
				setSubmachine((StateMachine)newValue);
				return;
			case StateMachinesPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				getDeferrableTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case StateMachinesPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)newValue);
				return;
			case StateMachinesPackage.STATE__ENTRY:
				setEntry((Behavior)newValue);
				return;
			case StateMachinesPackage.STATE__EXIT:
				setExit((Behavior)newValue);
				return;
			case StateMachinesPackage.STATE__REDEFINED_STATE:
				setRedefinedState((State)newValue);
				return;
			case StateMachinesPackage.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)newValue);
				return;
			case StateMachinesPackage.STATE__REGION:
				getRegion().clear();
				getRegion().addAll((Collection<? extends Region>)newValue);
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
			case StateMachinesPackage.STATE__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case StateMachinesPackage.STATE__CONTAINER:
				setContainer((Region)null);
				return;
			case StateMachinesPackage.STATE__CONNECTION:
				getConnection().clear();
				return;
			case StateMachinesPackage.STATE__CONNECTION_POINT:
				getConnectionPoint().clear();
				return;
			case StateMachinesPackage.STATE__SUBMACHINE:
				setSubmachine((StateMachine)null);
				return;
			case StateMachinesPackage.STATE__DEFERRABLE_TRIGGER:
				getDeferrableTrigger().clear();
				return;
			case StateMachinesPackage.STATE__DO_ACTIVITY:
				setDoActivity((Behavior)null);
				return;
			case StateMachinesPackage.STATE__ENTRY:
				setEntry((Behavior)null);
				return;
			case StateMachinesPackage.STATE__EXIT:
				setExit((Behavior)null);
				return;
			case StateMachinesPackage.STATE__REDEFINED_STATE:
				setRedefinedState((State)null);
				return;
			case StateMachinesPackage.STATE__STATE_INVARIANT:
				setStateInvariant((Constraint)null);
				return;
			case StateMachinesPackage.STATE__REGION:
				getRegion().clear();
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
			case StateMachinesPackage.STATE__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case StateMachinesPackage.STATE__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case StateMachinesPackage.STATE__REDEFINITION_CONTEXT:
				return !getRedefinitionContext().isEmpty();
			case StateMachinesPackage.STATE__CONTAINER:
				return getContainer() != null;
			case StateMachinesPackage.STATE__OUTGOING:
				return !getOutgoing().isEmpty();
			case StateMachinesPackage.STATE__INCOMING:
				return !getIncoming().isEmpty();
			case StateMachinesPackage.STATE__CONNECTION:
				return connection != null && !connection.isEmpty();
			case StateMachinesPackage.STATE__CONNECTION_POINT:
				return connectionPoint != null && !connectionPoint.isEmpty();
			case StateMachinesPackage.STATE__SUBMACHINE:
				return submachine != null;
			case StateMachinesPackage.STATE__DEFERRABLE_TRIGGER:
				return deferrableTrigger != null && !deferrableTrigger.isEmpty();
			case StateMachinesPackage.STATE__DO_ACTIVITY:
				return doActivity != null;
			case StateMachinesPackage.STATE__ENTRY:
				return entry != null;
			case StateMachinesPackage.STATE__EXIT:
				return exit != null;
			case StateMachinesPackage.STATE__IS_COMPOSITE:
				return isIsComposite() != IS_COMPOSITE_EDEFAULT;
			case StateMachinesPackage.STATE__IS_ORTHOGONAL:
				return isIsOrthogonal() != IS_ORTHOGONAL_EDEFAULT;
			case StateMachinesPackage.STATE__IS_SIMPLE:
				return isIsSimple() != IS_SIMPLE_EDEFAULT;
			case StateMachinesPackage.STATE__IS_SUBMACHINE_STATE:
				return isIsSubmachineState() != IS_SUBMACHINE_STATE_EDEFAULT;
			case StateMachinesPackage.STATE__REDEFINED_STATE:
				return redefinedState != null;
			case StateMachinesPackage.STATE__STATE_INVARIANT:
				return stateInvariant != null;
			case StateMachinesPackage.STATE__REGION:
				return region != null && !region.isEmpty();
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
				case StateMachinesPackage.STATE__IS_LEAF: return ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case StateMachinesPackage.STATE__REDEFINED_ELEMENT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case StateMachinesPackage.STATE__REDEFINITION_CONTEXT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (derivedFeatureID) {
				case StateMachinesPackage.STATE__CONTAINER: return StateMachinesPackage.VERTEX__CONTAINER;
				case StateMachinesPackage.STATE__OUTGOING: return StateMachinesPackage.VERTEX__OUTGOING;
				case StateMachinesPackage.STATE__INCOMING: return StateMachinesPackage.VERTEX__INCOMING;
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
				case ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF: return StateMachinesPackage.STATE__IS_LEAF;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return StateMachinesPackage.STATE__REDEFINED_ELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return StateMachinesPackage.STATE__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseFeatureID) {
				case StateMachinesPackage.VERTEX__CONTAINER: return StateMachinesPackage.STATE__CONTAINER;
				case StateMachinesPackage.VERTEX__OUTGOING: return StateMachinesPackage.STATE__OUTGOING;
				case StateMachinesPackage.VERTEX__INCOMING: return StateMachinesPackage.STATE__INCOMING;
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
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT: return StateMachinesPackage.STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT: return StateMachinesPackage.STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Vertex.class) {
			switch (baseOperationID) {
				case StateMachinesPackage.VERTEX___CONTAINING_STATE_MACHINE: return StateMachinesPackage.STATE___CONTAINING_STATE_MACHINE;
				case StateMachinesPackage.VERTEX___INCOMING: return StateMachinesPackage.STATE___INCOMING;
				case StateMachinesPackage.VERTEX___OUTGOING: return StateMachinesPackage.STATE___OUTGOING;
				case StateMachinesPackage.VERTEX___IS_CONTAINED_IN_STATE__STATE: return StateMachinesPackage.STATE___IS_CONTAINED_IN_STATE__STATE;
				case StateMachinesPackage.VERTEX___IS_CONTAINED_IN_REGION__REGION: return StateMachinesPackage.STATE___IS_CONTAINED_IN_REGION__REGION;
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
			case StateMachinesPackage.STATE___IS_COMPOSITE:
				return isComposite();
			case StateMachinesPackage.STATE___IS_ORTHOGONAL:
				return isOrthogonal();
			case StateMachinesPackage.STATE___IS_SIMPLE:
				return isSimple();
			case StateMachinesPackage.STATE___IS_SUBMACHINE_STATE:
				return isSubmachineState();
			case StateMachinesPackage.STATE___REDEFINITION_CONTEXT:
				return redefinitionContext();
			case StateMachinesPackage.STATE___CONTAINING_STATE_MACHINE:
				return containingStateMachine();
			case StateMachinesPackage.STATE___INCOMING:
				return incoming();
			case StateMachinesPackage.STATE___OUTGOING:
				return outgoing();
			case StateMachinesPackage.STATE___IS_CONTAINED_IN_STATE__STATE:
				return isContainedInState((State)arguments.get(0));
			case StateMachinesPackage.STATE___IS_CONTAINED_IN_REGION__REGION:
				return isContainedInRegion((Region)arguments.get(0));
			case StateMachinesPackage.STATE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return isConsistentWith((RedefinableElement)arguments.get(0));
			case StateMachinesPackage.STATE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
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

} //StateImpl
