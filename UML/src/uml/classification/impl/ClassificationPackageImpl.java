/**
 */
package uml.classification.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import types.TypesPackage;

import types.impl.TypesPackageImpl;

import uml.actions.ActionsPackage;

import uml.actions.impl.ActionsPackageImpl;

import uml.activities.ActivitiesPackage;

import uml.activities.impl.ActivitiesPackageImpl;

import uml.classification.AggregationKind;
import uml.classification.BehavioralFeature;
import uml.classification.CallConcurrencyKind;
import uml.classification.ClassificationFactory;
import uml.classification.ClassificationPackage;
import uml.classification.Classifier;
import uml.classification.ClassifierTemplateParameter;
import uml.classification.Feature;
import uml.classification.Generalization;
import uml.classification.GeneralizationSet;
import uml.classification.InstanceSpecification;
import uml.classification.InstanceValue;
import uml.classification.Operation;
import uml.classification.OperationTemplateParameter;
import uml.classification.Parameter;
import uml.classification.ParameterDirectionKind;
import uml.classification.ParameterEffectKind;
import uml.classification.ParameterSet;
import uml.classification.Property;
import uml.classification.RedefinableElement;
import uml.classification.RedefinableTemplateSignature;
import uml.classification.Slot;
import uml.classification.StructuralFeature;
import uml.classification.Substitution;

import uml.classification.util.ClassificationValidator;

import uml.commonBehavior.CommonBehaviorPackage;

import uml.commonBehavior.impl.CommonBehaviorPackageImpl;

import uml.commonStructure.CommonStructurePackage;

import uml.commonStructure.impl.CommonStructurePackageImpl;

import uml.deployments.DeploymentsPackage;

import uml.deployments.impl.DeploymentsPackageImpl;

import uml.informationFlows.InformationFlowsPackage;

import uml.informationFlows.impl.InformationFlowsPackageImpl;

import uml.interactions.InteractionsPackage;

import uml.interactions.impl.InteractionsPackageImpl;

import uml.packages.PackagesPackage;

import uml.packages.impl.PackagesPackageImpl;

import uml.simpleClassifiers.SimpleClassifiersPackage;

import uml.simpleClassifiers.impl.SimpleClassifiersPackageImpl;

import uml.stateMachines.StateMachinesPackage;

import uml.stateMachines.impl.StateMachinesPackageImpl;

import uml.structuredClassifiers.StructuredClassifiersPackage;

import uml.structuredClassifiers.impl.StructuredClassifiersPackageImpl;

import uml.useCases.UseCasesPackage;

import uml.useCases.impl.UseCasesPackageImpl;

import uml.values.ValuesPackage;

import uml.values.impl.ValuesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationPackageImpl extends EPackageImpl implements ClassificationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableTemplateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callConcurrencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterEffectKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uml.classification.ClassificationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClassificationPackageImpl() {
		super(eNS_URI, ClassificationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClassificationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClassificationPackage init() {
		if (isInited) return (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);

		// Obtain or create and register package
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassificationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) : CommonStructurePackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		StructuredClassifiersPackageImpl theStructuredClassifiersPackage = (StructuredClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) instanceof StructuredClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) : StructuredClassifiersPackage.eINSTANCE);
		SimpleClassifiersPackageImpl theSimpleClassifiersPackage = (SimpleClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI) instanceof SimpleClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI) : SimpleClassifiersPackage.eINSTANCE);
		DeploymentsPackageImpl theDeploymentsPackage = (DeploymentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) instanceof DeploymentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) : DeploymentsPackage.eINSTANCE);
		StateMachinesPackageImpl theStateMachinesPackage = (StateMachinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) instanceof StateMachinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) : StateMachinesPackage.eINSTANCE);
		UseCasesPackageImpl theUseCasesPackage = (UseCasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) instanceof UseCasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) : UseCasesPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) : InteractionsPackage.eINSTANCE);
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theClassificationPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
		theValuesPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theStructuredClassifiersPackage.createPackageContents();
		theSimpleClassifiersPackage.createPackageContents();
		theDeploymentsPackage.createPackageContents();
		theStateMachinesPackage.createPackageContents();
		theUseCasesPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theInteractionsPackage.createPackageContents();
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theClassificationPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theStructuredClassifiersPackage.initializePackageContents();
		theSimpleClassifiersPackage.initializePackageContents();
		theDeploymentsPackage.initializePackageContents();
		theStateMachinesPackage.initializePackageContents();
		theUseCasesPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theInteractionsPackage.initializePackageContents();
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theClassificationPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ClassificationValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theClassificationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClassificationPackage.eNS_URI, theClassificationPackage);
		return theClassificationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitution() {
		return substitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_Contract() {
		return (EReference)substitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_SubstitutingClassifier() {
		return (EReference)substitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeature() {
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Concurrency() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_IsAbstract() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_Method() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameter() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameterSet() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_RaisedException() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavioralFeature__InputParameters() {
		return behavioralFeatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavioralFeature__OutputParameters() {
		return behavioralFeatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeaturingClassifier() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
		return (EAttribute)redefinableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinedElement() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinitionContext() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__IsConsistentWith__RedefinableElement() {
		return redefinableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__IsRedefinitionContextValid__RedefinableElement() {
		return redefinableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Default() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DefaultValue() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Effect() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsException() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsStream() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterSet() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__Default_() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Interface() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Aggregation() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Association() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_AssociationEnd() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Qualifier() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Class() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datatype() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DefaultValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerivedUnion() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsId() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningAssociation() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_RedefinedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubsettedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsAttribute() {
		return propertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsComposite() {
		return propertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsNavigable() {
		return propertyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__Opposite() {
		return propertyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SubsettingContext() {
		return propertyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_BodyCondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Class() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Datatype() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Interface() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsOrdered() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsQuery() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsUnique() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Lower() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Postcondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Precondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RedefinedOperation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Type() {
		return (EReference)operationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Upper() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__IsOrdered() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__IsUnique() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Lower() {
		return operationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__ReturnResult() {
		return operationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Type() {
		return operationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Upper() {
		return operationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTemplateParameter() {
		return operationTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSet() {
		return parameterSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Condition() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Parameter() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierTemplateParameter() {
		return classifierTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_AllowSubstitutable() {
		return (EAttribute)classifierTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierTemplateParameter_ConstrainingClassifier() {
		return (EReference)classifierTemplateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_GeneralizationSet() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_IsSubstitutable() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Powertype() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalization() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecification() {
		return instanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Classifier() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Slot() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Specification() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_DefiningFeature() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Value() {
		return (EReference)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_OwningInstance() {
		return (EReference)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValue() {
		return instanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceValue_Instance() {
		return (EReference)instanceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableTemplateSignature() {
		return redefinableTemplateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_Classifier() {
		return (EReference)redefinableTemplateSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_ExtendedSignature() {
		return (EReference)redefinableTemplateSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_InheritedParameter() {
		return (EReference)redefinableTemplateSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableTemplateSignature__InheritedParameter() {
		return redefinableTemplateSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Substitution() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Feature() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_PowertypeExtent() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attribute() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_CollaborationUse() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_General() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_InheritedMember() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsFinalSpecialization() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_OwnedUseCase() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_UseCase() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_RedefinedClassifier() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Representation() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllFeatures() {
		return classifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllParents() {
		return classifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__General() {
		return classifierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasVisibilityOf__NamedElement() {
		return classifierEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__Inherit__EList() {
		return classifierEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__InheritableMembers__Classifier() {
		return classifierEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__InheritedMember() {
		return classifierEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__MaySpecializeType__Classifier() {
		return classifierEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__Parents() {
		return classifierEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__DirectlyRealizedInterfaces() {
		return classifierEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__DirectlyUsedInterfaces() {
		return classifierEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllRealizedInterfaces() {
		return classifierEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllUsedInterfaces() {
		return classifierEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__IsSubstitutableFor__Classifier() {
		return classifierEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllAttributes() {
		return classifierEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllSlottableFeatures() {
		return classifierEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallConcurrencyKind() {
		return callConcurrencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterEffectKind() {
		return parameterEffectKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationFactory getClassificationFactory() {
		return (ClassificationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		substitutionEClass = createEClass(SUBSTITUTION);
		createEReference(substitutionEClass, SUBSTITUTION__CONTRACT);
		createEReference(substitutionEClass, SUBSTITUTION__SUBSTITUTING_CLASSIFIER);

		behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__CONCURRENCY);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__IS_ABSTRACT);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__METHOD);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
		createEOperation(behavioralFeatureEClass, BEHAVIORAL_FEATURE___INPUT_PARAMETERS);
		createEOperation(behavioralFeatureEClass, BEHAVIORAL_FEATURE___OUTPUT_PARAMETERS);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__FEATURING_CLASSIFIER);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__OPERATION);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);
		createEReference(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEAttribute(parameterEClass, PARAMETER__EFFECT);
		createEAttribute(parameterEClass, PARAMETER__IS_EXCEPTION);
		createEAttribute(parameterEClass, PARAMETER__IS_STREAM);
		createEReference(parameterEClass, PARAMETER__PARAMETER_SET);
		createEOperation(parameterEClass, PARAMETER___DEFAULT_);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__INTERFACE);
		createEAttribute(propertyEClass, PROPERTY__AGGREGATION);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION_END);
		createEReference(propertyEClass, PROPERTY__QUALIFIER);
		createEReference(propertyEClass, PROPERTY__CLASS);
		createEReference(propertyEClass, PROPERTY__DATATYPE);
		createEReference(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED_UNION);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEReference(propertyEClass, PROPERTY__OWNING_ASSOCIATION);
		createEReference(propertyEClass, PROPERTY__REDEFINED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__SUBSETTED_PROPERTY);
		createEOperation(propertyEClass, PROPERTY___IS_ATTRIBUTE);
		createEOperation(propertyEClass, PROPERTY___IS_COMPOSITE);
		createEOperation(propertyEClass, PROPERTY___IS_NAVIGABLE);
		createEOperation(propertyEClass, PROPERTY___OPPOSITE);
		createEOperation(propertyEClass, PROPERTY___SUBSETTING_CONTEXT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__BODY_CONDITION);
		createEReference(operationEClass, OPERATION__CLASS);
		createEReference(operationEClass, OPERATION__DATATYPE);
		createEReference(operationEClass, OPERATION__INTERFACE);
		createEAttribute(operationEClass, OPERATION__IS_ORDERED);
		createEAttribute(operationEClass, OPERATION__IS_QUERY);
		createEAttribute(operationEClass, OPERATION__IS_UNIQUE);
		createEAttribute(operationEClass, OPERATION__LOWER);
		createEReference(operationEClass, OPERATION__POSTCONDITION);
		createEReference(operationEClass, OPERATION__PRECONDITION);
		createEReference(operationEClass, OPERATION__REDEFINED_OPERATION);
		createEReference(operationEClass, OPERATION__TYPE);
		createEAttribute(operationEClass, OPERATION__UPPER);
		createEOperation(operationEClass, OPERATION___IS_ORDERED);
		createEOperation(operationEClass, OPERATION___IS_UNIQUE);
		createEOperation(operationEClass, OPERATION___LOWER);
		createEOperation(operationEClass, OPERATION___RETURN_RESULT);
		createEOperation(operationEClass, OPERATION___TYPE);
		createEOperation(operationEClass, OPERATION___UPPER);

		operationTemplateParameterEClass = createEClass(OPERATION_TEMPLATE_PARAMETER);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__IS_READ_ONLY);

		parameterSetEClass = createEClass(PARAMETER_SET);
		createEReference(parameterSetEClass, PARAMETER_SET__CONDITION);
		createEReference(parameterSetEClass, PARAMETER_SET__PARAMETER);

		classifierTemplateParameterEClass = createEClass(CLASSIFIER_TEMPLATE_PARAMETER);
		createEAttribute(classifierTemplateParameterEClass, CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE);
		createEReference(classifierTemplateParameterEClass, CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZATION_SET);
		createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__POWERTYPE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATION);

		instanceSpecificationEClass = createEClass(INSTANCE_SPECIFICATION);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__CLASSIFIER);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SLOT);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SPECIFICATION);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__DEFINING_FEATURE);
		createEReference(slotEClass, SLOT__VALUE);
		createEReference(slotEClass, SLOT__OWNING_INSTANCE);

		instanceValueEClass = createEClass(INSTANCE_VALUE);
		createEReference(instanceValueEClass, INSTANCE_VALUE__INSTANCE);

		redefinableTemplateSignatureEClass = createEClass(REDEFINABLE_TEMPLATE_SIGNATURE);
		createEReference(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER);
		createEReference(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
		createEReference(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER);
		createEOperation(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETER);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__SUBSTITUTION);
		createEReference(classifierEClass, CLASSIFIER__FEATURE);
		createEReference(classifierEClass, CLASSIFIER__POWERTYPE_EXTENT);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTE);
		createEReference(classifierEClass, CLASSIFIER__COLLABORATION_USE);
		createEReference(classifierEClass, CLASSIFIER__GENERAL);
		createEReference(classifierEClass, CLASSIFIER__INHERITED_MEMBER);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEAttribute(classifierEClass, CLASSIFIER__IS_FINAL_SPECIALIZATION);
		createEReference(classifierEClass, CLASSIFIER__OWNED_USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__REDEFINED_CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__REPRESENTATION);
		createEOperation(classifierEClass, CLASSIFIER___ALL_FEATURES);
		createEOperation(classifierEClass, CLASSIFIER___ALL_PARENTS);
		createEOperation(classifierEClass, CLASSIFIER___GENERAL);
		createEOperation(classifierEClass, CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT);
		createEOperation(classifierEClass, CLASSIFIER___INHERIT__ELIST);
		createEOperation(classifierEClass, CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___INHERITED_MEMBER);
		createEOperation(classifierEClass, CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___PARENTS);
		createEOperation(classifierEClass, CLASSIFIER___DIRECTLY_REALIZED_INTERFACES);
		createEOperation(classifierEClass, CLASSIFIER___DIRECTLY_USED_INTERFACES);
		createEOperation(classifierEClass, CLASSIFIER___ALL_REALIZED_INTERFACES);
		createEOperation(classifierEClass, CLASSIFIER___ALL_USED_INTERFACES);
		createEOperation(classifierEClass, CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___ALL_ATTRIBUTES);
		createEOperation(classifierEClass, CLASSIFIER___ALL_SLOTTABLE_FEATURES);

		// Create enums
		callConcurrencyKindEEnum = createEEnum(CALL_CONCURRENCY_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
		parameterEffectKindEEnum = createEEnum(PARAMETER_EFFECT_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);
		StructuredClassifiersPackage theStructuredClassifiersPackage = (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);
		ValuesPackage theValuesPackage = (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);
		DeploymentsPackage theDeploymentsPackage = (DeploymentsPackage)EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI);
		SimpleClassifiersPackage theSimpleClassifiersPackage = (SimpleClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI);
		UseCasesPackage theUseCasesPackage = (UseCasesPackage)EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		substitutionEClass.getESuperTypes().add(theCommonStructurePackage.getRealization());
		behavioralFeatureEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		redefinableElementEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		parameterEClass.getESuperTypes().add(theStructuredClassifiersPackage.getConnectableElement());
		parameterEClass.getESuperTypes().add(theCommonStructurePackage.getMultiplicityElement());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		propertyEClass.getESuperTypes().add(theStructuredClassifiersPackage.getConnectableElement());
		propertyEClass.getESuperTypes().add(theDeploymentsPackage.getDeploymentTarget());
		operationEClass.getESuperTypes().add(this.getBehavioralFeature());
		operationEClass.getESuperTypes().add(theCommonStructurePackage.getParameterableElement());
		operationEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateableElement());
		operationTemplateParameterEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateParameter());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(theCommonStructurePackage.getTypedElement());
		structuralFeatureEClass.getESuperTypes().add(theCommonStructurePackage.getMultiplicityElement());
		parameterSetEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		classifierTemplateParameterEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateParameter());
		generalizationEClass.getESuperTypes().add(theCommonStructurePackage.getDirectedRelationship());
		generalizationSetEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		instanceSpecificationEClass.getESuperTypes().add(theDeploymentsPackage.getDeploymentTarget());
		instanceSpecificationEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		instanceSpecificationEClass.getESuperTypes().add(theDeploymentsPackage.getDeployedArtifact());
		slotEClass.getESuperTypes().add(theCommonStructurePackage.getElement());
		instanceValueEClass.getESuperTypes().add(theValuesPackage.getValueSpecification());
		redefinableTemplateSignatureEClass.getESuperTypes().add(this.getRedefinableElement());
		redefinableTemplateSignatureEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateSignature());
		classifierEClass.getESuperTypes().add(theCommonStructurePackage.getNamespace());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		classifierEClass.getESuperTypes().add(theCommonStructurePackage.getType());
		classifierEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstitution_Contract(), this.getClassifier(), null, "contract", null, 1, 1, Substitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstitution_SubstitutingClassifier(), this.getClassifier(), this.getClassifier_Substitution(), "substitutingClassifier", null, 1, 1, Substitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavioralFeature_Concurrency(), this.getCallConcurrencyKind(), "concurrency", "sequential", 1, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehavioralFeature_IsAbstract(), theTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_Method(), theCommonBehaviorPackage.getBehavior(), theCommonBehaviorPackage.getBehavior_Specification(), "method", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavioralFeature_OwnedParameterSet(), this.getParameterSet(), null, "ownedParameterSet", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_RaisedException(), theCommonStructurePackage.getType(), null, "raisedException", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBehavioralFeature__InputParameters(), this.getParameter(), "inputParameters", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBehavioralFeature__OutputParameters(), this.getParameter(), "outputParameters", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_FeaturingClassifier(), this.getClassifier(), this.getClassifier_Feature(), "featuringClassifier", null, 0, 1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsStatic(), theTypesPackage.getBoolean(), "isStatic", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedefinableElement_IsLeaf(), theTypesPackage.getBoolean(), "isLeaf", "false", 1, 1, RedefinableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableElement_RedefinedElement(), this.getRedefinableElement(), null, "redefinedElement", null, 0, -1, RedefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableElement_RedefinitionContext(), this.getClassifier(), null, "redefinitionContext", null, 0, -1, RedefinableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRedefinableElement__IsConsistentWith__RedefinableElement(), theTypesPackage.getBoolean(), "isConsistentWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefiningElement", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRedefinableElement__IsRedefinitionContextValid__RedefinableElement(), theTypesPackage.getBoolean(), "isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefinedElement", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Operation(), this.getOperation(), null, "operation", null, 0, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Default(), theTypesPackage.getString(), "default", null, 0, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_DefaultValue(), theValuesPackage.getValueSpecification(), null, "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Direction(), this.getParameterDirectionKind(), "direction", "in", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Effect(), this.getParameterEffectKind(), "effect", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_IsException(), theTypesPackage.getBoolean(), "isException", "false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_IsStream(), theTypesPackage.getBoolean(), "isStream", "false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_ParameterSet(), this.getParameterSet(), this.getParameterSet_Parameter(), "parameterSet", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getParameter__Default_(), theTypesPackage.getString(), "default_", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Interface(), theSimpleClassifiersPackage.getInterface(), theSimpleClassifiersPackage.getInterface_OwnedAttribute(), "interface", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_Aggregation(), this.getAggregationKind(), "aggregation", "none", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Association(), theStructuredClassifiersPackage.getAssociation(), theStructuredClassifiersPackage.getAssociation_MemberEnd(), "association", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_AssociationEnd(), this.getProperty(), this.getProperty_Qualifier(), "associationEnd", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Qualifier(), this.getProperty(), this.getProperty_AssociationEnd(), "qualifier", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Class(), theStructuredClassifiersPackage.getClass_(), null, "class", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Datatype(), theSimpleClassifiersPackage.getDataType(), theSimpleClassifiersPackage.getDataType_OwnedAttribute(), "datatype", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_DefaultValue(), theValuesPackage.getValueSpecification(), null, "defaultValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsComposite(), theTypesPackage.getBoolean(), "isComposite", "false", 1, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), theTypesPackage.getBoolean(), "isDerived", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerivedUnion(), theTypesPackage.getBoolean(), "isDerivedUnion", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsId(), theTypesPackage.getBoolean(), "isId", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Opposite(), this.getProperty(), null, "opposite", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_OwningAssociation(), theStructuredClassifiersPackage.getAssociation(), theStructuredClassifiersPackage.getAssociation_OwnedEnd(), "owningAssociation", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_RedefinedProperty(), this.getProperty(), null, "redefinedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_SubsettedProperty(), this.getProperty(), null, "subsettedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getProperty__IsAttribute(), theTypesPackage.getBoolean(), "isAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsComposite(), theTypesPackage.getBoolean(), "isComposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsNavigable(), theTypesPackage.getBoolean(), "isNavigable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__Opposite(), this.getProperty(), "opposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__SubsettingContext(), theCommonStructurePackage.getType(), "subsettingContext", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_BodyCondition(), theCommonStructurePackage.getConstraint(), null, "bodyCondition", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Class(), theStructuredClassifiersPackage.getClass_(), theStructuredClassifiersPackage.getClass_OwnedOperation(), "class", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Datatype(), theSimpleClassifiersPackage.getDataType(), theSimpleClassifiersPackage.getDataType_OwnedOperation(), "datatype", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Interface(), theSimpleClassifiersPackage.getInterface(), theSimpleClassifiersPackage.getInterface_OwnedOperation(), "interface", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", null, 1, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsQuery(), theTypesPackage.getBoolean(), "isQuery", "false", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsUnique(), theTypesPackage.getBoolean(), "isUnique", null, 1, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_Lower(), theTypesPackage.getInteger(), "lower", null, 0, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Postcondition(), theCommonStructurePackage.getConstraint(), null, "postcondition", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Precondition(), theCommonStructurePackage.getConstraint(), null, "precondition", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_RedefinedOperation(), this.getOperation(), null, "redefinedOperation", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Type(), theCommonStructurePackage.getType(), null, "type", null, 0, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_Upper(), theTypesPackage.getUnlimitedNatural(), "upper", null, 0, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getOperation__IsOrdered(), theTypesPackage.getBoolean(), "isOrdered", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__IsUnique(), theTypesPackage.getBoolean(), "isUnique", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__Lower(), theTypesPackage.getInteger(), "lower", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__ReturnResult(), this.getParameter(), "returnResult", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__Type(), theCommonStructurePackage.getType(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__Upper(), theTypesPackage.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(operationTemplateParameterEClass, OperationTemplateParameter.class, "OperationTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_IsReadOnly(), theTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(parameterSetEClass, ParameterSet.class, "ParameterSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterSet_Condition(), theCommonStructurePackage.getConstraint(), null, "condition", null, 0, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterSet_Parameter(), this.getParameter(), this.getParameter_ParameterSet(), "parameter", null, 1, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classifierTemplateParameterEClass, ClassifierTemplateParameter.class, "ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierTemplateParameter_AllowSubstitutable(), theTypesPackage.getBoolean(), "allowSubstitutable", "true", 1, 1, ClassifierTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifierTemplateParameter_ConstrainingClassifier(), this.getClassifier(), null, "constrainingClassifier", null, 0, -1, ClassifierTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_GeneralizationSet(), this.getGeneralizationSet(), this.getGeneralizationSet_Generalization(), "generalizationSet", null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralization_IsSubstitutable(), theTypesPackage.getBoolean(), "isSubstitutable", "true", 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(), "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsCovering(), theTypesPackage.getBoolean(), "isCovering", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsDisjoint(), theTypesPackage.getBoolean(), "isDisjoint", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Powertype(), this.getClassifier(), this.getClassifier_PowertypeExtent(), "powertype", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Generalization(), this.getGeneralization(), this.getGeneralization_GeneralizationSet(), "generalization", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instanceSpecificationEClass, InstanceSpecification.class, "InstanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecification_Classifier(), this.getClassifier(), null, "classifier", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Slot(), this.getSlot(), this.getSlot_OwningInstance(), "slot", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Specification(), theValuesPackage.getValueSpecification(), null, "specification", null, 0, 1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_DefiningFeature(), this.getStructuralFeature(), null, "definingFeature", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlot_Value(), theValuesPackage.getValueSpecification(), null, "value", null, 0, -1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlot_OwningInstance(), this.getInstanceSpecification(), this.getInstanceSpecification_Slot(), "owningInstance", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(instanceValueEClass, InstanceValue.class, "InstanceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceValue_Instance(), this.getInstanceSpecification(), null, "instance", null, 1, 1, InstanceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(redefinableTemplateSignatureEClass, RedefinableTemplateSignature.class, "RedefinableTemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefinableTemplateSignature_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, RedefinableTemplateSignature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableTemplateSignature_ExtendedSignature(), this.getRedefinableTemplateSignature(), null, "extendedSignature", null, 0, -1, RedefinableTemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableTemplateSignature_InheritedParameter(), theCommonStructurePackage.getTemplateParameter(), null, "inheritedParameter", null, 0, -1, RedefinableTemplateSignature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getRedefinableTemplateSignature__InheritedParameter(), theCommonStructurePackage.getTemplateParameter(), "inheritedParameter", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_Substitution(), this.getSubstitution(), this.getSubstitution_SubstitutingClassifier(), "substitution", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_PowertypeExtent(), this.getGeneralizationSet(), this.getGeneralizationSet_Powertype(), "powertypeExtent", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getClassifier_CollaborationUse(), theStructuredClassifiersPackage.getCollaborationUse(), null, "collaborationUse", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_InheritedMember(), theCommonStructurePackage.getNamedElement(), null, "inheritedMember", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifier_IsAbstract(), theTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifier_IsFinalSpecialization(), theTypesPackage.getBoolean(), "isFinalSpecialization", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_OwnedUseCase(), theUseCasesPackage.getUseCase(), null, "ownedUseCase", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_UseCase(), theUseCasesPackage.getUseCase(), theUseCasesPackage.getUseCase_Subject(), "useCase", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_RedefinedClassifier(), this.getClassifier(), null, "redefinedClassifier", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Representation(), theStructuredClassifiersPackage.getCollaborationUse(), null, "representation", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getClassifier__AllFeatures(), this.getFeature(), "allFeatures", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllParents(), this.getClassifier(), "allParents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__General(), this.getClassifier(), "general", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__HasVisibilityOf__NamedElement(), theTypesPackage.getBoolean(), "hasVisibilityOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonStructurePackage.getNamedElement(), "n", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__Inherit__EList(), theCommonStructurePackage.getNamedElement(), "inherit", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCommonStructurePackage.getNamedElement(), "inhs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__InheritableMembers__Classifier(), theCommonStructurePackage.getNamedElement(), "inheritableMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__InheritedMember(), theCommonStructurePackage.getNamedElement(), "inheritedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__MaySpecializeType__Classifier(), theTypesPackage.getBoolean(), "maySpecializeType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__Parents(), this.getClassifier(), "parents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__DirectlyRealizedInterfaces(), theSimpleClassifiersPackage.getInterface(), "directlyRealizedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__DirectlyUsedInterfaces(), theSimpleClassifiersPackage.getInterface(), "directlyUsedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllRealizedInterfaces(), theSimpleClassifiersPackage.getInterface(), "allRealizedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllUsedInterfaces(), theSimpleClassifiersPackage.getInterface(), "allUsedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__IsSubstitutableFor__Classifier(), theTypesPackage.getBoolean(), "isSubstitutableFor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "contract", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllAttributes(), this.getProperty(), "allAttributes", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__AllSlottableFeatures(), this.getStructuralFeature(), "allSlottableFeatures", 0, -1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(callConcurrencyKindEEnum, CallConcurrencyKind.class, "CallConcurrencyKind");
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.SEQUENTIAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.GUARDED);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.CONCURRENT);

		initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE);

		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind");
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.INOUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.OUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.RETURN);

		initEEnum(parameterEffectKindEEnum, ParameterEffectKind.class, "ParameterEffectKind");
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.CREATE);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.READ);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.UPDATE);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.DELETE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// union
		createUnionAnnotations();
		// redefines
		createRedefinesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Classification"
		   });	
		addAnnotation
		  (getProperty_IsId(), 
		   source, 
		   new String[] {
			 "originalName", "isID"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (behavioralFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "abstract_no_method"
		   });	
		addAnnotation
		  (redefinableElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "redefinition_consistent non_leaf_redefinition redefinition_context_valid"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "in_and_out not_exception connector_end reentrant_behaviors stream_and_exception object_effect"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "constraints", "subsetting_context_conforms derived_union_is_read_only multiplicity_of_composite redefined_property_inherited subsetting_rules binding_to_attribute derived_union_is_derived deployment_target subsetted_property_names type_of_opposite_end qualified_is_association_end"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "constraints", "at_most_one_return only_body_for_query"
		   });	
		addAnnotation
		  (operationTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "match_default_signature"
		   });	
		addAnnotation
		  (parameterSetEClass, 
		   source, 
		   new String[] {
			 "constraints", "same_parameterized_entity input two_parameter_sets"
		   });	
		addAnnotation
		  (classifierTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "constraints", "has_constraining_classifier parametered_element_no_features matching_abstract actual_is_classifier constraining_classifiers_constrain_args constraining_classifiers_constrain_parametered_element"
		   });	
		addAnnotation
		  (generalizationSetEClass, 
		   source, 
		   new String[] {
			 "constraints", "generalization_same_classifier maps_to_generalization_set"
		   });	
		addAnnotation
		  (instanceSpecificationEClass, 
		   source, 
		   new String[] {
			 "constraints", "deployment_artifact structural_feature defining_feature deployment_target"
		   });	
		addAnnotation
		  (redefinableTemplateSignatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "redefines_parents"
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "constraints", "specialize_type maps_to_generalization_set non_final_parents no_cycles_in_generalization"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";	
		addAnnotation
		  (getSubstitution_Contract(), 
		   source, 
		   new String[] {
			 "body", "substitution"
		   });	
		addAnnotation
		  (getBehavioralFeature_OwnedParameter(), 
		   source, 
		   new String[] {
			 "body", "ownerFormalParam"
		   });	
		addAnnotation
		  (getBehavioralFeature_OwnedParameterSet(), 
		   source, 
		   new String[] {
			 "body", "behavioralFeature"
		   });	
		addAnnotation
		  (getBehavioralFeature_RaisedException(), 
		   source, 
		   new String[] {
			 "body", "behavioralFeature"
		   });	
		addAnnotation
		  (getRedefinableElement_RedefinedElement(), 
		   source, 
		   new String[] {
			 "body", "redefinableElement"
		   });	
		addAnnotation
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "redefinableElement"
		   });	
		addAnnotation
		  (getParameter_DefaultValue(), 
		   source, 
		   new String[] {
			 "body", "owningParameter"
		   });	
		addAnnotation
		  (getProperty_DefaultValue(), 
		   source, 
		   new String[] {
			 "body", "owningProperty"
		   });	
		addAnnotation
		  (getProperty_Opposite(), 
		   source, 
		   new String[] {
			 "body", "property"
		   });	
		addAnnotation
		  (getProperty_RedefinedProperty(), 
		   source, 
		   new String[] {
			 "body", "property"
		   });	
		addAnnotation
		  (getProperty_SubsettedProperty(), 
		   source, 
		   new String[] {
			 "body", "property"
		   });	
		addAnnotation
		  (getOperation_BodyCondition(), 
		   source, 
		   new String[] {
			 "body", "bodyContext"
		   });	
		addAnnotation
		  (getOperation_Postcondition(), 
		   source, 
		   new String[] {
			 "body", "postContext"
		   });	
		addAnnotation
		  (getOperation_Precondition(), 
		   source, 
		   new String[] {
			 "body", "preContext"
		   });	
		addAnnotation
		  (getOperation_RedefinedOperation(), 
		   source, 
		   new String[] {
			 "body", "operation"
		   });	
		addAnnotation
		  (getOperation_Type(), 
		   source, 
		   new String[] {
			 "body", "operation"
		   });	
		addAnnotation
		  (getParameterSet_Condition(), 
		   source, 
		   new String[] {
			 "body", "parameterSet"
		   });	
		addAnnotation
		  (getClassifierTemplateParameter_ConstrainingClassifier(), 
		   source, 
		   new String[] {
			 "body", "classifierTemplateParameter"
		   });	
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
			 "body", "generalization"
		   });	
		addAnnotation
		  (getInstanceSpecification_Classifier(), 
		   source, 
		   new String[] {
			 "body", "instanceSpecification"
		   });	
		addAnnotation
		  (getInstanceSpecification_Specification(), 
		   source, 
		   new String[] {
			 "body", "owningInstanceSpec"
		   });	
		addAnnotation
		  (getSlot_DefiningFeature(), 
		   source, 
		   new String[] {
			 "body", "slot"
		   });	
		addAnnotation
		  (getSlot_Value(), 
		   source, 
		   new String[] {
			 "body", "owningSlot"
		   });	
		addAnnotation
		  (getInstanceValue_Instance(), 
		   source, 
		   new String[] {
			 "body", "instanceValue"
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_ExtendedSignature(), 
		   source, 
		   new String[] {
			 "body", "redefinableTemplateSignature"
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_InheritedParameter(), 
		   source, 
		   new String[] {
			 "body", "redefinableTemplateSignature"
		   });	
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
			 "body", "classifier"
		   });	
		addAnnotation
		  (getClassifier_CollaborationUse(), 
		   source, 
		   new String[] {
			 "body", "classifier"
		   });	
		addAnnotation
		  (getClassifier_General(), 
		   source, 
		   new String[] {
			 "body", "classifier"
		   });	
		addAnnotation
		  (getClassifier_InheritedMember(), 
		   source, 
		   new String[] {
			 "body", "inheritingClassifier"
		   });	
		addAnnotation
		  (getClassifier_OwnedUseCase(), 
		   source, 
		   new String[] {
			 "body", "classifier"
		   });	
		addAnnotation
		  (getClassifier_RedefinedClassifier(), 
		   source, 
		   new String[] {
			 "body", "classifier"
		   });	
		addAnnotation
		  (getClassifier_Representation(), 
		   source, 
		   new String[] {
			 "body", "classifier"
		   });
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";	
		addAnnotation
		  (getSubstitution_Contract(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSubstitution_SubstitutingClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavioralFeature_OwnedParameter(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getBehavioralFeature_OwnedParameterSet(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getParameter_DefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Interface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_AssociationEnd(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Qualifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Class(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_Datatype(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_DefaultValue(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_OwningAssociation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getProperty_RedefinedProperty(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_BodyCondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_Class(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_Datatype(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_Interface(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_Postcondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_Precondition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getOperation_RedefinedOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getParameterSet_Condition(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getGeneralization_Specific(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInstanceSpecification_Slot(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getInstanceSpecification_Specification(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSlot_Value(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getSlot_OwningInstance(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_Classifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_ExtendedSignature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_InheritedParameter(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Substitution(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Generalization(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_CollaborationUse(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_InheritedMember(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_OwnedUseCase(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_RedefinedClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Representation(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (behavioralFeatureEClass, 
		   source, 
		   new String[] {
			 "abstract_no_method", "isAbstract implies method->isEmpty()"
		   });	
		addAnnotation
		  (getBehavioralFeature__InputParameters(), 
		   source, 
		   new String[] {
			 "body", "ownedParameter->select(direction=ParameterDirectionKind::_\'in\' or direction=ParameterDirectionKind::inout)"
		   });	
		addAnnotation
		  (getBehavioralFeature__OutputParameters(), 
		   source, 
		   new String[] {
			 "body", "ownedParameter->select(direction=ParameterDirectionKind::out or direction=ParameterDirectionKind::inout or direction=ParameterDirectionKind::return)"
		   });	
		addAnnotation
		  (redefinableElementEClass, 
		   source, 
		   new String[] {
			 "redefinition_consistent", "redefinedElement->forAll(re | re.isConsistentWith(self))",
			 "non_leaf_redefinition", "redefinedElement->forAll(re | not re.isLeaf)",
			 "redefinition_context_valid", "redefinedElement->forAll(re | self.isRedefinitionContextValid(re))"
		   });	
		addAnnotation
		  (getRedefinableElement__IsConsistentWith__RedefinableElement(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (getRedefinableElement__IsRedefinitionContextValid__RedefinableElement(), 
		   source, 
		   new String[] {
			 "body", "redefinitionContext->exists(c | c.allParents()->includesAll(redefinedElement.redefinitionContext))"
		   });	
		addAnnotation
		  (parameterEClass, 
		   source, 
		   new String[] {
			 "in_and_out", "(effect = ParameterEffectKind::delete implies (direction = ParameterDirectionKind::_\'in\' or direction = ParameterDirectionKind::inout))\r\nand\r\n(effect = ParameterEffectKind::create implies (direction = ParameterDirectionKind::out or direction = ParameterDirectionKind::inout or direction = ParameterDirectionKind::return))",
			 "not_exception", "isException implies (direction <> ParameterDirectionKind::_\'in\' and direction <> ParameterDirectionKind::inout)",
			 "connector_end", "end->notEmpty() implies collaboration->notEmpty()",
			 "reentrant_behaviors", "(isStream and behavior <> null) implies not behavior.isReentrant",
			 "stream_and_exception", "not (isException and isStream)",
			 "object_effect", "(type.oclIsKindOf(DataType)) implies (effect = null)"
		   });	
		addAnnotation
		  (getParameter__Default_(), 
		   source, 
		   new String[] {
			 "body", "if self.type = String then defaultValue.stringValue() else null endif"
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
			 "subsetting_context_conforms", "subsettedProperty->notEmpty() implies\n  (subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |\n    subsettedProperty->forAll(sp |\n      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))",
			 "derived_union_is_read_only", "isDerivedUnion implies isReadOnly",
			 "multiplicity_of_composite", "isComposite and association <> null implies opposite.upperBound() <= 1\r\n\r\n",
			 "redefined_property_inherited", "(redefinedProperty->notEmpty()) implies\r\n  (redefinitionContext->notEmpty() and\r\n      redefinedProperty->forAll(rp|\r\n        ((redefinitionContext->collect(fc|\r\n          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp)))",
			 "subsetting_rules", "subsettedProperty->forAll(sp |\n  self.type.conformsTo(sp.type) and\n    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\n      self.upperBound() <= sp.upperBound() ))",
			 "binding_to_attribute", "(self.isAttribute()\r\nand (templateParameterSubstitution->notEmpty())\r\nimplies (templateParameterSubstitution->forAll(ts |\r\n    ts.formal.oclIsKindOf(Property)\r\n    and ts.formal.oclAsType(Property).isAttribute())))",
			 "derived_union_is_derived", "isDerivedUnion implies isDerived",
			 "deployment_target", "deployment->notEmpty() implies owner.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p = self))",
			 "subsetted_property_names", "subsettedProperty->forAll(sp | sp.name <> name)",
			 "type_of_opposite_end", "(opposite->notEmpty() and owningAssociation->isEmpty()) implies classifier = opposite.type",
			 "qualified_is_association_end", "qualifier->notEmpty() implies association->notEmpty()"
		   });	
		addAnnotation
		  (getProperty__IsAttribute(), 
		   source, 
		   new String[] {
			 "body", "not classifier->isEmpty()"
		   });	
		addAnnotation
		  (getProperty__IsComposite(), 
		   source, 
		   new String[] {
			 "body", "aggregation = AggregationKind::composite"
		   });	
		addAnnotation
		  (getProperty__IsNavigable(), 
		   source, 
		   new String[] {
			 "body", "not classifier->isEmpty() or association.navigableOwnedEnd->includes(self)"
		   });	
		addAnnotation
		  (getProperty__Opposite(), 
		   source, 
		   new String[] {
			 "body", "if association <> null and association.memberEnd->size() = 2\nthen\n    association.memberEnd->any(e | e <> self)\nelse\n    null\nendif"
		   });	
		addAnnotation
		  (getProperty__SubsettingContext(), 
		   source, 
		   new String[] {
			 "body", "if association <> null\nthen association.memberEnd->excluding(self)->collect(type)->asSet()\nelse \n  if classifier<>null\n  then classifier->asSet()\n  else Set{} \n  endif\nendif"
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
			 "at_most_one_return", "self.ownedParameter->select(direction = ParameterDirectionKind::return)->size() <= 1",
			 "only_body_for_query", "bodyCondition <> null implies isQuery"
		   });	
		addAnnotation
		  (getOperation__IsOrdered(), 
		   source, 
		   new String[] {
			 "body", "if returnResult()->notEmpty() then returnResult()-> exists(isOrdered) else false endif"
		   });	
		addAnnotation
		  (getOperation__IsUnique(), 
		   source, 
		   new String[] {
			 "body", "if returnResult()->notEmpty() then returnResult()->exists(isUnique) else true endif"
		   });	
		addAnnotation
		  (getOperation__Lower(), 
		   source, 
		   new String[] {
			 "body", "if returnResult()->notEmpty() then returnResult()->any(true).lower else null endif"
		   });	
		addAnnotation
		  (getOperation__ReturnResult(), 
		   source, 
		   new String[] {
			 "body", "ownedParameter->select (direction = ParameterDirectionKind::return)"
		   });	
		addAnnotation
		  (getOperation__Type(), 
		   source, 
		   new String[] {
			 "body", "if returnResult()->notEmpty() then returnResult()->any(true).type else null endif"
		   });	
		addAnnotation
		  (getOperation__Upper(), 
		   source, 
		   new String[] {
			 "body", "if returnResult()->notEmpty() then returnResult()->any(true).upper else null endif"
		   });	
		addAnnotation
		  (operationTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "match_default_signature", "default->notEmpty() implies (default.oclIsKindOf(Operation) and (let defaultOp : Operation = default.oclAsType(Operation) in \r\n    defaultOp.ownedParameter->size() = parameteredElement.ownedParameter->size() and\r\n    Sequence{1.. defaultOp.ownedParameter->size()}->forAll( ix | \r\n        let p1: Parameter = defaultOp.ownedParameter->at(ix), p2 : Parameter = parameteredElement.ownedParameter->at(ix) in\r\n          p1.type = p2.type and p1.upper = p2.upper and p1.lower = p2.lower and p1.direction = p2.direction and p1.isOrdered = p2.isOrdered and p1.isUnique = p2.isUnique)))"
		   });	
		addAnnotation
		  (parameterSetEClass, 
		   source, 
		   new String[] {
			 "same_parameterized_entity", "parameter->forAll(p1, p2 | self.owner = p1.owner and self.owner = p2.owner and p1.direction = p2.direction)",
			 "input", "((parameter->exists(direction = ParameterDirectionKind::_\'in\')) implies \r\n    behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::_\'in\' and p.parameterSet->isEmpty())->forAll(isStream))\r\n    and\r\n((parameter->exists(direction = ParameterDirectionKind::out)) implies \r\n    behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::out and p.parameterSet->isEmpty())->forAll(isStream))  \r\n",
			 "two_parameter_sets", "parameter->forAll(parameterSet->forAll(s1, s2 | s1->size() = s2->size() implies s1.parameter->exists(p | not s2.parameter->includes(p))))"
		   });	
		addAnnotation
		  (classifierTemplateParameterEClass, 
		   source, 
		   new String[] {
			 "has_constraining_classifier", "allowSubstitutable implies constrainingClassifier->notEmpty()",
			 "parametered_element_no_features", "parameteredElement.feature->isEmpty() and (constrainingClassifier->isEmpty() implies  parameteredElement.allParents()->isEmpty())",
			 "matching_abstract", "(not parameteredElement.isAbstract) implies templateParameterSubstitution.actual->forAll(a | not a.oclAsType(Classifier).isAbstract)",
			 "actual_is_classifier", " templateParameterSubstitution.actual->forAll(a | a.oclIsKindOf(Classifier))",
			 "constraining_classifiers_constrain_args", "templateParameterSubstitution.actual->forAll( a |\r\n  let arg : Classifier = a.oclAsType(Classifier) in\r\n    constrainingClassifier->forAll(\r\n      cc |  \r\n         arg = cc or arg.conformsTo(cc) or (allowSubstitutable and arg.isSubstitutableFor(cc))\r\n      )\r\n)",
			 "constraining_classifiers_constrain_parametered_element", "constrainingClassifier->forAll(\r\n     cc |  parameteredElement = cc or parameteredElement.conformsTo(cc) or (allowSubstitutable and parameteredElement.isSubstitutableFor(cc))\r\n)\r\n"
		   });	
		addAnnotation
		  (generalizationSetEClass, 
		   source, 
		   new String[] {
			 "generalization_same_classifier", "generalization->collect(general)->asSet()->size() <= 1",
			 "maps_to_generalization_set", "powertype <> null implies generalization->forAll( gen | \r\n    not (gen.general = powertype) and not gen.general.allParents()->includes(powertype) and not (gen.specific = powertype) and not powertype.allParents()->includes(gen.specific)\r\n  )"
		   });	
		addAnnotation
		  (instanceSpecificationEClass, 
		   source, 
		   new String[] {
			 "deployment_artifact", "deploymentForArtifact->notEmpty() implies classifier->exists(oclIsKindOf(Artifact))",
			 "structural_feature", "classifier->forAll(c | (c.allSlottableFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)))",
			 "defining_feature", "slot->forAll(s | classifier->exists (c | c.allSlottableFeatures()->includes (s.definingFeature)))",
			 "deployment_target", "deployment->notEmpty() implies classifier->exists(node | node.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p.type = node)))"
		   });	
		addAnnotation
		  (redefinableTemplateSignatureEClass, 
		   source, 
		   new String[] {
			 "redefines_parents", "classifier.allParents()->forAll(c | c.ownedTemplateSignature->notEmpty() implies self->closure(extendedSignature)->includes(c.ownedTemplateSignature))"
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature__InheritedParameter(), 
		   source, 
		   new String[] {
			 "body", "if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter->asSet() endif"
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
			 "specialize_type", "parents()->forAll(c | self.maySpecializeType(c))",
			 "maps_to_generalization_set", "powertypeExtent->forAll( gs | \r\n  gs.generalization->forAll( gen | \r\n    not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) \r\n  ))",
			 "non_final_parents", "parents()->forAll(not isFinalSpecialization)",
			 "no_cycles_in_generalization", "not allParents()->includes(self)"
		   });	
		addAnnotation
		  (getClassifier__AllFeatures(), 
		   source, 
		   new String[] {
			 "body", "member->select(oclIsKindOf(Feature))->collect(oclAsType(Feature))->asSet()"
		   });	
		addAnnotation
		  (getClassifier__AllParents(), 
		   source, 
		   new String[] {
			 "body", "parents()->union(parents()->collect(allParents())->asSet())"
		   });	
		addAnnotation
		  (getClassifier__General(), 
		   source, 
		   new String[] {
			 "body", "parents()"
		   });	
		addAnnotation
		  (getClassifier__HasVisibilityOf__NamedElement(), 
		   source, 
		   new String[] {
			 "body", "n.visibility <> VisibilityKind::private"
		   });	
		addAnnotation
		  (getClassifier__Inherit__EList(), 
		   source, 
		   new String[] {
			 "body", "inhs->reject(inh |\r\n  inh.oclIsKindOf(RedefinableElement) and\r\n  ownedMember->select(oclIsKindOf(RedefinableElement))->\r\n    select(redefinedElement->includes(inh.oclAsType(RedefinableElement)))\r\n       ->notEmpty())"
		   });	
		addAnnotation
		  (getClassifier__InheritableMembers__Classifier(), 
		   source, 
		   new String[] {
			 "body", "member->select(m | c.hasVisibilityOf(m))"
		   });	
		addAnnotation
		  (getClassifier__InheritedMember(), 
		   source, 
		   new String[] {
			 "body", "inherit(parents()->collect(inheritableMembers(self))->asSet())"
		   });	
		addAnnotation
		  (getClassifier__MaySpecializeType__Classifier(), 
		   source, 
		   new String[] {
			 "body", "self.oclIsKindOf(c.oclType())"
		   });	
		addAnnotation
		  (getClassifier__Parents(), 
		   source, 
		   new String[] {
			 "body", "generalization.general->asSet()"
		   });	
		addAnnotation
		  (getClassifier__DirectlyRealizedInterfaces(), 
		   source, 
		   new String[] {
			 "body", "(clientDependency->\r\n  select(oclIsKindOf(Realization) and supplier->forAll(oclIsKindOf(Interface))))->\r\n      collect(supplier.oclAsType(Interface))->asSet()"
		   });	
		addAnnotation
		  (getClassifier__DirectlyUsedInterfaces(), 
		   source, 
		   new String[] {
			 "body", "(supplierDependency->\r\n  select(oclIsKindOf(Usage) and client->forAll(oclIsKindOf(Interface))))->\r\n    collect(client.oclAsType(Interface))->asSet()"
		   });	
		addAnnotation
		  (getClassifier__AllRealizedInterfaces(), 
		   source, 
		   new String[] {
			 "body", "directlyRealizedInterfaces()->union(self.allParents()->collect(directlyRealizedInterfaces()))->asSet()"
		   });	
		addAnnotation
		  (getClassifier__AllUsedInterfaces(), 
		   source, 
		   new String[] {
			 "body", "directlyUsedInterfaces()->union(self.allParents()->collect(directlyUsedInterfaces()))->asSet()"
		   });	
		addAnnotation
		  (getClassifier__IsSubstitutableFor__Classifier(), 
		   source, 
		   new String[] {
			 "body", "substitution.contract->includes(contract)"
		   });	
		addAnnotation
		  (getClassifier__AllAttributes(), 
		   source, 
		   new String[] {
			 "body", "attribute->asSequence()->union(parents()->asSequence().allAttributes())->select(p | member->includes(p))->asOrderedSet()"
		   });	
		addAnnotation
		  (getClassifier__AllSlottableFeatures(), 
		   source, 
		   new String[] {
			 "body", "member->select(oclIsKindOf(StructuralFeature))->\r\n  collect(oclAsType(StructuralFeature))->\r\n   union(self.inherit(self.allParents()->collect(p | p.attribute)->asSet())->\r\n     collect(oclAsType(StructuralFeature)))->asSet()"
		   });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (behavioralFeatureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationTemplateParameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (classifierTemplateParameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (redefinableTemplateSignatureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";	
		addAnnotation
		  (getFeature_FeaturingClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableElement_RedefinedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";	
		addAnnotation
		  (getRedefinableTemplateSignature_Classifier(), 
		   source, 
		   new String[] {
		   });
	}

} //ClassificationPackageImpl
