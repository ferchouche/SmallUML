/**
 */
package uml.simpleClassifiers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.Operation;
import uml.classification.Property;

import uml.classification.impl.ClassifierImpl;

import uml.simpleClassifiers.Interface;
import uml.simpleClassifiers.Reception;
import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.stateMachines.ProtocolStateMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceImpl#getRedefinedInterface <em>Redefined Interface</em>}</li>
 *   <li>{@link uml.simpleClassifiers.impl.InterfaceImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends ClassifierImpl implements Interface {
	/**
	 * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifier;

	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedReception() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReception()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReception;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProtocolStateMachine protocol;

	/**
	 * The cached value of the '{@link #getRedefinedInterface() <em>Redefined Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> redefinedInterface;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimpleClassifiersPackage.Literals.INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, SimpleClassifiersPackage.INTERFACE__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE, ClassificationPackage.PROPERTY__INTERFACE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, SimpleClassifiersPackage.INTERFACE__OWNED_RECEPTION);
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolStateMachine getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProtocol(ProtocolStateMachine newProtocol, NotificationChain msgs) {
		ProtocolStateMachine oldProtocol = protocol;
		protocol = newProtocol;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimpleClassifiersPackage.INTERFACE__PROTOCOL, oldProtocol, newProtocol);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProtocolStateMachine newProtocol) {
		if (newProtocol != protocol) {
			NotificationChain msgs = null;
			if (protocol != null)
				msgs = ((InternalEObject)protocol).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimpleClassifiersPackage.INTERFACE__PROTOCOL, null, msgs);
			if (newProtocol != null)
				msgs = ((InternalEObject)newProtocol).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimpleClassifiersPackage.INTERFACE__PROTOCOL, null, msgs);
			msgs = basicSetProtocol(newProtocol, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimpleClassifiersPackage.INTERFACE__PROTOCOL, newProtocol, newProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRedefinedInterface() {
		if (redefinedInterface == null) {
			redefinedInterface = new EObjectResolvingEList<Interface>(Interface.class, this, SimpleClassifiersPackage.INTERFACE__REDEFINED_INTERFACE);
		}
		return redefinedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION, ClassificationPackage.OPERATION__INTERFACE);
		}
		return ownedOperation;
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
			case SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
			case SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
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
			case SimpleClassifiersPackage.INTERFACE__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
			case SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case SimpleClassifiersPackage.INTERFACE__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
			case SimpleClassifiersPackage.INTERFACE__PROTOCOL:
				return basicSetProtocol(null, msgs);
			case SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
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
			case SimpleClassifiersPackage.INTERFACE__NESTED_CLASSIFIER:
				return getNestedClassifier();
			case SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case SimpleClassifiersPackage.INTERFACE__OWNED_RECEPTION:
				return getOwnedReception();
			case SimpleClassifiersPackage.INTERFACE__PROTOCOL:
				return getProtocol();
			case SimpleClassifiersPackage.INTERFACE__REDEFINED_INTERFACE:
				return getRedefinedInterface();
			case SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION:
				return getOwnedOperation();
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
			case SimpleClassifiersPackage.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case SimpleClassifiersPackage.INTERFACE__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
				return;
			case SimpleClassifiersPackage.INTERFACE__PROTOCOL:
				setProtocol((ProtocolStateMachine)newValue);
				return;
			case SimpleClassifiersPackage.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterface().clear();
				getRedefinedInterface().addAll((Collection<? extends Interface>)newValue);
				return;
			case SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case SimpleClassifiersPackage.INTERFACE__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				return;
			case SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case SimpleClassifiersPackage.INTERFACE__OWNED_RECEPTION:
				getOwnedReception().clear();
				return;
			case SimpleClassifiersPackage.INTERFACE__PROTOCOL:
				setProtocol((ProtocolStateMachine)null);
				return;
			case SimpleClassifiersPackage.INTERFACE__REDEFINED_INTERFACE:
				getRedefinedInterface().clear();
				return;
			case SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION:
				getOwnedOperation().clear();
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
			case SimpleClassifiersPackage.INTERFACE__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
			case SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case SimpleClassifiersPackage.INTERFACE__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case SimpleClassifiersPackage.INTERFACE__PROTOCOL:
				return protocol != null;
			case SimpleClassifiersPackage.INTERFACE__REDEFINED_INTERFACE:
				return redefinedInterface != null && !redefinedInterface.isEmpty();
			case SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterfaceImpl
