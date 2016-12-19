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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Operation;
import uml.classification.Parameter;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Constraint;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateBinding;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateSignature;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;

import uml.simpleClassifiers.DataType;
import uml.simpleClassifiers.Interface;
import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.structuredClassifiers.StructuredClassifiersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.OperationImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getBodyCondition <em>Body Condition</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getRedefinedOperation <em>Redefined Operation</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getType <em>Type</em>}</li>
 *   <li>{@link uml.classification.impl.OperationImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getBodyCondition() <em>Body Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyCondition()
	 * @generated
	 * @ordered
	 */
	protected Constraint bodyCondition;

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
	 * The default value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_QUERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsQuery() <em>Is Query</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsQuery()
	 * @generated
	 * @ordered
	 */
	protected boolean isQuery = IS_QUERY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = false;

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
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> postcondition;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> precondition;

	/**
	 * The cached value of the '{@link #getRedefinedOperation() <em>Redefined Operation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> redefinedOperation;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, ClassificationPackage.OPERATION__TEMPLATE_BINDING, CommonStructurePackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBodyCondition() {
		if (bodyCondition != null && bodyCondition.eIsProxy()) {
			InternalEObject oldBodyCondition = (InternalEObject)bodyCondition;
			bodyCondition = (Constraint)eResolveProxy(oldBodyCondition);
			if (bodyCondition != oldBodyCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
			}
		}
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBodyCondition() {
		return bodyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyCondition(Constraint newBodyCondition) {
		Constraint oldBodyCondition = bodyCondition;
		bodyCondition = newBodyCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__BODY_CONDITION, oldBodyCondition, bodyCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.structuredClassifiers.Class getClass_() {
		if (eContainerFeatureID() != ClassificationPackage.OPERATION__CLASS) return null;
		return (uml.structuredClassifiers.Class)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClass(uml.structuredClassifiers.Class newClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newClass, ClassificationPackage.OPERATION__CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(uml.structuredClassifiers.Class newClass) {
		if (newClass != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.OPERATION__CLASS && newClass != null)) {
			if (EcoreUtil.isAncestor(this, newClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newClass != null)
				msgs = ((InternalEObject)newClass).eInverseAdd(this, StructuredClassifiersPackage.CLASS__OWNED_OPERATION, uml.structuredClassifiers.Class.class, msgs);
			msgs = basicSetClass(newClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__CLASS, newClass, newClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID() != ClassificationPackage.OPERATION__DATATYPE) return null;
		return (DataType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatype, ClassificationPackage.OPERATION__DATATYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.OPERATION__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (eContainerFeatureID() != ClassificationPackage.OPERATION__INTERFACE) return null;
		return (Interface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, ClassificationPackage.OPERATION__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.OPERATION__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOrdered() {
		// TODO: implement this method to return the 'Is Ordered' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsQuery() {
		return isQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsQuery(boolean newIsQuery) {
		boolean oldIsQuery = isQuery;
		isQuery = newIsQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.OPERATION__IS_QUERY, oldIsQuery, isQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUnique() {
		// TODO: implement this method to return the 'Is Unique' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public EList<Constraint> getPostcondition() {
		if (postcondition == null) {
			postcondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, ClassificationPackage.OPERATION__POSTCONDITION);
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getPrecondition() {
		if (precondition == null) {
			precondition = new EObjectResolvingEList<Constraint>(Constraint.class, this, ClassificationPackage.OPERATION__PRECONDITION);
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getRedefinedOperation() {
		if (redefinedOperation == null) {
			redefinedOperation = new EObjectResolvingEList<Operation>(Operation.class, this, ClassificationPackage.OPERATION__REDEFINED_OPERATION);
		}
		return redefinedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		Type type = basicGetType();
		return type != null && type.eIsProxy() ? (Type)eResolveProxy((InternalEObject)type) : type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetType() {
		// TODO: implement this method to return the 'Type' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	 * The cached invocation delegate for the '{@link #isOrdered() <em>Is Ordered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ORDERED__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.OPERATION___IS_ORDERED).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		try {
			return (Boolean)IS_ORDERED__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isUnique() <em>Is Unique</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_UNIQUE__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.OPERATION___IS_UNIQUE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnique() {
		try {
			return (Boolean)IS_UNIQUE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate LOWER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.OPERATION___LOWER).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #returnResult() <em>Return Result</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #returnResult()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate RETURN_RESULT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.OPERATION___RETURN_RESULT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Parameter> returnResult() {
		try {
			return (EList<Parameter>)RETURN_RESULT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #type() <em>Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #type()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.OPERATION___TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type type() {
		try {
			return (Type)TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	protected static final EOperation.Internal.InvocationDelegate UPPER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.OPERATION___UPPER).getInvocationDelegate();

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
	 * The cached invocation delegate for the '{@link #isTemplate() <em>Is Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TEMPLATE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.TEMPLATEABLE_ELEMENT___IS_TEMPLATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		try {
			return (Boolean)IS_TEMPLATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #parameterableElements()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PARAMETERABLE_ELEMENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParameterableElement> parameterableElements() {
		try {
			return (EList<ParameterableElement>)PARAMETERABLE_ELEMENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isCompatibleWith(uml.commonStructure.ParameterableElement) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompatibleWith(uml.commonStructure.ParameterableElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_COMPATIBLE_WITH_PARAMETERABLE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		try {
			return (Boolean)IS_COMPATIBLE_WITH_PARAMETERABLE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{p}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isTemplateParameter() <em>Is Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TEMPLATE_PARAMETER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		try {
			return (Boolean)IS_TEMPLATE_PARAMETER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case ClassificationPackage.OPERATION__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case ClassificationPackage.OPERATION__CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetClass((uml.structuredClassifiers.Class)otherEnd, msgs);
			case ClassificationPackage.OPERATION__DATATYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType)otherEnd, msgs);
			case ClassificationPackage.OPERATION__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case ClassificationPackage.OPERATION__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case ClassificationPackage.OPERATION__CLASS:
				return basicSetClass(null, msgs);
			case ClassificationPackage.OPERATION__DATATYPE:
				return basicSetDatatype(null, msgs);
			case ClassificationPackage.OPERATION__INTERFACE:
				return basicSetInterface(null, msgs);
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return eInternalContainer().eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case ClassificationPackage.OPERATION__CLASS:
				return eInternalContainer().eInverseRemove(this, StructuredClassifiersPackage.CLASS__OWNED_OPERATION, uml.structuredClassifiers.Class.class, msgs);
			case ClassificationPackage.OPERATION__DATATYPE:
				return eInternalContainer().eInverseRemove(this, SimpleClassifiersPackage.DATA_TYPE__OWNED_OPERATION, DataType.class, msgs);
			case ClassificationPackage.OPERATION__INTERFACE:
				return eInternalContainer().eInverseRemove(this, SimpleClassifiersPackage.INTERFACE__OWNED_OPERATION, Interface.class, msgs);
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case ClassificationPackage.OPERATION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case ClassificationPackage.OPERATION__BODY_CONDITION:
				if (resolve) return getBodyCondition();
				return basicGetBodyCondition();
			case ClassificationPackage.OPERATION__CLASS:
				return getClass_();
			case ClassificationPackage.OPERATION__DATATYPE:
				return getDatatype();
			case ClassificationPackage.OPERATION__INTERFACE:
				return getInterface();
			case ClassificationPackage.OPERATION__IS_ORDERED:
				return isIsOrdered();
			case ClassificationPackage.OPERATION__IS_QUERY:
				return isIsQuery();
			case ClassificationPackage.OPERATION__IS_UNIQUE:
				return isIsUnique();
			case ClassificationPackage.OPERATION__LOWER:
				return getLower();
			case ClassificationPackage.OPERATION__POSTCONDITION:
				return getPostcondition();
			case ClassificationPackage.OPERATION__PRECONDITION:
				return getPrecondition();
			case ClassificationPackage.OPERATION__REDEFINED_OPERATION:
				return getRedefinedOperation();
			case ClassificationPackage.OPERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ClassificationPackage.OPERATION__UPPER:
				return getUpper();
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case ClassificationPackage.OPERATION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case ClassificationPackage.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)newValue);
				return;
			case ClassificationPackage.OPERATION__CLASS:
				setClass((uml.structuredClassifiers.Class)newValue);
				return;
			case ClassificationPackage.OPERATION__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case ClassificationPackage.OPERATION__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case ClassificationPackage.OPERATION__IS_QUERY:
				setIsQuery((Boolean)newValue);
				return;
			case ClassificationPackage.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				getPostcondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ClassificationPackage.OPERATION__PRECONDITION:
				getPrecondition().clear();
				getPrecondition().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ClassificationPackage.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperation().clear();
				getRedefinedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case ClassificationPackage.OPERATION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case ClassificationPackage.OPERATION__BODY_CONDITION:
				setBodyCondition((Constraint)null);
				return;
			case ClassificationPackage.OPERATION__CLASS:
				setClass((uml.structuredClassifiers.Class)null);
				return;
			case ClassificationPackage.OPERATION__DATATYPE:
				setDatatype((DataType)null);
				return;
			case ClassificationPackage.OPERATION__INTERFACE:
				setInterface((Interface)null);
				return;
			case ClassificationPackage.OPERATION__IS_QUERY:
				setIsQuery(IS_QUERY_EDEFAULT);
				return;
			case ClassificationPackage.OPERATION__POSTCONDITION:
				getPostcondition().clear();
				return;
			case ClassificationPackage.OPERATION__PRECONDITION:
				getPrecondition().clear();
				return;
			case ClassificationPackage.OPERATION__REDEFINED_OPERATION:
				getRedefinedOperation().clear();
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
			case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case ClassificationPackage.OPERATION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case ClassificationPackage.OPERATION__BODY_CONDITION:
				return bodyCondition != null;
			case ClassificationPackage.OPERATION__CLASS:
				return getClass_() != null;
			case ClassificationPackage.OPERATION__DATATYPE:
				return getDatatype() != null;
			case ClassificationPackage.OPERATION__INTERFACE:
				return getInterface() != null;
			case ClassificationPackage.OPERATION__IS_ORDERED:
				return isIsOrdered() != IS_ORDERED_EDEFAULT;
			case ClassificationPackage.OPERATION__IS_QUERY:
				return isQuery != IS_QUERY_EDEFAULT;
			case ClassificationPackage.OPERATION__IS_UNIQUE:
				return isIsUnique() != IS_UNIQUE_EDEFAULT;
			case ClassificationPackage.OPERATION__LOWER:
				return getLower() != LOWER_EDEFAULT;
			case ClassificationPackage.OPERATION__POSTCONDITION:
				return postcondition != null && !postcondition.isEmpty();
			case ClassificationPackage.OPERATION__PRECONDITION:
				return precondition != null && !precondition.isEmpty();
			case ClassificationPackage.OPERATION__REDEFINED_OPERATION:
				return redefinedOperation != null && !redefinedOperation.isEmpty();
			case ClassificationPackage.OPERATION__TYPE:
				return basicGetType() != null;
			case ClassificationPackage.OPERATION__UPPER:
				return getUpper() != UPPER_EDEFAULT;
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
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case ClassificationPackage.OPERATION__TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.OPERATION__TEMPLATE_BINDING: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return ClassificationPackage.OPERATION__OWNING_TEMPLATE_PARAMETER;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return ClassificationPackage.OPERATION__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return ClassificationPackage.OPERATION__TEMPLATE_BINDING;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return ClassificationPackage.OPERATION__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return ClassificationPackage.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return ClassificationPackage.OPERATION___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return ClassificationPackage.OPERATION___IS_TEMPLATE;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return ClassificationPackage.OPERATION___PARAMETERABLE_ELEMENTS;
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
			case ClassificationPackage.OPERATION___IS_ORDERED:
				return isOrdered();
			case ClassificationPackage.OPERATION___IS_UNIQUE:
				return isUnique();
			case ClassificationPackage.OPERATION___LOWER:
				return lower();
			case ClassificationPackage.OPERATION___RETURN_RESULT:
				return returnResult();
			case ClassificationPackage.OPERATION___TYPE:
				return type();
			case ClassificationPackage.OPERATION___UPPER:
				return upper();
			case ClassificationPackage.OPERATION___IS_TEMPLATE:
				return isTemplate();
			case ClassificationPackage.OPERATION___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case ClassificationPackage.OPERATION___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case ClassificationPackage.OPERATION___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
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
		result.append(" (isQuery: ");
		result.append(isQuery);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
