/**
 */
package uml.commonStructure.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.Comment;
import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.impl.ElementImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link uml.commonStructure.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link uml.commonStructure.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonStructurePackage.Literals.ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, CommonStructurePackage.ELEMENT__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedElement() {
		// TODO: implement this method to return the 'Owned Element' reference list
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
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetOwner() {
		// TODO: implement this method to return the 'Owner' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #allOwnedElements() <em>All Owned Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allOwnedElements()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_OWNED_ELEMENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.ELEMENT___ALL_OWNED_ELEMENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Element> allOwnedElements() {
		try {
			return (EList<Element>)ALL_OWNED_ELEMENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #mustBeOwned() <em>Must Be Owned</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #mustBeOwned()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MUST_BE_OWNED__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.ELEMENT___MUST_BE_OWNED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mustBeOwned() {
		try {
			return (Boolean)MUST_BE_OWNED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case CommonStructurePackage.ELEMENT__OWNED_COMMENT:
				return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
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
			case CommonStructurePackage.ELEMENT__OWNED_COMMENT:
				return getOwnedComment();
			case CommonStructurePackage.ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case CommonStructurePackage.ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
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
			case CommonStructurePackage.ELEMENT__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
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
			case CommonStructurePackage.ELEMENT__OWNED_COMMENT:
				getOwnedComment().clear();
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
			case CommonStructurePackage.ELEMENT__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case CommonStructurePackage.ELEMENT__OWNED_ELEMENT:
				return !getOwnedElement().isEmpty();
			case CommonStructurePackage.ELEMENT__OWNER:
				return basicGetOwner() != null;
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
			case CommonStructurePackage.ELEMENT___ALL_OWNED_ELEMENTS:
				return allOwnedElements();
			case CommonStructurePackage.ELEMENT___MUST_BE_OWNED:
				return mustBeOwned();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ElementImpl
