/**
 */
package uml.interactions.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.interactions.InteractionFragment;
import uml.interactions.InteractionsPackage;
import uml.interactions.Message;
import uml.interactions.MessageEnd;
import uml.interactions.MessageOccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Occurrence Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.impl.MessageOccurrenceSpecificationImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageOccurrenceSpecificationImpl extends OccurrenceSpecificationImpl implements MessageOccurrenceSpecification {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageOccurrenceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionsPackage.Literals.MESSAGE_OCCURRENCE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * The cached invocation delegate for the '{@link #oppositeEnd() <em>Opposite End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #oppositeEnd()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OPPOSITE_END__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.MESSAGE_END___OPPOSITE_END).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageEnd> oppositeEnd() {
		try {
			return (EList<MessageEnd>)OPPOSITE_END__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSend() <em>Is Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSend()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SEND__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.MESSAGE_END___IS_SEND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSend() {
		try {
			return (Boolean)IS_SEND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isReceive() <em>Is Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReceive()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_RECEIVE__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.MESSAGE_END___IS_RECEIVE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReceive() {
		try {
			return (Boolean)IS_RECEIVE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #enclosingFragment() <em>Enclosing Fragment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #enclosingFragment()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ENCLOSING_FRAGMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)InteractionsPackage.Literals.MESSAGE_END___ENCLOSING_FRAGMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InteractionFragment> enclosingFragment() {
		try {
			return (EList<InteractionFragment>)ENCLOSING_FRAGMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
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
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE:
				setMessage((Message)newValue);
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
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE:
				setMessage((Message)null);
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
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE:
				return message != null;
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
		if (baseClass == MessageEnd.class) {
			switch (derivedFeatureID) {
				case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE: return InteractionsPackage.MESSAGE_END__MESSAGE;
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
		if (baseClass == MessageEnd.class) {
			switch (baseFeatureID) {
				case InteractionsPackage.MESSAGE_END__MESSAGE: return InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION__MESSAGE;
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
		if (baseClass == MessageEnd.class) {
			switch (baseOperationID) {
				case InteractionsPackage.MESSAGE_END___OPPOSITE_END: return InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END;
				case InteractionsPackage.MESSAGE_END___IS_SEND: return InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND;
				case InteractionsPackage.MESSAGE_END___IS_RECEIVE: return InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE;
				case InteractionsPackage.MESSAGE_END___ENCLOSING_FRAGMENT: return InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT;
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
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___OPPOSITE_END:
				return oppositeEnd();
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_SEND:
				return isSend();
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___IS_RECEIVE:
				return isReceive();
			case InteractionsPackage.MESSAGE_OCCURRENCE_SPECIFICATION___ENCLOSING_FRAGMENT:
				return enclosingFragment();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MessageOccurrenceSpecificationImpl
