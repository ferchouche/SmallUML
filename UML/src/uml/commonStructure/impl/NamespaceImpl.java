/**
 */
package uml.commonStructure.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Constraint;
import uml.commonStructure.ElementImport;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageImport;
import uml.commonStructure.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.impl.NamespaceImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamespaceImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamespaceImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml.commonStructure.impl.NamespaceImpl#getPackageImport <em>Package Import</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class NamespaceImpl extends NamedElementImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonStructurePackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT, CommonStructurePackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		// TODO: implement this method to return the 'Imported Member' reference list
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
	public EList<NamedElement> getMember() {
		// TODO: implement this method to return the 'Member' reference list
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
	public EList<NamedElement> getOwnedMember() {
		// TODO: implement this method to return the 'Owned Member' reference list
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
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, CommonStructurePackage.NAMESPACE__OWNED_RULE, CommonStructurePackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT, CommonStructurePackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * The cached invocation delegate for the '{@link #excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #excludeCollisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EXCLUDE_COLLISIONS_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___EXCLUDE_COLLISIONS__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
		try {
			return (EList<PackageableElement>)EXCLUDE_COLLISIONS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{imps}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getNamesOfMember(uml.commonStructure.NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamesOfMember(uml.commonStructure.NamedElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NAMES_OF_MEMBER_NAMED_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getNamesOfMember(NamedElement element) {
		try {
			return (EList<String>)GET_NAMES_OF_MEMBER_NAMED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importMembers(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IMPORT_MEMBERS_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___IMPORT_MEMBERS__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
		try {
			return (EList<PackageableElement>)IMPORT_MEMBERS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{imps}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #importedMember() <em>Imported Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importedMember()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IMPORTED_MEMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___IMPORTED_MEMBER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> importedMember() {
		try {
			return (EList<PackageableElement>)IMPORTED_MEMBER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #membersAreDistinguishable()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MEMBERS_ARE_DISTINGUISHABLE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		try {
			return (Boolean)MEMBERS_ARE_DISTINGUISHABLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case CommonStructurePackage.NAMESPACE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
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
			case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case CommonStructurePackage.NAMESPACE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
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
			case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT:
				return getElementImport();
			case CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER:
				return getImportedMember();
			case CommonStructurePackage.NAMESPACE__MEMBER:
				return getMember();
			case CommonStructurePackage.NAMESPACE__OWNED_MEMBER:
				return getOwnedMember();
			case CommonStructurePackage.NAMESPACE__OWNED_RULE:
				return getOwnedRule();
			case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT:
				return getPackageImport();
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
			case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case CommonStructurePackage.NAMESPACE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
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
			case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case CommonStructurePackage.NAMESPACE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT:
				getPackageImport().clear();
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
			case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER:
				return !getImportedMember().isEmpty();
			case CommonStructurePackage.NAMESPACE__MEMBER:
				return !getMember().isEmpty();
			case CommonStructurePackage.NAMESPACE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case CommonStructurePackage.NAMESPACE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<PackageableElement>)arguments.get(0));
			case CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
				return getNamesOfMember((NamedElement)arguments.get(0));
			case CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST:
				return importMembers((EList<PackageableElement>)arguments.get(0));
			case CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER:
				return importedMember();
			case CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE:
				return membersAreDistinguishable();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NamespaceImpl
