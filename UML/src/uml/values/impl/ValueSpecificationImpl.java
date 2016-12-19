/**
 */
package uml.values.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Type;
import uml.commonStructure.TypedElement;

import uml.commonStructure.impl.PackageableElementImpl;

import uml.values.ValueSpecification;
import uml.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.values.impl.ValueSpecificationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ValueSpecificationImpl extends PackageableElementImpl implements ValueSpecification {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.VALUE_SPECIFICATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.VALUE_SPECIFICATION__TYPE, oldType, type));
	}

	/**
	 * The cached invocation delegate for the '{@link #booleanValue() <em>Boolean Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #booleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate BOOLEAN_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___BOOLEAN_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean booleanValue() {
		try {
			return (Boolean)BOOLEAN_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #integerValue() <em>Integer Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #integerValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INTEGER_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___INTEGER_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int integerValue() {
		try {
			return (Integer)INTEGER_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isComputable() <em>Is Computable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComputable()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_COMPUTABLE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___IS_COMPUTABLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComputable() {
		try {
			return (Boolean)IS_COMPUTABLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isNull() <em>Is Null</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNull()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_NULL__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___IS_NULL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNull() {
		try {
			return (Boolean)IS_NULL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #realValue() <em>Real Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #realValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REAL_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___REAL_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double realValue() {
		try {
			return (Double)REAL_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #stringValue() <em>String Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #stringValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate STRING_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___STRING_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stringValue() {
		try {
			return (String)STRING_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #unlimitedValue() <em>Unlimited Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #unlimitedValue()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate UNLIMITED_VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.VALUE_SPECIFICATION___UNLIMITED_VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int unlimitedValue() {
		try {
			return (Integer)UNLIMITED_VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ValuesPackage.VALUE_SPECIFICATION__TYPE:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ValuesPackage.VALUE_SPECIFICATION__TYPE:
				setType((Type)newValue);
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
			case ValuesPackage.VALUE_SPECIFICATION__TYPE:
				setType((Type)null);
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
			case ValuesPackage.VALUE_SPECIFICATION__TYPE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case ValuesPackage.VALUE_SPECIFICATION__TYPE: return CommonStructurePackage.TYPED_ELEMENT__TYPE;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TYPED_ELEMENT__TYPE: return ValuesPackage.VALUE_SPECIFICATION__TYPE;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ValuesPackage.VALUE_SPECIFICATION___BOOLEAN_VALUE:
				return booleanValue();
			case ValuesPackage.VALUE_SPECIFICATION___INTEGER_VALUE:
				return integerValue();
			case ValuesPackage.VALUE_SPECIFICATION___IS_COMPUTABLE:
				return isComputable();
			case ValuesPackage.VALUE_SPECIFICATION___IS_NULL:
				return isNull();
			case ValuesPackage.VALUE_SPECIFICATION___REAL_VALUE:
				return realValue();
			case ValuesPackage.VALUE_SPECIFICATION___STRING_VALUE:
				return stringValue();
			case ValuesPackage.VALUE_SPECIFICATION___UNLIMITED_VALUE:
				return unlimitedValue();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ValueSpecificationImpl
