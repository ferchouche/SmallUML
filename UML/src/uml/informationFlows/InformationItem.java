/**
 */
package uml.informationFlows;

import org.eclipse.emf.common.util.EList;

import uml.classification.Classifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * InformationItems represent many kinds of information that can flow from sources to targets in very abstract ways.  They represent the kinds of information that may move within a system, but do not elaborate details of the transferred information.  Details of transferred information are the province of other Classifiers that may ultimately define InformationItems.  Consequently, InformationItems cannot be instantiated and do not themselves have features, generalizations, or associations. An important use of InformationItems is to represent information during early design stages, possibly before the detailed modeling decisions that will ultimately define them have been made. Another purpose of InformationItems is to abstract portions of complex models in less precise, but perhaps more general and communicable, ways. 
 * (self.represented->select(oclIsKindOf(InformationItem))->forAll(p |
 *   p.conveyingFlow.source->forAll(q | self.conveyingFlow.source->includes(q)) and
 *     p.conveyingFlow.target->forAll(q | self.conveyingFlow.target->includes(q)))) and
 *       (self.represented->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface) or
 *         oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))
 * self.generalization->isEmpty() and self.feature->isEmpty()
 * isAbstract
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.informationFlows.InformationItem#getRepresented <em>Represented</em>}</li>
 * </ul>
 *
 * @see uml.informationFlows.InformationFlowsPackage#getInformationItem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sources_and_targets has_no not_instantiable'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL sources_and_targets='(self.represented->select(oclIsKindOf(InformationItem))->forAll(p |\r\n  p.conveyingFlow.source->forAll(q | self.conveyingFlow.source->includes(q)) and\r\n    p.conveyingFlow.target->forAll(q | self.conveyingFlow.target->includes(q)))) and\r\n      (self.represented->forAll(oclIsKindOf(Class) or oclIsKindOf(Interface) or\r\n        oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))' has_no='self.generalization->isEmpty() and self.feature->isEmpty()' not_instantiable='isAbstract'"
 * @generated
 */
public interface InformationItem extends Classifier {
	/**
	 * Returns the value of the '<em><b>Represented</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines the classifiers that will specify the structure and nature of the information. An information item represents all its represented classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Represented</em>' reference list.
	 * @see uml.informationFlows.InformationFlowsPackage#getInformationItem_Represented()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='representation'"
	 * @generated
	 */
	EList<Classifier> getRepresented();

} // InformationItem
