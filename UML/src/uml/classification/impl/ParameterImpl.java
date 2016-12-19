/**
 */
package uml.classification.impl;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Operation;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.ParameterEffectKind;
import uml.classification.ParameterSet;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.MultiplicityElement;

import uml.structuredClassifiers.impl.ConnectableElementImpl;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.ParameterImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#isIsStream <em>Is Stream</em>}</li>
 *   <li>{@link uml.classification.impl.ParameterImpl#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends ConnectableElementImpl implements Parameter {
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
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterDirectionKind DIRECTION_EDEFAULT = ParameterDirectionKind.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected ParameterDirectionKind direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterEffectKind EFFECT_EDEFAULT = ParameterEffectKind.CREATE;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected ParameterEffectKind effect = EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXCEPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsException() <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsException()
	 * @generated
	 * @ordered
	 */
	protected boolean isException = IS_EXCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStream()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STREAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStream() <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStream()
	 * @generated
	 * @ordered
	 */
	protected boolean isStream = IS_STREAM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterSet() <em>Parameter Set</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterSet> parameterSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__IS_ORDERED, oldIsOrdered, isOrdered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__IS_UNIQUE, oldIsUnique, isUnique));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__LOWER_VALUE, oldLowerValue, newLowerValue);
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
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PARAMETER__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PARAMETER__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__LOWER_VALUE, newLowerValue, newLowerValue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__UPPER_VALUE, oldUpperValue, newUpperValue);
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
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PARAMETER__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PARAMETER__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		Operation operation = basicGetOperation();
		return operation != null && operation.eIsProxy() ? (Operation)eResolveProxy((InternalEObject)operation) : operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		// TODO: implement this method to return the 'Operation' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		// TODO: implement this method to return the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		// TODO: implement this method to set the 'Default' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PARAMETER__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(ParameterDirectionKind newDirection) {
		ParameterDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(ParameterEffectKind newEffect) {
		ParameterEffectKind oldEffect = effect;
		effect = newEffect == null ? EFFECT_EDEFAULT : newEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__EFFECT, oldEffect, effect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsException() {
		return isException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsException(boolean newIsException) {
		boolean oldIsException = isException;
		isException = newIsException;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__IS_EXCEPTION, oldIsException, isException));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStream() {
		return isStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStream(boolean newIsStream) {
		boolean oldIsStream = isStream;
		isStream = newIsStream;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PARAMETER__IS_STREAM, oldIsStream, isStream));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterSet> getParameterSet() {
		if (parameterSet == null) {
			parameterSet = new EObjectWithInverseResolvingEList.ManyInverse<ParameterSet>(ParameterSet.class, this, ClassificationPackage.PARAMETER__PARAMETER_SET, ClassificationPackage.PARAMETER_SET__PARAMETER);
		}
		return parameterSet;
	}

	/**
	 * The cached invocation delegate for the '{@link #default_() <em>Default </em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #default_()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DEFAULT___EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.PARAMETER___DEFAULT_).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String default_() {
		try {
			return (String)DEFAULT___EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassificationPackage.PARAMETER__PARAMETER_SET:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParameterSet()).basicAdd(otherEnd, msgs);
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
			case ClassificationPackage.PARAMETER__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case ClassificationPackage.PARAMETER__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case ClassificationPackage.PARAMETER__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case ClassificationPackage.PARAMETER__PARAMETER_SET:
				return ((InternalEList<?>)getParameterSet()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.PARAMETER__IS_ORDERED:
				return isIsOrdered();
			case ClassificationPackage.PARAMETER__IS_UNIQUE:
				return isIsUnique();
			case ClassificationPackage.PARAMETER__LOWER:
				return getLower();
			case ClassificationPackage.PARAMETER__LOWER_VALUE:
				return getLowerValue();
			case ClassificationPackage.PARAMETER__UPPER:
				return getUpper();
			case ClassificationPackage.PARAMETER__UPPER_VALUE:
				return getUpperValue();
			case ClassificationPackage.PARAMETER__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case ClassificationPackage.PARAMETER__DEFAULT:
				return getDefault();
			case ClassificationPackage.PARAMETER__DEFAULT_VALUE:
				return getDefaultValue();
			case ClassificationPackage.PARAMETER__DIRECTION:
				return getDirection();
			case ClassificationPackage.PARAMETER__EFFECT:
				return getEffect();
			case ClassificationPackage.PARAMETER__IS_EXCEPTION:
				return isIsException();
			case ClassificationPackage.PARAMETER__IS_STREAM:
				return isIsStream();
			case ClassificationPackage.PARAMETER__PARAMETER_SET:
				return getParameterSet();
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
			case ClassificationPackage.PARAMETER__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case ClassificationPackage.PARAMETER__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case ClassificationPackage.PARAMETER__LOWER:
				setLower((Integer)newValue);
				return;
			case ClassificationPackage.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case ClassificationPackage.PARAMETER__UPPER:
				setUpper((Integer)newValue);
				return;
			case ClassificationPackage.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case ClassificationPackage.PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case ClassificationPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case ClassificationPackage.PARAMETER__DIRECTION:
				setDirection((ParameterDirectionKind)newValue);
				return;
			case ClassificationPackage.PARAMETER__EFFECT:
				setEffect((ParameterEffectKind)newValue);
				return;
			case ClassificationPackage.PARAMETER__IS_EXCEPTION:
				setIsException((Boolean)newValue);
				return;
			case ClassificationPackage.PARAMETER__IS_STREAM:
				setIsStream((Boolean)newValue);
				return;
			case ClassificationPackage.PARAMETER__PARAMETER_SET:
				getParameterSet().clear();
				getParameterSet().addAll((Collection<? extends ParameterSet>)newValue);
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
			case ClassificationPackage.PARAMETER__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case ClassificationPackage.PARAMETER__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case ClassificationPackage.PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case ClassificationPackage.PARAMETER__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__EFFECT:
				setEffect(EFFECT_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__IS_EXCEPTION:
				setIsException(IS_EXCEPTION_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__IS_STREAM:
				setIsStream(IS_STREAM_EDEFAULT);
				return;
			case ClassificationPackage.PARAMETER__PARAMETER_SET:
				getParameterSet().clear();
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
			case ClassificationPackage.PARAMETER__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case ClassificationPackage.PARAMETER__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case ClassificationPackage.PARAMETER__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case ClassificationPackage.PARAMETER__LOWER_VALUE:
				return lowerValue != null;
			case ClassificationPackage.PARAMETER__UPPER:
				return getUpper() != UPPER_EDEFAULT;
			case ClassificationPackage.PARAMETER__UPPER_VALUE:
				return upperValue != null;
			case ClassificationPackage.PARAMETER__OPERATION:
				return basicGetOperation() != null;
			case ClassificationPackage.PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? getDefault() != null : !DEFAULT_EDEFAULT.equals(getDefault());
			case ClassificationPackage.PARAMETER__DEFAULT_VALUE:
				return defaultValue != null;
			case ClassificationPackage.PARAMETER__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ClassificationPackage.PARAMETER__EFFECT:
				return effect != EFFECT_EDEFAULT;
			case ClassificationPackage.PARAMETER__IS_EXCEPTION:
				return isException != IS_EXCEPTION_EDEFAULT;
			case ClassificationPackage.PARAMETER__IS_STREAM:
				return isStream != IS_STREAM_EDEFAULT;
			case ClassificationPackage.PARAMETER__PARAMETER_SET:
				return parameterSet != null && !parameterSet.isEmpty();
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
				case ClassificationPackage.PARAMETER__IS_ORDERED: return CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case ClassificationPackage.PARAMETER__IS_UNIQUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case ClassificationPackage.PARAMETER__LOWER: return CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER;
				case ClassificationPackage.PARAMETER__LOWER_VALUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case ClassificationPackage.PARAMETER__UPPER: return CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER;
				case ClassificationPackage.PARAMETER__UPPER_VALUE: return CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER_VALUE;
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
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_ORDERED: return ClassificationPackage.PARAMETER__IS_ORDERED;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__IS_UNIQUE: return ClassificationPackage.PARAMETER__IS_UNIQUE;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER: return ClassificationPackage.PARAMETER__LOWER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__LOWER_VALUE: return ClassificationPackage.PARAMETER__LOWER_VALUE;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER: return ClassificationPackage.PARAMETER__UPPER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT__UPPER_VALUE: return ClassificationPackage.PARAMETER__UPPER_VALUE;
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
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT: return ClassificationPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT: return ClassificationPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___IS__INT_INT: return ClassificationPackage.PARAMETER___IS__INT_INT;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___IS_MULTIVALUED: return ClassificationPackage.PARAMETER___IS_MULTIVALUED;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___LOWER: return ClassificationPackage.PARAMETER___LOWER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___LOWER_BOUND: return ClassificationPackage.PARAMETER___LOWER_BOUND;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___UPPER: return ClassificationPackage.PARAMETER___UPPER;
				case CommonStructurePackage.MULTIPLICITY_ELEMENT___UPPER_BOUND: return ClassificationPackage.PARAMETER___UPPER_BOUND;
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
			case ClassificationPackage.PARAMETER___DEFAULT_:
				return default_();
			case ClassificationPackage.PARAMETER___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return compatibleWith((MultiplicityElement)arguments.get(0));
			case ClassificationPackage.PARAMETER___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return includesMultiplicity((MultiplicityElement)arguments.get(0));
			case ClassificationPackage.PARAMETER___IS__INT_INT:
				return is((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ClassificationPackage.PARAMETER___IS_MULTIVALUED:
				return isMultivalued();
			case ClassificationPackage.PARAMETER___LOWER:
				return lower();
			case ClassificationPackage.PARAMETER___LOWER_BOUND:
				return lowerBound();
			case ClassificationPackage.PARAMETER___UPPER:
				return upper();
			case ClassificationPackage.PARAMETER___UPPER_BOUND:
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
		result.append(", direction: ");
		result.append(direction);
		result.append(", effect: ");
		result.append(effect);
		result.append(", isException: ");
		result.append(isException);
		result.append(", isStream: ");
		result.append(isStream);
		result.append(')');
		return result.toString();
	}

} //ParameterImpl
