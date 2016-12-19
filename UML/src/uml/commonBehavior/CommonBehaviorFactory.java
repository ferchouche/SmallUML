/**
 */
package uml.commonBehavior;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.commonBehavior.CommonBehaviorPackage
 * @generated
 */
public interface CommonBehaviorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonBehaviorFactory eINSTANCE = uml.commonBehavior.impl.CommonBehaviorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Any Receive Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Any Receive Event</em>'.
	 * @generated
	 */
	AnyReceiveEvent createAnyReceiveEvent();

	/**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
	Trigger createTrigger();

	/**
	 * Returns a new object of class '<em>Call Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Event</em>'.
	 * @generated
	 */
	CallEvent createCallEvent();

	/**
	 * Returns a new object of class '<em>Change Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Event</em>'.
	 * @generated
	 */
	ChangeEvent createChangeEvent();

	/**
	 * Returns a new object of class '<em>Function Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Behavior</em>'.
	 * @generated
	 */
	FunctionBehavior createFunctionBehavior();

	/**
	 * Returns a new object of class '<em>Opaque Behavior</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Behavior</em>'.
	 * @generated
	 */
	OpaqueBehavior createOpaqueBehavior();

	/**
	 * Returns a new object of class '<em>Signal Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signal Event</em>'.
	 * @generated
	 */
	SignalEvent createSignalEvent();

	/**
	 * Returns a new object of class '<em>Time Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Event</em>'.
	 * @generated
	 */
	TimeEvent createTimeEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonBehaviorPackage getCommonBehaviorPackage();

} //CommonBehaviorFactory
