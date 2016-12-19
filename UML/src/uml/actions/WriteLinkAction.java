/**
 */
package uml.actions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Write Link Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * WriteLinkAction is an abstract class for LinkActions that create and destroy links.
 * endData.end->exists(end |
 *   end.type=_'context' or
 *   end.visibility=VisibilityKind::public or 
 *   end.visibility=VisibilityKind::protected and
 *   endData.end->exists(other | 
 *     other<>end and _'context'.conformsTo(other.type.oclAsType(Classifier))))
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see uml.actions.ActionsPackage#getWriteLinkAction()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='allow_access'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL allow_access='endData.end->exists(end |\r\n  end.type=_\'context\' or\r\n  end.visibility=VisibilityKind::public or \r\n  end.visibility=VisibilityKind::protected and\r\n  endData.end->exists(other | \r\n    other<>end and _\'context\'.conformsTo(other.type.oclAsType(Classifier))))\r\n'"
 * @generated
 */
public interface WriteLinkAction extends LinkAction {
} // WriteLinkAction
