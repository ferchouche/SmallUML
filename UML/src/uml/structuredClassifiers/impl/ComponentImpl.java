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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.PackageableElement;

import uml.simpleClassifiers.Interface;

import uml.structuredClassifiers.Component;
import uml.structuredClassifiers.ComponentRealization;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentImpl#isIsIndirectlyInstantiated <em>Is Indirectly Instantiated</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentImpl#getProvided <em>Provided</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.ComponentImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ClassImpl implements Component {
	/**
	 * The default value of the '{@link #isIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIRECTLY_INSTANTIATED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsIndirectlyInstantiated() <em>Is Indirectly Instantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndirectlyInstantiated()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndirectlyInstantiated = IS_INDIRECTLY_INSTANTIATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> packagedElement;

	/**
	 * The cached value of the '{@link #getRealization() <em>Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentRealization> realization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndirectlyInstantiated() {
		return isIndirectlyInstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndirectlyInstantiated(boolean newIsIndirectlyInstantiated) {
		boolean oldIsIndirectlyInstantiated = isIndirectlyInstantiated;
		isIndirectlyInstantiated = newIsIndirectlyInstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED, oldIsIndirectlyInstantiated, isIndirectlyInstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, StructuredClassifiersPackage.COMPONENT__PACKAGED_ELEMENT);
		}
		return packagedElement;
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
	public EList<ComponentRealization> getRealization() {
		if (realization == null) {
			realization = new EObjectContainmentWithInverseEList<ComponentRealization>(ComponentRealization.class, this, StructuredClassifiersPackage.COMPONENT__REALIZATION, StructuredClassifiersPackage.COMPONENT_REALIZATION__ABSTRACTION);
		}
		return realization;
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
	protected static final EOperation.Internal.InvocationDelegate PROVIDED__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.COMPONENT___PROVIDED).getInvocationDelegate();

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
	protected static final EOperation.Internal.InvocationDelegate REQUIRED__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.COMPONENT___REQUIRED).getInvocationDelegate();

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuredClassifiersPackage.COMPONENT__REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRealization()).basicAdd(otherEnd, msgs);
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
			case StructuredClassifiersPackage.COMPONENT__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.COMPONENT__REALIZATION:
				return ((InternalEList<?>)getRealization()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIsIndirectlyInstantiated();
			case StructuredClassifiersPackage.COMPONENT__PACKAGED_ELEMENT:
				return getPackagedElement();
			case StructuredClassifiersPackage.COMPONENT__PROVIDED:
				return getProvided();
			case StructuredClassifiersPackage.COMPONENT__REALIZATION:
				return getRealization();
			case StructuredClassifiersPackage.COMPONENT__REQUIRED:
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
			case StructuredClassifiersPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated((Boolean)newValue);
				return;
			case StructuredClassifiersPackage.COMPONENT__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case StructuredClassifiersPackage.COMPONENT__REALIZATION:
				getRealization().clear();
				getRealization().addAll((Collection<? extends ComponentRealization>)newValue);
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
			case StructuredClassifiersPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				setIsIndirectlyInstantiated(IS_INDIRECTLY_INSTANTIATED_EDEFAULT);
				return;
			case StructuredClassifiersPackage.COMPONENT__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case StructuredClassifiersPackage.COMPONENT__REALIZATION:
				getRealization().clear();
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
			case StructuredClassifiersPackage.COMPONENT__IS_INDIRECTLY_INSTANTIATED:
				return isIndirectlyInstantiated != IS_INDIRECTLY_INSTANTIATED_EDEFAULT;
			case StructuredClassifiersPackage.COMPONENT__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case StructuredClassifiersPackage.COMPONENT__PROVIDED:
				return !getProvided().isEmpty();
			case StructuredClassifiersPackage.COMPONENT__REALIZATION:
				return realization != null && !realization.isEmpty();
			case StructuredClassifiersPackage.COMPONENT__REQUIRED:
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
			case StructuredClassifiersPackage.COMPONENT___PROVIDED:
				return provided();
			case StructuredClassifiersPackage.COMPONENT___REQUIRED:
				return required();
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
		result.append(" (isIndirectlyInstantiated: ");
		result.append(isIndirectlyInstantiated);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
