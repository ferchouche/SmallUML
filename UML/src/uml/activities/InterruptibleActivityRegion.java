/**
 */
package uml.activities;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An InterruptibleActivityRegion is an ActivityGroup that supports the termination of tokens flowing in the portions of an activity within it.
 * interruptingEdge->forAll(edge | 
 *   node->includes(edge.source) and node->excludes(edge.target) and edge.target.containingActivity() = inActivity)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.activities.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 *   <li>{@link uml.activities.InterruptibleActivityRegion#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see uml.activities.ActivitiesPackage#getInterruptibleActivityRegion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='interrupting_edges'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL interrupting_edges='interruptingEdge->forAll(edge | \r\n  node->includes(edge.source) and node->excludes(edge.target) and edge.target.containingActivity() = inActivity)'"
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ActivityEdges leaving the InterruptibleActivityRegion on which a traversing token will result in the termination of other tokens flowing in the InterruptibleActivityRegion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getInterruptibleActivityRegion_InterruptingEdge()
	 * @see uml.activities.ActivityEdge#getInterrupts
	 * @model opposite="interrupts" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getInterruptingEdge();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link uml.activities.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml.activities.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityNodes immediately contained in the InterruptibleActivityRegion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see uml.activities.ActivitiesPackage#getInterruptibleActivityRegion_Node()
	 * @see uml.activities.ActivityNode#getInInterruptibleRegion
	 * @model opposite="inInterruptibleRegion" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

} // InterruptibleActivityRegion
