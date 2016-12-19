/**
 */
package uml.packages;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model captures a view of a physical system. It is an abstraction of the physical system, with a certain purpose. This purpose determines what is to be included in the model and what is irrelevant. Thus the model completely describes those aspects of the physical system that are relevant to the purpose of the model, at the appropriate level of detail.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.packages.Model#getViewpoint <em>Viewpoint</em>}</li>
 * </ul>
 *
 * @see uml.packages.PackagesPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends uml.packages.Package {
	/**
	 * Returns the value of the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the viewpoint that is expressed by a model (this name may refer to a profile definition).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint</em>' attribute.
	 * @see #setViewpoint(String)
	 * @see uml.packages.PackagesPackage#getModel_Viewpoint()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getViewpoint();

	/**
	 * Sets the value of the '{@link uml.packages.Model#getViewpoint <em>Viewpoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint</em>' attribute.
	 * @see #getViewpoint()
	 * @generated
	 */
	void setViewpoint(String value);

} // Model
