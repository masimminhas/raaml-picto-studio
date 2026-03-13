/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import raaml.core.CorePackage;
import raaml.core.HarmPotential;

import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Harm Potential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.HarmPotentialImpl#getUndesiredControlAction <em>Undesired Control Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HarmPotentialImpl extends CoreSafetyElementImpl implements HarmPotential {
	/**
	 * The cached value of the '{@link #getUndesiredControlAction() <em>Undesired Control Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndesiredControlAction()
	 * @generated
	 * @ordered
	 */
	protected EList<UndesiredControlAction> undesiredControlAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HarmPotentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.HARM_POTENTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UndesiredControlAction> getUndesiredControlAction() {
		if (undesiredControlAction == null) {
			undesiredControlAction = new EObjectResolvingEList<UndesiredControlAction>(UndesiredControlAction.class, this, CorePackage.HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION);
		}
		return undesiredControlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION:
				return getUndesiredControlAction();
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
			case CorePackage.HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION:
				getUndesiredControlAction().clear();
				getUndesiredControlAction().addAll((Collection<? extends UndesiredControlAction>)newValue);
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
			case CorePackage.HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION:
				getUndesiredControlAction().clear();
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
			case CorePackage.HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION:
				return undesiredControlAction != null && !undesiredControlAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HarmPotentialImpl
