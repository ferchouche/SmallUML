/**
 */
package uml.activities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.StructuredActivityNode;

import uml.activities.ActivitiesPackage;
import uml.activities.Activity;
import uml.activities.ActivityEdge;
import uml.activities.ActivityGroup;
import uml.activities.ActivityNode;
import uml.activities.ActivityPartition;
import uml.activities.Variable;

import uml.commonBehavior.impl.BehaviorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.impl.ActivityImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#getNode <em>Node</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#isIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#isIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link uml.activities.impl.ActivityImpl#getPartition <em>Partition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity {
	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> group;

	/**
	 * The default value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SINGLE_EXECUTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> partition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitiesPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, ActivitiesPackage.ACTIVITY__EDGE, ActivitiesPackage.ACTIVITY_EDGE__ACTIVITY);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActivitiesPackage.ACTIVITY__NODE, ActivitiesPackage.ACTIVITY_NODE__ACTIVITY);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, ActivitiesPackage.ACTIVITY__VARIABLE, ActivitiesPackage.VARIABLE__ACTIVITY_SCOPE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredActivityNode> getStructuredNode() {
		// TODO: implement this method to return the 'Structured Node' reference list
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
	public EList<ActivityGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, ActivitiesPackage.ACTIVITY__GROUP, ActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(boolean newIsSingleExecution) {
		boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getPartition() {
		if (partition == null) {
			partition = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, ActivitiesPackage.ACTIVITY__PARTITION);
		}
		return partition;
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
			case ActivitiesPackage.ACTIVITY__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup()).basicAdd(otherEnd, msgs);
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
			case ActivitiesPackage.ACTIVITY__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case ActivitiesPackage.ACTIVITY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
			case ActivitiesPackage.ACTIVITY__EDGE:
				return getEdge();
			case ActivitiesPackage.ACTIVITY__NODE:
				return getNode();
			case ActivitiesPackage.ACTIVITY__VARIABLE:
				return getVariable();
			case ActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				return getStructuredNode();
			case ActivitiesPackage.ACTIVITY__GROUP:
				return getGroup();
			case ActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				return isIsReadOnly();
			case ActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return isIsSingleExecution();
			case ActivitiesPackage.ACTIVITY__PARTITION:
				return getPartition();
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
			case ActivitiesPackage.ACTIVITY__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				getStructuredNode().clear();
				getStructuredNode().addAll((Collection<? extends StructuredActivityNode>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution((Boolean)newValue);
				return;
			case ActivitiesPackage.ACTIVITY__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends ActivityPartition>)newValue);
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
			case ActivitiesPackage.ACTIVITY__EDGE:
				getEdge().clear();
				return;
			case ActivitiesPackage.ACTIVITY__NODE:
				getNode().clear();
				return;
			case ActivitiesPackage.ACTIVITY__VARIABLE:
				getVariable().clear();
				return;
			case ActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				getStructuredNode().clear();
				return;
			case ActivitiesPackage.ACTIVITY__GROUP:
				getGroup().clear();
				return;
			case ActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case ActivitiesPackage.ACTIVITY__PARTITION:
				getPartition().clear();
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
			case ActivitiesPackage.ACTIVITY__EDGE:
				return edge != null && !edge.isEmpty();
			case ActivitiesPackage.ACTIVITY__NODE:
				return node != null && !node.isEmpty();
			case ActivitiesPackage.ACTIVITY__VARIABLE:
				return variable != null && !variable.isEmpty();
			case ActivitiesPackage.ACTIVITY__STRUCTURED_NODE:
				return !getStructuredNode().isEmpty();
			case ActivitiesPackage.ACTIVITY__GROUP:
				return group != null && !group.isEmpty();
			case ActivitiesPackage.ACTIVITY__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case ActivitiesPackage.ACTIVITY__IS_SINGLE_EXECUTION:
				return isSingleExecution != IS_SINGLE_EXECUTION_EDEFAULT;
			case ActivitiesPackage.ACTIVITY__PARTITION:
				return partition != null && !partition.isEmpty();
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
