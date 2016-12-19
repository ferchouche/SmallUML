/**
 */
package uml.classification;

import uml.commonStructure.TemplateParameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OperationTemplateParameter exposes an Operation as a formal parameter for a template.
 * default->notEmpty() implies (default.oclIsKindOf(Operation) and (let defaultOp : Operation = default.oclAsType(Operation) in 
 *     defaultOp.ownedParameter->size() = parameteredElement.ownedParameter->size() and
 *     Sequence{1.. defaultOp.ownedParameter->size()}->forAll( ix | 
 *         let p1: Parameter = defaultOp.ownedParameter->at(ix), p2 : Parameter = parameteredElement.ownedParameter->at(ix) in
 *           p1.type = p2.type and p1.upper = p2.upper and p1.lower = p2.lower and p1.direction = p2.direction and p1.isOrdered = p2.isOrdered and p1.isUnique = p2.isUnique)))
 * <!-- end-model-doc -->
 *
 *
 * @see uml.classification.ClassificationPackage#getOperationTemplateParameter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='match_default_signature'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL match_default_signature='default->notEmpty() implies (default.oclIsKindOf(Operation) and (let defaultOp : Operation = default.oclAsType(Operation) in \r\n    defaultOp.ownedParameter->size() = parameteredElement.ownedParameter->size() and\r\n    Sequence{1.. defaultOp.ownedParameter->size()}->forAll( ix | \r\n        let p1: Parameter = defaultOp.ownedParameter->at(ix), p2 : Parameter = parameteredElement.ownedParameter->at(ix) in\r\n          p1.type = p2.type and p1.upper = p2.upper and p1.lower = p2.lower and p1.direction = p2.direction and p1.isOrdered = p2.isOrdered and p1.isUnique = p2.isUnique)))'"
 * @generated
 */
public interface OperationTemplateParameter extends TemplateParameter {
} // OperationTemplateParameter
