/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.AbstractEffect;
import raaml.core.AbstractRisk;
import raaml.core.CorePackage;
import raaml.core.HarmPotential;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Risk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.AbstractRiskImpl#getRiskScore <em>Risk Score</em>}</li>
 *   <li>{@link raaml.core.impl.AbstractRiskImpl#getHarmPotentials <em>Harm Potentials</em>}</li>
 *   <li>{@link raaml.core.impl.AbstractRiskImpl#getHarms <em>Harms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRiskImpl extends ScenarioImpl implements AbstractRisk {
	/**
	 * The default value of the '{@link #getRiskScore() <em>Risk Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskScore()
	 * @generated
	 * @ordered
	 */
	protected static final double RISK_SCORE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRiskScore() <em>Risk Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskScore()
	 * @generated
	 * @ordered
	 */
	protected double riskScore = RISK_SCORE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHarmPotentials() <em>Harm Potentials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmPotentials()
	 * @generated
	 * @ordered
	 */
	protected EList<HarmPotential> harmPotentials;

	/**
	 * The cached value of the '{@link #getHarms() <em>Harms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarms()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEffect> harms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractRiskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_RISK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRiskScore() {
		return riskScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskScore(double newRiskScore) {
		double oldRiskScore = riskScore;
		riskScore = newRiskScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_RISK__RISK_SCORE, oldRiskScore, riskScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HarmPotential> getHarmPotentials() {
		if (harmPotentials == null) {
			harmPotentials = new EObjectContainmentEList<HarmPotential>(HarmPotential.class, this, CorePackage.ABSTRACT_RISK__HARM_POTENTIALS);
		}
		return harmPotentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractEffect> getHarms() {
		if (harms == null) {
			harms = new EObjectContainmentEList<AbstractEffect>(AbstractEffect.class, this, CorePackage.ABSTRACT_RISK__HARMS);
		}
		return harms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ABSTRACT_RISK__HARM_POTENTIALS:
				return ((InternalEList<?>)getHarmPotentials()).basicRemove(otherEnd, msgs);
			case CorePackage.ABSTRACT_RISK__HARMS:
				return ((InternalEList<?>)getHarms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ABSTRACT_RISK__RISK_SCORE:
				return getRiskScore();
			case CorePackage.ABSTRACT_RISK__HARM_POTENTIALS:
				return getHarmPotentials();
			case CorePackage.ABSTRACT_RISK__HARMS:
				return getHarms();
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
			case CorePackage.ABSTRACT_RISK__RISK_SCORE:
				setRiskScore((Double)newValue);
				return;
			case CorePackage.ABSTRACT_RISK__HARM_POTENTIALS:
				getHarmPotentials().clear();
				getHarmPotentials().addAll((Collection<? extends HarmPotential>)newValue);
				return;
			case CorePackage.ABSTRACT_RISK__HARMS:
				getHarms().clear();
				getHarms().addAll((Collection<? extends AbstractEffect>)newValue);
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
			case CorePackage.ABSTRACT_RISK__RISK_SCORE:
				setRiskScore(RISK_SCORE_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_RISK__HARM_POTENTIALS:
				getHarmPotentials().clear();
				return;
			case CorePackage.ABSTRACT_RISK__HARMS:
				getHarms().clear();
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
			case CorePackage.ABSTRACT_RISK__RISK_SCORE:
				return riskScore != RISK_SCORE_EDEFAULT;
			case CorePackage.ABSTRACT_RISK__HARM_POTENTIALS:
				return harmPotentials != null && !harmPotentials.isEmpty();
			case CorePackage.ABSTRACT_RISK__HARMS:
				return harms != null && !harms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (riskScore: ");
		result.append(riskScore);
		result.append(')');
		return result.toString();
	}

} //AbstractRiskImpl
