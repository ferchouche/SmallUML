/**
 */
package uml.interactions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import uml.interactions.Gate;
import uml.interactions.InteractionOperand;
import uml.interactions.InteractionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GateImpl extends MessageEndImpl implements Gate {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionsPackage.Literals.GATE;
	}

	/**
	 * The cached invocation delegate for the '{@link #isOutsideCf() <em>Is Outside Cf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutsideCf()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_OUTSIDE_CF__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___IS_OUTSIDE_CF).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutsideCf() {
		try {
			return (Boolean)IS_OUTSIDE_CF__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isInsideCf() <em>Is Inside Cf</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsideCf()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INSIDE_CF__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___IS_INSIDE_CF).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsideCf() {
		try {
			return (Boolean)IS_INSIDE_CF__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isActual() <em>Is Actual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActual()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ACTUAL__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___IS_ACTUAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActual() {
		try {
			return (Boolean)IS_ACTUAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isFormal() <em>Is Formal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFormal()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FORMAL__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___IS_FORMAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFormal() {
		try {
			return (Boolean)IS_FORMAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getName() <em>Get Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___GET_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		try {
			return (String)GET_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #matches(uml.interactions.Gate) <em>Matches</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #matches(uml.interactions.Gate)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MATCHES_GATE__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___MATCHES__GATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean matches(Gate gateToMatch) {
		try {
			return (Boolean)MATCHES_GATE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{gateToMatch}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getOperand() <em>Get Operand</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_OPERAND__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.GATE___GET_OPERAND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getOperand() {
		try {
			return (InteractionOperand)GET_OPERAND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InteractionsPackage.GATE___IS_OUTSIDE_CF:
				return isOutsideCf();
			case InteractionsPackage.GATE___IS_INSIDE_CF:
				return isInsideCf();
			case InteractionsPackage.GATE___IS_ACTUAL:
				return isActual();
			case InteractionsPackage.GATE___IS_FORMAL:
				return isFormal();
			case InteractionsPackage.GATE___GET_NAME:
				return getName();
			case InteractionsPackage.GATE___MATCHES__GATE:
				return matches((Gate)arguments.get(0));
			case InteractionsPackage.GATE___GET_OPERAND:
				return getOperand();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GateImpl
