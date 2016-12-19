/**
 */
package uml.structuredClassifiers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.classification.Property;

import uml.commonStructure.impl.MultiplicityElementImpl;

import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.ConnectorEnd;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorEndImpl#getDefiningEnd <em>Defining End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorEndImpl#getPartWithPort <em>Part With Port</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ConnectorEndImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndImpl extends MultiplicityElementImpl implements ConnectorEnd {
	/**
	 * The cached value of the '{@link #getPartWithPort() <em>Part With Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartWithPort()
	 * @generated
	 * @ordered
	 */
	protected Property partWithPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.CONNECTOR_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getDefiningEnd() {
		Property definingEnd = basicGetDefiningEnd();
		return definingEnd != null && definingEnd.eIsProxy() ? (Property)eResolveProxy((InternalEObject)definingEnd) : definingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetDefiningEnd() {
		// TODO: implement this method to return the 'Defining End' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getPartWithPort() {
		if (partWithPort != null && partWithPort.eIsProxy()) {
			InternalEObject oldPartWithPort = (InternalEObject)partWithPort;
			partWithPort = (Property)eResolveProxy(oldPartWithPort);
			if (partWithPort != oldPartWithPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuredClassifiersPackage.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort, partWithPort));
			}
		}
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetPartWithPort() {
		return partWithPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartWithPort(Property newPartWithPort) {
		Property oldPartWithPort = partWithPort;
		partWithPort = newPartWithPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.CONNECTOR_END__PART_WITH_PORT, oldPartWithPort, partWithPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getRole() {
		ConnectableElement role = basicGetRole();
		return role != null && role.eIsProxy() ? (ConnectableElement)eResolveProxy((InternalEObject)role) : role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetRole() {
		// TODO: implement this method to return the 'Role' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(ConnectableElement newRole) {
		// TODO: implement this method to set the 'Role' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #definingEnd() <em>Defining End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #definingEnd()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DEFINING_END__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.CONNECTOR_END___DEFINING_END).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property definingEnd() {
		try {
			return (Property)DEFINING_END__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case StructuredClassifiersPackage.CONNECTOR_END__DEFINING_END:
				if (resolve) return getDefiningEnd();
				return basicGetDefiningEnd();
			case StructuredClassifiersPackage.CONNECTOR_END__PART_WITH_PORT:
				if (resolve) return getPartWithPort();
				return basicGetPartWithPort();
			case StructuredClassifiersPackage.CONNECTOR_END__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructuredClassifiersPackage.CONNECTOR_END__PART_WITH_PORT:
				setPartWithPort((Property)newValue);
				return;
			case StructuredClassifiersPackage.CONNECTOR_END__ROLE:
				setRole((ConnectableElement)newValue);
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
			case StructuredClassifiersPackage.CONNECTOR_END__PART_WITH_PORT:
				setPartWithPort((Property)null);
				return;
			case StructuredClassifiersPackage.CONNECTOR_END__ROLE:
				setRole((ConnectableElement)null);
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
			case StructuredClassifiersPackage.CONNECTOR_END__DEFINING_END:
				return basicGetDefiningEnd() != null;
			case StructuredClassifiersPackage.CONNECTOR_END__PART_WITH_PORT:
				return partWithPort != null;
			case StructuredClassifiersPackage.CONNECTOR_END__ROLE:
				return basicGetRole() != null;
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
			case StructuredClassifiersPackage.CONNECTOR_END___DEFINING_END:
				return definingEnd();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConnectorEndImpl
