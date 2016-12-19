/**
 */
package uml.informationFlows.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.activities.ActivityEdge;

import uml.classification.Classifier;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.Element;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Relationship;

import uml.commonStructure.impl.PackageableElementImpl;

import uml.informationFlows.InformationFlow;
import uml.informationFlows.InformationFlowsPackage;

import uml.interactions.Message;

import uml.structuredClassifiers.Connector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getConveyed <em>Conveyed</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getInformationSource <em>Information Source</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getInformationTarget <em>Information Target</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getRealization <em>Realization</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getRealizingActivityEdge <em>Realizing Activity Edge</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getRealizingConnector <em>Realizing Connector</em>}</li>
 *   <li>{@link uml.informationFlows.impl.InformationFlowImpl#getRealizingMessage <em>Realizing Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationFlowImpl extends PackageableElementImpl implements InformationFlow {
	/**
	 * The cached value of the '{@link #getConveyed() <em>Conveyed</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyed()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> conveyed;

	/**
	 * The cached value of the '{@link #getInformationSource() <em>Information Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationSource()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> informationSource;

	/**
	 * The cached value of the '{@link #getInformationTarget() <em>Information Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<NamedElement> informationTarget;

	/**
	 * The cached value of the '{@link #getRealization() <em>Realization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealization()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> realization;

	/**
	 * The cached value of the '{@link #getRealizingActivityEdge() <em>Realizing Activity Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingActivityEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> realizingActivityEdge;

	/**
	 * The cached value of the '{@link #getRealizingConnector() <em>Realizing Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> realizingConnector;

	/**
	 * The cached value of the '{@link #getRealizingMessage() <em>Realizing Message</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizingMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> realizingMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InformationFlowsPackage.Literals.INFORMATION_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		// TODO: implement this method to return the 'Related Element' reference list
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
	public EList<Element> getSource() {
		// TODO: implement this method to return the 'Source' reference list
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
	public EList<Element> getTarget() {
		// TODO: implement this method to return the 'Target' reference list
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
	public EList<Classifier> getConveyed() {
		if (conveyed == null) {
			conveyed = new EObjectResolvingEList<Classifier>(Classifier.class, this, InformationFlowsPackage.INFORMATION_FLOW__CONVEYED);
		}
		return conveyed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInformationSource() {
		if (informationSource == null) {
			informationSource = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_SOURCE);
		}
		return informationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInformationTarget() {
		if (informationTarget == null) {
			informationTarget = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_TARGET);
		}
		return informationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRealization() {
		if (realization == null) {
			realization = new EObjectResolvingEList<Relationship>(Relationship.class, this, InformationFlowsPackage.INFORMATION_FLOW__REALIZATION);
		}
		return realization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getRealizingActivityEdge() {
		if (realizingActivityEdge == null) {
			realizingActivityEdge = new EObjectResolvingEList<ActivityEdge>(ActivityEdge.class, this, InformationFlowsPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
		}
		return realizingActivityEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getRealizingConnector() {
		if (realizingConnector == null) {
			realizingConnector = new EObjectResolvingEList<Connector>(Connector.class, this, InformationFlowsPackage.INFORMATION_FLOW__REALIZING_CONNECTOR);
		}
		return realizingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getRealizingMessage() {
		if (realizingMessage == null) {
			realizingMessage = new EObjectResolvingEList<Message>(Message.class, this, InformationFlowsPackage.INFORMATION_FLOW__REALIZING_MESSAGE);
		}
		return realizingMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InformationFlowsPackage.INFORMATION_FLOW__RELATED_ELEMENT:
				return getRelatedElement();
			case InformationFlowsPackage.INFORMATION_FLOW__SOURCE:
				return getSource();
			case InformationFlowsPackage.INFORMATION_FLOW__TARGET:
				return getTarget();
			case InformationFlowsPackage.INFORMATION_FLOW__CONVEYED:
				return getConveyed();
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_SOURCE:
				return getInformationSource();
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_TARGET:
				return getInformationTarget();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZATION:
				return getRealization();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE:
				return getRealizingActivityEdge();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_CONNECTOR:
				return getRealizingConnector();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_MESSAGE:
				return getRealizingMessage();
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
			case InformationFlowsPackage.INFORMATION_FLOW__CONVEYED:
				getConveyed().clear();
				getConveyed().addAll((Collection<? extends Classifier>)newValue);
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_SOURCE:
				getInformationSource().clear();
				getInformationSource().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_TARGET:
				getInformationTarget().clear();
				getInformationTarget().addAll((Collection<? extends NamedElement>)newValue);
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZATION:
				getRealization().clear();
				getRealization().addAll((Collection<? extends Relationship>)newValue);
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE:
				getRealizingActivityEdge().clear();
				getRealizingActivityEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_CONNECTOR:
				getRealizingConnector().clear();
				getRealizingConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_MESSAGE:
				getRealizingMessage().clear();
				getRealizingMessage().addAll((Collection<? extends Message>)newValue);
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
			case InformationFlowsPackage.INFORMATION_FLOW__CONVEYED:
				getConveyed().clear();
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_SOURCE:
				getInformationSource().clear();
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_TARGET:
				getInformationTarget().clear();
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZATION:
				getRealization().clear();
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE:
				getRealizingActivityEdge().clear();
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_CONNECTOR:
				getRealizingConnector().clear();
				return;
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_MESSAGE:
				getRealizingMessage().clear();
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
			case InformationFlowsPackage.INFORMATION_FLOW__RELATED_ELEMENT:
				return !getRelatedElement().isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__SOURCE:
				return !getSource().isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__TARGET:
				return !getTarget().isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__CONVEYED:
				return conveyed != null && !conveyed.isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_SOURCE:
				return informationSource != null && !informationSource.isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__INFORMATION_TARGET:
				return informationTarget != null && !informationTarget.isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZATION:
				return realization != null && !realization.isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE:
				return realizingActivityEdge != null && !realizingActivityEdge.isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_CONNECTOR:
				return realizingConnector != null && !realizingConnector.isEmpty();
			case InformationFlowsPackage.INFORMATION_FLOW__REALIZING_MESSAGE:
				return realizingMessage != null && !realizingMessage.isEmpty();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case InformationFlowsPackage.INFORMATION_FLOW__RELATED_ELEMENT: return CommonStructurePackage.RELATIONSHIP__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (derivedFeatureID) {
				case InformationFlowsPackage.INFORMATION_FLOW__SOURCE: return CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE;
				case InformationFlowsPackage.INFORMATION_FLOW__TARGET: return CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.RELATIONSHIP__RELATED_ELEMENT: return InformationFlowsPackage.INFORMATION_FLOW__RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DirectedRelationship.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.DIRECTED_RELATIONSHIP__SOURCE: return InformationFlowsPackage.INFORMATION_FLOW__SOURCE;
				case CommonStructurePackage.DIRECTED_RELATIONSHIP__TARGET: return InformationFlowsPackage.INFORMATION_FLOW__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InformationFlowImpl
