/**
 */
package uml.interactions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.commonStructure.impl.NamespaceImpl;

import uml.interactions.GeneralOrdering;
import uml.interactions.Interaction;
import uml.interactions.InteractionConstraint;
import uml.interactions.InteractionFragment;
import uml.interactions.InteractionOperand;
import uml.interactions.InteractionsPackage;
import uml.interactions.Lifeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Operand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.interactions.impl.InteractionOperandImpl#getCovered <em>Covered</em>}</li>
 *   <li>{@link uml.interactions.impl.InteractionOperandImpl#getEnclosingInteraction <em>Enclosing Interaction</em>}</li>
 *   <li>{@link uml.interactions.impl.InteractionOperandImpl#getEnclosingOperand <em>Enclosing Operand</em>}</li>
 *   <li>{@link uml.interactions.impl.InteractionOperandImpl#getGeneralOrdering <em>General Ordering</em>}</li>
 *   <li>{@link uml.interactions.impl.InteractionOperandImpl#getFragment <em>Fragment</em>}</li>
 *   <li>{@link uml.interactions.impl.InteractionOperandImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionOperandImpl extends NamespaceImpl implements InteractionOperand {
	/**
	 * The cached value of the '{@link #getCovered() <em>Covered</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCovered()
	 * @generated
	 * @ordered
	 */
	protected EList<Lifeline> covered;

	/**
	 * The cached value of the '{@link #getGeneralOrdering() <em>General Ordering</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralOrdering()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralOrdering> generalOrdering;

	/**
	 * The cached value of the '{@link #getFragment() <em>Fragment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFragment()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFragment> fragment;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected InteractionConstraint guard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionOperandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteractionsPackage.Literals.INTERACTION_OPERAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lifeline> getCovered() {
		if (covered == null) {
			covered = new EObjectWithInverseResolvingEList.ManyInverse<Lifeline>(Lifeline.class, this, InteractionsPackage.INTERACTION_OPERAND__COVERED, InteractionsPackage.LIFELINE__COVERED_BY);
		}
		return covered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interaction getEnclosingInteraction() {
		if (eContainerFeatureID() != InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION) return null;
		return (Interaction)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingInteraction(Interaction newEnclosingInteraction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosingInteraction, InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingInteraction(Interaction newEnclosingInteraction) {
		if (newEnclosingInteraction != eInternalContainer() || (eContainerFeatureID() != InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION && newEnclosingInteraction != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingInteraction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingInteraction != null)
				msgs = ((InternalEObject)newEnclosingInteraction).eInverseAdd(this, InteractionsPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
			msgs = basicSetEnclosingInteraction(newEnclosingInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION, newEnclosingInteraction, newEnclosingInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionOperand getEnclosingOperand() {
		if (eContainerFeatureID() != InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND) return null;
		return (InteractionOperand)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnclosingOperand(InteractionOperand newEnclosingOperand, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnclosingOperand, InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnclosingOperand(InteractionOperand newEnclosingOperand) {
		if (newEnclosingOperand != eInternalContainer() || (eContainerFeatureID() != InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND && newEnclosingOperand != null)) {
			if (EcoreUtil.isAncestor(this, newEnclosingOperand))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnclosingOperand != null)
				msgs = ((InternalEObject)newEnclosingOperand).eInverseAdd(this, InteractionsPackage.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
			msgs = basicSetEnclosingOperand(newEnclosingOperand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND, newEnclosingOperand, newEnclosingOperand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralOrdering> getGeneralOrdering() {
		if (generalOrdering == null) {
			generalOrdering = new EObjectContainmentEList<GeneralOrdering>(GeneralOrdering.class, this, InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING);
		}
		return generalOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFragment> getFragment() {
		if (fragment == null) {
			fragment = new EObjectContainmentWithInverseEList<InteractionFragment>(InteractionFragment.class, this, InteractionsPackage.INTERACTION_OPERAND__FRAGMENT, InteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
		}
		return fragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionConstraint getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(InteractionConstraint newGuard, NotificationChain msgs) {
		InteractionConstraint oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InteractionsPackage.INTERACTION_OPERAND__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(InteractionConstraint newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InteractionsPackage.INTERACTION_OPERAND__GUARD, null, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InteractionsPackage.INTERACTION_OPERAND__GUARD, null, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteractionsPackage.INTERACTION_OPERAND__GUARD, newGuard, newGuard));
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
			case InteractionsPackage.INTERACTION_OPERAND__COVERED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCovered()).basicAdd(otherEnd, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingInteraction((Interaction)otherEnd, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnclosingOperand((InteractionOperand)otherEnd, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__FRAGMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFragment()).basicAdd(otherEnd, msgs);
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
			case InteractionsPackage.INTERACTION_OPERAND__COVERED:
				return ((InternalEList<?>)getCovered()).basicRemove(otherEnd, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return basicSetEnclosingInteraction(null, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return basicSetEnclosingOperand(null, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return ((InternalEList<?>)getGeneralOrdering()).basicRemove(otherEnd, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__FRAGMENT:
				return ((InternalEList<?>)getFragment()).basicRemove(otherEnd, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__GUARD:
				return basicSetGuard(null, msgs);
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
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return eInternalContainer().eInverseRemove(this, InteractionsPackage.INTERACTION__FRAGMENT, Interaction.class, msgs);
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return eInternalContainer().eInverseRemove(this, InteractionsPackage.INTERACTION_OPERAND__FRAGMENT, InteractionOperand.class, msgs);
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
			case InteractionsPackage.INTERACTION_OPERAND__COVERED:
				return getCovered();
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return getEnclosingInteraction();
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return getEnclosingOperand();
			case InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return getGeneralOrdering();
			case InteractionsPackage.INTERACTION_OPERAND__FRAGMENT:
				return getFragment();
			case InteractionsPackage.INTERACTION_OPERAND__GUARD:
				return getGuard();
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
			case InteractionsPackage.INTERACTION_OPERAND__COVERED:
				getCovered().clear();
				getCovered().addAll((Collection<? extends Lifeline>)newValue);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)newValue);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)newValue);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				getGeneralOrdering().addAll((Collection<? extends GeneralOrdering>)newValue);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__FRAGMENT:
				getFragment().clear();
				getFragment().addAll((Collection<? extends InteractionFragment>)newValue);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__GUARD:
				setGuard((InteractionConstraint)newValue);
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
			case InteractionsPackage.INTERACTION_OPERAND__COVERED:
				getCovered().clear();
				return;
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				setEnclosingInteraction((Interaction)null);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				setEnclosingOperand((InteractionOperand)null);
				return;
			case InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				getGeneralOrdering().clear();
				return;
			case InteractionsPackage.INTERACTION_OPERAND__FRAGMENT:
				getFragment().clear();
				return;
			case InteractionsPackage.INTERACTION_OPERAND__GUARD:
				setGuard((InteractionConstraint)null);
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
			case InteractionsPackage.INTERACTION_OPERAND__COVERED:
				return covered != null && !covered.isEmpty();
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION:
				return getEnclosingInteraction() != null;
			case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND:
				return getEnclosingOperand() != null;
			case InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING:
				return generalOrdering != null && !generalOrdering.isEmpty();
			case InteractionsPackage.INTERACTION_OPERAND__FRAGMENT:
				return fragment != null && !fragment.isEmpty();
			case InteractionsPackage.INTERACTION_OPERAND__GUARD:
				return guard != null;
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
		if (baseClass == InteractionFragment.class) {
			switch (derivedFeatureID) {
				case InteractionsPackage.INTERACTION_OPERAND__COVERED: return InteractionsPackage.INTERACTION_FRAGMENT__COVERED;
				case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION: return InteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION;
				case InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND: return InteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND;
				case InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING: return InteractionsPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING;
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
		if (baseClass == InteractionFragment.class) {
			switch (baseFeatureID) {
				case InteractionsPackage.INTERACTION_FRAGMENT__COVERED: return InteractionsPackage.INTERACTION_OPERAND__COVERED;
				case InteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_INTERACTION: return InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_INTERACTION;
				case InteractionsPackage.INTERACTION_FRAGMENT__ENCLOSING_OPERAND: return InteractionsPackage.INTERACTION_OPERAND__ENCLOSING_OPERAND;
				case InteractionsPackage.INTERACTION_FRAGMENT__GENERAL_ORDERING: return InteractionsPackage.INTERACTION_OPERAND__GENERAL_ORDERING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InteractionOperandImpl
