/**
 */
package uml.packages.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import uml.classification.Property;

import uml.packages.Extension;
import uml.packages.PackagesPackage;

import uml.structuredClassifiers.impl.AssociationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link uml.packages.impl.ExtensionImpl#isIsRequired <em>Is Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExtensionImpl extends AssociationImpl implements Extension {
	/**
	 * The default value of the '{@link #isIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_REQUIRED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagesPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.structuredClassifiers.Class getMetaclass() {
		uml.structuredClassifiers.Class metaclass = basicGetMetaclass();
		return metaclass != null && metaclass.eIsProxy() ? (uml.structuredClassifiers.Class)eResolveProxy((InternalEObject)metaclass) : metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.structuredClassifiers.Class basicGetMetaclass() {
		// TODO: implement this method to return the 'Metaclass' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRequired() {
		// TODO: implement this method to return the 'Is Required' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #isRequired() <em>Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_REQUIRED__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.EXTENSION___IS_REQUIRED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		try {
			return (Boolean)IS_REQUIRED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #metaclass() <em>Metaclass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #metaclass()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate METACLASS__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.EXTENSION___METACLASS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.structuredClassifiers.Class metaclass() {
		try {
			return (uml.structuredClassifiers.Class)METACLASS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #metaclassEnd() <em>Metaclass End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #metaclassEnd()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate METACLASS_END__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.EXTENSION___METACLASS_END).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property metaclassEnd() {
		try {
			return (Property)METACLASS_END__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PackagesPackage.EXTENSION__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
			case PackagesPackage.EXTENSION__IS_REQUIRED:
				return isIsRequired();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PackagesPackage.EXTENSION__METACLASS:
				return basicGetMetaclass() != null;
			case PackagesPackage.EXTENSION__IS_REQUIRED:
				return isIsRequired() != IS_REQUIRED_EDEFAULT;
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
			case PackagesPackage.EXTENSION___IS_REQUIRED:
				return isRequired();
			case PackagesPackage.EXTENSION___METACLASS:
				return metaclass();
			case PackagesPackage.EXTENSION___METACLASS_END:
				return metaclassEnd();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtensionImpl
