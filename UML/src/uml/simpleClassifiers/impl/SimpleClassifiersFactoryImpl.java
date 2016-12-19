/**
 */
package uml.simpleClassifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.simpleClassifiers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleClassifiersFactoryImpl extends EFactoryImpl implements SimpleClassifiersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleClassifiersFactory init() {
		try {
			SimpleClassifiersFactory theSimpleClassifiersFactory = (SimpleClassifiersFactory)EPackage.Registry.INSTANCE.getEFactory(SimpleClassifiersPackage.eNS_URI);
			if (theSimpleClassifiersFactory != null) {
				return theSimpleClassifiersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimpleClassifiersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassifiersFactoryImpl() {
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
			case SimpleClassifiersPackage.DATA_TYPE: return createDataType();
			case SimpleClassifiersPackage.INTERFACE: return createInterface();
			case SimpleClassifiersPackage.RECEPTION: return createReception();
			case SimpleClassifiersPackage.SIGNAL: return createSignal();
			case SimpleClassifiersPackage.ENUMERATION: return createEnumeration();
			case SimpleClassifiersPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
			case SimpleClassifiersPackage.INTERFACE_REALIZATION: return createInterfaceRealization();
			case SimpleClassifiersPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataType() {
		DataTypeImpl dataType = new DataTypeImpl();
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reception createReception() {
		ReceptionImpl reception = new ReceptionImpl();
		return reception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal createSignal() {
		SignalImpl signal = new SignalImpl();
		return signal;
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
	public EnumerationLiteral createEnumerationLiteral() {
		EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
		return enumerationLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceRealization createInterfaceRealization() {
		InterfaceRealizationImpl interfaceRealization = new InterfaceRealizationImpl();
		return interfaceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClassifiersPackage getSimpleClassifiersPackage() {
		return (SimpleClassifiersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimpleClassifiersPackage getPackage() {
		return SimpleClassifiersPackage.eINSTANCE;
	}

} //SimpleClassifiersFactoryImpl
