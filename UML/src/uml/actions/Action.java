/**
 */
package uml.actions;

import org.eclipse.emf.common.util.EList;

import uml.activities.ActivityNode;
import uml.activities.ExecutableNode;

import uml.classification.Classifier;

import uml.commonBehavior.Behavior;

import uml.commonStructure.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Action is the fundamental unit of executable functionality. The execution of an Action represents some transformation or processing in the modeled system. Actions provide the ExecutableNodes within Activities and may also be used within Interactions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.actions.Action#getContext <em>Context</em>}</li>
 *   <li>{@link uml.actions.Action#getInput <em>Input</em>}</li>
 *   <li>{@link uml.actions.Action#isIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link uml.actions.Action#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link uml.actions.Action#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link uml.actions.Action#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see uml.actions.ActionsPackage#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The context Classifier of the Behavior that contains this Action, or the Behavior itself if it has no context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see uml.actions.ActionsPackage#getAction_Context()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='action'"
	 * @generated
	 */
	Classifier getContext();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of InputPins representing the inputs to the Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see uml.actions.ActionsPackage#getAction_Input()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='action'"
	 * @generated
	 */
	EList<InputPin> getInput();

	/**
	 * Returns the value of the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Action can begin a new, concurrent execution, even if there is already another execution of the Action ongoing. If false, the Action cannot begin a new execution until any previous execution has completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Locally Reentrant</em>' attribute.
	 * @see #setIsLocallyReentrant(boolean)
	 * @see uml.actions.ActionsPackage#getAction_IsLocallyReentrant()
	 * @model default="false" dataType="types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsLocallyReentrant();

	/**
	 * Sets the value of the '{@link uml.actions.Action#isIsLocallyReentrant <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locally Reentrant</em>' attribute.
	 * @see #isIsLocallyReentrant()
	 * @generated
	 */
	void setIsLocallyReentrant(boolean value);

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Constraint that must be satisfied when execution of the Action is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getAction_LocalPostcondition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='action'"
	 * @generated
	 */
	EList<Constraint> getLocalPostcondition();

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link uml.commonStructure.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Constraint that must be satisfied when execution of the Action is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see uml.actions.ActionsPackage#getAction_LocalPrecondition()
	 * @model containment="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='action'"
	 * @generated
	 */
	EList<Constraint> getLocalPrecondition();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link uml.actions.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of OutputPins representing outputs from the Action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see uml.actions.ActionsPackage#getAction_Output()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='action'"
	 * @generated
	 */
	EList<OutputPin> getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derivation for the context property.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='let behavior: Behavior = self.containingBehavior() in\r\nif behavior=null then null\r\nelse if behavior._\'context\' = null then behavior\r\nelse behavior._\'context\'\r\nendif\r\nendif'"
	 * @generated
	 */
	Classifier context();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return this Action and all Actions contained directly or indirectly in it. By default only the Action itself is returned, but the operation is overridden for StructuredActivityNodes.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='self->asSet()'"
	 * @generated
	 */
	EList<Action> allActions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns all the ActivityNodes directly or indirectly owned by this Action. This includes at least all the Pins of the Action.
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='input.oclAsType(Pin)->asSet()->union(output->asSet())'"
	 * @generated
	 */
	EList<ActivityNode> allOwnedNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL body='if inStructuredNode<>null then inStructuredNode.containingBehavior() \r\nelse if activity<>null then activity\r\nelse interaction \r\nendif\r\nendif'"
	 * @generated
	 */
	Behavior containingBehavior();

} // Action
