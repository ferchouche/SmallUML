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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Property;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Element;
import uml.commonStructure.Relationship;
import uml.commonStructure.Type;

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.AssociationClass;
import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.structuredClassifiers.impl.AssociationClassImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.AssociationClassImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.AssociationClassImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.AssociationClassImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.AssociationClassImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.structuredClassifiers.impl.AssociationClassImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationClassImpl extends ClassImpl implements AssociationClass {
	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuredClassifiersPackage.Literals.ASSOCIATION_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		// TODO: implement this method to return the 'Related Element' reference list
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
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END, ClassificationPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END, ClassificationPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndType() {
		// TODO: implement this method to return the 'End Type' reference list
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
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnd;
	}

	/**
	 * The cached invocation delegate for the '{@link #endType() <em>End Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #endType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate END_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.ASSOCIATION___END_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> endType() {
		try {
			return (EList<Type>)END_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return getRelatedElement();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END:
				return getMemberEnd();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END:
				return getOwnedEnd();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__END_TYPE:
				return getEndType();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED:
				return isIsDerived();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END:
				getMemberEnd().clear();
				return;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END:
				getOwnedEnd().clear();
				return;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__RELATED_ELEMENT:
				return !getRelatedElement().isEmpty();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__END_TYPE:
				return !getEndType().isEmpty();
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case StructuredClassifiersPackage.ASSOCIATION_CLASS__RELATED_ELEMENT: return CommonStructurePackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END: return StructuredClassifiersPackage.ASSOCIATION__MEMBER_END;
				case StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END: return StructuredClassifiersPackage.ASSOCIATION__OWNED_END;
				case StructuredClassifiersPackage.ASSOCIATION_CLASS__END_TYPE: return StructuredClassifiersPackage.ASSOCIATION__END_TYPE;
				case StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED: return StructuredClassifiersPackage.ASSOCIATION__IS_DERIVED;
				case StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END: return StructuredClassifiersPackage.ASSOCIATION__NAVIGABLE_OWNED_END;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.RELATIONSHIP__RELATED_ELEMENT: return StructuredClassifiersPackage.ASSOCIATION_CLASS__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case StructuredClassifiersPackage.ASSOCIATION__MEMBER_END: return StructuredClassifiersPackage.ASSOCIATION_CLASS__MEMBER_END;
				case StructuredClassifiersPackage.ASSOCIATION__OWNED_END: return StructuredClassifiersPackage.ASSOCIATION_CLASS__OWNED_END;
				case StructuredClassifiersPackage.ASSOCIATION__END_TYPE: return StructuredClassifiersPackage.ASSOCIATION_CLASS__END_TYPE;
				case StructuredClassifiersPackage.ASSOCIATION__IS_DERIVED: return StructuredClassifiersPackage.ASSOCIATION_CLASS__IS_DERIVED;
				case StructuredClassifiersPackage.ASSOCIATION__NAVIGABLE_OWNED_END: return StructuredClassifiersPackage.ASSOCIATION_CLASS__NAVIGABLE_OWNED_END;
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
		if (baseClass == Relationship.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseOperationID) {
				case StructuredClassifiersPackage.ASSOCIATION___END_TYPE: return StructuredClassifiersPackage.ASSOCIATION_CLASS___END_TYPE;
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
			case StructuredClassifiersPackage.ASSOCIATION_CLASS___END_TYPE:
				return endType();
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
		result.append(" (isDerived: ");
		result.append(isDerived);
		result.append(')');
		return result.toString();
	}

} //AssociationClassImpl
