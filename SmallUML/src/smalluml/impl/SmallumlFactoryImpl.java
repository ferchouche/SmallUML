/**
 */
package smalluml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import smalluml.Association;
import smalluml.Attribute;
import smalluml.BooleanType;
import smalluml.Cardinalities;
import smalluml.ClassDiagram;
import smalluml.Entity;
import smalluml.Enumeration;
import smalluml.IntegerType;
import smalluml.Operation;
import smalluml.Parameter;
import smalluml.RealType;
import smalluml.SmallumlFactory;
import smalluml.SmallumlPackage;
import smalluml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmallumlFactoryImpl extends EFactoryImpl implements SmallumlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmallumlFactory init() {
		try {
			SmallumlFactory theSmallumlFactory = (SmallumlFactory)EPackage.Registry.INSTANCE.getEFactory(SmallumlPackage.eNS_URI);
			if (theSmallumlFactory != null) {
				return theSmallumlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmallumlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlFactoryImpl() {
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
			case SmallumlPackage.CLASS: return createClass();
			case SmallumlPackage.CLASS_DIAGRAM: return createClassDiagram();
			case SmallumlPackage.OPERATION: return createOperation();
			case SmallumlPackage.ATTRIBUTE: return createAttribute();
			case SmallumlPackage.PARAMETER: return createParameter();
			case SmallumlPackage.CARDINALITIES: return createCardinalities();
			case SmallumlPackage.ASSOCIATION: return createAssociation();
			case SmallumlPackage.TYPE: return createType();
			case SmallumlPackage.BOOLEAN_TYPE: return createBooleanType();
			case SmallumlPackage.REAL_TYPE: return createRealType();
			case SmallumlPackage.INTEGER_TYPE: return createIntegerType();
			case SmallumlPackage.ENUMERATION: return createEnumeration();
			case SmallumlPackage.ENTITY: return createEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public smalluml.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDiagram createClassDiagram() {
		ClassDiagramImpl classDiagram = new ClassDiagramImpl();
		return classDiagram;
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
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
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
	public Cardinalities createCardinalities() {
		CardinalitiesImpl cardinalities = new CardinalitiesImpl();
		return cardinalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealType createRealType() {
		RealTypeImpl realType = new RealTypeImpl();
		return realType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerType createIntegerType() {
		IntegerTypeImpl integerType = new IntegerTypeImpl();
		return integerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallumlPackage getSmallumlPackage() {
		return (SmallumlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmallumlPackage getPackage() {
		return SmallumlPackage.eINSTANCE;
	}

} //SmallumlFactoryImpl
