/**
 */
package uml.useCases;

import uml.simpleClassifiers.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Actor specifies a role played by a user or any other system that interacts with the subject.
 * Association.allInstances()->forAll( a |
 *   a.memberEnd->collect(type)->includes(self) implies
 *   (
 *     a.memberEnd->size() = 2 and
 *     let actorEnd : Property = a.memberEnd->any(type = self) in
 *       actorEnd.opposite.class.oclIsKindOf(UseCase) or
 *       ( actorEnd.opposite.class.oclIsKindOf(Class) and not
 *          actorEnd.opposite.class.oclIsKindOf(Behavior))
 *       )
 *   )
 * name->notEmpty()
 * <!-- end-model-doc -->
 *
 *
 * @see uml.useCases.UseCasesPackage#getActor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='associations must_have_name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL associations='Association.allInstances()->forAll( a |\n  a.memberEnd->collect(type)->includes(self) implies\n  (\n    a.memberEnd->size() = 2 and\n    let actorEnd : Property = a.memberEnd->any(type = self) in\n      actorEnd.opposite.class.oclIsKindOf(UseCase) or\n      ( actorEnd.opposite.class.oclIsKindOf(Class) and not\n         actorEnd.opposite.class.oclIsKindOf(Behavior))\n      )\n  )' must_have_name='name->notEmpty()'"
 * @generated
 */
public interface Actor extends BehavioredClassifier {
} // Actor
