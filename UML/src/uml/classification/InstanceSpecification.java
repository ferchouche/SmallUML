/**
 */
package uml.classification;

import org.eclipse.emf.common.util.EList;

import uml.commonStructure.PackageableElement;

import uml.deployments.DeployedArtifact;
import uml.deployments.DeploymentTarget;

import uml.values.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InstanceSpecification is a model element that represents an instance in a modeled system. An InstanceSpecification can act as a DeploymentTarget in a Deployment relationship, in the case that it represents an instance of a Node. It can also act as a DeployedArtifact, if it represents an instance of an Artifact.
 * deploymentForArtifact->notEmpty() implies classifier->exists(oclIsKindOf(Artifact))
 * classifier->forAll(c | (c.allSlottableFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)))
 * slot->forAll(s | classifier->exists (c | c.allSlottableFeatures()->includes (s.definingFeature)))
 * deployment->notEmpty() implies classifier->exists(node | node.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p.type = node)))
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.classification.InstanceSpecification#getClassifier <em>Classifier</em>}</li>
 *   <li>{@link uml.classification.InstanceSpecification#getSlot <em>Slot</em>}</li>
 *   <li>{@link uml.classification.InstanceSpecification#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see uml.classification.ClassificationPackage#getInstanceSpecification()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='deployment_artifact structural_feature defining_feature deployment_target'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL deployment_artifact='deploymentForArtifact->notEmpty() implies classifier->exists(oclIsKindOf(Artifact))' structural_feature='classifier->forAll(c | (c.allSlottableFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)))' defining_feature='slot->forAll(s | classifier->exists (c | c.allSlottableFeatures()->includes (s.definingFeature)))' deployment_target='deployment->notEmpty() implies classifier->exists(node | node.oclIsKindOf(Node) and Node.allInstances()->exists(n | n.part->exists(p | p.type = node)))'"
 * @generated
 */
public interface InstanceSpecification extends DeploymentTarget, PackageableElement, DeployedArtifact {
	/**
	 * Returns the value of the '<em><b>Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.classification.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier or Classifiers of the represented instance. If multiple Classifiers are specified, the instance is classified by all of them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier</em>' reference list.
	 * @see uml.classification.ClassificationPackage#getInstanceSpecification_Classifier()
	 * @model ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='instanceSpecification'"
	 * @generated
	 */
	EList<Classifier> getClassifier();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference list.
	 * The list contents are of type {@link uml.classification.Slot}.
	 * It is bidirectional and its opposite is '{@link uml.classification.Slot#getOwningInstance <em>Owning Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Slot giving the value or values of a StructuralFeature of the instance. An InstanceSpecification can have one Slot per StructuralFeature of its Classifiers, including inherited features. It is not necessary to model a Slot for every StructuralFeature, in which case the InstanceSpecification is a partial description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference list.
	 * @see uml.classification.ClassificationPackage#getInstanceSpecification_Slot()
	 * @see uml.classification.Slot#getOwningInstance
	 * @model opposite="owningInstance" containment="true" ordered="false"
	 * @generated
	 */
	EList<Slot> getSlot();

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification of how to compute, derive, or construct the instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specification</em>' containment reference.
	 * @see #setSpecification(ValueSpecification)
	 * @see uml.classification.ClassificationPackage#getInstanceSpecification_Specification()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='owningInstanceSpec'"
	 * @generated
	 */
	ValueSpecification getSpecification();

	/**
	 * Sets the value of the '{@link uml.classification.InstanceSpecification#getSpecification <em>Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' containment reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(ValueSpecification value);

} // InstanceSpecification
