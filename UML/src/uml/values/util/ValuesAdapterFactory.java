/**
 */
package uml.values.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uml.commonStructure.Constraint;
import uml.commonStructure.Element;
import uml.commonStructure.NamedElement;
import uml.commonStructure.PackageableElement;
import uml.commonStructure.ParameterableElement;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.TypedElement;

import uml.values.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uml.values.ValuesPackage
 * @generated
 */
public class ValuesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ValuesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValuesSwitch<Adapter> modelSwitch =
		new ValuesSwitch<Adapter>() {
			@Override
			public Adapter caseDuration(Duration object) {
				return createDurationAdapter();
			}
			@Override
			public Adapter caseValueSpecification(ValueSpecification object) {
				return createValueSpecificationAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseDurationConstraint(DurationConstraint object) {
				return createDurationConstraintAdapter();
			}
			@Override
			public Adapter caseIntervalConstraint(IntervalConstraint object) {
				return createIntervalConstraintAdapter();
			}
			@Override
			public Adapter caseInterval(Interval object) {
				return createIntervalAdapter();
			}
			@Override
			public Adapter caseDurationInterval(DurationInterval object) {
				return createDurationIntervalAdapter();
			}
			@Override
			public Adapter caseDurationObservation(DurationObservation object) {
				return createDurationObservationAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralBoolean(LiteralBoolean object) {
				return createLiteralBooleanAdapter();
			}
			@Override
			public Adapter caseLiteralSpecification(LiteralSpecification object) {
				return createLiteralSpecificationAdapter();
			}
			@Override
			public Adapter caseLiteralInteger(LiteralInteger object) {
				return createLiteralIntegerAdapter();
			}
			@Override
			public Adapter caseLiteralNull(LiteralNull object) {
				return createLiteralNullAdapter();
			}
			@Override
			public Adapter caseLiteralReal(LiteralReal object) {
				return createLiteralRealAdapter();
			}
			@Override
			public Adapter caseLiteralString(LiteralString object) {
				return createLiteralStringAdapter();
			}
			@Override
			public Adapter caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
				return createLiteralUnlimitedNaturalAdapter();
			}
			@Override
			public Adapter caseOpaqueExpression(OpaqueExpression object) {
				return createOpaqueExpressionAdapter();
			}
			@Override
			public Adapter caseTimeConstraint(TimeConstraint object) {
				return createTimeConstraintAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object) {
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseTimeExpression(TimeExpression object) {
				return createTimeExpressionAdapter();
			}
			@Override
			public Adapter caseTimeObservation(TimeObservation object) {
				return createTimeObservationAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseParameterableElement(ParameterableElement object) {
				return createParameterableElementAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseTemplateableElement(TemplateableElement object) {
				return createTemplateableElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link uml.values.Duration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.Duration
	 * @generated
	 */
	public Adapter createDurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.ValueSpecification
	 * @generated
	 */
	public Adapter createValueSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.DurationConstraint <em>Duration Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.DurationConstraint
	 * @generated
	 */
	public Adapter createDurationConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.IntervalConstraint <em>Interval Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.IntervalConstraint
	 * @generated
	 */
	public Adapter createIntervalConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.Interval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.Interval
	 * @generated
	 */
	public Adapter createIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.DurationInterval <em>Duration Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.DurationInterval
	 * @generated
	 */
	public Adapter createDurationIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.DurationObservation <em>Duration Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.DurationObservation
	 * @generated
	 */
	public Adapter createDurationObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralBoolean <em>Literal Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralBoolean
	 * @generated
	 */
	public Adapter createLiteralBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralSpecification <em>Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralSpecification
	 * @generated
	 */
	public Adapter createLiteralSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralInteger <em>Literal Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralInteger
	 * @generated
	 */
	public Adapter createLiteralIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralNull <em>Literal Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralNull
	 * @generated
	 */
	public Adapter createLiteralNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralReal <em>Literal Real</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralReal
	 * @generated
	 */
	public Adapter createLiteralRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralString <em>Literal String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralString
	 * @generated
	 */
	public Adapter createLiteralStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.LiteralUnlimitedNatural
	 * @generated
	 */
	public Adapter createLiteralUnlimitedNaturalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.OpaqueExpression <em>Opaque Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.OpaqueExpression
	 * @generated
	 */
	public Adapter createOpaqueExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.TimeConstraint <em>Time Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.TimeConstraint
	 * @generated
	 */
	public Adapter createTimeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.TimeExpression <em>Time Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.TimeExpression
	 * @generated
	 */
	public Adapter createTimeExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.TimeObservation <em>Time Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.TimeObservation
	 * @generated
	 */
	public Adapter createTimeObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.values.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.values.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.ParameterableElement
	 * @generated
	 */
	public Adapter createParameterableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link uml.commonStructure.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see uml.commonStructure.TemplateableElement
	 * @generated
	 */
	public Adapter createTemplateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ValuesAdapterFactory
