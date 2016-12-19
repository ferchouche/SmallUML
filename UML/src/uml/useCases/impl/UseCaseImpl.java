/**
 */
package uml.useCases.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;

import uml.simpleClassifiers.impl.BehavioredClassifierImpl;

import uml.useCases.Extend;
import uml.useCases.ExtensionPoint;
import uml.useCases.Include;
import uml.useCases.UseCase;
import uml.useCases.UseCasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.useCases.impl.UseCaseImpl#getExtend <em>Extend</em>}</li>
 *   <li>{@link uml.useCases.impl.UseCaseImpl#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link uml.useCases.impl.UseCaseImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link uml.useCases.impl.UseCaseImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseCaseImpl extends BehavioredClassifierImpl implements UseCase {
	/**
	 * The cached value of the '{@link #getExtend() <em>Extend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtend()
	 * @generated
	 * @ordered
	 */
	protected EList<Extend> extend;

	/**
	 * The cached value of the '{@link #getExtensionPoint() <em>Extension Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionPoint> extensionPoint;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UseCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UseCasesPackage.Literals.USE_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extend> getExtend() {
		if (extend == null) {
			extend = new EObjectContainmentWithInverseEList<Extend>(Extend.class, this, UseCasesPackage.USE_CASE__EXTEND, UseCasesPackage.EXTEND__EXTENSION);
		}
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionPoint> getExtensionPoint() {
		if (extensionPoint == null) {
			extensionPoint = new EObjectContainmentWithInverseEList<ExtensionPoint>(ExtensionPoint.class, this, UseCasesPackage.USE_CASE__EXTENSION_POINT, UseCasesPackage.EXTENSION_POINT__USE_CASE);
		}
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentWithInverseEList<Include>(Include.class, this, UseCasesPackage.USE_CASE__INCLUDE, UseCasesPackage.INCLUDE__INCLUDING_CASE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getSubject() {
		if (subject == null) {
			subject = new EObjectWithInverseResolvingEList.ManyInverse<Classifier>(Classifier.class, this, UseCasesPackage.USE_CASE__SUBJECT, ClassificationPackage.CLASSIFIER__USE_CASE);
		}
		return subject;
	}

	/**
	 * The cached invocation delegate for the '{@link #allIncludedUseCases() <em>All Included Use Cases</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allIncludedUseCases()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_INCLUDED_USE_CASES__EINVOCATION_DELEGATE = ((EOperation.Internal)UseCasesPackage.Literals.USE_CASE___ALL_INCLUDED_USE_CASES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> allIncludedUseCases() {
		try {
			return (EList<UseCase>)ALL_INCLUDED_USE_CASES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case UseCasesPackage.USE_CASE__EXTEND:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtend()).basicAdd(otherEnd, msgs);
			case UseCasesPackage.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionPoint()).basicAdd(otherEnd, msgs);
			case UseCasesPackage.USE_CASE__INCLUDE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInclude()).basicAdd(otherEnd, msgs);
			case UseCasesPackage.USE_CASE__SUBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubject()).basicAdd(otherEnd, msgs);
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
			case UseCasesPackage.USE_CASE__EXTEND:
				return ((InternalEList<?>)getExtend()).basicRemove(otherEnd, msgs);
			case UseCasesPackage.USE_CASE__EXTENSION_POINT:
				return ((InternalEList<?>)getExtensionPoint()).basicRemove(otherEnd, msgs);
			case UseCasesPackage.USE_CASE__INCLUDE:
				return ((InternalEList<?>)getInclude()).basicRemove(otherEnd, msgs);
			case UseCasesPackage.USE_CASE__SUBJECT:
				return ((InternalEList<?>)getSubject()).basicRemove(otherEnd, msgs);
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
			case UseCasesPackage.USE_CASE__EXTEND:
				return getExtend();
			case UseCasesPackage.USE_CASE__EXTENSION_POINT:
				return getExtensionPoint();
			case UseCasesPackage.USE_CASE__INCLUDE:
				return getInclude();
			case UseCasesPackage.USE_CASE__SUBJECT:
				return getSubject();
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
			case UseCasesPackage.USE_CASE__EXTEND:
				getExtend().clear();
				getExtend().addAll((Collection<? extends Extend>)newValue);
				return;
			case UseCasesPackage.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				getExtensionPoint().addAll((Collection<? extends ExtensionPoint>)newValue);
				return;
			case UseCasesPackage.USE_CASE__INCLUDE:
				getInclude().clear();
				getInclude().addAll((Collection<? extends Include>)newValue);
				return;
			case UseCasesPackage.USE_CASE__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection<? extends Classifier>)newValue);
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
			case UseCasesPackage.USE_CASE__EXTEND:
				getExtend().clear();
				return;
			case UseCasesPackage.USE_CASE__EXTENSION_POINT:
				getExtensionPoint().clear();
				return;
			case UseCasesPackage.USE_CASE__INCLUDE:
				getInclude().clear();
				return;
			case UseCasesPackage.USE_CASE__SUBJECT:
				getSubject().clear();
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
			case UseCasesPackage.USE_CASE__EXTEND:
				return extend != null && !extend.isEmpty();
			case UseCasesPackage.USE_CASE__EXTENSION_POINT:
				return extensionPoint != null && !extensionPoint.isEmpty();
			case UseCasesPackage.USE_CASE__INCLUDE:
				return include != null && !include.isEmpty();
			case UseCasesPackage.USE_CASE__SUBJECT:
				return subject != null && !subject.isEmpty();
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
			case UseCasesPackage.USE_CASE___ALL_INCLUDED_USE_CASES:
				return allIncludedUseCases();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UseCaseImpl
