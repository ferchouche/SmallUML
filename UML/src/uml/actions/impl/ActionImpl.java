/**
 */
package uml.actions.impl;

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
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.Action;
import uml.actions.ActionsPackage;
import uml.actions.InputPin;
import uml.actions.OutputPin;

import uml.activities.ActivityNode;

import uml.activities.impl.ExecutableNodeImpl;

import uml.classification.Classifier;

import uml.commonBehavior.Behavior;

import uml.commonStructure.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.ActionImpl#getContext <em>Context</em>}</li>
 *   <li>{@link uml.actions.impl.ActionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link uml.actions.impl.ActionImpl#isIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link uml.actions.impl.ActionImpl#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link uml.actions.impl.ActionImpl#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link uml.actions.impl.ActionImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActionImpl extends ExecutableNodeImpl implements Action {
	/**
	 * The default value of the '{@link #isIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LOCALLY_REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLocallyReentrant() <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLocallyReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean isLocallyReentrant = IS_LOCALLY_REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalPostcondition() <em>Local Postcondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPostcondition;

	/**
	 * The cached value of the '{@link #getLocalPrecondition() <em>Local Precondition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> localPrecondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getContext() {
		Classifier context = basicGetContext();
		return context != null && context.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)context) : context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetContext() {
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
	public EList<InputPin> getInput() {
		// TODO: implement this method to return the 'Input' reference list
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
	public boolean isIsLocallyReentrant() {
		return isLocallyReentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLocallyReentrant(boolean newIsLocallyReentrant) {
		boolean oldIsLocallyReentrant = isLocallyReentrant;
		isLocallyReentrant = newIsLocallyReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.ACTION__IS_LOCALLY_REENTRANT, oldIsLocallyReentrant, isLocallyReentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPostcondition() {
		if (localPostcondition == null) {
			localPostcondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, ActionsPackage.ACTION__LOCAL_POSTCONDITION);
		}
		return localPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getLocalPrecondition() {
		if (localPrecondition == null) {
			localPrecondition = new EObjectContainmentEList<Constraint>(Constraint.class, this, ActionsPackage.ACTION__LOCAL_PRECONDITION);
		}
		return localPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getOutput() {
		// TODO: implement this method to return the 'Output' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #context() <em>Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #context()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.ACTION___CONTEXT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier context() {
		try {
			return (Classifier)CONTEXT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allActions() <em>All Actions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allActions()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_ACTIONS__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.ACTION___ALL_ACTIONS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Action> allActions() {
		try {
			return (EList<Action>)ALL_ACTIONS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allOwnedNodes() <em>All Owned Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allOwnedNodes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_OWNED_NODES__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.ACTION___ALL_OWNED_NODES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActivityNode> allOwnedNodes() {
		try {
			return (EList<ActivityNode>)ALL_OWNED_NODES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #containingBehavior() <em>Containing Behavior</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_BEHAVIOR__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.ACTION___CONTAINING_BEHAVIOR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior containingBehavior() {
		try {
			return (Behavior)CONTAINING_BEHAVIOR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionsPackage.ACTION__LOCAL_POSTCONDITION:
				return ((InternalEList<?>)getLocalPostcondition()).basicRemove(otherEnd, msgs);
			case ActionsPackage.ACTION__LOCAL_PRECONDITION:
				return ((InternalEList<?>)getLocalPrecondition()).basicRemove(otherEnd, msgs);
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
			case ActionsPackage.ACTION__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ActionsPackage.ACTION__INPUT:
				return getInput();
			case ActionsPackage.ACTION__IS_LOCALLY_REENTRANT:
				return isIsLocallyReentrant();
			case ActionsPackage.ACTION__LOCAL_POSTCONDITION:
				return getLocalPostcondition();
			case ActionsPackage.ACTION__LOCAL_PRECONDITION:
				return getLocalPrecondition();
			case ActionsPackage.ACTION__OUTPUT:
				return getOutput();
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
			case ActionsPackage.ACTION__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant((Boolean)newValue);
				return;
			case ActionsPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				getLocalPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ActionsPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
				getLocalPrecondition().addAll((Collection<? extends Constraint>)newValue);
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
			case ActionsPackage.ACTION__IS_LOCALLY_REENTRANT:
				setIsLocallyReentrant(IS_LOCALLY_REENTRANT_EDEFAULT);
				return;
			case ActionsPackage.ACTION__LOCAL_POSTCONDITION:
				getLocalPostcondition().clear();
				return;
			case ActionsPackage.ACTION__LOCAL_PRECONDITION:
				getLocalPrecondition().clear();
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
			case ActionsPackage.ACTION__CONTEXT:
				return basicGetContext() != null;
			case ActionsPackage.ACTION__INPUT:
				return !getInput().isEmpty();
			case ActionsPackage.ACTION__IS_LOCALLY_REENTRANT:
				return isLocallyReentrant != IS_LOCALLY_REENTRANT_EDEFAULT;
			case ActionsPackage.ACTION__LOCAL_POSTCONDITION:
				return localPostcondition != null && !localPostcondition.isEmpty();
			case ActionsPackage.ACTION__LOCAL_PRECONDITION:
				return localPrecondition != null && !localPrecondition.isEmpty();
			case ActionsPackage.ACTION__OUTPUT:
				return !getOutput().isEmpty();
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
			case ActionsPackage.ACTION___CONTEXT:
				return context();
			case ActionsPackage.ACTION___ALL_ACTIONS:
				return allActions();
			case ActionsPackage.ACTION___ALL_OWNED_NODES:
				return allOwnedNodes();
			case ActionsPackage.ACTION___CONTAINING_BEHAVIOR:
				return containingBehavior();
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
		result.append(" (isLocallyReentrant: ");
		result.append(isLocallyReentrant);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
