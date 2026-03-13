/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import raaml.core.CorePackage;
import raaml.core.Factor;
import raaml.core.ProcessModelFlaw;

import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process Model Flaw</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.ProcessModelFlawImpl#getCausalFactor <em>Causal Factor</em>}</li>
 *   <li>{@link raaml.core.impl.ProcessModelFlawImpl#getUndesiredControlAction <em>Undesired Control Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessModelFlawImpl extends AnySituationImpl implements ProcessModelFlaw {
	/**
	 * The cached value of the '{@link #getCausalFactor() <em>Causal Factor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalFactor()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> causalFactor;

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
	protected ProcessModelFlawImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.PROCESS_MODEL_FLAW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Factor> getCausalFactor() {
		if (causalFactor == null) {
			causalFactor = new EObjectResolvingEList<Factor>(Factor.class, this, CorePackage.PROCESS_MODEL_FLAW__CAUSAL_FACTOR);
		}
		return causalFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UndesiredControlAction> getUndesiredControlAction() {
		if (undesiredControlAction == null) {
			undesiredControlAction = new EObjectResolvingEList<UndesiredControlAction>(UndesiredControlAction.class, this, CorePackage.PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION);
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
			case CorePackage.PROCESS_MODEL_FLAW__CAUSAL_FACTOR:
				return getCausalFactor();
			case CorePackage.PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION:
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
			case CorePackage.PROCESS_MODEL_FLAW__CAUSAL_FACTOR:
				getCausalFactor().clear();
				getCausalFactor().addAll((Collection<? extends Factor>)newValue);
				return;
			case CorePackage.PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION:
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
			case CorePackage.PROCESS_MODEL_FLAW__CAUSAL_FACTOR:
				getCausalFactor().clear();
				return;
			case CorePackage.PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION:
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
			case CorePackage.PROCESS_MODEL_FLAW__CAUSAL_FACTOR:
				return causalFactor != null && !causalFactor.isEmpty();
			case CorePackage.PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION:
				return undesiredControlAction != null && !undesiredControlAction.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessModelFlawImpl
