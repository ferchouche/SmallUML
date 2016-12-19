/**
 */
package uml.classification.impl;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.Feature;
import uml.classification.Generalization;
import uml.classification.GeneralizationSet;
import uml.classification.Property;
import uml.classification.RedefinableElement;
import uml.classification.StructuralFeature;
import uml.classification.Substitution;

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

import uml.simpleClassifiers.Interface;

import uml.structuredClassifiers.CollaborationUse;

import uml.useCases.UseCase;
import uml.useCases.UseCasesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.ClassifierImpl#isIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml.classification.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * The default value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_LEAF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected boolean isLeaf = IS_LEAF_EDEFAULT;

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
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitution;

	/**
	 * The cached value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> powertypeExtent;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getCollaborationUse() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUse()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUse;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_SPECIALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinalSpecialization = IS_FINAL_SPECIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCase;

	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCase;

	/**
	 * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinedClassifier;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(boolean newIsLeaf) {
		boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		// TODO: implement this method to return the 'Redefined Element' reference list
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
	public EList<Classifier> getRedefinitionContext() {
		// TODO: implement this method to return the 'Redefinition Context' reference list
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
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package getPackage() {
		uml.packages.Package package_ = basicGetPackage();
		return package_ != null && package_.eIsProxy() ? (uml.packages.Package)eResolveProxy((InternalEObject)package_) : package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.packages.Package basicGetPackage() {
		// TODO: implement this method to return the 'Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(uml.packages.Package newPackage) {
		// TODO: implement this method to set the 'Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING, CommonStructurePackage.TEMPLATE_BINDING__BOUND_ELEMENT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitution() {
		if (substitution == null) {
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, ClassificationPackage.CLASSIFIER__SUBSTITUTION, ClassificationPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		// TODO: implement this method to return the 'Feature' reference list
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
	public EList<GeneralizationSet> getPowertypeExtent() {
		if (powertypeExtent == null) {
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT, ClassificationPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, ClassificationPackage.CLASSIFIER__GENERALIZATION, ClassificationPackage.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		// TODO: implement this method to return the 'Attribute' reference list
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
	public EList<CollaborationUse> getCollaborationUse() {
		if (collaborationUse == null) {
			collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, ClassificationPackage.CLASSIFIER__COLLABORATION_USE);
		}
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		// TODO: implement this method to return the 'General' reference list
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
	public EList<NamedElement> getInheritedMember() {
		// TODO: implement this method to return the 'Inherited Member' reference list
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
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFinalSpecialization() {
		return isFinalSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(boolean newIsFinalSpecialization) {
		boolean oldIsFinalSpecialization = isFinalSpecialization;
		isFinalSpecialization = newIsFinalSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, ClassificationPackage.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase() {
		if (useCase == null) {
			useCase = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this, ClassificationPackage.CLASSIFIER__USE_CASE, UseCasesPackage.USE_CASE__SUBJECT);
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifier() {
		if (redefinedClassifier == null) {
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, ClassificationPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (CollaborationUse)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * The cached invocation delegate for the '{@link #allFeatures() <em>All Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_FEATURES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___ALL_FEATURES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> allFeatures() {
		try {
			return (EList<Feature>)ALL_FEATURES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allParents() <em>All Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allParents()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_PARENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___ALL_PARENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> allParents() {
		try {
			return (EList<Classifier>)ALL_PARENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #general() <em>General</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #general()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GENERAL__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___GENERAL).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> general() {
		try {
			return (EList<Classifier>)GENERAL__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #hasVisibilityOf(uml.commonStructure.NamedElement) <em>Has Visibility Of</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasVisibilityOf(uml.commonStructure.NamedElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_VISIBILITY_OF_NAMED_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		try {
			return (Boolean)HAS_VISIBILITY_OF_NAMED_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{n}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inherit(org.eclipse.emf.common.util.EList) <em>Inherit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inherit(org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INHERIT_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___INHERIT__ELIST).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		try {
			return (EList<NamedElement>)INHERIT_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{inhs}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inheritableMembers(uml.classification.Classifier) <em>Inheritable Members</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inheritableMembers(uml.classification.Classifier)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INHERITABLE_MEMBERS_CLASSIFIER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> inheritableMembers(Classifier c) {
		try {
			return (EList<NamedElement>)INHERITABLE_MEMBERS_CLASSIFIER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{c}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #inheritedMember() <em>Inherited Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #inheritedMember()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INHERITED_MEMBER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___INHERITED_MEMBER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> inheritedMember() {
		try {
			return (EList<NamedElement>)INHERITED_MEMBER__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #maySpecializeType(uml.classification.Classifier) <em>May Specialize Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #maySpecializeType(uml.classification.Classifier)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate MAY_SPECIALIZE_TYPE_CLASSIFIER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		try {
			return (Boolean)MAY_SPECIALIZE_TYPE_CLASSIFIER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{c}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #parents() <em>Parents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #parents()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PARENTS__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___PARENTS).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> parents() {
		try {
			return (EList<Classifier>)PARENTS__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #directlyRealizedInterfaces() <em>Directly Realized Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directlyRealizedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DIRECTLY_REALIZED_INTERFACES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> directlyRealizedInterfaces() {
		try {
			return (EList<Interface>)DIRECTLY_REALIZED_INTERFACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #directlyUsedInterfaces() <em>Directly Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directlyUsedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DIRECTLY_USED_INTERFACES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___DIRECTLY_USED_INTERFACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> directlyUsedInterfaces() {
		try {
			return (EList<Interface>)DIRECTLY_USED_INTERFACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allRealizedInterfaces() <em>All Realized Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allRealizedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_REALIZED_INTERFACES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___ALL_REALIZED_INTERFACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> allRealizedInterfaces() {
		try {
			return (EList<Interface>)ALL_REALIZED_INTERFACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allUsedInterfaces() <em>All Used Interfaces</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allUsedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_USED_INTERFACES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___ALL_USED_INTERFACES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Interface> allUsedInterfaces() {
		try {
			return (EList<Interface>)ALL_USED_INTERFACES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSubstitutableFor(uml.classification.Classifier) <em>Is Substitutable For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstitutableFor(uml.classification.Classifier)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUBSTITUTABLE_FOR_CLASSIFIER__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutableFor(Classifier contract) {
		try {
			return (Boolean)IS_SUBSTITUTABLE_FOR_CLASSIFIER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{contract}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allAttributes() <em>All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allAttributes()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_ATTRIBUTES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___ALL_ATTRIBUTES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> allAttributes() {
		try {
			return (EList<Property>)ALL_ATTRIBUTES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #allSlottableFeatures() <em>All Slottable Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allSlottableFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_SLOTTABLE_FEATURES__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.CLASSIFIER___ALL_SLOTTABLE_FEATURES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<StructuralFeature> allSlottableFeatures() {
		try {
			return (EList<StructuralFeature>)ALL_SLOTTABLE_FEATURES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	 * The cached invocation delegate for the '{@link #conformsTo(uml.commonStructure.Type) <em>Conforms To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #conformsTo(uml.commonStructure.Type)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONFORMS_TO_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonStructurePackage.Literals.TYPE___CONFORMS_TO__TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
		try {
			return (Boolean)CONFORMS_TO_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{other}));
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
	 * The cached invocation delegate for the '{@link #isConsistentWith(uml.classification.RedefinableElement) <em>Is Consistent With</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConsistentWith(uml.classification.RedefinableElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CONSISTENT_WITH_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConsistentWith(RedefinableElement redefiningElement) {
		try {
			return (Boolean)IS_CONSISTENT_WITH_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{redefiningElement}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isRedefinitionContextValid(uml.classification.RedefinableElement) <em>Is Redefinition Context Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRedefinitionContextValid(uml.classification.RedefinableElement)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_REDEFINITION_CONTEXT_VALID_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRedefinitionContextValid(RedefinableElement redefinedElement) {
		try {
			return (Boolean)IS_REDEFINITION_CONTEXT_VALID_REDEFINABLE_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{redefinedElement}));
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
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__USE_CASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCase()).basicAdd(otherEnd, msgs);
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
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case ClassificationPackage.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.CLASSIFIER__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
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
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
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
			case ClassificationPackage.CLASSIFIER__IS_LEAF:
				return isIsLeaf();
			case ClassificationPackage.CLASSIFIER__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case ClassificationPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case ClassificationPackage.CLASSIFIER__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBinding();
			case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case ClassificationPackage.CLASSIFIER__SUBSTITUTION:
				return getSubstitution();
			case ClassificationPackage.CLASSIFIER__FEATURE:
				return getFeature();
			case ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case ClassificationPackage.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case ClassificationPackage.CLASSIFIER__ATTRIBUTE:
				return getAttribute();
			case ClassificationPackage.CLASSIFIER__COLLABORATION_USE:
				return getCollaborationUse();
			case ClassificationPackage.CLASSIFIER__GENERAL:
				return getGeneral();
			case ClassificationPackage.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case ClassificationPackage.CLASSIFIER__IS_ABSTRACT:
				return isIsAbstract();
			case ClassificationPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				return isIsFinalSpecialization();
			case ClassificationPackage.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCase();
			case ClassificationPackage.CLASSIFIER__USE_CASE:
				return getUseCase();
			case ClassificationPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case ClassificationPackage.CLASSIFIER__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
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
			case ClassificationPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__PACKAGE:
				setPackage((uml.packages.Package)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case ClassificationPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)newValue);
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
			case ClassificationPackage.CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case ClassificationPackage.CLASSIFIER__PACKAGE:
				setPackage((uml.packages.Package)null);
				return;
			case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case ClassificationPackage.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				return;
			case ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case ClassificationPackage.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case ClassificationPackage.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				return;
			case ClassificationPackage.CLASSIFIER__GENERAL:
				getGeneral().clear();
				return;
			case ClassificationPackage.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case ClassificationPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case ClassificationPackage.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case ClassificationPackage.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				return;
			case ClassificationPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case ClassificationPackage.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)null);
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
			case ClassificationPackage.CLASSIFIER__IS_LEAF:
				return isLeaf != IS_LEAF_EDEFAULT;
			case ClassificationPackage.CLASSIFIER__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case ClassificationPackage.CLASSIFIER__REDEFINITION_CONTEXT:
				return !getRedefinitionContext().isEmpty();
			case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case ClassificationPackage.CLASSIFIER__PACKAGE:
				return basicGetPackage() != null;
			case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case ClassificationPackage.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
			case ClassificationPackage.CLASSIFIER__FEATURE:
				return !getFeature().isEmpty();
			case ClassificationPackage.CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case ClassificationPackage.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case ClassificationPackage.CLASSIFIER__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case ClassificationPackage.CLASSIFIER__COLLABORATION_USE:
				return collaborationUse != null && !collaborationUse.isEmpty();
			case ClassificationPackage.CLASSIFIER__GENERAL:
				return !getGeneral().isEmpty();
			case ClassificationPackage.CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMember().isEmpty();
			case ClassificationPackage.CLASSIFIER__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case ClassificationPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case ClassificationPackage.CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case ClassificationPackage.CLASSIFIER__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case ClassificationPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case ClassificationPackage.CLASSIFIER__REPRESENTATION:
				return representation != null;
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
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.CLASSIFIER__IS_LEAF: return ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF;
				case ClassificationPackage.CLASSIFIER__REDEFINED_ELEMENT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case ClassificationPackage.CLASSIFIER__REDEFINITION_CONTEXT: return ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.CLASSIFIER__PACKAGE: return CommonStructurePackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE: return CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case ClassificationPackage.REDEFINABLE_ELEMENT__IS_LEAF: return ClassificationPackage.CLASSIFIER__IS_LEAF;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return ClassificationPackage.CLASSIFIER__REDEFINED_ELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return ClassificationPackage.CLASSIFIER__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return ClassificationPackage.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return ClassificationPackage.CLASSIFIER__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TYPE__PACKAGE: return ClassificationPackage.CLASSIFIER__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return ClassificationPackage.CLASSIFIER__TEMPLATE_BINDING;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return ClassificationPackage.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT: return ClassificationPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case ClassificationPackage.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT: return ClassificationPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return ClassificationPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return ClassificationPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.TYPE___CONFORMS_TO__TYPE: return ClassificationPackage.CLASSIFIER___CONFORMS_TO__TYPE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return ClassificationPackage.CLASSIFIER___IS_TEMPLATE;
				case CommonStructurePackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return ClassificationPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS;
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
			case ClassificationPackage.CLASSIFIER___ALL_FEATURES:
				return allFeatures();
			case ClassificationPackage.CLASSIFIER___ALL_PARENTS:
				return allParents();
			case ClassificationPackage.CLASSIFIER___GENERAL:
				return general();
			case ClassificationPackage.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT:
				return hasVisibilityOf((NamedElement)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___INHERIT__ELIST:
				return inherit((EList<NamedElement>)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER:
				return inheritableMembers((Classifier)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___INHERITED_MEMBER:
				return inheritedMember();
			case ClassificationPackage.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER:
				return maySpecializeType((Classifier)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___PARENTS:
				return parents();
			case ClassificationPackage.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES:
				return directlyRealizedInterfaces();
			case ClassificationPackage.CLASSIFIER___DIRECTLY_USED_INTERFACES:
				return directlyUsedInterfaces();
			case ClassificationPackage.CLASSIFIER___ALL_REALIZED_INTERFACES:
				return allRealizedInterfaces();
			case ClassificationPackage.CLASSIFIER___ALL_USED_INTERFACES:
				return allUsedInterfaces();
			case ClassificationPackage.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
				return isSubstitutableFor((Classifier)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___ALL_ATTRIBUTES:
				return allAttributes();
			case ClassificationPackage.CLASSIFIER___ALL_SLOTTABLE_FEATURES:
				return allSlottableFeatures();
			case ClassificationPackage.CLASSIFIER___IS_TEMPLATE:
				return isTemplate();
			case ClassificationPackage.CLASSIFIER___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case ClassificationPackage.CLASSIFIER___CONFORMS_TO__TYPE:
				return conformsTo((Type)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
			case ClassificationPackage.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return isConsistentWith((RedefinableElement)arguments.get(0));
			case ClassificationPackage.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
				return isRedefinitionContextValid((RedefinableElement)arguments.get(0));
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
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinalSpecialization: ");
		result.append(isFinalSpecialization);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl
