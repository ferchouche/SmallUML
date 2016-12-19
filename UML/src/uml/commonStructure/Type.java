/**
 */
package uml.commonStructure;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Type constrains the values represented by a TypedElement.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.Type#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.packages.Package#getOwnedType <em>Owned Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the owning Package of this Type, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(uml.packages.Package)
	 * @see uml.commonStructure.CommonStructurePackage#getType_Package()
	 * @see uml.packages.Package#getOwnedType
	 * @model opposite="ownedType" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	uml.packages.Package getPackage();

	/**
	 * Sets the value of the '{@link uml.commonStructure.Type#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(uml.packages.Package value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a Type that conforms to another. By default, two Types do not conform to each other. This query is intended to be redefined for specific conformance situations.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='false'"
	 * @generated
	 */
	boolean conformsTo(Type other);

} // Type
