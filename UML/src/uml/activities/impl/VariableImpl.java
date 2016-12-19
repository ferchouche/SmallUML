/**
 */
package uml.activities.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import uml.actions.Action;
import uml.actions.ActionsPackage;
import uml.actions.StructuredActivityNode;

import uml.activities.ActivitiesPackage;
import uml.activities.Activity;
import uml.activities.Variable;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.MultiplicityElement;

import uml.structuredClassifiers.impl.ConnectableElementImpl;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.impl.VariableImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#getActivityScope <em>Activity Scope</em>}</li>
 *   <li>{@link uml.activities.impl.VariableImpl#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends ConnectableElementImpl implements Variable {
	/**
	 * The default value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final int LOWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final int UPPER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(int newLower) {
		// TODO: implement this method to set the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.VARIABLE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.VARIABLE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(int newUpper) {
		// TODO: implement this method to set the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.VARIABLE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActivitiesPackage.VARIABLE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityScope() {
		if (eContainerFeatureID() != ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityScope(Activity newActivityScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityScope, ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityScope(Activity newActivityScope) {
		if (newActivityScope != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE && newActivityScope != null)) {
			if (EcoreUtil.isAncestor(this, newActivityScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityScope != null)
				msgs = ((InternalEObject)newActivityScope).eInverseAdd(this, ActivitiesPackage.ACTIVITY__VARIABLE, Activity.class, msgs);
			msgs = basicSetActivityScope(newActivityScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE, newActivityScope, newActivityScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getScope() {
		if (eContainerFeatureID() != ActivitiesPackage.VARIABLE__SCOPE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(StructuredActivityNode newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, ActivitiesPackage.VARIABLE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(StructuredActivityNode newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != ActivitiesPackage.VARIABLE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE, StructuredActivityNode.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.VARIABLE__SCOPE, newScope, newScope));
	}

	/**
	 * The cached invocation delegate for the '{@link #isAccessibleBy(uml.actions.Action) <em>Is Accessible By</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccessibleBy(uml.actions.Action)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ACCESSIBLE_BY_ACTION__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivitiesPackage.Literals.VARIABLE___IS_ACCESSIBLE_BY__ACTION).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccessibleBy(Action a) {
		try {
			return (Boolean)IS_ACCESSIBLE_BY_ACTION__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{a}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #compatibleWith(uml.commonStructure.MultiplicityElement) <em>Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #compatibleWith(uml.commonStructure.MultiplicityElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate COMPATIBLE_WITH_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean compatibleWith(MultiplicityElement other) {
		try {
			return (Boolean)COMPATIBLE_WITH_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{other}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #includesMultiplicity(uml.commonStructure.MultiplicityElement) <em>Includes Multiplicity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #includesMultiplicity(uml.commonStructure.MultiplicityElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCLUDES_MULTIPLICITY_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean includesMultiplicity(MultiplicityElement m) {
		try {
			return (Boolean)INCLUDES_MULTIPLICITY_MULTIPLICITY_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{m}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #is(int, int) <em>Is</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #is(int, int)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_INT_INT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___IS__INT_INT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean is(int lowerbound, int upperbound) {
		try {
			return (Boolean)IS_INT_INT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{lowerbound, upperbound}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isMultivalued() <em>Is Multivalued</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultivalued()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_MULTIVALUED__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___IS_MULTIVALUED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultivalued() {
		try {
			return (Boolean)IS_MULTIVALUED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #lower() <em>Lower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lower()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LOWER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___LOWER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lower() {
		try {
			return (Integer)LOWER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #lowerBound() <em>Lower Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #lowerBound()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate LOWER_BOUND__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___LOWER_BOUND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int lowerBound() {
		try {
			return (Integer)LOWER_BOUND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #upper() <em>Upper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #upper()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate UPPER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___UPPER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upper() {
		try {
			return (Integer)UPPER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #upperBound() <em>Upper Bound</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #upperBound()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate UPPER_BOUND__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.MULTIPLICITY_ELEMENT___UPPER_BOUND).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int upperBound() {
		try {
			return (Integer)UPPER_BOUND__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityScope((Activity)otherEnd, msgs);
			case ActivitiesPackage.VARIABLE__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((StructuredActivityNode)otherEnd, msgs);
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
			case ActivitiesPackage.VARIABLE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case ActivitiesPackage.VARIABLE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				return basicSetActivityScope(null, msgs);
			case ActivitiesPackage.VARIABLE__SCOPE:
				return basicSetScope(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY__VARIABLE, Activity.class, msgs);
			case ActivitiesPackage.VARIABLE__SCOPE:
				return eInternalContainer().eInverseRemove(this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE, StructuredActivityNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActivitiesPackage.VARIABLE__IS_ORDERED:
				return isIsOrdered();
			case ActivitiesPackage.VARIABLE__IS_UNIQUE:
				return isIsUnique();
			case ActivitiesPackage.VARIABLE__LOWER:
				return getLower();
			case ActivitiesPackage.VARIABLE__LOWER_VALUE:
				return getLowerValue();
			case ActivitiesPackage.VARIABLE__UPPER:
				return getUpper();
			case ActivitiesPackage.VARIABLE__UPPER_VALUE:
				return getUpperValue();
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				return getActivityScope();
			case ActivitiesPackage.VARIABLE__SCOPE:
				return getScope();
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
			case ActivitiesPackage.VARIABLE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case ActivitiesPackage.VARIABLE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case ActivitiesPackage.VARIABLE__LOWER:
				setLower((Integer)newValue);
				return;
			case ActivitiesPackage.VARIABLE__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case ActivitiesPackage.VARIABLE__UPPER:
				setUpper((Integer)newValue);
				return;
			case ActivitiesPackage.VARIABLE__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				setActivityScope((Activity)newValue);
				return;
			case ActivitiesPackage.VARIABLE__SCOPE:
				setScope((StructuredActivityNode)newValue);
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
			case ActivitiesPackage.VARIABLE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case ActivitiesPackage.VARIABLE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case ActivitiesPackage.VARIABLE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case ActivitiesPackage.VARIABLE__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case ActivitiesPackage.VARIABLE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case ActivitiesPackage.VARIABLE__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				setActivityScope((Activity)null);
				return;
			case ActivitiesPackage.VARIABLE__SCOPE:
				setScope((StructuredActivityNode)null);
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
			case ActivitiesPackage.VARIABLE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case ActivitiesPackage.VARIABLE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case ActivitiesPackage.VARIABLE__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case ActivitiesPackage.VARIABLE__LOWER_VALUE:
				return lowerValue != null;
			case ActivitiesPackage.VARIABLE__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case ActivitiesPackage.VARIABLE__UPPER_VALUE:
				return upperValue != null;
			case ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE:
				return getActivityScope() != null;
			case ActivitiesPackage.VARIABLE__SCOPE:
				return getScope() != null;
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
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case ActivitiesPackage.VARIABLE__IS_ORDERED: return CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case ActivitiesPackage.VARIABLE__IS_UNIQUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case ActivitiesPackage.VARIABLE__LOWER: return CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER;
				case ActivitiesPackage.VARIABLE__LOWER_VALUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case ActivitiesPackage.VARIABLE__UPPER: return CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER;
				case ActivitiesPackage.VARIABLE__UPPER_VALUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return ActivitiesPackage.VARIABLE__IS_ORDERED;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return ActivitiesPackage.VARIABLE__IS_UNIQUE;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER: return ActivitiesPackage.VARIABLE__LOWER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return ActivitiesPackage.VARIABLE__LOWER_VALUE;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER: return ActivitiesPackage.VARIABLE__UPPER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return ActivitiesPackage.VARIABLE__UPPER_VALUE;
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
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT: return ActivitiesPackage.VARIABLE___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT: return ActivitiesPackage.VARIABLE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___IS__INT_INT: return ActivitiesPackage.VARIABLE___IS__INT_INT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED: return ActivitiesPackage.VARIABLE___IS_MULTIVALUED;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___LOWER: return ActivitiesPackage.VARIABLE___LOWER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___LOWER_BOUND: return ActivitiesPackage.VARIABLE___LOWER_BOUND;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___UPPER: return ActivitiesPackage.VARIABLE___UPPER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___UPPER_BOUND: return ActivitiesPackage.VARIABLE___UPPER_BOUND;
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
			case ActivitiesPackage.VARIABLE___IS_ACCESSIBLE_BY__ACTION:
				return isAccessibleBy((Action)arguments.get(0));
			case ActivitiesPackage.VARIABLE___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return compatibleWith((MultiplicityElement)arguments.get(0));
			case ActivitiesPackage.VARIABLE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return includesMultiplicity((MultiplicityElement)arguments.get(0));
			case ActivitiesPackage.VARIABLE___IS__INT_INT:
				return is((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ActivitiesPackage.VARIABLE___IS_MULTIVALUED:
				return isMultivalued();
			case ActivitiesPackage.VARIABLE___LOWER:
				return lower();
			case ActivitiesPackage.VARIABLE___LOWER_BOUND:
				return lowerBound();
			case ActivitiesPackage.VARIABLE___UPPER:
				return upper();
			case ActivitiesPackage.VARIABLE___UPPER_BOUND:
				return upperBound();
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
