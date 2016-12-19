/**
 */
package uml.deployments;

import uml.commonStructure.Abstraction;
import uml.commonStructure.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manifestation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifestation is the concrete physical rendering of one or more model elements by an artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.deployments.Manifestation#getUtilizedElement <em>Utilized Element</em>}</li>
 * </ul>
 *
 * @see uml.deployments.DeploymentsPackage#getManifestation()
 * @model
 * @generated
 */
public interface Manifestation extends Abstraction {
	/**
	 * Returns the value of the '<em><b>Utilized Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The model element that is utilized in the manifestation in an Artifact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Utilized Element</em>' reference.
	 * @see #setUtilizedElement(PackageableElement)
	 * @see uml.deployments.DeploymentsPackage#getManifestation_UtilizedElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='manifestation'"
	 * @generated
	 */
	PackageableElement getUtilizedElement();

	/**
	 * Sets the value of the '{@link uml.deployments.Manifestation#getUtilizedElement <em>Utilized Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilized Element</em>' reference.
	 * @see #getUtilizedElement()
	 * @generated
	 */
	void setUtilizedElement(PackageableElement value);

} // Manifestation
