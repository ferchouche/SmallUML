/**
 */
package uml.values.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see uml.values.ValuesPackage
 * @generated
 */
public class ValuesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ValuesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuesSwitch() {
		if (modelPackage == null) {
			modelPackage = ValuesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ValuesPackage.DURATION: {
				Duration duration = (Duration)theEObject;
				T result = caseDuration(duration);
				if (result == null) result = caseValueSpecification(duration);
				if (result == null) result = casePackageableElement(duration);
				if (result == null) result = caseTypedElement(duration);
				if (result == null) result = caseNamedElement(duration);
				if (result == null) result = caseParameterableElement(duration);
				if (result == null) result = caseElement(duration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.VALUE_SPECIFICATION: {
				ValueSpecification valueSpecification = (ValueSpecification)theEObject;
				T result = caseValueSpecification(valueSpecification);
				if (result == null) result = casePackageableElement(valueSpecification);
				if (result == null) result = caseTypedElement(valueSpecification);
				if (result == null) result = caseNamedElement(valueSpecification);
				if (result == null) result = caseParameterableElement(valueSpecification);
				if (result == null) result = caseElement(valueSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.OBSERVATION: {
				Observation observation = (Observation)theEObject;
				T result = caseObservation(observation);
				if (result == null) result = casePackageableElement(observation);
				if (result == null) result = caseNamedElement(observation);
				if (result == null) result = caseParameterableElement(observation);
				if (result == null) result = caseElement(observation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.DURATION_CONSTRAINT: {
				DurationConstraint durationConstraint = (DurationConstraint)theEObject;
				T result = caseDurationConstraint(durationConstraint);
				if (result == null) result = caseIntervalConstraint(durationConstraint);
				if (result == null) result = caseConstraint(durationConstraint);
				if (result == null) result = casePackageableElement(durationConstraint);
				if (result == null) result = caseNamedElement(durationConstraint);
				if (result == null) result = caseParameterableElement(durationConstraint);
				if (result == null) result = caseElement(durationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.INTERVAL_CONSTRAINT: {
				IntervalConstraint intervalConstraint = (IntervalConstraint)theEObject;
				T result = caseIntervalConstraint(intervalConstraint);
				if (result == null) result = caseConstraint(intervalConstraint);
				if (result == null) result = casePackageableElement(intervalConstraint);
				if (result == null) result = caseNamedElement(intervalConstraint);
				if (result == null) result = caseParameterableElement(intervalConstraint);
				if (result == null) result = caseElement(intervalConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.INTERVAL: {
				Interval interval = (Interval)theEObject;
				T result = caseInterval(interval);
				if (result == null) result = caseValueSpecification(interval);
				if (result == null) result = casePackageableElement(interval);
				if (result == null) result = caseTypedElement(interval);
				if (result == null) result = caseNamedElement(interval);
				if (result == null) result = caseParameterableElement(interval);
				if (result == null) result = caseElement(interval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.DURATION_INTERVAL: {
				DurationInterval durationInterval = (DurationInterval)theEObject;
				T result = caseDurationInterval(durationInterval);
				if (result == null) result = caseInterval(durationInterval);
				if (result == null) result = caseValueSpecification(durationInterval);
				if (result == null) result = casePackageableElement(durationInterval);
				if (result == null) result = caseTypedElement(durationInterval);
				if (result == null) result = caseNamedElement(durationInterval);
				if (result == null) result = caseParameterableElement(durationInterval);
				if (result == null) result = caseElement(durationInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.DURATION_OBSERVATION: {
				DurationObservation durationObservation = (DurationObservation)theEObject;
				T result = caseDurationObservation(durationObservation);
				if (result == null) result = caseObservation(durationObservation);
				if (result == null) result = casePackageableElement(durationObservation);
				if (result == null) result = caseNamedElement(durationObservation);
				if (result == null) result = caseParameterableElement(durationObservation);
				if (result == null) result = caseElement(durationObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseValueSpecification(expression);
				if (result == null) result = casePackageableElement(expression);
				if (result == null) result = caseTypedElement(expression);
				if (result == null) result = caseNamedElement(expression);
				if (result == null) result = caseParameterableElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_BOOLEAN: {
				LiteralBoolean literalBoolean = (LiteralBoolean)theEObject;
				T result = caseLiteralBoolean(literalBoolean);
				if (result == null) result = caseLiteralSpecification(literalBoolean);
				if (result == null) result = caseValueSpecification(literalBoolean);
				if (result == null) result = casePackageableElement(literalBoolean);
				if (result == null) result = caseTypedElement(literalBoolean);
				if (result == null) result = caseNamedElement(literalBoolean);
				if (result == null) result = caseParameterableElement(literalBoolean);
				if (result == null) result = caseElement(literalBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_SPECIFICATION: {
				LiteralSpecification literalSpecification = (LiteralSpecification)theEObject;
				T result = caseLiteralSpecification(literalSpecification);
				if (result == null) result = caseValueSpecification(literalSpecification);
				if (result == null) result = casePackageableElement(literalSpecification);
				if (result == null) result = caseTypedElement(literalSpecification);
				if (result == null) result = caseNamedElement(literalSpecification);
				if (result == null) result = caseParameterableElement(literalSpecification);
				if (result == null) result = caseElement(literalSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_INTEGER: {
				LiteralInteger literalInteger = (LiteralInteger)theEObject;
				T result = caseLiteralInteger(literalInteger);
				if (result == null) result = caseLiteralSpecification(literalInteger);
				if (result == null) result = caseValueSpecification(literalInteger);
				if (result == null) result = casePackageableElement(literalInteger);
				if (result == null) result = caseTypedElement(literalInteger);
				if (result == null) result = caseNamedElement(literalInteger);
				if (result == null) result = caseParameterableElement(literalInteger);
				if (result == null) result = caseElement(literalInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_NULL: {
				LiteralNull literalNull = (LiteralNull)theEObject;
				T result = caseLiteralNull(literalNull);
				if (result == null) result = caseLiteralSpecification(literalNull);
				if (result == null) result = caseValueSpecification(literalNull);
				if (result == null) result = casePackageableElement(literalNull);
				if (result == null) result = caseTypedElement(literalNull);
				if (result == null) result = caseNamedElement(literalNull);
				if (result == null) result = caseParameterableElement(literalNull);
				if (result == null) result = caseElement(literalNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_REAL: {
				LiteralReal literalReal = (LiteralReal)theEObject;
				T result = caseLiteralReal(literalReal);
				if (result == null) result = caseLiteralSpecification(literalReal);
				if (result == null) result = caseValueSpecification(literalReal);
				if (result == null) result = casePackageableElement(literalReal);
				if (result == null) result = caseTypedElement(literalReal);
				if (result == null) result = caseNamedElement(literalReal);
				if (result == null) result = caseParameterableElement(literalReal);
				if (result == null) result = caseElement(literalReal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_STRING: {
				LiteralString literalString = (LiteralString)theEObject;
				T result = caseLiteralString(literalString);
				if (result == null) result = caseLiteralSpecification(literalString);
				if (result == null) result = caseValueSpecification(literalString);
				if (result == null) result = casePackageableElement(literalString);
				if (result == null) result = caseTypedElement(literalString);
				if (result == null) result = caseNamedElement(literalString);
				if (result == null) result = caseParameterableElement(literalString);
				if (result == null) result = caseElement(literalString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.LITERAL_UNLIMITED_NATURAL: {
				LiteralUnlimitedNatural literalUnlimitedNatural = (LiteralUnlimitedNatural)theEObject;
				T result = caseLiteralUnlimitedNatural(literalUnlimitedNatural);
				if (result == null) result = caseLiteralSpecification(literalUnlimitedNatural);
				if (result == null) result = caseValueSpecification(literalUnlimitedNatural);
				if (result == null) result = casePackageableElement(literalUnlimitedNatural);
				if (result == null) result = caseTypedElement(literalUnlimitedNatural);
				if (result == null) result = caseNamedElement(literalUnlimitedNatural);
				if (result == null) result = caseParameterableElement(literalUnlimitedNatural);
				if (result == null) result = caseElement(literalUnlimitedNatural);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.OPAQUE_EXPRESSION: {
				OpaqueExpression opaqueExpression = (OpaqueExpression)theEObject;
				T result = caseOpaqueExpression(opaqueExpression);
				if (result == null) result = caseValueSpecification(opaqueExpression);
				if (result == null) result = casePackageableElement(opaqueExpression);
				if (result == null) result = caseTypedElement(opaqueExpression);
				if (result == null) result = caseNamedElement(opaqueExpression);
				if (result == null) result = caseParameterableElement(opaqueExpression);
				if (result == null) result = caseElement(opaqueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.TIME_CONSTRAINT: {
				TimeConstraint timeConstraint = (TimeConstraint)theEObject;
				T result = caseTimeConstraint(timeConstraint);
				if (result == null) result = caseIntervalConstraint(timeConstraint);
				if (result == null) result = caseConstraint(timeConstraint);
				if (result == null) result = casePackageableElement(timeConstraint);
				if (result == null) result = caseNamedElement(timeConstraint);
				if (result == null) result = caseParameterableElement(timeConstraint);
				if (result == null) result = caseElement(timeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseInterval(timeInterval);
				if (result == null) result = caseValueSpecification(timeInterval);
				if (result == null) result = casePackageableElement(timeInterval);
				if (result == null) result = caseTypedElement(timeInterval);
				if (result == null) result = caseNamedElement(timeInterval);
				if (result == null) result = caseParameterableElement(timeInterval);
				if (result == null) result = caseElement(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.TIME_EXPRESSION: {
				TimeExpression timeExpression = (TimeExpression)theEObject;
				T result = caseTimeExpression(timeExpression);
				if (result == null) result = caseValueSpecification(timeExpression);
				if (result == null) result = casePackageableElement(timeExpression);
				if (result == null) result = caseTypedElement(timeExpression);
				if (result == null) result = caseNamedElement(timeExpression);
				if (result == null) result = caseParameterableElement(timeExpression);
				if (result == null) result = caseElement(timeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.TIME_OBSERVATION: {
				TimeObservation timeObservation = (TimeObservation)theEObject;
				T result = caseTimeObservation(timeObservation);
				if (result == null) result = caseObservation(timeObservation);
				if (result == null) result = casePackageableElement(timeObservation);
				if (result == null) result = caseNamedElement(timeObservation);
				if (result == null) result = caseParameterableElement(timeObservation);
				if (result == null) result = caseElement(timeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ValuesPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseExpression(stringExpression);
				if (result == null) result = caseTemplateableElement(stringExpression);
				if (result == null) result = caseValueSpecification(stringExpression);
				if (result == null) result = casePackageableElement(stringExpression);
				if (result == null) result = caseTypedElement(stringExpression);
				if (result == null) result = caseNamedElement(stringExpression);
				if (result == null) result = caseParameterableElement(stringExpression);
				if (result == null) result = caseElement(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuration(Duration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSpecification(ValueSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationConstraint(DurationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntervalConstraint(IntervalConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterval(Interval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationInterval(DurationInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duration Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDurationObservation(DurationObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralBoolean(LiteralBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralSpecification(LiteralSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralInteger(LiteralInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralNull(LiteralNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralReal(LiteralReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralString(LiteralString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Unlimited Natural</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Opaque Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpaqueExpression(OpaqueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeConstraint(TimeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeInterval(TimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeExpression(TimeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeObservation(TimeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ValuesSwitch
