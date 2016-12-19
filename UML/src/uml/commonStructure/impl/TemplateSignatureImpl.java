/**
 */
package uml.commonStructure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateSignature;
import uml.commonStructure.TemplateableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.impl.TemplateSignatureImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link uml.commonStructure.impl.TemplateSignatureImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link uml.commonStructure.impl.TemplateSignatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateSignatureImpl extends ElementImpl implements TemplateSignature {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateSignatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonStructurePackage.Literals.TEMPLATE_SIGNATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectResolvingEList<TemplateParameter>(TemplateParameter.class, this, CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateableElement getTemplate() {
		if (eContainerFeatureID() != CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE) return null;
		return (TemplateableElement)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplate(TemplateableElement newTemplate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplate, CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplate(TemplateableElement newTemplate) {
		if (newTemplate != eInternalContainer() || (eContainerFeatureID() != CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE && newTemplate != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE, newTemplate, newTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateParameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentWithInverseEList<TemplateParameter>(TemplateParameter.class, this, CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER, CommonStructurePackage.TEMPLATE_PARAMETER__SIGNATURE);
		}
		return ownedParameter;
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplate((TemplateableElement)otherEnd, msgs);
			case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
				return basicSetTemplate(null, msgs);
			case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER:
				return getParameter();
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate();
			case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return getOwnedParameter();
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends TemplateParameter>)newValue);
				return;
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)newValue);
				return;
			case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends TemplateParameter>)newValue);
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER:
				getParameter().clear();
				return;
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
				setTemplate((TemplateableElement)null);
				return;
			case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
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
			case CommonStructurePackage.TEMPLATE_SIGNATURE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE:
				return getTemplate() != null;
			case CommonStructurePackage.TEMPLATE_SIGNATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemplateSignatureImpl
