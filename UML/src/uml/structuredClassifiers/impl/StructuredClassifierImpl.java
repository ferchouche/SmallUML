/**
 */
package uml.structuredClassifiers.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.Property;

import uml.classification.impl.ClassifierImpl;

import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.Connector;
import uml.structuredClassifiers.StructuredClassifier;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.StructuredClassifierImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.StructuredClassifierImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.StructuredClassifierImpl#getPart <em>Part</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.StructuredClassifierImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class StructuredClassifierImpl extends ClassifierImpl implements StructuredClassifier {
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
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.STRUCTURED_CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentEList<Property>(Property.class, this, StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getPart() {
		// TODO: implement this method to return the 'Part' reference list
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
	public EList<ConnectableElement> getRole() {
		// TODO: implement this method to return the 'Role' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #part() <em>Part</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #part()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PART__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.STRUCTURED_CLASSIFIER___PART).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> part() {
		try {
			return (EList<Property>)PART__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allRoles() <em>All Roles</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allRoles()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_ROLES__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.STRUCTURED_CLASSIFIER___ALL_ROLES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectableElement> allRoles() {
		try {
			return (EList<ConnectableElement>)ALL_ROLES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return getOwnedConnector();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__PART:
				return getPart();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__ROLE:
				return getRole();
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
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
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
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				getOwnedConnector().clear();
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
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__PART:
				return !getPart().isEmpty();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER__ROLE:
				return !getRole().isEmpty();
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
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER___PART:
				return part();
			case StructuredClassifiersPackage.STRUCTURED_CLASSIFIER___ALL_ROLES:
				return allRoles();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StructuredClassifierImpl
