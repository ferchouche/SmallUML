/**
 */
package uml.commonStructure.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Dependency;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.VisibilityKind;

import uml.values.StringExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.impl.NamedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamedElementImpl#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamedElementImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamedElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamedElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamedElementImpl#getClientDependency <em>Client Dependency</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamedElementImpl extends ElementImpl implements NamedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNameExpression() <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameExpression()
	 * @generated
	 * @ordered
	 */
	protected StringExpression nameExpression;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonStructurePackage.Literals.NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.NAMED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getNameExpression() {
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameExpression(StringExpression newNameExpression, NotificationChain msgs) {
		StringExpression oldNameExpression = nameExpression;
		nameExpression = newNameExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION, oldNameExpression, newNameExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameExpression(StringExpression newNameExpression) {
		if (newNameExpression != nameExpression) {
			NotificationChain msgs = null;
			if (nameExpression != null)
				msgs = ((InternalEObject)nameExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION, null, msgs);
			if (newNameExpression != null)
				msgs = ((InternalEObject)newNameExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION, null, msgs);
			msgs = basicSetNameExpression(newNameExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION, newNameExpression, newNameExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getNamespace() {
		Namespace namespace = basicGetNamespace();
		return namespace != null && namespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)namespace) : namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetNamespace() {
		// TODO: implement this method to return the 'Namespace' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedName() {
		// TODO: implement this method to return the 'Qualified Name' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.NAMED_ELEMENT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getClientDependency() {
		// TODO: implement this method to return the 'Client Dependency' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #allNamespaces() <em>All Namespaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allNamespaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_NAMESPACES__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMED_ELEMENT___ALL_NAMESPACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Namespace> allNamespaces() {
		try {
			return (EList<Namespace>)ALL_NAMESPACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allOwningPackages() <em>All Owning Packages</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allOwningPackages()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_OWNING_PACKAGES__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMED_ELEMENT___ALL_OWNING_PACKAGES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<uml.packages.Package> allOwningPackages() {
		try {
			return (EList<uml.packages.Package>)ALL_OWNING_PACKAGES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isDistinguishableFrom(uml.commonStructure.NamedElement, uml.commonStructure.Namespace) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinguishableFrom(uml.commonStructure.NamedElement, uml.commonStructure.Namespace)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DISTINGUISHABLE_FROM_NAMED_ELEMENT_NAMESPACE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinguishableFrom(NamedElement n, Namespace ns) {
		try {
			return (Boolean)IS_DISTINGUISHABLE_FROM_NAMED_ELEMENT_NAMESPACE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{n, ns}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #qualifiedName() <em>Qualified Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #qualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate QUALIFIED_NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMED_ELEMENT___QUALIFIED_NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String qualifiedName() {
		try {
			return (String)QUALIFIED_NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #separator() <em>Separator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #separator()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SEPARATOR__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMED_ELEMENT___SEPARATOR).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String separator() {
		try {
			return (String)SEPARATOR__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #clientDependency() <em>Client Dependency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #clientDependency()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CLIENT_DEPENDENCY__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMED_ELEMENT___CLIENT_DEPENDENCY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Dependency> clientDependency() {
		try {
			return (EList<Dependency>)CLIENT_DEPENDENCY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION:
				return basicSetNameExpression(null, msgs);
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
			case CommonStructurePackage.NAMED_ELEMENT__NAME:
				return getName();
			case CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION:
				return getNameExpression();
			case CommonStructurePackage.NAMED_ELEMENT__NAMESPACE:
				if (resolve) return getNamespace();
				return basicGetNamespace();
			case CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case CommonStructurePackage.NAMED_ELEMENT__VISIBILITY:
				return getVisibility();
			case CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return getClientDependency();
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
			case CommonStructurePackage.NAMED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)newValue);
				return;
			case CommonStructurePackage.NAMED_ELEMENT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependency().clear();
				getClientDependency().addAll((Collection<? extends Dependency>)newValue);
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
			case CommonStructurePackage.NAMED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION:
				setNameExpression((StringExpression)null);
				return;
			case CommonStructurePackage.NAMED_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				getClientDependency().clear();
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
			case CommonStructurePackage.NAMED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CommonStructurePackage.NAMED_ELEMENT__NAME_EXPRESSION:
				return nameExpression != null;
			case CommonStructurePackage.NAMED_ELEMENT__NAMESPACE:
				return basicGetNamespace() != null;
			case CommonStructurePackage.NAMED_ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case CommonStructurePackage.NAMED_ELEMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case CommonStructurePackage.NAMED_ELEMENT__CLIENT_DEPENDENCY:
				return !getClientDependency().isEmpty();
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
			case CommonStructurePackage.NAMED_ELEMENT___ALL_NAMESPACES:
				return allNamespaces();
			case CommonStructurePackage.NAMED_ELEMENT___ALL_OWNING_PACKAGES:
				return allOwningPackages();
			case CommonStructurePackage.NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE:
				return isDistinguishableFrom((NamedElement)arguments.get(0), (Namespace)arguments.get(1));
			case CommonStructurePackage.NAMED_ELEMENT___QUALIFIED_NAME:
				return qualifiedName();
			case CommonStructurePackage.NAMED_ELEMENT___SEPARATOR:
				return separator();
			case CommonStructurePackage.NAMED_ELEMENT___CLIENT_DEPENDENCY:
				return clientDependency();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //NamedElementImpl
