/**
 */
package uml.useCases;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

import uml.simpleClassifiers.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A UseCase specifies a set of actions performed by its subjects, which yields an observable result that is of value for one or more Actors or other stakeholders of each subject.
 * Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies a.memberEnd->size() = 2)
 * Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies 
 *    (
 *    let usecases: Set(UseCase) = a.memberEnd.type->select(oclIsKindOf(UseCase))->collect(oclAsType(UseCase))->asSet() in
 *    usecases->size() > 1 implies usecases->collect(subject)->size() > 1
 *    )
 * )
 * not allIncludedUseCases()->includes(self)
 * name -> notEmpty ()
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.useCases.UseCase#getExtend <em>Extend</em>}</li>
 *   <li>{@link uml.useCases.UseCase#getExtensionPoint <em>Extension Point</em>}</li>
 *   <li>{@link uml.useCases.UseCase#getInclude <em>Include</em>}</li>
 *   <li>{@link uml.useCases.UseCase#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see uml.useCases.UseCasesPackage#getUseCase()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='binary_associations no_association_to_use_case cannot_include_self must_have_name'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL binary_associations='Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies a.memberEnd->size() = 2)' no_association_to_use_case='Association.allInstances()->forAll(a | a.memberEnd.type->includes(self) implies \r\n   (\r\n   let usecases: Set(UseCase) = a.memberEnd.type->select(oclIsKindOf(UseCase))->collect(oclAsType(UseCase))->asSet() in\r\n   usecases->size() > 1 implies usecases->collect(subject)->size() > 1\r\n   )\r\n)' cannot_include_self='not allIncludedUseCases()->includes(self)' must_have_name='name -> notEmpty ()'"
 * @generated
 */
public interface UseCase extends BehavioredClassifier {
	/**
	 * Returns the value of the '<em><b>Extend</b></em>' containment reference list.
	 * The list contents are of type {@link uml.useCases.Extend}.
	 * It is bidirectional and its opposite is '{@link uml.useCases.Extend#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Extend relationships owned by this UseCase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extend</em>' containment reference list.
	 * @see uml.useCases.UseCasesPackage#getUseCase_Extend()
	 * @see uml.useCases.Extend#getExtension
	 * @model opposite="extension" containment="true" ordered="false"
	 * @generated
	 */
	EList<Extend> getExtend();

	/**
	 * Returns the value of the '<em><b>Extension Point</b></em>' containment reference list.
	 * The list contents are of type {@link uml.useCases.ExtensionPoint}.
	 * It is bidirectional and its opposite is '{@link uml.useCases.ExtensionPoint#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ExtensionPoints owned by this UseCase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Point</em>' containment reference list.
	 * @see uml.useCases.UseCasesPackage#getUseCase_ExtensionPoint()
	 * @see uml.useCases.ExtensionPoint#getUseCase
	 * @model opposite="useCase" containment="true" ordered="false"
	 * @generated
	 */
	EList<ExtensionPoint> getExtensionPoint();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link uml.useCases.Include}.
	 * It is bidirectional and its opposite is '{@link uml.useCases.Include#getIncludingCase <em>Including Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Include relationships owned by this UseCase.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see uml.useCases.UseCasesPackage#getUseCase_Include()
	 * @see uml.useCases.Include#getIncludingCase
	 * @model opposite="includingCase" containment="true" ordered="false"
	 * @generated
	 */
	EList<Include> getInclude();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Classifier#getUseCase <em>Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subjects to which this UseCase applies. Each subject or its parts realize all the UseCases that apply to it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see uml.useCases.UseCasesPackage#getUseCase_Subject()
	 * @see uml.classification.Classifier#getUseCase
	 * @model opposite="useCase" ordered="false"
	 * @generated
	 */
	EList<Classifier> getSubject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allIncludedUseCases() returns the transitive closure of all UseCases (directly or indirectly) included by this UseCase.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self.include.addition->union(self.include.addition->collect(uc | uc.allIncludedUseCases()))->asSet()'"
	 * @generated
	 */
	EList<UseCase> allIncludedUseCases();

} // UseCase
