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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.FactorImpl#getProcessModelFlaw <em>Process Model Flaw</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FactorImpl extends AnySituationImpl implements Factor {
	/**
	 * The cached value of the '{@link #getProcessModelFlaw() <em>Process Model Flaw</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModelFlaw()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModelFlaw> processModelFlaw;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModelFlaw> getProcessModelFlaw() {
		if (processModelFlaw == null) {
			processModelFlaw = new EObjectResolvingEList<ProcessModelFlaw>(ProcessModelFlaw.class, this, CorePackage.FACTOR__PROCESS_MODEL_FLAW);
		}
		return processModelFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.FACTOR__PROCESS_MODEL_FLAW:
				return getProcessModelFlaw();
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
			case CorePackage.FACTOR__PROCESS_MODEL_FLAW:
				getProcessModelFlaw().clear();
				getProcessModelFlaw().addAll((Collection<? extends ProcessModelFlaw>)newValue);
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
			case CorePackage.FACTOR__PROCESS_MODEL_FLAW:
				getProcessModelFlaw().clear();
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
			case CorePackage.FACTOR__PROCESS_MODEL_FLAW:
				return processModelFlaw != null && !processModelFlaw.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactorImpl
