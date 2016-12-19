/**
 */
package uml.informationFlows.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.informationFlows.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InformationFlowsFactoryImpl extends EFactoryImpl implements InformationFlowsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InformationFlowsFactory init() {
		try {
			InformationFlowsFactory theInformationFlowsFactory = (InformationFlowsFactory)EPackage.Registry.INSTANCE.getEFactory(InformationFlowsPackage.eNS_URI);
			if (theInformationFlowsFactory != null) {
				return theInformationFlowsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InformationFlowsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowsFactoryImpl() {
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
			case InformationFlowsPackage.INFORMATION_FLOW: return createInformationFlow();
			case InformationFlowsPackage.INFORMATION_ITEM: return createInformationItem();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlow createInformationFlow() {
		InformationFlowImpl informationFlow = new InformationFlowImpl();
		return informationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationItem createInformationItem() {
		InformationItemImpl informationItem = new InformationItemImpl();
		return informationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFlowsPackage getInformationFlowsPackage() {
		return (InformationFlowsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InformationFlowsPackage getPackage() {
		return InformationFlowsPackage.eINSTANCE;
	}

} //InformationFlowsFactoryImpl
