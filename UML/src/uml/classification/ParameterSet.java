/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.Constraint;
import uml.commonStructure.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ParameterSet designates alternative sets of inputs or outputs that a Behavior may use.
 * parameter->forAll(p1, p2 | self.owner = p1.owner and self.owner = p2.owner and p1.direction = p2.direction)
 * ((parameter->exists(direction = ParameterDirectionKind::_'in')) implies 
 *     behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::_'in' and p.parameterSet->isEmpty())->forAll(isStream))
 *     and
 * ((parameter->exists(direction = ParameterDirectionKind::out)) implies 
 *     behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::out and p.parameterSet->isEmpty())->forAll(isStream))  
 * 
 * parameter->forAll(parameterSet->forAll(s1, s2 | s1->size() = s2->size() implies s1.parameter->exists(p | not s2.parameter->includes(p))))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.ParameterSet#getCondition <em>Condition</em>}</li>
 *   <li>{@link uml.classification.ParameterSet#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getParameterSet()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_parameterized_entity input two_parameter_sets'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL same_parameterized_entity='parameter->forAll(p1, p2 | self.owner = p1.owner and self.owner = p2.owner and p1.direction = p2.direction)' input='((parameter->exists(direction = ParameterDirectionKind::_\'in\')) implies \r\n    behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::_\'in\' and p.parameterSet->isEmpty())->forAll(isStream))\r\n    and\r\n((parameter->exists(direction = ParameterDirectionKind::out)) implies \r\n    behavioralFeature.ownedParameter->select(p | p.direction = ParameterDirectionKind::out and p.parameterSet->isEmpty())->forAll(isStream))  \r\n' two_parameter_sets='parameter->forAll(parameterSet->forAll(s1, s2 | s1->size() = s2->size() implies s1.parameter->exists(p | not s2.parameter->includes(p))))'"
 * @generated
 */
public interface ParameterSet extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A constraint that should be satisfied for the owner of the Parameters in an input ParameterSet to start execution using the values provided for those Parameters, or the owner of the Parameters in an output ParameterSet to end execution providing the values for those Parameters, if all preconditions and conditions on input ParameterSets were satisfied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getParameterSet_Condition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='parameterSet'"
	 * @generated
	 */
	EList<Constraint> getCondition();

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Parameter}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Parameter#getParameterSet <em>Parameter Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameters in the ParameterSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getParameterSet_Parameter()
	 * @see uml.classification.Parameter#getParameterSet
	 * @model opposite="parameterSet" required="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // ParameterSet
