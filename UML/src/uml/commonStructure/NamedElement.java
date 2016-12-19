/**
 */
package uml.commonStructure;

import org.eclipse.emf.common.util.EList;

import uml.values.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A NamedElement is an Element in a model that may have a name. The name may be given directly and/or via the use of a StringExpression.
 * (namespace = null and owner <> null) implies visibility = null
 * (name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies
 *   qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))
 * name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.commonStructure.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link uml.commonStructure.NamedElement#getNameExpression <em>Name Expression</em>}</li>
 *   <li>{@link uml.commonStructure.NamedElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link uml.commonStructure.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link uml.commonStructure.NamedElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.commonStructure.NamedElement#getClientDependency <em>Client Dependency</em>}</li>
 * </ul>
 *
 * @see uml.commonStructure.CommonStructurePackage#getNamedElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='visibility_needs_ownership has_qualified_name has_no_qualified_name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL visibility_needs_ownership='(namespace = null and owner <> null) implies visibility = null' has_qualified_name='(name <> null and allNamespaces()->select(ns | ns.name = null)->isEmpty()) implies\n  qualifiedName = allNamespaces()->iterate( ns : Namespace; agg: String = name | ns.name.concat(self.separator()).concat(agg))' has_no_qualified_name='name=null or allNamespaces()->select( ns | ns.name=null )->notEmpty() implies qualifiedName = null'"
 * @generated
 */
public interface NamedElement extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see uml.commonStructure.CommonStructurePackage#getNamedElement_Name()
	 * @model dataType="types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link uml.commonStructure.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StringExpression used to define the name of this NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Expression</em>' containment reference.
	 * @see #setNameExpression(StringExpression)
	 * @see uml.commonStructure.CommonStructurePackage#getNamedElement_NameExpression()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='namedElement'"
	 * @generated
	 */
	StringExpression getNameExpression();

	/**
	 * Sets the value of the '{@link uml.commonStructure.NamedElement#getNameExpression <em>Name Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Expression</em>' containment reference.
	 * @see #getNameExpression()
	 * @generated
	 */
	void setNameExpression(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Namespace#getOwnedMember <em>Owned Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Namespace that owns the NamedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Namespace</em>' reference.
	 * @see uml.commonStructure.CommonStructurePackage#getNamedElement_Namespace()
	 * @see uml.commonStructure.Namespace#getOwnedMember
	 * @model opposite="ownedMember" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Namespace getNamespace();

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name that allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing Namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see uml.commonStructure.CommonStructurePackage#getNamedElement_QualifiedName()
	 * @model dataType="types.String" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link uml.commonStructure.VisibilityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines whether and how the NamedElement is visible outside its owning Namespace.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see uml.commonStructure.VisibilityKind
	 * @see #setVisibility(VisibilityKind)
	 * @see uml.commonStructure.CommonStructurePackage#getNamedElement_Visibility()
	 * @model ordered="false"
	 * @generated
	 */
	VisibilityKind getVisibility();

	/**
	 * Sets the value of the '{@link uml.commonStructure.NamedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see uml.commonStructure.VisibilityKind
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityKind value);

	/**
	 * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.Dependency}.
	 * It is bidirectional and its opposite is '{@link uml.commonStructure.Dependency#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the Dependencies that reference this NamedElement as a client.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Dependency</em>' reference list.
	 * @see uml.commonStructure.CommonStructurePackage#getNamedElement_ClientDependency()
	 * @see uml.commonStructure.Dependency#getClient
	 * @model opposite="client" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Dependency> getClientDependency();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allNamespaces() gives the sequence of Namespaces in which the NamedElement is nested, working outwards.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if owner.oclIsKindOf(TemplateParameter) and\n  owner.oclAsType(TemplateParameter).signature.template.oclIsKindOf(Namespace) then\n    let enclosingNamespace : Namespace =\n      owner.oclAsType(TemplateParameter).signature.template.oclAsType(Namespace) in\n        enclosingNamespace.allNamespaces()->prepend(enclosingNamespace)\nelse\n  if namespace->isEmpty()\n    then OrderedSet{}\n  else\n    namespace.allNamespaces()->prepend(namespace)\n  endif\nendif'"
	 * @generated
	 */
	EList<Namespace> allNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allOwningPackages() returns the set of all the enclosing Namespaces of this NamedElement, working outwards, that are Packages, up to but not including the first such Namespace that is not a Package.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if namespace.oclIsKindOf(Package)\r\nthen\r\n  let owningPackage : Package = namespace.oclAsType(Package) in\r\n    owningPackage->union(owningPackage.allOwningPackages())\r\nelse\r\n  null\r\nendif'"
	 * @generated
	 */
	EList<uml.packages.Package> allOwningPackages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isDistinguishableFrom() determines whether two NamedElements may logically co-exist within a Namespace. By default, two named elements are distinguishable if (a) they have types neither of which is a kind of the other or (b) they have different names.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false" nsRequired="true" nsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='(self.oclIsKindOf(n.oclType()) or n.oclIsKindOf(self.oclType())) implies\n    ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()'"
	 * @generated
	 */
	boolean isDistinguishableFrom(NamedElement n, Namespace ns);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When a NamedElement has a name, and all of its containing Namespaces have a name, the qualifiedName is constructed from the name of the NamedElement and the names of the containing Namespaces.
	 * <!-- end-model-doc -->
	 * @model dataType="types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if self.name <> null and self.allNamespaces()->select( ns | ns.name=null )->isEmpty()\nthen \n    self.allNamespaces()->iterate( ns : Namespace; agg: String = self.name | ns.name.concat(self.separator()).concat(agg))\nelse\n   null\nendif'"
	 * @generated
	 */
	String qualifiedName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query separator() gives the string that is used to separate names when constructing a qualifiedName.
	 * <!-- end-model-doc -->
	 * @model dataType="types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='\'::\''"
	 * @generated
	 */
	String separator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='Dependency.allInstances()->select(d | d.client->includes(self))'"
	 * @generated
	 */
	EList<Dependency> clientDependency();

} // NamedElement
