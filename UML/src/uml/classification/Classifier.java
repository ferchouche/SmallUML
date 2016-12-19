/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.NamedElement;
import uml.commonStructure.Namespace;
import uml.commonStructure.TemplateableElement;
import uml.commonStructure.Type;

import uml.simpleClassifiers.Interface;

import uml.structuredClassifiers.CollaborationUse;

import uml.useCases.UseCase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Classifier represents a classification of instances according to their Features.
 * parents()->forAll(c | self.maySpecializeType(c))
 * powertypeExtent->forAll( gs | 
 *   gs.generalization->forAll( gen | 
 *     not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) 
 *   ))
 * parents()->forAll(not isFinalSpecialization)
 * not allParents()->includes(self)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.Classifier#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link uml.classification.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml.classification.Classifier#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link uml.classification.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.classification.Classifier#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml.classification.Classifier#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link uml.classification.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.classification.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml.classification.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.classification.Classifier#isIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link uml.classification.Classifier#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link uml.classification.Classifier#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link uml.classification.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml.classification.Classifier#getRepresentation <em>Representation</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getClassifier()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='specialize_type maps_to_generalization_set non_final_parents no_cycles_in_generalization'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL specialize_type='parents()->forAll(c | self.maySpecializeType(c))' maps_to_generalization_set='powertypeExtent->forAll( gs | \r\n  gs.generalization->forAll( gen | \r\n    not (gen.general = self) and not gen.general.allParents()->includes(self) and not (gen.specific = self) and not self.allParents()->includes(gen.specific) \r\n  ))' non_final_parents='parents()->forAll(not isFinalSpecialization)' no_cycles_in_generalization='not allParents()->includes(self)'"
 * @generated
 */
