/**
 */
package uml.packages.impl;

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

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.NamedElement;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateBinding;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.TemplateSignature;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;

import uml.commonStructure.impl.NamespaceImpl;

import uml.packages.PackageMerge;
import uml.packages.PackagesPackage;
import uml.packages.Profile;
import uml.packages.ProfileApplication;
import uml.packages.Stereotype;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.impl.PackageImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getProfileApplication <em>Profile Application</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.packages.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements uml.packages.Package {
	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getPackageMerge() <em>Package Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerge()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMerge> packageMerge;

	/**
	 * The cached value of the '{@link #getProfileApplication() <em>Profile Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileApplication> profileApplication;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> packagedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagesPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PackagesPackage.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, PackagesPackage.PACKAGE__TEMPLATE_BINDING, CommonStructurePackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, CommonStructurePackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageMerge> getPackageMerge() {
		if (packageMerge == null) {
			packageMerge = new EObjectContainmentWithInverseEList<PackageMerge>(PackageMerge.class, this, PackagesPackage.PACKAGE__PACKAGE_MERGE, PackagesPackage.PACKAGE_MERGE__RECEIVING_PACKAGE);
		}
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileApplication> getProfileApplication() {
		if (profileApplication == null) {
			profileApplication = new EObjectContainmentWithInverseEList<ProfileApplication>(ProfileApplication.class, this, PackagesPackage.PACKAGE__PROFILE_APPLICATION, PackagesPackage.PROFILE_APPLICATION__APPLYING_PACKAGE);
		}
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagesPackage.PACKAGE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml.packages.Package> getNestedPackage() {
		// TODO: implement this method to return the 'Nested Package' reference list
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
	public uml.packages.Package getNestingPackage() {
		uml.packages.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy() ? (uml.packages.Package)eResolveProxy((InternalEObject)nestingPackage) : nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package basicGetNestingPackage() {
		// TODO: implement this method to return the 'Nesting Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(uml.packages.Package newNestingPackage) {
		// TODO: implement this method to set the 'Nesting Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getOwnedStereotype() {
		// TODO: implement this method to return the 'Owned Stereotype' reference list
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
	public EList<PackageableElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, PackagesPackage.PACKAGE__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		// TODO: implement this method to return the 'Owned Type' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached invocation delegate for the '{@link #allApplicableStereotypes() <em>All Applicable Stereotypes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allApplicableStereotypes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_APPLICABLE_STEREOTYPES__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___ALL_APPLICABLE_STEREOTYPES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Stereotype> allApplicableStereotypes() {
		try {
			return (EList<Stereotype>)ALL_APPLICABLE_STEREOTYPES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #containingProfile() <em>Containing Profile</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containingProfile()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINING_PROFILE__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___CONTAINING_PROFILE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile containingProfile() {
		try {
			return (Profile)CONTAINING_PROFILE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #makesVisible(uml.commonStructure.NamedElement) <em>Makes Visible</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #makesVisible(uml.commonStructure.NamedElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MAKES_VISIBLE_NAMED_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___MAKES_VISIBLE__NAMEDELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makesVisible(NamedElement el) {
		try {
			return (Boolean)MAKES_VISIBLE_NAMED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{el}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #nestedPackage() <em>Nested Package</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #nestedPackage()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NESTED_PACKAGE__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___NESTED_PACKAGE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<uml.packages.Package> nestedPackage() {
		try {
			return (EList<uml.packages.Package>)NESTED_PACKAGE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #ownedStereotype() <em>Owned Stereotype</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ownedStereotype()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OWNED_STEREOTYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___OWNED_STEREOTYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Stereotype> ownedStereotype() {
		try {
			return (EList<Stereotype>)OWNED_STEREOTYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #ownedType() <em>Owned Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ownedType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OWNED_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___OWNED_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> ownedType() {
		try {
			return (EList<Type>)OWNED_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #visibleMembers() <em>Visible Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #visibleMembers()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate VISIBLE_MEMBERS__EINVOCATION_DELEGATE = ((EOperation.Internal)PackagesPackage.Literals.PACKAGE___VISIBLE_MEMBERS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> visibleMembers() {
		try {
			return (EList<PackageableElement>)VISIBLE_MEMBERS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isTemplate() <em>Is Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TEMPLATE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.TEMPLATEABLE_ELEMENT___IS_TEMPLATE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
		try {
			return (Boolean)IS_TEMPLATE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #parameterableElements() <em>Parameterable Elements</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #parameterableElements()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PARAMETERABLE_ELEMENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ParameterableElement> parameterableElements() {
		try {
			return (EList<ParameterableElement>)PARAMETERABLE_ELEMENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isCompatibleWith(uml.commonStructure.ParameterableElement) <em>Is Compatible With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompatibleWith(uml.commonStructure.ParameterableElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_COMPATIBLE_WITH_PARAMETERABLE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCompatibleWith(ParameterableElement p) {
		try {
			return (Boolean)IS_COMPATIBLE_WITH_PARAMETERABLE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{p}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isTemplateParameter() <em>Is Template Parameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TEMPLATE_PARAMETER__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplateParameter() {
		try {
			return (Boolean)IS_TEMPLATE_PARAMETER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case PackagesPackage.PACKAGE__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case PackagesPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageMerge()).basicAdd(otherEnd, msgs);
			case PackagesPackage.PACKAGE__PROFILE_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfileApplication()).basicAdd(otherEnd, msgs);
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case PackagesPackage.PACKAGE__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case PackagesPackage.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<?>)getPackageMerge()).basicRemove(otherEnd, msgs);
			case PackagesPackage.PACKAGE__PROFILE_APPLICATION:
				return ((InternalEList<?>)getProfileApplication()).basicRemove(otherEnd, msgs);
			case PackagesPackage.PACKAGE__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return eInternalContainer().eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case PackagesPackage.PACKAGE__TEMPLATE_BINDING:
				return getTemplateBinding();
			case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case PackagesPackage.PACKAGE__PACKAGE_MERGE:
				return getPackageMerge();
			case PackagesPackage.PACKAGE__PROFILE_APPLICATION:
				return getProfileApplication();
			case PackagesPackage.PACKAGE__URI:
				return getUri();
			case PackagesPackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case PackagesPackage.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case PackagesPackage.PACKAGE__OWNED_STEREOTYPE:
				return getOwnedStereotype();
			case PackagesPackage.PACKAGE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case PackagesPackage.PACKAGE__OWNED_TYPE:
				return getOwnedType();
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case PackagesPackage.PACKAGE__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case PackagesPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				getPackageMerge().addAll((Collection<? extends PackageMerge>)newValue);
				return;
			case PackagesPackage.PACKAGE__PROFILE_APPLICATION:
				getProfileApplication().clear();
				getProfileApplication().addAll((Collection<? extends ProfileApplication>)newValue);
				return;
			case PackagesPackage.PACKAGE__URI:
				setUri((String)newValue);
				return;
			case PackagesPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends uml.packages.Package>)newValue);
				return;
			case PackagesPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((uml.packages.Package)newValue);
				return;
			case PackagesPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case PackagesPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case PackagesPackage.PACKAGE__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case PackagesPackage.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				return;
			case PackagesPackage.PACKAGE__PROFILE_APPLICATION:
				getProfileApplication().clear();
				return;
			case PackagesPackage.PACKAGE__URI:
				setUri(URI_EDEFAULT);
				return;
			case PackagesPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case PackagesPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((uml.packages.Package)null);
				return;
			case PackagesPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case PackagesPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
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
			case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case PackagesPackage.PACKAGE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case PackagesPackage.PACKAGE__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case PackagesPackage.PACKAGE__PROFILE_APPLICATION:
				return profileApplication != null && !profileApplication.isEmpty();
			case PackagesPackage.PACKAGE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case PackagesPackage.PACKAGE__NESTED_PACKAGE:
				return !getNestedPackage().isEmpty();
			case PackagesPackage.PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case PackagesPackage.PACKAGE__OWNED_STEREOTYPE:
				return !getOwnedStereotype().isEmpty();
			case PackagesPackage.PACKAGE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case PackagesPackage.PACKAGE__OWNED_TYPE:
				return !getOwnedType().isEmpty();
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
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case PackagesPackage.PACKAGE__TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case PackagesPackage.PACKAGE__TEMPLATE_BINDING: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return PackagesPackage.PACKAGE__OWNING_TEMPLATE_PARAMETER;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return PackagesPackage.PACKAGE__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return PackagesPackage.PACKAGE__TEMPLATE_BINDING;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return PackagesPackage.PACKAGE__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return PackagesPackage.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return PackagesPackage.PACKAGE___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return PackagesPackage.PACKAGE___IS_TEMPLATE;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return PackagesPackage.PACKAGE___PARAMETERABLE_ELEMENTS;
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
			case PackagesPackage.PACKAGE___ALL_APPLICABLE_STEREOTYPES:
				return allApplicableStereotypes();
			case PackagesPackage.PACKAGE___CONTAINING_PROFILE:
				return containingProfile();
			case PackagesPackage.PACKAGE___MAKES_VISIBLE__NAMEDELEMENT:
				return makesVisible((NamedElement)arguments.get(0));
			case PackagesPackage.PACKAGE___NESTED_PACKAGE:
				return nestedPackage();
			case PackagesPackage.PACKAGE___OWNED_STEREOTYPE:
				return ownedStereotype();
			case PackagesPackage.PACKAGE___OWNED_TYPE:
				return ownedType();
			case PackagesPackage.PACKAGE___VISIBLE_MEMBERS:
				return visibleMembers();
			case PackagesPackage.PACKAGE___IS_TEMPLATE:
				return isTemplate();
			case PackagesPackage.PACKAGE___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case PackagesPackage.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case PackagesPackage.PACKAGE___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
