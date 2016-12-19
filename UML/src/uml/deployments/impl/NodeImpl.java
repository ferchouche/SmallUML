/**
 */
package uml.deployments.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.PackageableElement;

import uml.deployments.Deployment;
import uml.deployments.DeploymentTarget;
import uml.deployments.DeploymentsPackage;
import uml.deployments.Node;

import uml.structuredClassifiers.impl.ClassImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.impl.NodeImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link uml.deployments.impl.NodeImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link uml.deployments.impl.NodeImpl#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends ClassImpl implements Node {
	/**
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployment;

	/**
	 * The cached value of the '{@link #getNestedNode() <em>Nested Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nestedNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeploymentsPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, DeploymentsPackage.NODE__DEPLOYMENT, DeploymentsPackage.DEPLOYMENT__LOCATION);
		}
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getDeployedElement() {
		// TODO: implement this method to return the 'Deployed Element' reference list
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
	public EList<Node> getNestedNode() {
		if (nestedNode == null) {
			nestedNode = new EObjectContainmentEList<Node>(Node.class, this, DeploymentsPackage.NODE__NESTED_NODE);
		}
		return nestedNode;
	}

	/**
	 * The cached invocation delegate for the '{@link #deployedElement() <em>Deployed Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #deployedElement()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DEPLOYED_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)DeploymentsPackage.Literals.DEPLOYMENT_TARGET___DEPLOYED_ELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> deployedElement() {
		try {
			return (EList<PackageableElement>)DEPLOYED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case DeploymentsPackage.NODE__DEPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployment()).basicAdd(otherEnd, msgs);
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
			case DeploymentsPackage.NODE__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case DeploymentsPackage.NODE__NESTED_NODE:
				return ((InternalEList<?>)getNestedNode()).basicRemove(otherEnd, msgs);
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
			case DeploymentsPackage.NODE__DEPLOYMENT:
				return getDeployment();
			case DeploymentsPackage.NODE__DEPLOYED_ELEMENT:
				return getDeployedElement();
			case DeploymentsPackage.NODE__NESTED_NODE:
				return getNestedNode();
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
			case DeploymentsPackage.NODE__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case DeploymentsPackage.NODE__NESTED_NODE:
				getNestedNode().clear();
				getNestedNode().addAll((Collection<? extends Node>)newValue);
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
			case DeploymentsPackage.NODE__DEPLOYMENT:
				getDeployment().clear();
				return;
			case DeploymentsPackage.NODE__NESTED_NODE:
				getNestedNode().clear();
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
			case DeploymentsPackage.NODE__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case DeploymentsPackage.NODE__DEPLOYED_ELEMENT:
				return !getDeployedElement().isEmpty();
			case DeploymentsPackage.NODE__NESTED_NODE:
				return nestedNode != null && !nestedNode.isEmpty();
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
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case DeploymentsPackage.NODE__DEPLOYMENT: return DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
				case DeploymentsPackage.NODE__DEPLOYED_ELEMENT: return DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYMENT: return DeploymentsPackage.NODE__DEPLOYMENT;
				case DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return DeploymentsPackage.NODE__DEPLOYED_ELEMENT;
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
		if (baseClass == DeploymentTarget.class) {
			switch (baseOperationID) {
				case DeploymentsPackage.DEPLOYMENT_TARGET___DEPLOYED_ELEMENT: return DeploymentsPackage.NODE___DEPLOYED_ELEMENT;
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
			case DeploymentsPackage.NODE___DEPLOYED_ELEMENT:
				return deployedElement();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NodeImpl
