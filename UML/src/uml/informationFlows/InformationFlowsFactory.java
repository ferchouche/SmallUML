/**
 */
package uml.informationFlows;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.informationFlows.InformationFlowsPackage
 * @generated
 */
public interface InformationFlowsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InformationFlowsFactory eINSTANCE = uml.informationFlows.impl.InformationFlowsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Flow</em>'.
	 * @generated
	 */
	InformationFlow createInformationFlow();

	/**
	 * Returns a new object of class '<em>Information Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Information Item</em>'.
	 * @generated
	 */
	InformationItem createInformationItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	InformationFlowsPackage getInformationFlowsPackage();

} //InformationFlowsFactory
