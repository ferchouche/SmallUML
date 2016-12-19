/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Type;

import uml.deployments.DeploymentTarget;

import uml.simpleClassifiers.DataType;
import uml.simpleClassifiers.Interface;

import uml.structuredClassifiers.Association;
import uml.structuredClassifiers.ConnectableElement;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Property is a StructuralFeature. A Property related by ownedAttribute to a Classifier (other than an association) represents an attribute and might also represent an association end. It relates an instance of the Classifier to a value or set of values of the type of the attribute. A Property related by memberEnd to an Association represents an end of the Association. The type of the Property is the type of the end of the Association. A Property has the capability of being a DeploymentTarget in a Deployment relationship. This enables modeling the deployment to hierarchical nodes that have Properties functioning as internal parts.  Property specializes ParameterableElement to specify that a Property can be exposed as a formal template parameter, and provided as an actual parameter in a binding of a template.
 * subsettedProperty->notEmpty() implies
 *   (subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |
 *     subsettedProperty->forAll(sp |
 *       sp.subsettingContext()->exists(c | sc.conformsTo(c)))))
 * isDerivedUnion implies isReadOnly
 * isComposite and association <> null implies opposite.upperBound() <= 1
 * 
 * 
 * (redefinedProperty->notEmpty()) implies
 *   (redefinitionContext->notEmpty() and
 *       redefinedProperty->forAll(rp|
 *         ((redefinitionContext->collect(fc|
 *           fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp)))
 * subsettedProperty->forAll(sp |
 *   self.type.conformsTo(sp.type) and
 *     ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies
 *       self.upperBound() <= sp.upperBound() ))
 * (self.isAttribute()
 * and (templateParameterSubstitution->notEmpty())
 * implies (templateParameterSubstitution->forAll(ts |
 *     ts.formal.oclIsKindOf(Property)
 *     and ts.formal.oclAsType(Property).isAttribute())))
 * isDerivedUnion implies isDerived
 * deployment->notEmpty() implies owner.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p = self))
 * subsettedProperty->forAll(sp | sp.name <> name)
 * (opposite->notEmpty() and owningAssociation->isEmpty()) implies classifier = opposite.type
 * qualifier->notEmpty() implies association->notEmpty()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Property#getInterface <em>Interface</em>}</li>
 *   <li>{@link uml.classification.Property#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link uml.classification.Property#getAssociation <em>Association</em>}</li>
 *   <li>{@link uml.classification.Property#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link uml.classification.Property#getQualifier <em>Qualifier</em>}</li>
 *   <li>{@link uml.classification.Property#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.classification.Property#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link uml.classification.Property#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.classification.Property#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link uml.classification.Property#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.classification.Property#isIsDerivedUnion <em>Is Derived Union</em>}</li>
 *   <li>{@link uml.classification.Property#isIsId <em>Is Id</em>}</li>
 *   <li>{@link uml.classification.Property#getOpposite <em>Opposite</em>}</li>
 *   <li>{@link uml.classification.Property#getOwningAssociation <em>Owning Association</em>}</li>
 *   <li>{@link uml.classification.Property#getRedefinedProperty <em>Redefined Property</em>}</li>
 *   <li>{@link uml.classification.Property#getSubsettedProperty <em>Subsetted Property</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getProperty()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='subsetting_context_conforms derived_union_is_read_only multiplicity_of_composite redefined_property_inherited subsetting_rules binding_to_attribute derived_union_is_derived deployment_target subsetted_property_names type_of_opposite_end qualified_is_association_end'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL subsetting_context_conforms='subsettedProperty->notEmpty() implies\n  (subsettingContext()->notEmpty() and subsettingContext()->forAll (sc |\n    subsettedProperty->forAll(sp |\n      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))' derived_union_is_read_only='isDerivedUnion implies isReadOnly' multiplicity_of_composite='isComposite and association <> null implies opposite.upperBound() <= 1\r\n\r\n' redefined_property_inherited='(redefinedProperty->notEmpty()) implies\r\n  (redefinitionContext->notEmpty() and\r\n      redefinedProperty->forAll(rp|\r\n        ((redefinitionContext->collect(fc|\r\n          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp)))' subsetting_rules='subsettedProperty->forAll(sp |\n  self.type.conformsTo(sp.type) and\n    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\n      self.upperBound() <= sp.upperBound() ))' binding_to_attribute='(self.isAttribute()\r\nand (templateParameterSubstitution->notEmpty())\r\nimplies (templateParameterSubstitution->forAll(ts |\r\n    ts.formal.oclIsKindOf(Property)\r\n    and ts.formal.oclAsType(Property).isAttribute())))' derived_union_is_derived='isDerivedUnion implies isDerived' deployment_target='deployment->notEmpty() implies owner.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p = self))' subsetted_property_names='subsettedProperty->forAll(sp | sp.name <> name)' type_of_opposite_end='(opposite->notEmpty() and owningAssociation->isEmpty()) implies classifier = opposite.type' qualified_is_association_end='qualifier->notEmpty() implies association->notEmpty()'"
 * @generated
 */
public interface Property extends StructuralFeature, ConnectableElement, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.Interface#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interface that owns this Property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' container reference.
	 * @see #setInterface(Interface)
	 * @see uml.classification.ClassificationPackage#getProperty_Interface()
	 * @see uml.simpleClassifiers.Interface#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getInterface <em>Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' container reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link uml.classification.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of aggregation that applies to the Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see uml.classification.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see uml.classification.ClassificationPackage#getProperty_Aggregation()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see uml.classification.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.Association#getMemberEnd <em>Member End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Association of which this Property is a member, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association</em>' reference.
	 * @see #setAssociation(Association)
	 * @see uml.classification.ClassificationPackage#getProperty_Association()
	 * @see uml.structuredClassifiers.Association#getMemberEnd
	 * @model opposite="memberEnd" ordered="false"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getAssociation <em>Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association</em>' reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Association End</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.classification.Property#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the optional association end that owns a qualifier attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Association End</em>' container reference.
	 * @see #setAssociationEnd(Property)
	 * @see uml.classification.ClassificationPackage#getProperty_AssociationEnd()
	 * @see uml.classification.Property#getQualifier
	 * @model opposite="qualifier" transient="false" ordered="false"
	 * @generated
	 */
	Property getAssociationEnd();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getAssociationEnd <em>Association End</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association End</em>' container reference.
	 * @see #getAssociationEnd()
	 * @generated
	 */
	void setAssociationEnd(Property value);

	/**
	 * Returns the value of the '<em><b>Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Property#getAssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional list of ordered qualifier attributes for the end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Qualifier</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getProperty_Qualifier()
	 * @see uml.classification.Property#getAssociationEnd
	 * @model opposite="associationEnd" containment="true"
	 * @generated
	 */
	EList<Property> getQualifier();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Class that owns this Property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see uml.classification.ClassificationPackage#getProperty_Class()
	 * @model transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	uml.structuredClassifiers.Class getClass_();

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.simpleClassifiers.DataType#getOwnedAttribute <em>Owned Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DataType that owns this Property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datatype</em>' container reference.
	 * @see #setDatatype(DataType)
	 * @see uml.classification.ClassificationPackage#getProperty_Datatype()
	 * @see uml.simpleClassifiers.DataType#getOwnedAttribute
	 * @model opposite="ownedAttribute" transient="false" ordered="false"
	 * @generated
	 */
	DataType getDatatype();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getDatatype <em>Datatype</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' container reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DataType value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A ValueSpecification that is evaluated to give a default value for the Property when an instance of the owning Classifier is instantiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see uml.classification.ClassificationPackage#getProperty_DefaultValue()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningProperty'"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Is Composite</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If isComposite is true, the object containing the attribute is a container for the object or value contained in the attribute. This is a derived value, indicating whether the aggregation of the Property is composite or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Composite</em>' attribute.
	 * @see #setIsComposite(boolean)
	 * @see uml.classification.ClassificationPackage#getProperty_IsComposite()
	 * @model default="false" dataType="types.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsComposite();

	/**
	 * Sets the value of the '{@link uml.classification.Property#isIsComposite <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composite</em>' attribute.
	 * @see #isIsComposite()
	 * @generated
	 */
	void setIsComposite(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the Property is derived, i.e., whether its value or values can be computed from other information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived</em>' attribute.
	 * @see #setIsDerived(boolean)
	 * @see uml.classification.ClassificationPackage#getProperty_IsDerived()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerived();

	/**
	 * Sets the value of the '{@link uml.classification.Property#isIsDerived <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived</em>' attribute.
	 * @see #isIsDerived()
	 * @generated
	 */
	void setIsDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Derived Union</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether the property is derived as the union of all of the Properties that are constrained to subset it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Derived Union</em>' attribute.
	 * @see #setIsDerivedUnion(boolean)
	 * @see uml.classification.ClassificationPackage#getProperty_IsDerivedUnion()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsDerivedUnion();

	/**
	 * Sets the value of the '{@link uml.classification.Property#isIsDerivedUnion <em>Is Derived Union</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Derived Union</em>' attribute.
	 * @see #isIsDerivedUnion()
	 * @generated
	 */
	void setIsDerivedUnion(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Id</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True indicates this property can be used to uniquely identify an instance of the containing Class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Id</em>' attribute.
	 * @see #setIsId(boolean)
	 * @see uml.classification.ClassificationPackage#getProperty_IsId()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='isID'"
	 * @generated
	 */
	boolean isIsId();

	/**
	 * Sets the value of the '{@link uml.classification.Property#isIsId <em>Is Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Id</em>' attribute.
	 * @see #isIsId()
	 * @generated
	 */
	void setIsId(boolean value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In the case where the Property is one end of a binary association this gives the other end.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Property)
	 * @see uml.classification.ClassificationPackage#getProperty_Opposite()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='property'"
	 * @generated
	 */
	Property getOpposite();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Property value);

	/**
	 * Returns the value of the '<em><b>Owning Association</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.structuredClassifiers.Association#getOwnedEnd <em>Owned End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owning association of this property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owning Association</em>' container reference.
	 * @see #setOwningAssociation(Association)
	 * @see uml.classification.ClassificationPackage#getProperty_OwningAssociation()
	 * @see uml.structuredClassifiers.Association#getOwnedEnd
	 * @model opposite="ownedEnd" transient="false" ordered="false"
	 * @generated
	 */
	Association getOwningAssociation();

	/**
	 * Sets the value of the '{@link uml.classification.Property#getOwningAssociation <em>Owning Association</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Association</em>' container reference.
	 * @see #getOwningAssociation()
	 * @generated
	 */
	void setOwningAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Redefined Property</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The properties that are redefined by this property, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Property</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getProperty_RedefinedProperty()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='property'"
	 * @generated
	 */
	EList<Property> getRedefinedProperty();

	/**
	 * Returns the value of the '<em><b>Subsetted Property</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The properties of which this Property is constrained to be a subset, if any.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subsetted Property</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getProperty_SubsettedProperty()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='property'"
	 * @generated
	 */
	EList<Property> getSubsettedProperty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isAttribute() is true if the Property is defined as an attribute of some Classifier.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='not classifier->isEmpty()'"
	 * @generated
	 */
	boolean isAttribute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of isComposite is true only if aggregation is composite.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='aggregation = AggregationKind::composite'"
	 * @generated
	 */
	boolean isComposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNavigable() indicates whether it is possible to navigate across the property.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="types.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='not classifier->isEmpty() or association.navigableOwnedEnd->includes(self)'"
	 * @generated
	 */
	boolean isNavigable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this property is a memberEnd of a binary association, then opposite gives the other end.
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if association <> null and association.memberEnd->size() = 2\nthen\n    association.memberEnd->any(e | e <> self)\nelse\n    null\nendif'"
	 * @generated
	 */
	Property opposite();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query subsettingContext() gives the context for subsetting a Property. It consists, in the case of an attribute, of the corresponding Classifier, and in the case of an association end, all of the Classifiers at the other ends.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if association <> null\nthen association.memberEnd->excluding(self)->collect(type)->asSet()\nelse \n  if classifier<>null\n  then classifier->asSet()\n  else Set{} \n  endif\nendif'"
	 * @generated
	 */
	EList<Type> subsettingContext();

} // Property
