/**
 */
package uml.classification.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.classification.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassificationFactoryImpl extends EFactoryImpl implements ClassificationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassificationFactory init() {
		try {
			ClassificationFactory theClassificationFactory = (ClassificationFactory)EPackage.Registry.INSTANCE.getEFactory(ClassificationPackage.eNS_URI);
			if (theClassificationFactory != null) {
				return theClassificationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClassificationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ClassificationPackage.SUBSTITUTION: return createSubstitution();
			case ClassificationPackage.PARAMETER: return createParameter();
			case ClassificationPackage.PROPERTY: return createProperty();
			case ClassificationPackage.OPERATION: return createOperation();
			case ClassificationPackage.OPERATION_TEMPLATE_PARAMETER: return createOperationTemplateParameter();
			case ClassificationPackage.PARAMETER_SET: return createParameterSet();
			case ClassificationPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
			case ClassificationPackage.GENERALIZATION: return createGeneralization();
			case ClassificationPackage.GENERALIZATION_SET: return createGeneralizationSet();
			case ClassificationPackage.INSTANCE_SPECIFICATION: return createInstanceSpecification();
			case ClassificationPackage.SLOT: return createSlot();
			case ClassificationPackage.INSTANCE_VALUE: return createInstanceValue();
			case ClassificationPackage.REDEFINABLE_TEMPLATE_SIGNATURE: return createRedefinableTemplateSignature();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ClassificationPackage.CALL_CONCURRENCY_KIND:
				return createCallConcurrencyKindFromString(eDataType, initialValue);
			case ClassificationPackage.AGGREGATION_KIND:
				return createAggregationKindFromString(eDataType, initialValue);
			case ClassificationPackage.PARAMETER_DIRECTION_KIND:
				return createParameterDirectionKindFromString(eDataType, initialValue);
			case ClassificationPackage.PARAMETER_EFFECT_KIND:
				return createParameterEffectKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ClassificationPackage.CALL_CONCURRENCY_KIND:
				return convertCallConcurrencyKindToString(eDataType, instanceValue);
			case ClassificationPackage.AGGREGATION_KIND:
				return convertAggregationKindToString(eDataType, instanceValue);
			case ClassificationPackage.PARAMETER_DIRECTION_KIND:
				return convertParameterDirectionKindToString(eDataType, instanceValue);
			case ClassificationPackage.PARAMETER_EFFECT_KIND:
				return convertParameterEffectKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substitution createSubstitution() {
		SubstitutionImpl substitution = new SubstitutionImpl();
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationTemplateParameter createOperationTemplateParameter() {
		OperationTemplateParameterImpl operationTemplateParameter = new OperationTemplateParameterImpl();
		return operationTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet createParameterSet() {
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassifierTemplateParameter createClassifierTemplateParameter() {
		ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
		return classifierTemplateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizationSet createGeneralizationSet() {
		GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
		return generalizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification createInstanceSpecification() {
		InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
		return instanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot createSlot() {
		SlotImpl slot = new SlotImpl();
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceValue createInstanceValue() {
		InstanceValueImpl instanceValue = new InstanceValueImpl();
		return instanceValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedefinableTemplateSignature createRedefinableTemplateSignature() {
		RedefinableTemplateSignatureImpl redefinableTemplateSignature = new RedefinableTemplateSignatureImpl();
		return redefinableTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue) {
		CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue) {
		AggregationKind result = AggregationKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
		ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterEffectKind createParameterEffectKindFromString(EDataType eDataType, String initialValue) {
		ParameterEffectKind result = ParameterEffectKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterEffectKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassificationPackage getClassificationPackage() {
		return (ClassificationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClassificationPackage getPackage() {
		return ClassificationPackage.eINSTANCE;
	}

} //ClassificationFactoryImpl
