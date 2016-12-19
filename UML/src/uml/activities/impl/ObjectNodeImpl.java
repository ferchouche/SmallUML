/**
 */
package uml.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.activities.ActivitiesPackage;
import uml.activities.ObjectNode;
import uml.activities.ObjectNodeOrderingKind;

import uml.commonBehavior.Behavior;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Type;
import uml.commonStructure.TypedElement;

import uml.stateMachines.State;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.impl.ObjectNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uml.activities.impl.ObjectNodeImpl#getInState <em>In State</em>}</li>
 *   <li>{@link uml.activities.impl.ObjectNodeImpl#isIsControlType <em>Is Control Type</em>}</li>
 *   <li>{@link uml.activities.impl.ObjectNodeImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link uml.activities.impl.ObjectNodeImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link uml.activities.impl.ObjectNodeImpl#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectNodeImpl extends ActivityNodeImpl implements ObjectNode {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getInState() <em>In State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> inState;

	/**
	 * The default value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONTROL_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsControlType() <em>Is Control Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsControlType()
	 * @generated
	 * @ordered
	 */
	protected boolean isControlType = IS_CONTROL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final ObjectNodeOrderingKind ORDERING_EDEFAULT = ObjectNodeOrderingKind.FIFO;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected ObjectNodeOrderingKind ordering = ORDERING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Behavior selection;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperBound;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.OBJECT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Type)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.OBJECT_NODE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OBJECT_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getInState() {
		if (inState == null) {
			inState = new EObjectResolvingEList<State>(State.class, this, ActivitiesPackage.OBJECT_NODE__IN_STATE);
		}
		return inState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsControlType() {
		return isControlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsControlType(boolean newIsControlType) {
		boolean oldIsControlType = isControlType;
		isControlType = newIsControlType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE, oldIsControlType, isControlType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectNodeOrderingKind getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(ObjectNodeOrderingKind newOrdering) {
		ObjectNodeOrderingKind oldOrdering = ordering;
		ordering = newOrdering == null ? ORDERING_EDEFAULT : newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OBJECT_NODE__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getSelection() {
		if (selection != null && selection.eIsProxy()) {
			InternalEObject oldSelection = (InternalEObject)selection;
			selection = (Behavior)eResolveProxy(oldSelection);
			if (selection != oldSelection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActivitiesPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
			}
		}
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Behavior newSelection) {
		Behavior oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OBJECT_NODE__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperBound() {
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperBound(ValueSpecification newUpperBound, NotificationChain msgs) {
		ValueSpecification oldUpperBound = upperBound;
		upperBound = newUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OBJECT_NODE__UPPER_BOUND, oldUpperBound, newUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperBound(ValueSpecification newUpperBound) {
		if (newUpperBound != upperBound) {
			NotificationChain msgs = null;
			if (upperBound != null)
				msgs = ((InternalEObject)upperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			if (newUpperBound != null)
				msgs = ((InternalEObject)newUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.OBJECT_NODE__UPPER_BOUND, null, msgs);
			msgs = basicSetUpperBound(newUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.OBJECT_NODE__UPPER_BOUND, newUpperBound, newUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.OBJECT_NODE__UPPER_BOUND:
				return basicSetUpperBound(null, msgs);
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
			case ActivitiesPackage.OBJECT_NODE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ActivitiesPackage.OBJECT_NODE__IN_STATE:
				return getInState();
			case ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				return isIsControlType();
			case ActivitiesPackage.OBJECT_NODE__ORDERING:
				return getOrdering();
			case ActivitiesPackage.OBJECT_NODE__SELECTION:
				if (resolve) return getSelection();
				return basicGetSelection();
			case ActivitiesPackage.OBJECT_NODE__UPPER_BOUND:
				return getUpperBound();
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
			case ActivitiesPackage.OBJECT_NODE__TYPE:
				setType((Type)newValue);
				return;
			case ActivitiesPackage.OBJECT_NODE__IN_STATE:
				getInState().clear();
				getInState().addAll((Collection<? extends State>)newValue);
				return;
			case ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				setIsControlType((Boolean)newValue);
				return;
			case ActivitiesPackage.OBJECT_NODE__ORDERING:
				setOrdering((ObjectNodeOrderingKind)newValue);
				return;
			case ActivitiesPackage.OBJECT_NODE__SELECTION:
				setSelection((Behavior)newValue);
				return;
			case ActivitiesPackage.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)newValue);
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
			case ActivitiesPackage.OBJECT_NODE__TYPE:
				setType((Type)null);
				return;
			case ActivitiesPackage.OBJECT_NODE__IN_STATE:
				getInState().clear();
				return;
			case ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				setIsControlType(IS_CONTROL_TYPE_EDEFAULT);
				return;
			case ActivitiesPackage.OBJECT_NODE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case ActivitiesPackage.OBJECT_NODE__SELECTION:
				setSelection((Behavior)null);
				return;
			case ActivitiesPackage.OBJECT_NODE__UPPER_BOUND:
				setUpperBound((ValueSpecification)null);
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
			case ActivitiesPackage.OBJECT_NODE__TYPE:
				return type != null;
			case ActivitiesPackage.OBJECT_NODE__IN_STATE:
				return inState != null && !inState.isEmpty();
			case ActivitiesPackage.OBJECT_NODE__IS_CONTROL_TYPE:
				return isControlType != IS_CONTROL_TYPE_EDEFAULT;
			case ActivitiesPackage.OBJECT_NODE__ORDERING:
				return ordering != ORDERING_EDEFAULT;
			case ActivitiesPackage.OBJECT_NODE__SELECTION:
				return selection != null;
			case ActivitiesPackage.OBJECT_NODE__UPPER_BOUND:
				return upperBound != null;
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
		if (baseClass == TypedElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.OBJECT_NODE__TYPE: return CommonStructurePackage.TYPED_ELEMENT__TYPE;
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
		if (baseClass == TypedElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TYPED_ELEMENT__TYPE: return ActivitiesPackage.OBJECT_NODE__TYPE;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isControlType: ");
		result.append(isControlType);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //ObjectNodeImpl
