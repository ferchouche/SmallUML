/**
 */
package uml.structuredClassifiers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.classification.impl.PropertyImpl;

import uml.simpleClassifiers.Interface;

import uml.stateMachines.ProtocolStateMachine;

import uml.structuredClassifiers.Port;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#isIsBehavior <em>Is Behavior</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#isIsConjugated <em>Is Conjugated</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#isIsService <em>Is Service</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#getRedefinedPort <em>Redefined Port</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.PortImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends PropertyImpl implements Port {
	/**
	 * The default value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BEHAVIOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBehavior() <em>Is Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBehavior()
	 * @generated
	 * @ordered
	 */
	protected boolean isBehavior = IS_BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONJUGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConjugated() <em>Is Conjugated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConjugated()
	 * @generated
	 * @ordered
	 */
	protected boolean isConjugated = IS_CONJUGATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SERVICE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsService() <em>Is Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsService()
	 * @generated
	 * @ordered
	 */
	protected boolean isService = IS_SERVICE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine protocol;

	/**
	 * The cached value of the '{@link #getRedefinedPort() <em>Redefined Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> redefinedPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBehavior() {
		return isBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBehavior(boolean newIsBehavior) {
		boolean oldIsBehavior = isBehavior;
		isBehavior = newIsBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.PORT__IS_BEHAVIOR, oldIsBehavior, isBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConjugated() {
		return isConjugated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConjugated(boolean newIsConjugated) {
		boolean oldIsConjugated = isConjugated;
		isConjugated = newIsConjugated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.PORT__IS_CONJUGATED, oldIsConjugated, isConjugated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsService() {
		return isService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsService(boolean newIsService) {
		boolean oldIsService = isService;
		isService = newIsService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.PORT__IS_SERVICE, oldIsService, isService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		if (protocol != null && protocol.eIsProxy()) {
			InternalEObject oldProtocol = (InternalEObject)protocol;
			protocol = (ProtocolStateMachine)eResolveProxy(oldProtocol);
			if (protocol != oldProtocol) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredClassifiersPackage.PORT__PROTOCOL, oldProtocol, protocol));
			}
		}
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine basicGetProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		ProtocolStateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.PORT__PROTOCOL, oldProtocol, protocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvided() {
		// TODO: implement this method to return the 'Provided' reference list
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
	public EList<Port> getRedefinedPort() {
		if (redefinedPort == null) {
			redefinedPort = new EObjectResolvingEList<Port>(Port.class, this, StructuredClassifiersPackage.PORT__REDEFINED_PORT);
		}
		return redefinedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequired() {
		// TODO: implement this method to return the 'Required' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #provided() <em>Provided</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #provided()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PROVIDED__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.PORT___PROVIDED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> provided() {
		try {
			return (EList<Interface>)PROVIDED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #required() <em>Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #required()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REQUIRED__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.PORT___REQUIRED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> required() {
		try {
			return (EList<Interface>)REQUIRED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #basicProvided() <em>Basic Provided</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #basicProvided()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate BASIC_PROVIDED__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.PORT___BASIC_PROVIDED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> basicProvided() {
		try {
			return (EList<Interface>)BASIC_PROVIDED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #basicRequired() <em>Basic Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #basicRequired()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate BASIC_REQUIRED__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.PORT___BASIC_REQUIRED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> basicRequired() {
		try {
			return (EList<Interface>)BASIC_REQUIRED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuredClassifiersPackage.PORT__IS_BEHAVIOR:
				return isIsBehavior();
			case StructuredClassifiersPackage.PORT__IS_CONJUGATED:
				return isIsConjugated();
			case StructuredClassifiersPackage.PORT__IS_SERVICE:
				return isIsService();
			case StructuredClassifiersPackage.PORT__PROTOCOL:
				if (resolve) return getProtocol();
				return basicGetProtocol();
			case StructuredClassifiersPackage.PORT__PROVIDED:
				return getProvided();
			case StructuredClassifiersPackage.PORT__REDEFINED_PORT:
				return getRedefinedPort();
			case StructuredClassifiersPackage.PORT__REQUIRED:
				return getRequired();
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
			case StructuredClassifiersPackage.PORT__IS_BEHAVIOR:
				setIsBehavior((Boolean)newValue);
				return;
			case StructuredClassifiersPackage.PORT__IS_CONJUGATED:
				setIsConjugated((Boolean)newValue);
				return;
			case StructuredClassifiersPackage.PORT__IS_SERVICE:
				setIsService((Boolean)newValue);
				return;
			case StructuredClassifiersPackage.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
				return;
			case StructuredClassifiersPackage.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
				getRedefinedPort().addAll((Collection<? extends Port>)newValue);
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
			case StructuredClassifiersPackage.PORT__IS_BEHAVIOR:
				setIsBehavior(IS_BEHAVIOR_EDEFAULT);
				return;
			case StructuredClassifiersPackage.PORT__IS_CONJUGATED:
				setIsConjugated(IS_CONJUGATED_EDEFAULT);
				return;
			case StructuredClassifiersPackage.PORT__IS_SERVICE:
				setIsService(IS_SERVICE_EDEFAULT);
				return;
			case StructuredClassifiersPackage.PORT__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
				return;
			case StructuredClassifiersPackage.PORT__REDEFINED_PORT:
				getRedefinedPort().clear();
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
			case StructuredClassifiersPackage.PORT__IS_BEHAVIOR:
				return isBehavior != IS_BEHAVIOR_EDEFAULT;
			case StructuredClassifiersPackage.PORT__IS_CONJUGATED:
				return isConjugated != IS_CONJUGATED_EDEFAULT;
			case StructuredClassifiersPackage.PORT__IS_SERVICE:
				return isService != IS_SERVICE_EDEFAULT;
			case StructuredClassifiersPackage.PORT__PROTOCOL:
				return protocol != null;
			case StructuredClassifiersPackage.PORT__PROVIDED:
				return !getProvided().isEmpty();
			case StructuredClassifiersPackage.PORT__REDEFINED_PORT:
				return redefinedPort != null && !redefinedPort.isEmpty();
			case StructuredClassifiersPackage.PORT__REQUIRED:
				return !getRequired().isEmpty();
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
			case StructuredClassifiersPackage.PORT___PROVIDED:
				return provided();
			case StructuredClassifiersPackage.PORT___REQUIRED:
				return required();
			case StructuredClassifiersPackage.PORT___BASIC_PROVIDED:
				return basicProvided();
			case StructuredClassifiersPackage.PORT___BASIC_REQUIRED:
				return basicRequired();
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
		result.append(" (isBehavior: ");
		result.append(isBehavior);
		result.append(", isConjugated: ");
		result.append(isConjugated);
		result.append(", isService: ");
		result.append(isService);
		result.append(')');
		return result.toString();
	}

} //PortImpl
