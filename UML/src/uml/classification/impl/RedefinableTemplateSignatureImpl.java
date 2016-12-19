/**
 */
package uml.classification.impl;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.RedefinableTemplateSignature;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateSignature;
import uml.commonStructure.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefinable Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.RedefinableTemplateSignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.RedefinableTemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link uml.classification.impl.RedefinableTemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.RedefinableTemplateSignatureImpl#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.classification.impl.RedefinableTemplateSignatureImpl#getExtendedSignature <em>Extended Signature</em>}</li>
 *   <li>{@link uml.classification.impl.RedefinableTemplateSignatureImpl#getInheritedParameter <em>Inherited Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedefinableTemplateSignatureImpl extends RedefinableElementImpl implements RedefinableTemplateSignature {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> parameter;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateParameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getExtendedSignature() <em>Extended Signature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSignature()
	 * @generated
	 * @ordered
	 */
	protected EList<RedefinableTemplateSignature> extendedSignature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinableTemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectResolvingEList<TemplateParameter>(TemplateParameter.class, this, ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID() != ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE) return null;
		return (TemplateableElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplate, ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
			if (EcoreUtil.isAncestor(this, newTemplate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplate != null)
				msgs = ((InternalEObject)newTemplate).eInverseAdd(this, CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
			msgs = basicSetTemplate(newTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<TemplateParameter>(TemplateParameter.class, this, ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER, CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getClassifier() {
		Classifier classifier = basicGetClassifier();
		return classifier != null && classifier.eIsProxy() ? (Classifier)eResolveProxy((InternalEObject)classifier) : classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetClassifier() {
		// TODO: implement this method to return the 'Classifier' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableTemplateSignature> getExtendedSignature() {
		if (extendedSignature == null) {
			extendedSignature = new EObjectResolvingEList<RedefinableTemplateSignature>(RedefinableTemplateSignature.class, this, ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
		}
		return extendedSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getInheritedParameter() {
		// TODO: implement this method to return the 'Inherited Parameter' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #inheritedParameter() <em>Inherited Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inheritedParameter()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INHERITED_PARAMETER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TemplateParameter> inheritedParameter() {
		try {
			return (EList<TemplateParameter>)INHERITED_PARAMETER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement)otherEnd, msgs);
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedParameter()).basicAdd(otherEnd, msgs);
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return eInternalContainer().eInverseRemove(this, CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, TemplateableElement.class, msgs);
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return getParameter();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
				if (resolve) return getClassifier();
				return basicGetClassifier();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				return getExtendedSignature();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
				return getInheritedParameter();
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)newValue);
				return;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				getExtendedSignature().clear();
				getExtendedSignature().addAll((Collection<? extends RedefinableTemplateSignature>)newValue);
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				return;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)null);
				return;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				getExtendedSignature().clear();
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
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate() != null;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER:
				return basicGetClassifier() != null;
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE:
				return extendedSignature != null && !extendedSignature.isEmpty();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER:
				return !getInheritedParameter().isEmpty();
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
		if (baseClass == TemplateSignature.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER: return CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER;
				case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE: return CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE;
				case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER: return CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER;
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
		if (baseClass == TemplateSignature.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER: return ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__PARAMETER;
				case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE: return ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__TEMPLATE;
				case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER: return ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE__OWNED_PARAMETER;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETER:
				return inheritedParameter();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RedefinableTemplateSignatureImpl
