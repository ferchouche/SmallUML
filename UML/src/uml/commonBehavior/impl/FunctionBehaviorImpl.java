/**
 */
package uml.commonBehavior.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import uml.commonBehavior.CommonBehaviorPackage;
import uml.commonBehavior.FunctionBehavior;

import uml.simpleClassifiers.DataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionBehaviorImpl extends OpaqueBehaviorImpl implements FunctionBehavior {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionBehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonBehaviorPackage.Literals.FUNCTION_BEHAVIOR;
	}

	/**
	 * The cached invocation delegate for the '{@link #hasAllDataTypeAttributes(uml.simpleClassifiers.DataType) <em>Has All Data Type Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #hasAllDataTypeAttributes(uml.simpleClassifiers.DataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate HAS_ALL_DATA_TYPE_ATTRIBUTES_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)CommonBehaviorPackage.Literals.FUNCTION_BEHAVIOR___HAS_ALL_DATA_TYPE_ATTRIBUTES__DATATYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasAllDataTypeAttributes(DataType d) {
		try {
			return (Boolean)HAS_ALL_DATA_TYPE_ATTRIBUTES_DATA_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{d}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommonBehaviorPackage.FUNCTION_BEHAVIOR___HAS_ALL_DATA_TYPE_ATTRIBUTES__DATATYPE:
				return hasAllDataTypeAttributes((DataType)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //FunctionBehaviorImpl
