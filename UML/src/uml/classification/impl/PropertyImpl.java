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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.classification.AggregationKind;
import uml.classification.ClassificationPackage;
import uml.classification.Property;

import uml.commonStructure.CommonStructurePackage;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateParameter;
import uml.commonStructure.Type;

import uml.deployments.Deployment;
import uml.deployments.DeploymentTarget;
import uml.deployments.DeploymentsPackage;

import uml.simpleClassifiers.DataType;
import uml.simpleClassifiers.Interface;
import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.ConnectorEnd;
import uml.structuredClassifiers.StructuredClassifiersPackage;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.impl.PropertyImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getEnd <em>End</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#isIsId <em>Is Id</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link uml.classification.impl.PropertyImpl#getSubsettedProperty <em>Subsetted Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends StructuralFeatureImpl implements Property {
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
	 * The cached value of the '{@link #getDeployment() <em>Deployment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployment()
	 * @generated
	 * @ordered
	 */
	protected EList<Deployment> deployment;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.NONE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association association;

	/**
	 * The cached value of the '{@link #getQualifier() <em>Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> qualifier;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification defaultValue;

	/**
	 * The default value of the '{@link #isIsComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_UNION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDerivedUnion() <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDerivedUnion()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerivedUnion = IS_DERIVED_UNION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsId()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsId() <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsId()
	 * @generated
	 * @ordered
	 */
	protected boolean isId = IS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRedefinedProperty() <em>Redefined Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> redefinedProperty;

	/**
	 * The cached value of the '{@link #getSubsettedProperty() <em>Subsetted Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsettedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> subsettedProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClassificationPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorEnd> getEnd() {
		// TODO: implement this method to return the 'End' reference list
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
	public EList<Deployment> getDeployment() {
		if (deployment == null) {
			deployment = new EObjectContainmentWithInverseEList<Deployment>(Deployment.class, this, ClassificationPackage.PROPERTY__DEPLOYMENT, DeploymentsPackage.DEPLOYMENT__LOCATION);
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
	public Interface getInterface() {
		if (eContainerFeatureID() != ClassificationPackage.PROPERTY__INTERFACE) return null;
		return (Interface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, ClassificationPackage.PROPERTY__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.PROPERTY__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getAssociation() {
		if (association != null && association.eIsProxy()) {
			InternalEObject oldAssociation = (InternalEObject)association;
			association = (Association)eResolveProxy(oldAssociation);
			if (association != oldAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassificationPackage.PROPERTY__ASSOCIATION, oldAssociation, association));
			}
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetAssociation() {
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociation(Association newAssociation, NotificationChain msgs) {
		Association oldAssociation = association;
		association = newAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__ASSOCIATION, oldAssociation, newAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociation(Association newAssociation) {
		if (newAssociation != association) {
			NotificationChain msgs = null;
			if (association != null)
				msgs = ((InternalEObject)association).eInverseRemove(this, StructuredClassifiersPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
			if (newAssociation != null)
				msgs = ((InternalEObject)newAssociation).eInverseAdd(this, StructuredClassifiersPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
			msgs = basicSetAssociation(newAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__ASSOCIATION, newAssociation, newAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getAssociationEnd() {
		if (eContainerFeatureID() != ClassificationPackage.PROPERTY__ASSOCIATION_END) return null;
		return (Property)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociationEnd(Property newAssociationEnd, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAssociationEnd, ClassificationPackage.PROPERTY__ASSOCIATION_END, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociationEnd(Property newAssociationEnd) {
		if (newAssociationEnd != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.PROPERTY__ASSOCIATION_END && newAssociationEnd != null)) {
			if (EcoreUtil.isAncestor(this, newAssociationEnd))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAssociationEnd != null)
				msgs = ((InternalEObject)newAssociationEnd).eInverseAdd(this, ClassificationPackage.PROPERTY__QUALIFIER, Property.class, msgs);
			msgs = basicSetAssociationEnd(newAssociationEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__ASSOCIATION_END, newAssociationEnd, newAssociationEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getQualifier() {
		if (qualifier == null) {
			qualifier = new EObjectContainmentWithInverseEList<Property>(Property.class, this, ClassificationPackage.PROPERTY__QUALIFIER, ClassificationPackage.PROPERTY__ASSOCIATION_END);
		}
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.structuredClassifiers.Class getClass_() {
		uml.structuredClassifiers.Class class_ = basicGetClass();
		return class_ != null && class_.eIsProxy() ? (uml.structuredClassifiers.Class)eResolveProxy((InternalEObject)class_) : class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml.structuredClassifiers.Class basicGetClass() {
		// TODO: implement this method to return the 'Class' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getDatatype() {
		if (eContainerFeatureID() != ClassificationPackage.PROPERTY__DATATYPE) return null;
		return (DataType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(DataType newDatatype, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDatatype, ClassificationPackage.PROPERTY__DATATYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(DataType newDatatype) {
		if (newDatatype != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.PROPERTY__DATATYPE && newDatatype != null)) {
			if (EcoreUtil.isAncestor(this, newDatatype))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject)newDatatype).eInverseAdd(this, SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__DATATYPE, newDatatype, newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(ValueSpecification newDefaultValue, NotificationChain msgs) {
		ValueSpecification oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(ValueSpecification newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PROPERTY__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassificationPackage.PROPERTY__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposite() {
		// TODO: implement this method to return the 'Is Composite' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposite(boolean newIsComposite) {
		// TODO: implement this method to set the 'Is Composite' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDerivedUnion() {
		return isDerivedUnion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDerivedUnion(boolean newIsDerivedUnion) {
		boolean oldIsDerivedUnion = isDerivedUnion;
		isDerivedUnion = newIsDerivedUnion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__IS_DERIVED_UNION, oldIsDerivedUnion, isDerivedUnion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsId() {
		return isId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsId(boolean newIsId) {
		boolean oldIsId = isId;
		isId = newIsId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__IS_ID, oldIsId, isId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getOpposite() {
		Property opposite = basicGetOpposite();
		return opposite != null && opposite.eIsProxy() ? (Property)eResolveProxy((InternalEObject)opposite) : opposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetOpposite() {
		// TODO: implement this method to return the 'Opposite' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpposite(Property newOpposite) {
		// TODO: implement this method to set the 'Opposite' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		if (eContainerFeatureID() != ClassificationPackage.PROPERTY__OWNING_ASSOCIATION) return null;
		return (Association)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAssociation(Association newOwningAssociation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningAssociation, ClassificationPackage.PROPERTY__OWNING_ASSOCIATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		if (newOwningAssociation != eInternalContainer() || (eContainerFeatureID() != ClassificationPackage.PROPERTY__OWNING_ASSOCIATION && newOwningAssociation != null)) {
			if (EcoreUtil.isAncestor(this, newOwningAssociation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningAssociation != null)
				msgs = ((InternalEObject)newOwningAssociation).eInverseAdd(this, StructuredClassifiersPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
			msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassificationPackage.PROPERTY__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getRedefinedProperty() {
		if (redefinedProperty == null) {
			redefinedProperty = new EObjectResolvingEList<Property>(Property.class, this, ClassificationPackage.PROPERTY__REDEFINED_PROPERTY);
		}
		return redefinedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getSubsettedProperty() {
		if (subsettedProperty == null) {
			subsettedProperty = new EObjectResolvingEList<Property>(Property.class, this, ClassificationPackage.PROPERTY__SUBSETTED_PROPERTY);
		}
		return subsettedProperty;
	}

	/**
	 * The cached invocation delegate for the '{@link #isAttribute() <em>Is Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_ATTRIBUTE__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.PROPERTY___IS_ATTRIBUTE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute() {
		try {
			return (Boolean)IS_ATTRIBUTE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isComposite() <em>Is Composite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_COMPOSITE__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.PROPERTY___IS_COMPOSITE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isComposite() {
		try {
			return (Boolean)IS_COMPOSITE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isNavigable() <em>Is Navigable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_NAVIGABLE__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.PROPERTY___IS_NAVIGABLE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNavigable() {
		try {
			return (Boolean)IS_NAVIGABLE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #opposite() <em>Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #opposite()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OPPOSITE__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.PROPERTY___OPPOSITE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property opposite() {
		try {
			return (Property)OPPOSITE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #subsettingContext() <em>Subsetting Context</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subsettingContext()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SUBSETTING_CONTEXT__EINVOCATION_DELEGATE = ((EOperation.Internal)ClassificationPackage.Literals.PROPERTY___SUBSETTING_CONTEXT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Type> subsettingContext() {
		try {
			return (EList<Type>)SUBSETTING_CONTEXT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
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
	 * The cached invocation delegate for the '{@link #end() <em>End</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #end()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate END__EINVOCATION_DELEGATE = ((EOperation.Internal)StructuredClassifiersPackage.Literals.CONNECTABLE_ELEMENT___END).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectorEnd> end() {
		try {
			return (EList<ConnectorEnd>)END__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case ClassificationPackage.PROPERTY__DEPLOYMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDeployment()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.PROPERTY__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
			case ClassificationPackage.PROPERTY__ASSOCIATION:
				if (association != null)
					msgs = ((InternalEObject)association).eInverseRemove(this, StructuredClassifiersPackage.ASSOCIATION__MEMBER_END, Association.class, msgs);
				return basicSetAssociation((Association)otherEnd, msgs);
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAssociationEnd((Property)otherEnd, msgs);
			case ClassificationPackage.PROPERTY__QUALIFIER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getQualifier()).basicAdd(otherEnd, msgs);
			case ClassificationPackage.PROPERTY__DATATYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDatatype((DataType)otherEnd, msgs);
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningAssociation((Association)otherEnd, msgs);
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case ClassificationPackage.PROPERTY__DEPLOYMENT:
				return ((InternalEList<?>)getDeployment()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.PROPERTY__INTERFACE:
				return basicSetInterface(null, msgs);
			case ClassificationPackage.PROPERTY__ASSOCIATION:
				return basicSetAssociation(null, msgs);
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				return basicSetAssociationEnd(null, msgs);
			case ClassificationPackage.PROPERTY__QUALIFIER:
				return ((InternalEList<?>)getQualifier()).basicRemove(otherEnd, msgs);
			case ClassificationPackage.PROPERTY__DATATYPE:
				return basicSetDatatype(null, msgs);
			case ClassificationPackage.PROPERTY__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				return basicSetOwningAssociation(null, msgs);
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				return eInternalContainer().eInverseRemove(this, CommonStructurePackage.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			case ClassificationPackage.PROPERTY__INTERFACE:
				return eInternalContainer().eInverseRemove(this, SimpleClassifiersPackage.INTERFACE__OWNED_ATTRIBUTE, Interface.class, msgs);
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				return eInternalContainer().eInverseRemove(this, ClassificationPackage.PROPERTY__QUALIFIER, Property.class, msgs);
			case ClassificationPackage.PROPERTY__DATATYPE:
				return eInternalContainer().eInverseRemove(this, SimpleClassifiersPackage.DATA_TYPE__OWNED_ATTRIBUTE, DataType.class, msgs);
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				return eInternalContainer().eInverseRemove(this, StructuredClassifiersPackage.ASSOCIATION__OWNED_END, Association.class, msgs);
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case ClassificationPackage.PROPERTY__END:
				return getEnd();
			case ClassificationPackage.PROPERTY__DEPLOYMENT:
				return getDeployment();
			case ClassificationPackage.PROPERTY__DEPLOYED_ELEMENT:
				return getDeployedElement();
			case ClassificationPackage.PROPERTY__INTERFACE:
				return getInterface();
			case ClassificationPackage.PROPERTY__AGGREGATION:
				return getAggregation();
			case ClassificationPackage.PROPERTY__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd();
			case ClassificationPackage.PROPERTY__QUALIFIER:
				return getQualifier();
			case ClassificationPackage.PROPERTY__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
			case ClassificationPackage.PROPERTY__DATATYPE:
				return getDatatype();
			case ClassificationPackage.PROPERTY__DEFAULT_VALUE:
				return getDefaultValue();
			case ClassificationPackage.PROPERTY__IS_COMPOSITE:
				return isIsComposite();
			case ClassificationPackage.PROPERTY__IS_DERIVED:
				return isIsDerived();
			case ClassificationPackage.PROPERTY__IS_DERIVED_UNION:
				return isIsDerivedUnion();
			case ClassificationPackage.PROPERTY__IS_ID:
				return isIsId();
			case ClassificationPackage.PROPERTY__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation();
			case ClassificationPackage.PROPERTY__REDEFINED_PROPERTY:
				return getRedefinedProperty();
			case ClassificationPackage.PROPERTY__SUBSETTED_PROPERTY:
				return getSubsettedProperty();
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case ClassificationPackage.PROPERTY__DEPLOYMENT:
				getDeployment().clear();
				getDeployment().addAll((Collection<? extends Deployment>)newValue);
				return;
			case ClassificationPackage.PROPERTY__INTERFACE:
				setInterface((Interface)newValue);
				return;
			case ClassificationPackage.PROPERTY__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case ClassificationPackage.PROPERTY__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Property)newValue);
				return;
			case ClassificationPackage.PROPERTY__QUALIFIER:
				getQualifier().clear();
				getQualifier().addAll((Collection<? extends Property>)newValue);
				return;
			case ClassificationPackage.PROPERTY__DATATYPE:
				setDatatype((DataType)newValue);
				return;
			case ClassificationPackage.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)newValue);
				return;
			case ClassificationPackage.PROPERTY__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case ClassificationPackage.PROPERTY__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case ClassificationPackage.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion((Boolean)newValue);
				return;
			case ClassificationPackage.PROPERTY__IS_ID:
				setIsId((Boolean)newValue);
				return;
			case ClassificationPackage.PROPERTY__OPPOSITE:
				setOpposite((Property)newValue);
				return;
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
				return;
			case ClassificationPackage.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				getRedefinedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case ClassificationPackage.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
				getSubsettedProperty().addAll((Collection<? extends Property>)newValue);
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case ClassificationPackage.PROPERTY__DEPLOYMENT:
				getDeployment().clear();
				return;
			case ClassificationPackage.PROPERTY__INTERFACE:
				setInterface((Interface)null);
				return;
			case ClassificationPackage.PROPERTY__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case ClassificationPackage.PROPERTY__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				setAssociationEnd((Property)null);
				return;
			case ClassificationPackage.PROPERTY__QUALIFIER:
				getQualifier().clear();
				return;
			case ClassificationPackage.PROPERTY__DATATYPE:
				setDatatype((DataType)null);
				return;
			case ClassificationPackage.PROPERTY__DEFAULT_VALUE:
				setDefaultValue((ValueSpecification)null);
				return;
			case ClassificationPackage.PROPERTY__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case ClassificationPackage.PROPERTY__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case ClassificationPackage.PROPERTY__IS_DERIVED_UNION:
				setIsDerivedUnion(IS_DERIVED_UNION_EDEFAULT);
				return;
			case ClassificationPackage.PROPERTY__IS_ID:
				setIsId(IS_ID_EDEFAULT);
				return;
			case ClassificationPackage.PROPERTY__OPPOSITE:
				setOpposite((Property)null);
				return;
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
				return;
			case ClassificationPackage.PROPERTY__REDEFINED_PROPERTY:
				getRedefinedProperty().clear();
				return;
			case ClassificationPackage.PROPERTY__SUBSETTED_PROPERTY:
				getSubsettedProperty().clear();
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
			case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case ClassificationPackage.PROPERTY__END:
				return !getEnd().isEmpty();
			case ClassificationPackage.PROPERTY__DEPLOYMENT:
				return deployment != null && !deployment.isEmpty();
			case ClassificationPackage.PROPERTY__DEPLOYED_ELEMENT:
				return !getDeployedElement().isEmpty();
			case ClassificationPackage.PROPERTY__INTERFACE:
				return getInterface() != null;
			case ClassificationPackage.PROPERTY__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case ClassificationPackage.PROPERTY__ASSOCIATION:
				return association != null;
			case ClassificationPackage.PROPERTY__ASSOCIATION_END:
				return getAssociationEnd() != null;
			case ClassificationPackage.PROPERTY__QUALIFIER:
				return qualifier != null && !qualifier.isEmpty();
			case ClassificationPackage.PROPERTY__CLASS:
				return basicGetClass() != null;
			case ClassificationPackage.PROPERTY__DATATYPE:
				return getDatatype() != null;
			case ClassificationPackage.PROPERTY__DEFAULT_VALUE:
				return defaultValue != null;
			case ClassificationPackage.PROPERTY__IS_COMPOSITE:
				return isIsComposite() != IS_COMPOSITE_EDEFAULT;
			case ClassificationPackage.PROPERTY__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case ClassificationPackage.PROPERTY__IS_DERIVED_UNION:
				return isDerivedUnion != IS_DERIVED_UNION_EDEFAULT;
			case ClassificationPackage.PROPERTY__IS_ID:
				return isId != IS_ID_EDEFAULT;
			case ClassificationPackage.PROPERTY__OPPOSITE:
				return basicGetOpposite() != null;
			case ClassificationPackage.PROPERTY__OWNING_ASSOCIATION:
				return getOwningAssociation() != null;
			case ClassificationPackage.PROPERTY__REDEFINED_PROPERTY:
				return redefinedProperty != null && !redefinedProperty.isEmpty();
			case ClassificationPackage.PROPERTY__SUBSETTED_PROPERTY:
				return subsettedProperty != null && !subsettedProperty.isEmpty();
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
				case ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER: return CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.PROPERTY__END: return StructuredClassifiersPackage.CONNECTABLE_ELEMENT__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (derivedFeatureID) {
				case ClassificationPackage.PROPERTY__DEPLOYMENT: return DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYMENT;
				case ClassificationPackage.PROPERTY__DEPLOYED_ELEMENT: return DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT;
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
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return ClassificationPackage.PROPERTY__OWNING_TEMPLATE_PARAMETER;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return ClassificationPackage.PROPERTY__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseFeatureID) {
				case StructuredClassifiersPackage.CONNECTABLE_ELEMENT__END: return ClassificationPackage.PROPERTY__END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseFeatureID) {
				case DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYMENT: return ClassificationPackage.PROPERTY__DEPLOYMENT;
				case DeploymentsPackage.DEPLOYMENT_TARGET__DEPLOYED_ELEMENT: return ClassificationPackage.PROPERTY__DEPLOYED_ELEMENT;
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
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return ClassificationPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case CommonStructurePackage.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return ClassificationPackage.PROPERTY___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == ConnectableElement.class) {
			switch (baseOperationID) {
				case StructuredClassifiersPackage.CONNECTABLE_ELEMENT___END: return ClassificationPackage.PROPERTY___END;
				default: return -1;
			}
		}
		if (baseClass == DeploymentTarget.class) {
			switch (baseOperationID) {
				case DeploymentsPackage.DEPLOYMENT_TARGET___DEPLOYED_ELEMENT: return ClassificationPackage.PROPERTY___DEPLOYED_ELEMENT;
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
			case ClassificationPackage.PROPERTY___IS_ATTRIBUTE:
				return isAttribute();
			case ClassificationPackage.PROPERTY___IS_COMPOSITE:
				return isComposite();
			case ClassificationPackage.PROPERTY___IS_NAVIGABLE:
				return isNavigable();
			case ClassificationPackage.PROPERTY___OPPOSITE:
				return opposite();
			case ClassificationPackage.PROPERTY___SUBSETTING_CONTEXT:
				return subsettingContext();
			case ClassificationPackage.PROPERTY___DEPLOYED_ELEMENT:
				return deployedElement();
			case ClassificationPackage.PROPERTY___END:
				return end();
			case ClassificationPackage.PROPERTY___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case ClassificationPackage.PROPERTY___IS_TEMPLATE_PARAMETER:
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
		result.append(" (aggregation: ");
		result.append(aggregation);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isDerivedUnion: ");
		result.append(isDerivedUnion);
		result.append(", isId: ");
		result.append(isId);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
