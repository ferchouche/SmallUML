/**
 */
package uml.useCases;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Constraint;
import uml.commonStructure.DirectedRelationship;
import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A relationship from an extending UseCase to an extended UseCase that specifies how and when the behavior defined in the extending UseCase can be inserted into the behavior defined in the extended UseCase.
 * extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.useCases.Extend#getCondition <em>Condition</em>}</li>
 *   <li>{@link uml.useCases.Extend#getExtendedCase <em>Extended Case</em>}</li>
 *   <li>{@link uml.useCases.Extend#getExtension <em>Extension</em>}</li>
 *   <li>{@link uml.useCases.Extend#getExtensionLocation <em>Extension Location</em>}</li>
 * </ul>
 *
 * @see uml.useCases.UseCasesPackage#getExtend()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='extension_points'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL extension_points='extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))'"
 * @generated
 */
public interface Extend extends NamedElement, DirectedRelationship {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the condition that must hold when the first ExtensionPoint is reached for the extension to take place. If no constraint is associated with the Extend relationship, the extension is unconditional.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Constraint)
	 * @see uml.useCases.UseCasesPackage#getExtend_Condition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extend'"
	 * @generated
	 */
	Constraint getCondition();

	/**
	 * Sets the value of the '{@link uml.useCases.Extend#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Constraint value);

	/**
	 * Returns the value of the '<em><b>Extended Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that is being extended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Case</em>' reference.
	 * @see #setExtendedCase(UseCase)
	 * @see uml.useCases.UseCasesPackage#getExtend_ExtendedCase()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extend'"
	 * @generated
	 */
	UseCase getExtendedCase();

	/**
	 * Sets the value of the '{@link uml.useCases.Extend#getExtendedCase <em>Extended Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Case</em>' reference.
	 * @see #getExtendedCase()
	 * @generated
	 */
	void setExtendedCase(UseCase value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.useCases.UseCase#getExtend <em>Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCase that represents the extension and owns the Extend relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension</em>' container reference.
	 * @see #setExtension(UseCase)
	 * @see uml.useCases.UseCasesPackage#getExtend_Extension()
	 * @see uml.useCases.UseCase#getExtend
	 * @model opposite="extend" required="true" transient="false" ordered="false"
	 * @generated
	 */
	UseCase getExtension();

	/**
	 * Sets the value of the '{@link uml.useCases.Extend#getExtension <em>Extension</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' container reference.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(UseCase value);

	/**
	 * Returns the value of the '<em><b>Extension Location</b></em>' reference list.
	 * The list contents are of type {@link uml.useCases.ExtensionPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An ordered list of ExtensionPoints belonging to the extended UseCase, specifying where the respective behavioral fragments of the extending UseCase are to be inserted. The first fragment in the extending UseCase is associated with the first extension point in the list, the second fragment with the second point, and so on. Note that, in most practical cases, the extending UseCase has just a single behavior fragment, so that the list of ExtensionPoints is trivial.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Location</em>' reference list.
	 * @see uml.useCases.UseCasesPackage#getExtend_ExtensionLocation()
	 * @model required="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='extension'"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionLocation();

} // Extend
