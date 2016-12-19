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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.impl.FeatureImpl;

import uml.commonBehavior.Behavior;

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.Connector;
import uml.structuredClassifiers.ConnectorEnd;
import uml.structuredClassifiers.ConnectorKind;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorImpl#getEnd <em>End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorImpl#getRedefinedConnector <em>Redefined Connector</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector {
	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> contract;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorEnd> end;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ConnectorKind KIND_EDEFAULT = ConnectorKind.ASSEMBLY;

	/**
	 * The cached value of the '{@link #getRedefinedConnector() <em>Redefined Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> redefinedConnector;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Association type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getContract() {
		if (contract == null) {
			contract = new EObjectResolvingEList<Behavior>(Behavior.class, this, StructuredClassifiersPackage.CONNECTOR__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd() {
		if (end == null) {
			end = new EObjectContainmentEList<ConnectorEnd>(ConnectorEnd.class, this, StructuredClassifiersPackage.CONNECTOR__END);
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind getKind() {
		// TODO: implement this method to return the 'Kind' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getRedefinedConnector() {
		if (redefinedConnector == null) {
			redefinedConnector = new EObjectResolvingEList<Connector>(Connector.class, this, StructuredClassifiersPackage.CONNECTOR__REDEFINED_CONNECTOR);
		}
		return redefinedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Association)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredClassifiersPackage.CONNECTOR__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Association newType) {
		Association oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * The cached invocation delegate for the '{@link #kind() <em>Kind</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #kind()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate KIND__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.CONNECTOR___KIND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorKind kind() {
		try {
			return (ConnectorKind)KIND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case StructuredClassifiersPackage.CONNECTOR__END:
				return ((InternalEList<?>)getEnd()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.CONNECTOR__CONTRACT:
				return getContract();
			case StructuredClassifiersPackage.CONNECTOR__END:
				return getEnd();
			case StructuredClassifiersPackage.CONNECTOR__KIND:
				return getKind();
			case StructuredClassifiersPackage.CONNECTOR__REDEFINED_CONNECTOR:
				return getRedefinedConnector();
			case StructuredClassifiersPackage.CONNECTOR__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case StructuredClassifiersPackage.CONNECTOR__CONTRACT:
				getContract().clear();
				getContract().addAll((Collection<? extends Behavior>)newValue);
				return;
			case StructuredClassifiersPackage.CONNECTOR__END:
				getEnd().clear();
				getEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
				return;
			case StructuredClassifiersPackage.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnector().clear();
				getRedefinedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case StructuredClassifiersPackage.CONNECTOR__TYPE:
				setType((Association)newValue);
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
			case StructuredClassifiersPackage.CONNECTOR__CONTRACT:
				getContract().clear();
				return;
			case StructuredClassifiersPackage.CONNECTOR__END:
				getEnd().clear();
				return;
			case StructuredClassifiersPackage.CONNECTOR__REDEFINED_CONNECTOR:
				getRedefinedConnector().clear();
				return;
			case StructuredClassifiersPackage.CONNECTOR__TYPE:
				setType((Association)null);
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
			case StructuredClassifiersPackage.CONNECTOR__CONTRACT:
				return contract != null && !contract.isEmpty();
			case StructuredClassifiersPackage.CONNECTOR__END:
				return end != null && !end.isEmpty();
			case StructuredClassifiersPackage.CONNECTOR__KIND:
				return getKind() != KIND_EDEFAULT;
			case StructuredClassifiersPackage.CONNECTOR__REDEFINED_CONNECTOR:
				return redefinedConnector != null && !redefinedConnector.isEmpty();
			case StructuredClassifiersPackage.CONNECTOR__TYPE:
				return type != null;
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
			case StructuredClassifiersPackage.CONNECTOR___KIND:
				return kind();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectorImpl
