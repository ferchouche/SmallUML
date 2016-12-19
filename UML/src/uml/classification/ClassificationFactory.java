/**
 */
package uml.classification;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.classification.ClassificationPackage
 * @generated
 */
public interface ClassificationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClassificationFactory eINSTANCE = uml.classification.impl.ClassificationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Substitution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substitution</em>'.
	 * @generated
	 */
	Substitution createSubstitution();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Operation Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Template Parameter</em>'.
	 * @generated
	 */
	OperationTemplateParameter createOperationTemplateParameter();

	/**
	 * Returns a new object of class '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set</em>'.
	 * @generated
	 */
	ParameterSet createParameterSet();

	/**
	 * Returns a new object of class '<em>Classifier Template Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Template Parameter</em>'.
	 * @generated
	 */
	ClassifierTemplateParameter createClassifierTemplateParameter();

	/**
	 * Returns a new object of class '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization</em>'.
	 * @generated
	 */
	Generalization createGeneralization();

	/**
	 * Returns a new object of class '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalization Set</em>'.
	 * @generated
	 */
	GeneralizationSet createGeneralizationSet();

	/**
	 * Returns a new object of class '<em>Instance Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Specification</em>'.
	 * @generated
	 */
	InstanceSpecification createInstanceSpecification();

	/**
	 * Returns a new object of class '<em>Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Slot</em>'.
	 * @generated
	 */
	Slot createSlot();

	/**
	 * Returns a new object of class '<em>Instance Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instance Value</em>'.
	 * @generated
	 */
	InstanceValue createInstanceValue();

	/**
	 * Returns a new object of class '<em>Redefinable Template Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefinable Template Signature</em>'.
	 * @generated
	 */
	RedefinableTemplateSignature createRedefinableTemplateSignature();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClassificationPackage getClassificationPackage();

} //ClassificationFactory