public interface Classifier extends Namespace, RedefinableElement, Type, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Substitution}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Substitutions owned by this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_Substitution()
	 * @see uml.classification.Substitution#getSubstitutingClassifier
	 * @model opposite="substitutingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<Substitution> getSubstitution();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Feature}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies each Feature directly defined in the classifier. Note that there may be members of the Classifier that are of the type Feature but are not included, e.g., inherited features.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_Feature()
	 * @see uml.classification.Feature#getFeaturingClassifier
	 * @model opposite="featuringClassifier" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link uml.classification.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The GeneralizationSet of which this Classifier is a power type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_PowertypeExtent()
	 * @see uml.classification.GeneralizationSet#getPowertype
	 * @model opposite="powertype" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getPowertypeExtent();

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Generalization}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Generalization relationships for this Classifier. These Generalizations navigate to more general Classifiers in the generalization hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_Generalization()
	 * @see uml.classification.Generalization#getSpecific
	 * @model opposite="specific" containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All of the Properties that are direct (i.e., not inherited or imported) attributes of the Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_Attribute()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifier'"
	 * @generated
	 */
	EList<Property> getAttribute();

	/**
	 * Returns the value of the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * The list contents are of type {@link uml.structuredClassifiers.CollaborationUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CollaborationUses owned by the Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Use</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_CollaborationUse()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifier'"
	 * @generated
	 */
	EList<CollaborationUse> getCollaborationUse();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The generalizing Classifiers for this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_General()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifier'"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link uml.commonStructure.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All elements inherited by this Classifier from its general Classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_InheritedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='inheritingClassifier'"
	 * @generated
	 */
	EList<NamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier can only be instantiated by instantiating one of its specializations. An abstract Classifier is intended to be used by other Classifiers e.g., as the target of Associations or Generalizations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see uml.classification.ClassificationPackage#getClassifier_IsAbstract()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link uml.classification.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Final Specialization</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier cannot be specialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Final Specialization</em>' attribute.
	 * @see #setIsFinalSpecialization(boolean)
	 * @see uml.classification.ClassificationPackage#getClassifier_IsFinalSpecialization()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsFinalSpecialization();

	/**
	 * Sets the value of the '{@link uml.classification.Classifier#isIsFinalSpecialization <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Final Specialization</em>' attribute.
	 * @see #isIsFinalSpecialization()
	 * @generated
	 */
	void setIsFinalSpecialization(boolean value);

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link uml.useCases.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The UseCases owned by this classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_OwnedUseCase()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifier'"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link uml.useCases.UseCase}.
	 * It is bidirectional and its opposite is '{@link uml.useCases.UseCase#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of UseCases for which this Classifier is the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_UseCase()
	 * @see uml.useCases.UseCase#getSubject
	 * @model opposite="subject" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCase();

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifiers redefined by this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getClassifier_RedefinedClassifier()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifier'"
	 * @generated
	 */
	EList<Classifier> getRedefinedClassifier();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A CollaborationUse which indicates the Collaboration that represents this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationUse)
	 * @see uml.classification.ClassificationPackage#getClassifier_Representation()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='classifier'"
	 * @generated
	 */
	CollaborationUse getRepresentation();

	/**
	 * Sets the value of the '{@link uml.classification.Classifier#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(CollaborationUse value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the Features in the namespace of the Classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='member->select(oclIsKindOf(Feature))->collect(oclAsType(Feature))->asSet()'"
	 * @generated
	 */
	EList<Feature> allFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='parents()->union(parents()->collect(allParents())->asSet())'"
	 * @generated
	 */
	EList<Classifier> allParents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general Classifiers are the ones referenced by the Generalization relationships.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='parents()'"
	 * @generated
	 */
	EList<Classifier> general();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a NamedElement is visible in the classifier. Non-private members are visible. It is only called when the argument is something owned by a parent.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='n.visibility <> VisibilityKind::private'"
	 * @generated
	 */
	boolean hasVisibilityOf(NamedElement n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inherit() defines how to inherit a set of elements passed as its argument.  It excludes redefined elements from the result.
	 * <!-- end-model-doc -->
	 * @model ordered="false" inhsMany="true" inhsOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='inhs->reject(inh |\r\n  inh.oclIsKindOf(RedefinableElement) and\r\n  ownedMember->select(oclIsKindOf(RedefinableElement))->\r\n    select(redefinedElement->includes(inh.oclAsType(RedefinableElement)))\r\n       ->notEmpty())'"
	 * @generated
	 */
	EList<NamedElement> inherit(EList<NamedElement> inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a Classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply.
	 * <!-- end-model-doc -->
	 * @model ordered="false" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='member->select(m | c.hasVisibilityOf(m))'"
	 * @generated
	 */
	EList<NamedElement> inheritableMembers(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='inherit(parents()->collect(inheritableMembers(self))->asSet())'"
	 * @generated
	 */
	EList<NamedElement> inheritedMember();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints.
	 * <!-- end-model-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" cRequired="true" cOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.oclIsKindOf(c.oclType())'"
	 * @generated
	 */
	boolean maySpecializeType(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='generalization.general->asSet()'"
	 * @generated
	 */
	EList<Classifier> parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly realized by this Classifier
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='(clientDependency->\r\n  select(oclIsKindOf(Realization) and supplier->forAll(oclIsKindOf(Interface))))->\r\n      collect(supplier.oclAsType(Interface))->asSet()'"
	 * @generated
	 */
	EList<Interface> directlyRealizedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces directly used by this Classifier
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='(supplierDependency->\r\n  select(oclIsKindOf(Usage) and client->forAll(oclIsKindOf(Interface))))->\r\n    collect(client.oclAsType(Interface))->asSet()'"
	 * @generated
	 */
	EList<Interface> directlyUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces realized by this Classifier and all of its generalizations
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='directlyRealizedInterfaces()->union(self.allParents()->collect(directlyRealizedInterfaces()))->asSet()'"
	 * @generated
	 */
	EList<Interface> allRealizedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Interfaces used by this Classifier and all of its generalizations
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='directlyUsedInterfaces()->union(self.allParents()->collect(directlyUsedInterfaces()))->asSet()'"
	 * @generated
	 */
	EList<Interface> allUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="types.Boolean" required="true" ordered="false" contractRequired="true" contractOrdered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='substitution.contract->includes(contract)'"
	 * @generated
	 */
	boolean isSubstitutableFor(Classifier contract);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allAttributes gives an ordered set of all owned and inherited attributes of the Classifier. All owned attributes appear before any inherited attributes, and the attributes inherited from any more specific parent Classifier appear before those of any more general parent Classifier. However, if the Classifier has multiple immediate parents, then the relative ordering of the sets of attributes from those parents is not defined.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='attribute->asSequence()->union(parents()->asSequence().allAttributes())->select(p | member->includes(p))->asOrderedSet()'"
	 * @generated
	 */
	EList<Property> allAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All StructuralFeatures related to the Classifier that may have Slots, including direct attributes, inherited attributes, private attributes in generalizations, and memberEnds of Associations, but excluding redefined StructuralFeatures.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='member->select(oclIsKindOf(StructuralFeature))->\r\n  collect(oclAsType(StructuralFeature))->\r\n   union(self.inherit(self.allParents()->collect(p | p.attribute)->asSet())->\r\n     collect(oclAsType(StructuralFeature)))->asSet()'"
	 * @generated
	 */
	EList<StructuralFeature> allSlottableFeatures();

} // Classifier
