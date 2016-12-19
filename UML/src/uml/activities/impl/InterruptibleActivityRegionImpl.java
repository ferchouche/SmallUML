/**
 */
package uml.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.activities.ActivitiesPackage;
import uml.activities.ActivityEdge;
import uml.activities.ActivityNode;
import uml.activities.InterruptibleActivityRegion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.impl.InterruptibleActivityRegionImpl#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link uml.activities.impl.InterruptibleActivityRegionImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion {
	/**
	 * The cached value of the '{@link #getInterruptingEdge() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> interruptingEdge;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.INTERRUPTIBLE_ACTIVITY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getInterruptingEdge() {
		if (interruptingEdge == null) {
			interruptingEdge = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, ActivitiesPackage.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE, ActivitiesPackage.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		}
		return node;
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
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterruptingEdge()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
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
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<?>)getInterruptingEdge()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
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
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdge();
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return getNode();
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
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				getInterruptingEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
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
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				return;
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				getNode().clear();
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
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return interruptingEdge != null && !interruptingEdge.isEmpty();
			case ActivitiesPackage.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return node != null && !node.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InterruptibleActivityRegionImpl
