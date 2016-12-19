/**
 */
package uml.structuredClassifiers.impl;

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

import uml.classification.ClassificationPackage;

import uml.classification.impl.ClassificationPackageImpl;

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

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.AssociationClass;
import uml.structuredClassifiers.Collaboration;
import uml.structuredClassifiers.CollaborationUse;
import uml.structuredClassifiers.Component;
import uml.structuredClassifiers.ComponentRealization;
import uml.structuredClassifiers.ConnectableElement;
import uml.structuredClassifiers.ConnectableElementTemplateParameter;
import uml.structuredClassifiers.Connector;
import uml.structuredClassifiers.ConnectorEnd;
import uml.structuredClassifiers.ConnectorKind;
import uml.structuredClassifiers.EncapsulatedClassifier;
import uml.structuredClassifiers.Port;
import uml.structuredClassifiers.StructuredClassifier;
import uml.structuredClassifiers.StructuredClassifiersFactory;
import uml.structuredClassifiers.StructuredClassifiersPackage;

import uml.structuredClassifiers.util.StructuredClassifiersValidator;

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
public class StructuredClassifiersPackageImpl extends EPackageImpl implements StructuredClassifiersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorKindEEnum = null;

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
	 * @see uml.structuredClassifiers.StructuredClassifiersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuredClassifiersPackageImpl() {
		super(eNS_URI, StructuredClassifiersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuredClassifiersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuredClassifiersPackage init() {
		if (isInited) return (StructuredClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI);

		// Obtain or create and register package
		StructuredClassifiersPackageImpl theStructuredClassifiersPackage = (StructuredClassifiersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructuredClassifiersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructuredClassifiersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) : CommonStructurePackage.eINSTANCE);
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI) : ValuesPackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		SimpleClassifiersPackageImpl theSimpleClassifiersPackage = (SimpleClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI) instanceof SimpleClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI) : SimpleClassifiersPackage.eINSTANCE);
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);
		DeploymentsPackageImpl theDeploymentsPackage = (DeploymentsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) instanceof DeploymentsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeploymentsPackage.eNS_URI) : DeploymentsPackage.eINSTANCE);
		StateMachinesPackageImpl theStateMachinesPackage = (StateMachinesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) instanceof StateMachinesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI) : StateMachinesPackage.eINSTANCE);
		UseCasesPackageImpl theUseCasesPackage = (UseCasesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) instanceof UseCasesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(UseCasesPackage.eNS_URI) : UseCasesPackage.eINSTANCE);
		ActionsPackageImpl theActionsPackage = (ActionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) instanceof ActionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionsPackage.eNS_URI) : ActionsPackage.eINSTANCE);
		InteractionsPackageImpl theInteractionsPackage = (InteractionsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) instanceof InteractionsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InteractionsPackage.eNS_URI) : InteractionsPackage.eINSTANCE);
		InformationFlowsPackageImpl theInformationFlowsPackage = (InformationFlowsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) instanceof InformationFlowsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InformationFlowsPackage.eNS_URI) : InformationFlowsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theStructuredClassifiersPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
		theValuesPackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theSimpleClassifiersPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theDeploymentsPackage.createPackageContents();
		theStateMachinesPackage.createPackageContents();
		theUseCasesPackage.createPackageContents();
		theActionsPackage.createPackageContents();
		theInteractionsPackage.createPackageContents();
		theInformationFlowsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theStructuredClassifiersPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
		theValuesPackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theSimpleClassifiersPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();
		theDeploymentsPackage.initializePackageContents();
		theStateMachinesPackage.initializePackageContents();
		theUseCasesPackage.initializePackageContents();
		theActionsPackage.initializePackageContents();
		theInteractionsPackage.initializePackageContents();
		theInformationFlowsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theStructuredClassifiersPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return StructuredClassifiersValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theStructuredClassifiersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuredClassifiersPackage.eNS_URI, theStructuredClassifiersPackage);
		return theStructuredClassifiersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClass() {
		return associationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extension() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsActive() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedClassifier() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedReception() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__Extension() {
		return classEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__SuperClass() {
		return classEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElement() {
		return connectableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectableElement_End() {
		return (EReference)connectableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectableElement__End() {
		return connectableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEnd() {
		return connectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_DefiningEnd() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_PartWithPort() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_Role() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectorEnd__DefiningEnd() {
		return connectorEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsBehavior() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsConjugated() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsService() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Protocol() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Provided() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RedefinedPort() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Required() {
		return (EReference)portEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__Provided() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__Required() {
		return portEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__BasicProvided() {
		return portEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__BasicRequired() {
		return portEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementTemplateParameter() {
		return connectableElementTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUse() {
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_RoleBinding() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_Type() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_CollaborationRole() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClassifier() {
		return structuredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedAttribute() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedConnector() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_Part() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_Role() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredClassifier__Part() {
		return structuredClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredClassifier__AllRoles() {
		return structuredClassifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Contract() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_End() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Kind() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_RedefinedConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Type() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__Kind() {
		return connectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedClassifier() {
		return encapsulatedClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedClassifier_OwnedPort() {
		return (EReference)encapsulatedClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEncapsulatedClassifier__OwnedPort() {
		return encapsulatedClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IsIndirectlyInstantiated() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_PackagedElement() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Provided() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Realization() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Required() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__Provided() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__Required() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRealization() {
		return componentRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRealization_RealizingClassifier() {
		return (EReference)componentRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRealization_Abstraction() {
		return (EReference)componentRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_MemberEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NavigableOwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__EndType() {
		return associationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorKind() {
		return connectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifiersFactory getStructuredClassifiersFactory() {
		return (StructuredClassifiersFactory)getEFactoryInstance();
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
		associationClassEClass = createEClass(ASSOCIATION_CLASS);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_OPERATION);
		createEReference(classEClass, CLASS__EXTENSION);
		createEAttribute(classEClass, CLASS__IS_ACTIVE);
		createEReference(classEClass, CLASS__NESTED_CLASSIFIER);
		createEReference(classEClass, CLASS__OWNED_RECEPTION);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEOperation(classEClass, CLASS___EXTENSION);
		createEOperation(classEClass, CLASS___SUPER_CLASS);

		connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);
		createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__END);
		createEOperation(connectableElementEClass, CONNECTABLE_ELEMENT___END);

		connectorEndEClass = createEClass(CONNECTOR_END);
		createEReference(connectorEndEClass, CONNECTOR_END__DEFINING_END);
		createEReference(connectorEndEClass, CONNECTOR_END__PART_WITH_PORT);
		createEReference(connectorEndEClass, CONNECTOR_END__ROLE);
		createEOperation(connectorEndEClass, CONNECTOR_END___DEFINING_END);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__IS_BEHAVIOR);
		createEAttribute(portEClass, PORT__IS_CONJUGATED);
		createEAttribute(portEClass, PORT__IS_SERVICE);
		createEReference(portEClass, PORT__PROTOCOL);
		createEReference(portEClass, PORT__PROVIDED);
		createEReference(portEClass, PORT__REDEFINED_PORT);
		createEReference(portEClass, PORT__REQUIRED);
		createEOperation(portEClass, PORT___PROVIDED);
		createEOperation(portEClass, PORT___REQUIRED);
		createEOperation(portEClass, PORT___BASIC_PROVIDED);
		createEOperation(portEClass, PORT___BASIC_REQUIRED);

		connectableElementTemplateParameterEClass = createEClass(CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER);

		collaborationUseEClass = createEClass(COLLABORATION_USE);
		createEReference(collaborationUseEClass, COLLABORATION_USE__ROLE_BINDING);
		createEReference(collaborationUseEClass, COLLABORATION_USE__TYPE);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);

		structuredClassifierEClass = createEClass(STRUCTURED_CLASSIFIER);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__PART);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__ROLE);
		createEOperation(structuredClassifierEClass, STRUCTURED_CLASSIFIER___PART);
		createEOperation(structuredClassifierEClass, STRUCTURED_CLASSIFIER___ALL_ROLES);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CONTRACT);
		createEReference(connectorEClass, CONNECTOR__END);
		createEAttribute(connectorEClass, CONNECTOR__KIND);
		createEReference(connectorEClass, CONNECTOR__REDEFINED_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__TYPE);
		createEOperation(connectorEClass, CONNECTOR___KIND);

		encapsulatedClassifierEClass = createEClass(ENCAPSULATED_CLASSIFIER);
		createEReference(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER__OWNED_PORT);
		createEOperation(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER___OWNED_PORT);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__IS_INDIRECTLY_INSTANTIATED);
		createEReference(componentEClass, COMPONENT__PACKAGED_ELEMENT);
		createEReference(componentEClass, COMPONENT__PROVIDED);
		createEReference(componentEClass, COMPONENT__REALIZATION);
		createEReference(componentEClass, COMPONENT__REQUIRED);
		createEOperation(componentEClass, COMPONENT___PROVIDED);
		createEOperation(componentEClass, COMPONENT___REQUIRED);

		componentRealizationEClass = createEClass(COMPONENT_REALIZATION);
		createEReference(componentRealizationEClass, COMPONENT_REALIZATION__REALIZING_CLASSIFIER);
		createEReference(componentRealizationEClass, COMPONENT_REALIZATION__ABSTRACTION);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__MEMBER_END);
		createEReference(associationEClass, ASSOCIATION__OWNED_END);
		createEReference(associationEClass, ASSOCIATION__END_TYPE);
		createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
		createEReference(associationEClass, ASSOCIATION__NAVIGABLE_OWNED_END);
		createEOperation(associationEClass, ASSOCIATION___END_TYPE);

		// Create enums
		connectorKindEEnum = createEEnum(CONNECTOR_KIND);
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
		SimpleClassifiersPackage theSimpleClassifiersPackage = (SimpleClassifiersPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleClassifiersPackage.eNS_URI);
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);
		PackagesPackage thePackagesPackage = (PackagesPackage)EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		CommonStructurePackage theCommonStructurePackage = (CommonStructurePackage)EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI);
		StateMachinesPackage theStateMachinesPackage = (StateMachinesPackage)EPackage.Registry.INSTANCE.getEPackage(StateMachinesPackage.eNS_URI);
		CommonBehaviorPackage theCommonBehaviorPackage = (CommonBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		associationClassEClass.getESuperTypes().add(this.getClass_());
		associationClassEClass.getESuperTypes().add(this.getAssociation());
		classEClass.getESuperTypes().add(this.getEncapsulatedClassifier());
		classEClass.getESuperTypes().add(theSimpleClassifiersPackage.getBehavioredClassifier());
		connectableElementEClass.getESuperTypes().add(theCommonStructurePackage.getTypedElement());
		connectableElementEClass.getESuperTypes().add(theCommonStructurePackage.getParameterableElement());
		connectorEndEClass.getESuperTypes().add(theCommonStructurePackage.getMultiplicityElement());
		portEClass.getESuperTypes().add(theClassificationPackage.getProperty());
		connectableElementTemplateParameterEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateParameter());
		collaborationUseEClass.getESuperTypes().add(theCommonStructurePackage.getNamedElement());
		collaborationEClass.getESuperTypes().add(this.getStructuredClassifier());
		collaborationEClass.getESuperTypes().add(theSimpleClassifiersPackage.getBehavioredClassifier());
		structuredClassifierEClass.getESuperTypes().add(theClassificationPackage.getClassifier());
		connectorEClass.getESuperTypes().add(theClassificationPackage.getFeature());
		encapsulatedClassifierEClass.getESuperTypes().add(this.getStructuredClassifier());
		componentEClass.getESuperTypes().add(this.getClass_());
		componentRealizationEClass.getESuperTypes().add(theCommonStructurePackage.getRealization());
		associationEClass.getESuperTypes().add(theClassificationPackage.getClassifier());
		associationEClass.getESuperTypes().add(theCommonStructurePackage.getRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(associationClassEClass, AssociationClass.class, "AssociationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, uml.structuredClassifiers.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedOperation(), theClassificationPackage.getOperation(), theClassificationPackage.getOperation_Class(), "ownedOperation", null, 0, -1, uml.structuredClassifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Extension(), thePackagesPackage.getExtension(), thePackagesPackage.getExtension_Metaclass(), "extension", null, 0, -1, uml.structuredClassifiers.Class.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClass_IsActive(), theTypesPackage.getBoolean(), "isActive", "false", 1, 1, uml.structuredClassifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_NestedClassifier(), theClassificationPackage.getClassifier(), null, "nestedClassifier", null, 0, -1, uml.structuredClassifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedReception(), theSimpleClassifiersPackage.getReception(), null, "ownedReception", null, 0, -1, uml.structuredClassifiers.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, uml.structuredClassifiers.Class.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getClass__Extension(), thePackagesPackage.getExtension(), "extension", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClass__SuperClass(), this.getClass_(), "superClass", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectableElement_End(), this.getConnectorEnd(), this.getConnectorEnd_Role(), "end", null, 0, -1, ConnectableElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getConnectableElement__End(), this.getConnectorEnd(), "end", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectorEndEClass, ConnectorEnd.class, "ConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorEnd_DefiningEnd(), theClassificationPackage.getProperty(), null, "definingEnd", null, 0, 1, ConnectorEnd.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectorEnd_PartWithPort(), theClassificationPackage.getProperty(), null, "partWithPort", null, 0, 1, ConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectorEnd_Role(), this.getConnectableElement(), this.getConnectableElement_End(), "role", null, 1, 1, ConnectorEnd.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getConnectorEnd__DefiningEnd(), theClassificationPackage.getProperty(), "definingEnd", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_IsBehavior(), theTypesPackage.getBoolean(), "isBehavior", "false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_IsConjugated(), theTypesPackage.getBoolean(), "isConjugated", "false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_IsService(), theTypesPackage.getBoolean(), "isService", "true", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Protocol(), theStateMachinesPackage.getProtocolStateMachine(), null, "protocol", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Provided(), theSimpleClassifiersPackage.getInterface(), null, "provided", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_RedefinedPort(), this.getPort(), null, "redefinedPort", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Required(), theSimpleClassifiersPackage.getInterface(), null, "required", null, 0, -1, Port.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getPort__Provided(), theSimpleClassifiersPackage.getInterface(), "provided", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPort__Required(), theSimpleClassifiersPackage.getInterface(), "required", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPort__BasicProvided(), theSimpleClassifiersPackage.getInterface(), "basicProvided", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPort__BasicRequired(), theSimpleClassifiersPackage.getInterface(), "basicRequired", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectableElementTemplateParameterEClass, ConnectableElementTemplateParameter.class, "ConnectableElementTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collaborationUseEClass, CollaborationUse.class, "CollaborationUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationUse_RoleBinding(), theCommonStructurePackage.getDependency(), null, "roleBinding", null, 0, -1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaborationUse_Type(), this.getCollaboration(), null, "type", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_CollaborationRole(), this.getConnectableElement(), null, "collaborationRole", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuredClassifierEClass, StructuredClassifier.class, "StructuredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredClassifier_OwnedAttribute(), theClassificationPackage.getProperty(), null, "ownedAttribute", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredClassifier_OwnedConnector(), this.getConnector(), null, "ownedConnector", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClassifier_Part(), theClassificationPackage.getProperty(), null, "part", null, 0, -1, StructuredClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClassifier_Role(), this.getConnectableElement(), null, "role", null, 0, -1, StructuredClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getStructuredClassifier__Part(), theClassificationPackage.getProperty(), "part", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStructuredClassifier__AllRoles(), this.getConnectableElement(), "allRoles", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Contract(), theCommonBehaviorPackage.getBehavior(), null, "contract", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_End(), this.getConnectorEnd(), null, "end", null, 2, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Kind(), this.getConnectorKind(), "kind", null, 1, 1, Connector.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_RedefinedConnector(), this.getConnector(), null, "redefinedConnector", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_Type(), this.getAssociation(), null, "type", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getConnector__Kind(), this.getConnectorKind(), "kind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(encapsulatedClassifierEClass, EncapsulatedClassifier.class, "EncapsulatedClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncapsulatedClassifier_OwnedPort(), this.getPort(), null, "ownedPort", null, 0, -1, EncapsulatedClassifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getEncapsulatedClassifier__OwnedPort(), this.getPort(), "ownedPort", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_IsIndirectlyInstantiated(), theTypesPackage.getBoolean(), "isIndirectlyInstantiated", "true", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_PackagedElement(), theCommonStructurePackage.getPackageableElement(), null, "packagedElement", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Provided(), theSimpleClassifiersPackage.getInterface(), null, "provided", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Realization(), this.getComponentRealization(), this.getComponentRealization_Abstraction(), "realization", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Required(), theSimpleClassifiersPackage.getInterface(), null, "required", null, 0, -1, Component.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getComponent__Provided(), theSimpleClassifiersPackage.getInterface(), "provided", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getComponent__Required(), theSimpleClassifiersPackage.getInterface(), "required", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(componentRealizationEClass, ComponentRealization.class, "ComponentRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRealization_RealizingClassifier(), theClassificationPackage.getClassifier(), null, "realizingClassifier", null, 1, -1, ComponentRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentRealization_Abstraction(), this.getComponent(), this.getComponent_Realization(), "abstraction", null, 0, 1, ComponentRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_MemberEnd(), theClassificationPackage.getProperty(), theClassificationPackage.getProperty_Association(), "memberEnd", null, 2, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_OwnedEnd(), theClassificationPackage.getProperty(), theClassificationPackage.getProperty_OwningAssociation(), "ownedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_EndType(), theCommonStructurePackage.getType(), null, "endType", null, 1, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAssociation_IsDerived(), theTypesPackage.getBoolean(), "isDerived", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_NavigableOwnedEnd(), theClassificationPackage.getProperty(), null, "navigableOwnedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAssociation__EndType(), theCommonStructurePackage.getType(), "endType", 1, -1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(connectorKindEEnum, ConnectorKind.class, "ConnectorKind");
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.ASSEMBLY);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.DELEGATION);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// subsets
		createSubsetsAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// redefines
		createRedefinesAnnotations();
		// union
		createUnionAnnotations();
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
			 "originalName", "StructuredClassifiers"
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
		  (associationClassEClass, 
		   source, 
		   new String[] {
			 "constraints", "cannot_be_defined disjoint_attributes_ends"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "constraints", "passive_class"
		   });	
		addAnnotation
		  (connectorEndEClass, 
		   source, 
		   new String[] {
			 "constraints", "role_and_part_with_port part_with_port_empty multiplicity self_part_with_port"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "constraints", "port_aggregation default_value encapsulated_owner"
		   });	
		addAnnotation
		  (collaborationUseEClass, 
		   source, 
		   new String[] {
			 "constraints", "client_elements every_role connectors"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "constraints", "types roles"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_nested_classifiers no_packaged_elements"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "constraints", "specialized_end_number specialized_end_types binary_associations association_ends ends_must_be_typed"
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
		  (associationClassEClass, 
		   source, 
		   new String[] {
			 "cannot_be_defined", "self.endType()->excludes(self) and self.endType()->collect(et|et.oclAsType(Classifier).allParents())->flatten()->excludes(self)",
			 "disjoint_attributes_ends", "ownedAttribute->intersection(ownedEnd)->isEmpty()"
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
			 "passive_class", "not isActive implies (ownedReception->isEmpty() and classifierBehavior = null)"
		   });	
		addAnnotation
		  (getClass__Extension(), 
		   source, 
		   new String[] {
			 "body", "Extension.allInstances()->select(ext | \r\n  let endTypes : Sequence(Classifier) = ext.memberEnd->collect(type.oclAsType(Classifier)) in\r\n  endTypes->includes(self) or endTypes.allParents()->includes(self) )"
		   });	
		addAnnotation
		  (getClass__SuperClass(), 
		   source, 
		   new String[] {
			 "body", "self.general()->select(oclIsKindOf(Class))->collect(oclAsType(Class))->asSet()"
		   });	
		addAnnotation
		  (getConnectableElement__End(), 
		   source, 
		   new String[] {
			 "body", "ConnectorEnd.allInstances()->select(role = self)"
		   });	
		addAnnotation
		  (connectorEndEClass, 
		   source, 
		   new String[] {
			 "role_and_part_with_port", "partWithPort->notEmpty() implies \r\n  (role.oclIsKindOf(Port) and partWithPort.type.oclAsType(Namespace).member->includes(role))",
			 "part_with_port_empty", "(role.oclIsKindOf(Port) and role.owner = connector.owner) implies partWithPort->isEmpty()",
			 "multiplicity", "self.compatibleWith(definingEnd)",
			 "self_part_with_port", "partWithPort->notEmpty() implies not partWithPort.oclIsKindOf(Port)"
		   });	
		addAnnotation
		  (getConnectorEnd__DefiningEnd(), 
		   source, 
		   new String[] {
			 "body", "if connector.type = null \r\nthen\r\n  null \r\nelse\r\n  let index : Integer = connector.end->indexOf(self) in\r\n    connector.type.memberEnd->at(index)\r\nendif"
		   });	
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "port_aggregation", "aggregation = AggregationKind::composite",
			 "default_value", "type.oclIsKindOf(Interface) implies defaultValue->isEmpty()",
			 "encapsulated_owner", "owner = encapsulatedClassifier"
		   });	
		addAnnotation
		  (getPort__Provided(), 
		   source, 
		   new String[] {
			 "body", "if isConjugated then basicRequired() else basicProvided() endif"
		   });	
		addAnnotation
		  (getPort__Required(), 
		   source, 
		   new String[] {
			 "body", "if isConjugated then basicProvided() else basicRequired() endif"
		   });	
		addAnnotation
		  (getPort__BasicProvided(), 
		   source, 
		   new String[] {
			 "body", "if type.oclIsKindOf(Interface) \r\nthen type.oclAsType(Interface)->asSet() \r\nelse type.oclAsType(Classifier).allRealizedInterfaces() \r\nendif"
		   });	
		addAnnotation
		  (getPort__BasicRequired(), 
		   source, 
		   new String[] {
			 "body", "type.oclAsType(Classifier).allUsedInterfaces()"
		   });	
		addAnnotation
		  (collaborationUseEClass, 
		   source, 
		   new String[] {
			 "client_elements", "roleBinding->collect(client)->forAll(ne1, ne2 |\r\n  ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and\r\n    let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in\r\n      ce1.structuredClassifier = ce2.structuredClassifier)\r\nand\r\n  roleBinding->collect(supplier)->forAll(ne1, ne2 |\r\n  ne1.oclIsKindOf(ConnectableElement) and ne2.oclIsKindOf(ConnectableElement) and\r\n    let ce1 : ConnectableElement = ne1.oclAsType(ConnectableElement), ce2 : ConnectableElement = ne2.oclAsType(ConnectableElement) in\r\n      ce1.collaboration = ce2.collaboration)",
			 "every_role", "type.collaborationRole->forAll(role | roleBinding->exists(rb | rb.supplier->includes(role)))",
			 "connectors", "type.ownedConnector->forAll(connector |\r\n  let rolesConnectedInCollab : Set(ConnectableElement) = connector.end.role->asSet(),\r\n        relevantBindings : Set(Dependency) = roleBinding->select(rb | rb.supplier->intersection(rolesConnectedInCollab)->notEmpty()),\r\n        boundRoles : Set(ConnectableElement) = relevantBindings->collect(client.oclAsType(ConnectableElement))->asSet(),\r\n        contextClassifier : StructuredClassifier = boundRoles->any(true).structuredClassifier->any(true) in\r\n          contextClassifier.ownedConnector->exists( correspondingConnector | \r\n              correspondingConnector.end.role->forAll( role | boundRoles->includes(role) )\r\n              and (connector.type->notEmpty() and correspondingConnector.type->notEmpty()) implies connector.type->forAll(conformsTo(correspondingConnector.type)) )\r\n)"
		   });	
		addAnnotation
		  (getStructuredClassifier__Part(), 
		   source, 
		   new String[] {
			 "body", "ownedAttribute->select(isComposite)"
		   });	
		addAnnotation
		  (getStructuredClassifier__AllRoles(), 
		   source, 
		   new String[] {
			 "body", "allFeatures()->select(oclIsKindOf(ConnectableElement))->collect(oclAsType(ConnectableElement))->asSet()"
		   });	
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "types", "type<>null implies \r\n  let noOfEnds : Integer = end->size() in \r\n  (type.memberEnd->size() = noOfEnds) and Sequence{1..noOfEnds}->forAll(i | end->at(i).role.type.conformsTo(type.memberEnd->at(i).type))",
			 "roles", "structuredClassifier <> null\r\nand\r\n  end->forAll( e | structuredClassifier.allRoles()->includes(e.role)\r\nor\r\n  e.role.oclIsKindOf(Port) and structuredClassifier.allRoles()->includes(e.partWithPort))"
		   });	
		addAnnotation
		  (getConnector__Kind(), 
		   source, 
		   new String[] {
			 "body", "if end->exists(\r\n\t\trole.oclIsKindOf(Port) \r\n\t\tand partWithPort->isEmpty()\r\n\t\tand not role.oclAsType(Port).isBehavior)\r\nthen ConnectorKind::delegation \r\nelse ConnectorKind::assembly \r\nendif"
		   });	
		addAnnotation
		  (getEncapsulatedClassifier__OwnedPort(), 
		   source, 
		   new String[] {
			 "body", "ownedAttribute->select(oclIsKindOf(Port))->collect(oclAsType(Port))->asOrderedSet()"
		   });	
		addAnnotation
		  (componentEClass, 
		   source, 
		   new String[] {
			 "no_nested_classifiers", "nestedClassifier->isEmpty()",
			 "no_packaged_elements", "nestingClass <> null implies packagedElement->isEmpty()"
		   });	
		addAnnotation
		  (getComponent__Provided(), 
		   source, 
		   new String[] {
			 "body", "let \tris : Set(Interface) = allRealizedInterfaces(),\r\n        realizingClassifiers : Set(Classifier) =  self.realization.realizingClassifier->union(self.allParents()->collect(realization.realizingClassifier))->asSet(),\r\n        allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents())->asSet(),\r\n        realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(c.allRealizedInterfaces())),\r\n        ports : Set(Port) = self.ownedPort->union(allParents()->collect(ownedPort))->asSet(),\r\n        providedByPorts : Set(Interface) = ports.provided->asSet()\r\nin     ris->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet()"
		   });	
		addAnnotation
		  (getComponent__Required(), 
		   source, 
		   new String[] {
			 "body", "let \tuis : Set(Interface) = allUsedInterfaces(),\r\n        realizingClassifiers : Set(Classifier) = self.realization.realizingClassifier->union(self.allParents()->collect(realization.realizingClassifier))->asSet(),\r\n        allRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents())->asSet(),\r\n        realizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(c.allUsedInterfaces())),\r\n        ports : Set(Port) = self.ownedPort->union(allParents()->collect(ownedPort))->asSet(),\r\n        usedByPorts : Set(Interface) = ports.required->asSet()\r\nin\t    uis->union(realizingClassifierInterfaces)->union(usedByPorts)->asSet()"
		   });	
		addAnnotation
		  (associationEClass, 
		   source, 
		   new String[] {
			 "specialized_end_number", "parents()->select(oclIsKindOf(Association)).oclAsType(Association)->forAll(p | p.memberEnd->size() = self.memberEnd->size())",
			 "specialized_end_types", "Sequence{1..memberEnd->size()}->\r\n\tforAll(i | general->select(oclIsKindOf(Association)).oclAsType(Association)->\r\n\t\tforAll(ga | self.memberEnd->at(i).type.conformsTo(ga.memberEnd->at(i).type)))",
			 "binary_associations", "memberEnd->exists(aggregation <> AggregationKind::none) implies (memberEnd->size() = 2 and memberEnd->exists(aggregation = AggregationKind::none))",
			 "association_ends", "memberEnd->size() > 2 implies ownedEnd->includesAll(memberEnd)",
			 "ends_must_be_typed", "memberEnd->forAll(type->notEmpty())"
		   });	
		addAnnotation
		  (getAssociation__EndType(), 
		   source, 
		   new String[] {
			 "body", "memberEnd->collect(type)->asSet()"
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
		  (classEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectableElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectableElementTemplateParameterEClass, 
		   source, 
		   new String[] {
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
		  (getClass_OwnedOperation(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_NestedClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClass_OwnedReception(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getPort_RedefinedPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollaborationUse_RoleBinding(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCollaboration_CollaborationRole(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredClassifier_OwnedAttribute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredClassifier_OwnedConnector(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConnector_End(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getConnector_RedefinedConnector(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getEncapsulatedClassifier_OwnedPort(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_PackagedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponent_Realization(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentRealization_RealizingClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getComponentRealization_Abstraction(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_MemberEnd(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_OwnedEnd(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAssociation_NavigableOwnedEnd(), 
		   source, 
		   new String[] {
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
		  (getClass_NestedClassifier(), 
		   source, 
		   new String[] {
			 "body", "nestingClass"
		   });	
		addAnnotation
		  (getClass_OwnedReception(), 
		   source, 
		   new String[] {
			 "body", "class"
		   });	
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
			 "body", "class"
		   });	
		addAnnotation
		  (getConnectorEnd_DefiningEnd(), 
		   source, 
		   new String[] {
			 "body", "connectorEnd"
		   });	
		addAnnotation
		  (getConnectorEnd_PartWithPort(), 
		   source, 
		   new String[] {
			 "body", "connectorEnd"
		   });	
		addAnnotation
		  (getPort_Protocol(), 
		   source, 
		   new String[] {
			 "body", "port"
		   });	
		addAnnotation
		  (getPort_Provided(), 
		   source, 
		   new String[] {
			 "body", "port"
		   });	
		addAnnotation
		  (getPort_RedefinedPort(), 
		   source, 
		   new String[] {
			 "body", "port"
		   });	
		addAnnotation
		  (getPort_Required(), 
		   source, 
		   new String[] {
			 "body", "port"
		   });	
		addAnnotation
		  (getCollaborationUse_RoleBinding(), 
		   source, 
		   new String[] {
			 "body", "collaborationUse"
		   });	
		addAnnotation
		  (getCollaborationUse_Type(), 
		   source, 
		   new String[] {
			 "body", "collaborationUse"
		   });	
		addAnnotation
		  (getCollaboration_CollaborationRole(), 
		   source, 
		   new String[] {
			 "body", "collaboration"
		   });	
		addAnnotation
		  (getStructuredClassifier_OwnedAttribute(), 
		   source, 
		   new String[] {
			 "body", "structuredClassifier"
		   });	
		addAnnotation
		  (getStructuredClassifier_OwnedConnector(), 
		   source, 
		   new String[] {
			 "body", "structuredClassifier"
		   });	
		addAnnotation
		  (getStructuredClassifier_Part(), 
		   source, 
		   new String[] {
			 "body", "structuredClassifier"
		   });	
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
			 "body", "structuredClassifier"
		   });	
		addAnnotation
		  (getConnector_Contract(), 
		   source, 
		   new String[] {
			 "body", "connector"
		   });	
		addAnnotation
		  (getConnector_End(), 
		   source, 
		   new String[] {
			 "body", "connector"
		   });	
		addAnnotation
		  (getConnector_RedefinedConnector(), 
		   source, 
		   new String[] {
			 "body", "connector"
		   });	
		addAnnotation
		  (getConnector_Type(), 
		   source, 
		   new String[] {
			 "body", "connector"
		   });	
		addAnnotation
		  (getEncapsulatedClassifier_OwnedPort(), 
		   source, 
		   new String[] {
			 "body", "encapsulatedClassifier"
		   });	
		addAnnotation
		  (getComponent_PackagedElement(), 
		   source, 
		   new String[] {
			 "body", "component"
		   });	
		addAnnotation
		  (getComponent_Provided(), 
		   source, 
		   new String[] {
			 "body", "component"
		   });	
		addAnnotation
		  (getComponent_Required(), 
		   source, 
		   new String[] {
			 "body", "component"
		   });	
		addAnnotation
		  (getComponentRealization_RealizingClassifier(), 
		   source, 
		   new String[] {
			 "body", "componentRealization"
		   });	
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
			 "body", "association"
		   });	
		addAnnotation
		  (getAssociation_NavigableOwnedEnd(), 
		   source, 
		   new String[] {
			 "body", "association"
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
		  (getClass_SuperClass(), 
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
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
		   });
	}

} //StructuredClassifiersPackageImpl
