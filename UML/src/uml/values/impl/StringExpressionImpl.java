/**
 */
package uml.values.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateBinding;
import uml.commonStructure.TemplateSignature;
import uml.commonStructure.TemplateableElement;

import uml.values.StringExpression;
import uml.values.ValuesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.values.impl.StringExpressionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.values.impl.StringExpressionImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.values.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 *   <li>{@link uml.values.impl.StringExpressionImpl#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringExpressionImpl extends ExpressionImpl implements StringExpression {
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
	 * The cached value of the '{@link #getSubExpression() <em>Sub Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<StringExpression> subExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ValuesPackage.Literals.STRING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING, CommonStructurePackage.TEMPLATE_BINDING__BOUND_ELEMENT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getOwningExpression() {
		if (eContainerFeatureID() != ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION) return null;
		return (StringExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningExpression(StringExpression newOwningExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningExpression, ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(StringExpression newOwningExpression) {
		if (newOwningExpression != eInternalContainer() || (eContainerFeatureID() != ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION && newOwningExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOwningExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningExpression != null)
				msgs = ((InternalEObject)newOwningExpression).eInverseAdd(this, ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
			msgs = basicSetOwningExpression(newOwningExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION, newOwningExpression, newOwningExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getSubExpression() {
		if (subExpression == null) {
			subExpression = new EObjectContainmentWithInverseEList<StringExpression>(StringExpression.class, this, ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION, ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION);
		}
		return subExpression;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningExpression((StringExpression)otherEnd, msgs);
			case ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubExpression()).basicAdd(otherEnd, msgs);
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
			case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return basicSetOwningExpression(null, msgs);
			case ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<?>)getSubExpression()).basicRemove(otherEnd, msgs);
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
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
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
			case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression();
			case ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return getSubExpression();
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
			case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)newValue);
				return;
			case ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
				getSubExpression().addAll((Collection<? extends StringExpression>)newValue);
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
			case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)null);
				return;
			case ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
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
			case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case ValuesPackage.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression() != null;
			case ValuesPackage.STRING_EXPRESSION__SUB_EXPRESSION:
				return subExpression != null && !subExpression.isEmpty();
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
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return ValuesPackage.STRING_EXPRESSION__TEMPLATE_BINDING;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return ValuesPackage.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return ValuesPackage.STRING_EXPRESSION___IS_TEMPLATE;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return ValuesPackage.STRING_EXPRESSION___PARAMETERABLE_ELEMENTS;
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
			case ValuesPackage.STRING_EXPRESSION___IS_TEMPLATE:
				return isTemplate();
			case ValuesPackage.STRING_EXPRESSION___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StringExpressionImpl
