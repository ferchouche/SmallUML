/**
 */
package uml.useCases;

import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Include relationship specifies that a UseCase contains the behavior defined in another UseCase.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.useCases.Include#getAddition <em>Addition</em>}</li>
 *   <li>{@link uml.useCases.Include#getIncludingCase <em>Including Case</em>}</li>
 * </ul>
 *
 * @see uml.useCases.UseCasesPackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends NamedElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Addition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that is to be included.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Addition</em>' reference.
	 * @see #setAddition(UseCase)
	 * @see uml.useCases.UseCasesPackage#getInclude_Addition()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='include'"
	 * @generated
	 */
	UseCase getAddition();

	/**
	 * Sets the value of the '{@link uml.useCases.Include#getAddition <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Addition</em>' reference.
	 * @see #getAddition()
	 * @generated
	 */
	void setAddition(UseCase value);

	/**
	 * Returns the value of the '<em><b>Including Case</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.useCases.UseCase#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase which includes the addition and owns the Include relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Including Case</em>' container reference.
	 * @see #setIncludingCase(UseCase)
	 * @see uml.useCases.UseCasesPackage#getInclude_IncludingCase()
	 * @see uml.useCases.UseCase#getInclude
	 * @model opposite="include" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getIncludingCase();

	/**
	 * Sets the value of the '{@link uml.useCases.Include#getIncludingCase <em>Including Case</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Including Case</em>' container reference.
	 * @see #getIncludingCase()
	 * @generated
	 */
	void setIncludingCase(UseCase value);

} // Include
