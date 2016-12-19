/**
 */
package uml.structuredClassifiers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A model element that has both Association and Class properties. An AssociationClass can be seen as an Association that also has Class properties, or as a Class that also has Association properties. It not only connects a set of Classifiers but also defines a set of Features that belong to the Association itself and not to any of the associated Classifiers.
 * self.endType()->excludes(self) and self.endType()->collect(et|et.oclAsType(Classifier).allParents())->flatten()->excludes(self)
 * ownedAttribute->intersection(ownedEnd)->isEmpty()
 * <!-- end-model-doc -->
 *
 *
 * @see uml.structuredClassifiers.StructuredClassifiersPackage#getAssociationClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='cannot_be_defined disjoint_attributes_ends'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL cannot_be_defined='self.endType()->excludes(self) and self.endType()->collect(et|et.oclAsType(Classifier).allParents())->flatten()->excludes(self)' disjoint_attributes_ends='ownedAttribute->intersection(ownedEnd)->isEmpty()'"
 * @generated
 */
public interface AssociationClass extends uml.structuredClassifiers.Class, Association {
} // AssociationClass
