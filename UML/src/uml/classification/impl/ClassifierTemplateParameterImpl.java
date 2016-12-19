/**
 */
package uml.classification.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.ClassifierTemplateParameter;

import uml.commonStructure.impl.TemplateParameterImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.ClassifierTemplateParameterImpl#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierTemplateParameterImpl#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierTemplateParameterImpl extends TemplateParameterImpl implements ClassifierTemplateParameter {
	/**
	 * The default value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_SUBSTITUTABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAllowSubstitutable() <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowSubstitutable()
	 * @generated
	 * @ordered
	 */
	protected boolean allowSubstitutable = ALLOW_SUBSTITUTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstrainingClassifier() <em>Constraining Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrainingClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> constrainingClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierTemplateParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFIER_TEMPLATE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowSubstitutable() {
		return allowSubstitutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowSubstitutable(boolean newAllowSubstitutable) {
		boolean oldAllowSubstitutable = allowSubstitutable;
		allowSubstitutable = newAllowSubstitutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE, oldAllowSubstitutable, allowSubstitutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getConstrainingClassifier() {
		if (constrainingClassifier == null) {
			constrainingClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
		}
		return constrainingClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				return isAllowSubstitutable();
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
				return getConstrainingClassifier();
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
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				setAllowSubstitutable((Boolean)newValue);
				return;
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
				getConstrainingClassifier().clear();
				getConstrainingClassifier().addAll((Collection<? extends Classifier>)newValue);
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
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				setAllowSubstitutable(ALLOW_SUBSTITUTABLE_EDEFAULT);
				return;
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
				getConstrainingClassifier().clear();
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
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE:
				return allowSubstitutable != ALLOW_SUBSTITUTABLE_EDEFAULT;
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER:
				return constrainingClassifier != null && !constrainingClassifier.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (allowSubstitutable: ");
		result.append(allowSubstitutable);
		result.append(')');
		return result.toString();
	}

} //ClassifierTemplateParameterImpl
