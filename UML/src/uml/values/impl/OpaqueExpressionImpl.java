/**
 */
package uml.values.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import uml.classification.Parameter;

import uml.commonBehavior.Behavior;

import uml.values.OpaqueExpression;
import uml.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.values.impl.OpaqueExpressionImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link uml.values.impl.OpaqueExpressionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link uml.values.impl.OpaqueExpressionImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml.values.impl.OpaqueExpressionImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueExpressionImpl extends ValueSpecificationImpl implements OpaqueExpression {
	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior behavior;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<String> body;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> language;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.OPAQUE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBehavior() {
		if (behavior != null && behavior.eIsProxy()) {
			InternalEObject oldBehavior = (InternalEObject)behavior;
			behavior = (Behavior)eResolveProxy(oldBehavior);
			if (behavior != oldBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ValuesPackage.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
			}
		}
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(Behavior newBehavior) {
		Behavior oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.OPAQUE_EXPRESSION__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBody() {
		if (body == null) {
			body = new EDataTypeEList<String>(String.class, this, ValuesPackage.OPAQUE_EXPRESSION__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguage() {
		if (language == null) {
			language = new EDataTypeUniqueEList<String>(String.class, this, ValuesPackage.OPAQUE_EXPRESSION__LANGUAGE);
		}
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getResult() {
		Parameter result = basicGetResult();
		return result != null && result.eIsProxy() ? (Parameter)eResolveProxy((InternalEObject)result) : result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetResult() {
		// TODO: implement this method to return the 'Result' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #isIntegral() <em>Is Integral</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIntegral()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INTEGRAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.OPAQUE_EXPRESSION___IS_INTEGRAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIntegral() {
		try {
			return (Boolean)IS_INTEGRAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isNonNegative() <em>Is Non Negative</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonNegative()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_NON_NEGATIVE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.OPAQUE_EXPRESSION___IS_NON_NEGATIVE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNonNegative() {
		try {
			return (Boolean)IS_NON_NEGATIVE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isPositive() <em>Is Positive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPositive()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_POSITIVE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.OPAQUE_EXPRESSION___IS_POSITIVE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPositive() {
		try {
			return (Boolean)IS_POSITIVE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #result() <em>Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #result()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RESULT__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.OPAQUE_EXPRESSION___RESULT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter result() {
		try {
			return (Parameter)RESULT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #value() <em>Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #value()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VALUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ValuesPackage.Literals.OPAQUE_EXPRESSION___VALUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int value() {
		try {
			return (Integer)VALUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ValuesPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				if (resolve) return getBehavior();
				return basicGetBehavior();
			case ValuesPackage.OPAQUE_EXPRESSION__BODY:
				return getBody();
			case ValuesPackage.OPAQUE_EXPRESSION__LANGUAGE:
				return getLanguage();
			case ValuesPackage.OPAQUE_EXPRESSION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
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
			case ValuesPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)newValue);
				return;
			case ValuesPackage.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends String>)newValue);
				return;
			case ValuesPackage.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
				getLanguage().addAll((Collection<? extends String>)newValue);
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
			case ValuesPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				setBehavior((Behavior)null);
				return;
			case ValuesPackage.OPAQUE_EXPRESSION__BODY:
				getBody().clear();
				return;
			case ValuesPackage.OPAQUE_EXPRESSION__LANGUAGE:
				getLanguage().clear();
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
			case ValuesPackage.OPAQUE_EXPRESSION__BEHAVIOR:
				return behavior != null;
			case ValuesPackage.OPAQUE_EXPRESSION__BODY:
				return body != null && !body.isEmpty();
			case ValuesPackage.OPAQUE_EXPRESSION__LANGUAGE:
				return language != null && !language.isEmpty();
			case ValuesPackage.OPAQUE_EXPRESSION__RESULT:
				return basicGetResult() != null;
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
			case ValuesPackage.OPAQUE_EXPRESSION___IS_INTEGRAL:
				return isIntegral();
			case ValuesPackage.OPAQUE_EXPRESSION___IS_NON_NEGATIVE:
				return isNonNegative();
			case ValuesPackage.OPAQUE_EXPRESSION___IS_POSITIVE:
				return isPositive();
			case ValuesPackage.OPAQUE_EXPRESSION___RESULT:
				return result();
			case ValuesPackage.OPAQUE_EXPRESSION___VALUE:
				return value();
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
		result.append(" (body: ");
		result.append(body);
		result.append(", language: ");
		result.append(language);
		result.append(')');
		return result.toString();
	}

} //OpaqueExpressionImpl
