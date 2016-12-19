/**
 */
package uml.packages;

import uml.classification.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extension end is used to tie an extension to a stereotype when extending a metaclass.
 * The default multiplicity of an extension end is 0..1.
 * (lowerBound() = 0 or lowerBound() = 1) and upperBound() = 1
 * self.aggregation = AggregationKind::composite
 * <!-- end-model-doc -->
 *
 *
 * @see uml.packages.PackagesPackage#getExtensionEnd()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity aggregation'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='(lowerBound() = 0 or lowerBound() = 1) and upperBound() = 1' aggregation='self.aggregation = AggregationKind::composite'"
 * @generated
 */
public interface ExtensionEnd extends Property {
} // ExtensionEnd
