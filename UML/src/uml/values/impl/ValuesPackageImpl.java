/**
 */
package uml.values.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

import uml.structuredClassifiers.StructuredClassifiersPackage;

import uml.structuredClassifiers.impl.StructuredClassifiersPackageImpl;

import uml.useCases.UseCasesPackage;

import uml.useCases.impl.UseCasesPackageImpl;

import uml.values.Duration;
import uml.values.DurationConstraint;
import uml.values.DurationInterval;
import uml.values.DurationObservation;
import uml.values.Expression;
import uml.values.Interval;
import uml.values.IntervalConstraint;
import uml.values.LiteralBoolean;
import uml.values.LiteralInteger;
import uml.values.LiteralNull;
import uml.values.LiteralReal;
import uml.values.LiteralSpecification;
import uml.values.LiteralString;
import uml.values.LiteralUnlimitedNatural;
import uml.values.Observation;
import uml.values.OpaqueExpression;
import uml.values.StringExpression;
import uml.values.TimeConstraint;
import uml.values.TimeExpression;
import uml.values.TimeInterval;
import uml.values.TimeObservation;
import uml.values.ValueSpecification;
import uml.values.ValuesFactory;
import uml.values.ValuesPackage;

import uml.values.util.ValuesValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValuesPackageImpl extends EPackageImpl implements ValuesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

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
	 * @see uml.values.ValuesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ValuesPackageImpl() {
		super(eNS_URI, ValuesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ValuesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ValuesPackage init() {
		if (isInited) return (ValuesPackage)EPackage.Registry.INSTANCE.getEPackage(ValuesPackage.eNS_URI);

		// Obtain or create and register package
		ValuesPackageImpl theValuesPackage = (ValuesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ValuesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ValuesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) instanceof ActivitiesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI) : ActivitiesPackage.eINSTANCE);
		CommonBehaviorPackageImpl theCommonBehaviorPackage = (CommonBehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) instanceof CommonBehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonBehaviorPackage.eNS_URI) : CommonBehaviorPackage.eINSTANCE);
		CommonStructurePackageImpl theCommonStructurePackage = (CommonStructurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) instanceof CommonStructurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonStructurePackage.eNS_URI) : CommonStructurePackage.eINSTANCE);
		PackagesPackageImpl thePackagesPackage = (PackagesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) instanceof PackagesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PackagesPackage.eNS_URI) : PackagesPackage.eINSTANCE);
		StructuredClassifiersPackageImpl theStructuredClassifiersPackage = (StructuredClassifiersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) instanceof StructuredClassifiersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredClassifiersPackage.eNS_URI) : StructuredClassifiersPackage.eINSTANCE);
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
		theValuesPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theCommonBehaviorPackage.createPackageContents();
		theCommonStructurePackage.createPackageContents();
		thePackagesPackage.createPackageContents();
		theStructuredClassifiersPackage.createPackageContents();
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
		theValuesPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theCommonBehaviorPackage.initializePackageContents();
		theCommonStructurePackage.initializePackageContents();
		thePackagesPackage.initializePackageContents();
		theStructuredClassifiersPackage.initializePackageContents();
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
			(theValuesPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ValuesValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theValuesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ValuesPackage.eNS_URI, theValuesPackage);
		return theValuesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Expr() {
		return (EReference)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Observation() {
		return (EReference)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__BooleanValue() {
		return valueSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IntegerValue() {
		return valueSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsComputable() {
		return valueSpecificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsNull() {
		return valueSpecificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__RealValue() {
		return valueSpecificationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__StringValue() {
		return valueSpecificationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__UnlimitedValue() {
		return valueSpecificationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraint() {
		return durationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationConstraint_FirstEvent() {
		return (EAttribute)durationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraint() {
		return intervalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Max() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Min() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationInterval() {
		return durationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservation() {
		return durationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationObservation_Event() {
		return (EReference)durationObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationObservation_FirstEvent() {
		return (EAttribute)durationObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNull() {
		return literalNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralReal() {
		return literalRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralReal_Value() {
		return (EAttribute)literalRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
		return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNatural() {
		return literalUnlimitedNaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUnlimitedNatural_Value() {
		return (EAttribute)literalUnlimitedNaturalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Behavior() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Result() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsIntegral() {
		return opaqueExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsNonNegative() {
		return opaqueExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsPositive() {
		return opaqueExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__Result() {
		return opaqueExpressionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__Value() {
		return opaqueExpressionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstraint_FirstEvent() {
		return (EAttribute)timeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Expr() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Observation() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservation() {
		return timeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeObservation_Event() {
		return (EReference)timeObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeObservation_FirstEvent() {
		return (EAttribute)timeObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_OwningExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_SubExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesFactory getValuesFactory() {
		return (ValuesFactory)getEFactoryInstance();
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
		durationEClass = createEClass(DURATION);
		createEReference(durationEClass, DURATION__EXPR);
		createEReference(durationEClass, DURATION__OBSERVATION);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___BOOLEAN_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___INTEGER_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_COMPUTABLE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_NULL);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___REAL_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___STRING_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___UNLIMITED_VALUE);

		observationEClass = createEClass(OBSERVATION);

		durationConstraintEClass = createEClass(DURATION_CONSTRAINT);
		createEAttribute(durationConstraintEClass, DURATION_CONSTRAINT__FIRST_EVENT);

		intervalConstraintEClass = createEClass(INTERVAL_CONSTRAINT);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__MAX);
		createEReference(intervalEClass, INTERVAL__MIN);

		durationIntervalEClass = createEClass(DURATION_INTERVAL);

		durationObservationEClass = createEClass(DURATION_OBSERVATION);
		createEReference(durationObservationEClass, DURATION_OBSERVATION__EVENT);
		createEAttribute(durationObservationEClass, DURATION_OBSERVATION__FIRST_EVENT);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__OPERAND);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		literalNullEClass = createEClass(LITERAL_NULL);

		literalRealEClass = createEClass(LITERAL_REAL);
		createEAttribute(literalRealEClass, LITERAL_REAL__VALUE);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalUnlimitedNaturalEClass = createEClass(LITERAL_UNLIMITED_NATURAL);
		createEAttribute(literalUnlimitedNaturalEClass, LITERAL_UNLIMITED_NATURAL__VALUE);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__BEHAVIOR);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__RESULT);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_INTEGRAL);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_NON_NEGATIVE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_POSITIVE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___RESULT);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___VALUE);

		timeConstraintEClass = createEClass(TIME_CONSTRAINT);
		createEAttribute(timeConstraintEClass, TIME_CONSTRAINT__FIRST_EVENT);

		timeIntervalEClass = createEClass(TIME_INTERVAL);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__EXPR);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__OBSERVATION);

		timeObservationEClass = createEClass(TIME_OBSERVATION);
		createEReference(timeObservationEClass, TIME_OBSERVATION__EVENT);
		createEAttribute(timeObservationEClass, TIME_OBSERVATION__FIRST_EVENT);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__OWNING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__SUB_EXPRESSION);
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
		ClassificationPackage theClassificationPackage = (ClassificationPackage)EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		durationEClass.getESuperTypes().add(this.getValueSpecification());
		valueSpecificationEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(theCommonStructurePackage.getTypedElement());
		observationEClass.getESuperTypes().add(theCommonStructurePackage.getPackageableElement());
		durationConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		intervalConstraintEClass.getESuperTypes().add(theCommonStructurePackage.getConstraint());
		intervalEClass.getESuperTypes().add(this.getValueSpecification());
		durationIntervalEClass.getESuperTypes().add(this.getInterval());
		durationObservationEClass.getESuperTypes().add(this.getObservation());
		expressionEClass.getESuperTypes().add(this.getValueSpecification());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalRealEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalUnlimitedNaturalEClass.getESuperTypes().add(this.getLiteralSpecification());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		timeConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		timeIntervalEClass.getESuperTypes().add(this.getInterval());
		timeExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		timeObservationEClass.getESuperTypes().add(this.getObservation());
		stringExpressionEClass.getESuperTypes().add(this.getExpression());
		stringExpressionEClass.getESuperTypes().add(theCommonStructurePackage.getTemplateableElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuration_Expr(), this.getValueSpecification(), null, "expr", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDuration_Observation(), this.getObservation(), null, "observation", null, 0, -1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValueSpecification__BooleanValue(), theTypesPackage.getBoolean(), "booleanValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IntegerValue(), theTypesPackage.getInteger(), "integerValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsComputable(), theTypesPackage.getBoolean(), "isComputable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsNull(), theTypesPackage.getBoolean(), "isNull", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__RealValue(), theTypesPackage.getReal(), "realValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__StringValue(), theTypesPackage.getString(), "stringValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__UnlimitedValue(), theTypesPackage.getUnlimitedNatural(), "unlimitedValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationConstraintEClass, DurationConstraint.class, "DurationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationConstraint_FirstEvent(), theTypesPackage.getBoolean(), "firstEvent", null, 0, 2, DurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(intervalConstraintEClass, IntervalConstraint.class, "IntervalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_Max(), this.getValueSpecification(), null, "max", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterval_Min(), this.getValueSpecification(), null, "min", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(durationIntervalEClass, DurationInterval.class, "DurationInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationObservationEClass, DurationObservation.class, "DurationObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDurationObservation_Event(), theCommonStructurePackage.getNamedElement(), null, "event", null, 1, 2, DurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDurationObservation_FirstEvent(), theTypesPackage.getBoolean(), "firstEvent", null, 0, 2, DurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Operand(), this.getValueSpecification(), null, "operand", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Symbol(), theTypesPackage.getString(), "symbol", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), theTypesPackage.getBoolean(), "value", "false", 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), theTypesPackage.getInteger(), "value", "0", 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRealEClass, LiteralReal.class, "LiteralReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralReal_Value(), theTypesPackage.getReal(), "value", null, 1, 1, LiteralReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), theTypesPackage.getString(), "value", null, 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalUnlimitedNaturalEClass, LiteralUnlimitedNatural.class, "LiteralUnlimitedNatural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralUnlimitedNatural_Value(), theTypesPackage.getUnlimitedNatural(), "value", "0", 1, 1, LiteralUnlimitedNatural.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueExpression_Behavior(), theCommonBehaviorPackage.getBehavior(), null, "behavior", null, 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpaqueExpression_Body(), theTypesPackage.getString(), "body", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueExpression_Language(), theTypesPackage.getString(), "language", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueExpression_Result(), theClassificationPackage.getParameter(), null, "result", null, 0, 1, OpaqueExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsIntegral(), theTypesPackage.getBoolean(), "isIntegral", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsNonNegative(), theTypesPackage.getBoolean(), "isNonNegative", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsPositive(), theTypesPackage.getBoolean(), "isPositive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__Result(), theClassificationPackage.getParameter(), "result", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__Value(), theTypesPackage.getInteger(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(timeConstraintEClass, TimeConstraint.class, "TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeConstraint_FirstEvent(), theTypesPackage.getBoolean(), "firstEvent", "true", 0, 1, TimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExpression_Expr(), this.getValueSpecification(), null, "expr", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeExpression_Observation(), this.getObservation(), null, "observation", null, 0, -1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeObservationEClass, TimeObservation.class, "TimeObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeObservation_Event(), theCommonStructurePackage.getNamedElement(), null, "event", null, 1, 1, TimeObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimeObservation_FirstEvent(), theTypesPackage.getBoolean(), "firstEvent", "true", 1, 1, TimeObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringExpression_OwningExpression(), this.getStringExpression(), this.getStringExpression_SubExpression(), "owningExpression", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringExpression_SubExpression(), this.getStringExpression(), this.getStringExpression_OwningExpression(), "subExpression", null, 0, -1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// subsets
		createSubsetsAnnotations();
		// duplicates
		createDuplicatesAnnotations();
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
			 "originalName", "Values"
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
		  (durationEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_expr_requires_observation"
		   });	
		addAnnotation
		  (durationConstraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "first_event_multiplicity has_one_or_two_constrainedElements"
		   });	
		addAnnotation
		  (durationObservationEClass, 
		   source, 
		   new String[] {
			 "constraints", "first_event_multiplicity"
		   });	
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "language_body_size one_return_result_parameter only_return_result_parameters"
		   });	
		addAnnotation
		  (timeConstraintEClass, 
		   source, 
		   new String[] {
			 "constraints", "has_one_constrainedElement"
		   });	
		addAnnotation
		  (timeExpressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "no_expr_requires_observation"
		   });	
		addAnnotation
		  (stringExpressionEClass, 
		   source, 
		   new String[] {
			 "constraints", "operands subexpressions"
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
		  (durationEClass, 
		   source, 
		   new String[] {
			 "no_expr_requires_observation", "expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(DurationObservation)))"
		   });	
		addAnnotation
		  (getValueSpecification__BooleanValue(), 
		   source, 
		   new String[] {
			 "body", "null"
		   });	
		addAnnotation
		  (getValueSpecification__IntegerValue(), 
		   source, 
		   new String[] {
			 "body", "null"
		   });	
		addAnnotation
		  (getValueSpecification__IsComputable(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (getValueSpecification__IsNull(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (getValueSpecification__RealValue(), 
		   source, 
		   new String[] {
			 "body", "null"
		   });	
		addAnnotation
		  (getValueSpecification__StringValue(), 
		   source, 
		   new String[] {
			 "body", "null"
		   });	
		addAnnotation
		  (getValueSpecification__UnlimitedValue(), 
		   source, 
		   new String[] {
			 "body", "null"
		   });	
		addAnnotation
		  (durationConstraintEClass, 
		   source, 
		   new String[] {
			 "first_event_multiplicity", "if (constrainedElement->size() = 2)\r\n  then (firstEvent->size() = 2) else (firstEvent->size() = 0) \r\nendif",
			 "has_one_or_two_constrainedElements", "constrainedElement->size() = 1 or constrainedElement->size()=2"
		   });	
		addAnnotation
		  (durationObservationEClass, 
		   source, 
		   new String[] {
			 "first_event_multiplicity", "if (event->size() = 2)\r\n  then (firstEvent->size() = 2) else (firstEvent->size() = 0)\r\nendif"
		   });	
		addAnnotation
		  (opaqueExpressionEClass, 
		   source, 
		   new String[] {
			 "language_body_size", "language->notEmpty() implies (_\'body\'->size() = language->size())",
			 "one_return_result_parameter", "behavior <> null implies\r\n   behavior.ownedParameter->select(direction=ParameterDirectionKind::return)->size() = 1",
			 "only_return_result_parameters", "behavior <> null implies behavior.ownedParameter->select(direction<>ParameterDirectionKind::return)->isEmpty()"
		   });	
		addAnnotation
		  (getOpaqueExpression__IsIntegral(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (getOpaqueExpression__IsNonNegative(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (getOpaqueExpression__IsPositive(), 
		   source, 
		   new String[] {
			 "body", "false"
		   });	
		addAnnotation
		  (getOpaqueExpression__Result(), 
		   source, 
		   new String[] {
			 "body", "if behavior = null then\r\n\tnull\r\nelse\r\n\tbehavior.ownedParameter->first()\r\nendif"
		   });	
		addAnnotation
		  (getOpaqueExpression__Value(), 
		   source, 
		   new String[] {
			 "body", "0"
		   });	
		addAnnotation
		  (timeConstraintEClass, 
		   source, 
		   new String[] {
			 "has_one_constrainedElement", "constrainedElement->size() = 1"
		   });	
		addAnnotation
		  (timeExpressionEClass, 
		   source, 
		   new String[] {
			 "no_expr_requires_observation", "expr = null implies (observation->size() = 1 and observation->forAll(oclIsKindOf(TimeObservation)))"
		   });	
		addAnnotation
		  (stringExpressionEClass, 
		   source, 
		   new String[] {
			 "operands", "operand->forAll (oclIsKindOf (LiteralString))",
			 "subexpressions", "if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty() endif"
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
		  (getDuration_Expr(), 
		   source, 
		   new String[] {
			 "body", "duration"
		   });	
		addAnnotation
		  (getDuration_Observation(), 
		   source, 
		   new String[] {
			 "body", "duration"
		   });	
		addAnnotation
		  (getInterval_Max(), 
		   source, 
		   new String[] {
			 "body", "interval"
		   });	
		addAnnotation
		  (getInterval_Min(), 
		   source, 
		   new String[] {
			 "body", "interval"
		   });	
		addAnnotation
		  (getDurationObservation_Event(), 
		   source, 
		   new String[] {
			 "body", "durationObservation"
		   });	
		addAnnotation
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
			 "body", "expression"
		   });	
		addAnnotation
		  (getOpaqueExpression_Behavior(), 
		   source, 
		   new String[] {
			 "body", "opaqueExpression"
		   });	
		addAnnotation
		  (getOpaqueExpression_Result(), 
		   source, 
		   new String[] {
			 "body", "opaqueExpression"
		   });	
		addAnnotation
		  (getTimeExpression_Expr(), 
		   source, 
		   new String[] {
			 "body", "timeExpression"
		   });	
		addAnnotation
		  (getTimeExpression_Observation(), 
		   source, 
		   new String[] {
			 "body", "timeExpression"
		   });	
		addAnnotation
		  (getTimeObservation_Event(), 
		   source, 
		   new String[] {
			 "body", "timeObservation"
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
		  (getDuration_Expr(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTimeExpression_Expr(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringExpression_OwningExpression(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStringExpression_SubExpression(), 
		   source, 
		   new String[] {
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
		  (valueSpecificationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (durationConstraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intervalConstraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (durationIntervalEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalBooleanEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalIntegerEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalNullEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalRealEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalStringEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalUnlimitedNaturalEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (timeConstraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (timeIntervalEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringExpressionEClass, 
		   source, 
		   new String[] {
		   });
	}

} //ValuesPackageImpl
