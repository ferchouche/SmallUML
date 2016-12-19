/**
 */
package uml.actions.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.actions.ActionsPackage;
import uml.actions.InputPin;
import uml.actions.OutputPin;
import uml.actions.StructuredActivityNode;

import uml.activities.ActivitiesPackage;
import uml.activities.Activity;
import uml.activities.ActivityEdge;
import uml.activities.ActivityGroup;
import uml.activities.ActivityNode;
import uml.activities.Variable;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.Constraint;
import uml.commonStructure.ElementImport;
import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.PackageImport;
import uml.commonStructure.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 *   <li>{@link uml.actions.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {
	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

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
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStructuredNodeInput() <em>Structured Node Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> structuredNodeInput;

	/**
	 * The cached value of the '{@link #getStructuredNodeOutput() <em>Structured Node Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> structuredNodeOutput;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionsPackage.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, CommonStructurePackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		// TODO: implement this method to return the 'Imported Member' reference list
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
	public EList<NamedElement> getMember() {
		// TODO: implement this method to return the 'Member' reference list
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
	public EList<NamedElement> getOwnedMember() {
		// TODO: implement this method to return the 'Owned Member' reference list
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
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, CommonStructurePackage.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, CommonStructurePackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		// TODO: implement this method to return the 'Contained Node' reference list
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
	public Activity getInActivity() {
		if (eContainerFeatureID() != ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInActivity(Activity newInActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInActivity, ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		if (newInActivity != eInternalContainer() || (eContainerFeatureID() != ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY && newInActivity != null)) {
			if (EcoreUtil.isAncestor(this, newInActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInActivity != null)
				msgs = ((InternalEObject)newInActivity).eInverseAdd(this, ActivitiesPackage.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetInActivity(newInActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, newInActivity, newInActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroup() {
		// TODO: implement this method to return the 'Subgroup' reference list
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
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy() ? (ActivityGroup)eResolveProxy((InternalEObject)superGroup) : superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		// TODO: implement this method to return the 'Super Group' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		// TODO: implement this method to return the 'Contained Edge' reference list
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
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE, ActivitiesPackage.VARIABLE__SCOPE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE, ActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustIsolate() {
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionsPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getStructuredNodeInput() {
		if (structuredNodeInput == null) {
			structuredNodeInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		}
		return structuredNodeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getStructuredNodeOutput() {
		if (structuredNodeOutput == null) {
			structuredNodeOutput = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		}
		return structuredNodeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE, ActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return node;
	}

	/**
	 * The cached invocation delegate for the '{@link #sourceNodes() <em>Source Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #sourceNodes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SOURCE_NODES__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.STRUCTURED_ACTIVITY_NODE___SOURCE_NODES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActivityNode> sourceNodes() {
		try {
			return (EList<ActivityNode>)SOURCE_NODES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #targetNodes() <em>Target Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #targetNodes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TARGET_NODES__EINVOCATION_DELEGATE = ((EOperation.Internal)ActionsPackage.Literals.STRUCTURED_ACTIVITY_NODE___TARGET_NODES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ActivityNode> targetNodes() {
		try {
			return (EList<ActivityNode>)TARGET_NODES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #containingActivity() <em>Containing Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingActivity()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_ACTIVITY__EINVOCATION_DELEGATE = ((EOperation.Internal)ActivitiesPackage.Literals.ACTIVITY_GROUP___CONTAINING_ACTIVITY).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity containingActivity() {
		try {
			return (Activity)CONTAINING_ACTIVITY__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #excludeCollisions(org.eclipse.emf.common.util.EList) <em>Exclude Collisions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #excludeCollisions(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EXCLUDE_COLLISIONS_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___EXCLUDE_COLLISIONS__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
		try {
			return (EList<PackageableElement>)EXCLUDE_COLLISIONS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{imps}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getNamesOfMember(uml.commonStructure.NamedElement) <em>Get Names Of Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamesOfMember(uml.commonStructure.NamedElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NAMES_OF_MEMBER_NAMED_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<String> getNamesOfMember(NamedElement element) {
		try {
			return (EList<String>)GET_NAMES_OF_MEMBER_NAMED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{element}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #importMembers(org.eclipse.emf.common.util.EList) <em>Import Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importMembers(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IMPORT_MEMBERS_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___IMPORT_MEMBERS__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
		try {
			return (EList<PackageableElement>)IMPORT_MEMBERS_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{imps}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #importedMember() <em>Imported Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importedMember()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IMPORTED_MEMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___IMPORTED_MEMBER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> importedMember() {
		try {
			return (EList<PackageableElement>)IMPORTED_MEMBER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #membersAreDistinguishable() <em>Members Are Distinguishable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #membersAreDistinguishable()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MEMBERS_ARE_DISTINGUISHABLE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean membersAreDistinguishable() {
		try {
			return (Boolean)MEMBERS_ARE_DISTINGUISHABLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInActivity((Activity)otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE:
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
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return basicSetInActivity(null, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return ((InternalEList<?>)getStructuredNodeInput()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return ((InternalEList<?>)getStructuredNodeOutput()).basicRemove(otherEnd, msgs);
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, ActivitiesPackage.ACTIVITY__GROUP, Activity.class, msgs);
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
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return getElementImport();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return getImportedMember();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return getMember();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
				return getOwnedMember();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return getOwnedRule();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return getPackageImport();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return getInActivity();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return getSubgroup();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return getEdge();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return getStructuredNodeInput();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return getStructuredNodeOutput();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE:
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
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				getStructuredNodeInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				getStructuredNodeOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE:
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
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				return;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE:
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
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return !getImportedMember().isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return !getMember().isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return getInActivity() != null;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return !getSubgroup().isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return !getContainedEdge().isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return edge != null && !edge.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return mustIsolate != MUST_ISOLATE_EDEFAULT;
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return structuredNodeInput != null && !structuredNodeInput.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return structuredNodeOutput != null && !structuredNodeOutput.isEmpty();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return node != null && !node.isEmpty();
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
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT: return CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER: return CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__MEMBER: return CommonStructurePackage.NAMESPACE__MEMBER;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER: return CommonStructurePackage.NAMESPACE__OWNED_MEMBER;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE: return CommonStructurePackage.NAMESPACE__OWNED_RULE;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT: return CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE: return ActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY: return ActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP: return ActivitiesPackage.ACTIVITY_GROUP__SUBGROUP;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return ActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP;
				case ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE: return ActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE;
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
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.NAMESPACE__ELEMENT_IMPORT: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case CommonStructurePackage.NAMESPACE__IMPORTED_MEMBER: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case CommonStructurePackage.NAMESPACE__MEMBER: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__MEMBER;
				case CommonStructurePackage.NAMESPACE__OWNED_MEMBER: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;
				case CommonStructurePackage.NAMESPACE__OWNED_RULE: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case CommonStructurePackage.NAMESPACE__PACKAGE_IMPORT: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case ActivitiesPackage.ACTIVITY_GROUP__CONTAINED_NODE: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
				case ActivitiesPackage.ACTIVITY_GROUP__IN_ACTIVITY: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case ActivitiesPackage.ACTIVITY_GROUP__SUBGROUP: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case ActivitiesPackage.ACTIVITY_GROUP__SUPER_GROUP: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case ActivitiesPackage.ACTIVITY_GROUP__CONTAINED_EDGE: return ActionsPackage.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
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
		if (baseClass == Namespace.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST: return ActionsPackage.STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST;
				case CommonStructurePackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT: return ActionsPackage.STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;
				case CommonStructurePackage.NAMESPACE___IMPORT_MEMBERS__ELIST: return ActionsPackage.STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST;
				case CommonStructurePackage.NAMESPACE___IMPORTED_MEMBER: return ActionsPackage.STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER;
				case CommonStructurePackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE: return ActionsPackage.STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseOperationID) {
				case ActivitiesPackage.ACTIVITY_GROUP___CONTAINING_ACTIVITY: return ActionsPackage.STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___SOURCE_NODES:
				return sourceNodes();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___TARGET_NODES:
				return targetNodes();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___CONTAINING_ACTIVITY:
				return containingActivity();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<PackageableElement>)arguments.get(0));
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
				return getNamesOfMember((NamedElement)arguments.get(0));
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST:
				return importMembers((EList<PackageableElement>)arguments.get(0));
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER:
				return importedMember();
			case ActionsPackage.STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE:
				return membersAreDistinguishable();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl
