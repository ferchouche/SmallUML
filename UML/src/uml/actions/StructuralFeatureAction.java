/**
 */
package uml.actions;

import uml.classification.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * StructuralFeatureAction is an abstract class for all Actions that operate on StructuralFeatures.
 * object.is(1,1)
 * object.type.oclAsType(Classifier).allFeatures()->includes(structuralFeature) or
 * 	object.type.conformsTo(structuralFeature.oclAsType(Property).opposite.type)
 * structuralFeature.visibility = VisibilityKind::public or
 * _'context'.allFeatures()->includes(structuralFeature) or
 * structuralFeature.visibility=VisibilityKind::protected and
 * _'context'.conformsTo(structuralFeature.oclAsType(Property).opposite.type.oclAsType(Classifier))
 * 
 * not structuralFeature.isStatic
 * structuralFeature.featuringClassifier->size() = 1
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.StructuralFeatureAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml.actions.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getStructuralFeatureAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='multiplicity object_type visibility not_static one_featuring_classifier'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL multiplicity='object.is(1,1)' object_type='object.type.oclAsType(Classifier).allFeatures()->includes(structuralFeature) or\r\n\tobject.type.conformsTo(structuralFeature.oclAsType(Property).opposite.type)' visibility='structuralFeature.visibility = VisibilityKind::public or\n_\'context\'.allFeatures()->includes(structuralFeature) or\nstructuralFeature.visibility=VisibilityKind::protected and\n_\'context\'.conformsTo(structuralFeature.oclAsType(Property).opposite.type.oclAsType(Classifier))\n' not_static='not structuralFeature.isStatic' one_featuring_classifier='structuralFeature.featuringClassifier->size() = 1'"
 * @generated
 */
public interface StructuralFeatureAction extends Action {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The InputPin from which the object whose StructuralFeature is to be read or written is obtained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml.actions.ActionsPackage#getStructuralFeatureAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuralFeatureAction'"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml.actions.StructuralFeatureAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Structural Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StructuralFeature to be read or written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structural Feature</em>' reference.
	 * @see #setStructuralFeature(StructuralFeature)
	 * @see uml.actions.ActionsPackage#getStructuralFeatureAction_StructuralFeature()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='structuralFeatureAction'"
	 * @generated
	 */
	StructuralFeature getStructuralFeature();

	/**
	 * Sets the value of the '{@link uml.actions.StructuralFeatureAction#getStructuralFeature <em>Structural Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structural Feature</em>' reference.
	 * @see #getStructuralFeature()
	 * @generated
	 */
	void setStructuralFeature(StructuralFeature value);

} // StructuralFeatureAction
