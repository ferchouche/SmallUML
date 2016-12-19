/**
 */
package uml.commonBehavior.impl;

import org.eclipse.emf.ecore.EClass;

import uml.commonBehavior.CommonBehaviorPackage;
import uml.commonBehavior.Event;

import uml.commonStructure.impl.PackageableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EventImpl extends PackageableElementImpl implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonBehaviorPackage.Literals.EVENT;
	}

} //EventImpl
