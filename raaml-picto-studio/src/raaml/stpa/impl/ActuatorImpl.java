/**
 */
package raaml.stpa.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.Actuator;
import raaml.stpa.ControlAction;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.ActuatorImpl#getExecutedActions <em>Executed Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends CoreSafetyElementImpl implements Actuator {
	/**
	 * The cached value of the '{@link #getExecutedActions() <em>Executed Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> executedActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.ACTUATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlAction> getExecutedActions() {
		if (executedActions == null) {
			executedActions = new EObjectResolvingEList<ControlAction>(ControlAction.class, this, StpaPackage.ACTUATOR__EXECUTED_ACTIONS);
		}
		return executedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StpaPackage.ACTUATOR__EXECUTED_ACTIONS:
				return getExecutedActions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StpaPackage.ACTUATOR__EXECUTED_ACTIONS:
				getExecutedActions().clear();
				getExecutedActions().addAll((Collection<? extends ControlAction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StpaPackage.ACTUATOR__EXECUTED_ACTIONS:
				getExecutedActions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StpaPackage.ACTUATOR__EXECUTED_ACTIONS:
				return executedActions != null && !executedActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActuatorImpl
