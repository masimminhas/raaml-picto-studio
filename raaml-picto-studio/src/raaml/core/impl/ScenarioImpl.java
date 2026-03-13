/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.AbstractEvent;
import raaml.core.AnySituation;
import raaml.core.CorePackage;
import raaml.core.Scenario;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.ScenarioImpl#getScenarioSteps <em>Scenario Steps</em>}</li>
 *   <li>{@link raaml.core.impl.ScenarioImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ScenarioImpl extends AnySituationImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getScenarioSteps() <em>Scenario Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarioSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<AnySituation> scenarioSteps;

	/**
	 * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggers()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEvent> triggers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnySituation> getScenarioSteps() {
		if (scenarioSteps == null) {
			scenarioSteps = new EObjectContainmentEList<AnySituation>(AnySituation.class, this, CorePackage.SCENARIO__SCENARIO_STEPS);
		}
		return scenarioSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractEvent> getTriggers() {
		if (triggers == null) {
			triggers = new EObjectContainmentEList<AbstractEvent>(AbstractEvent.class, this, CorePackage.SCENARIO__TRIGGERS);
		}
		return triggers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SCENARIO__SCENARIO_STEPS:
				return ((InternalEList<?>)getScenarioSteps()).basicRemove(otherEnd, msgs);
			case CorePackage.SCENARIO__TRIGGERS:
				return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SCENARIO__SCENARIO_STEPS:
				return getScenarioSteps();
			case CorePackage.SCENARIO__TRIGGERS:
				return getTriggers();
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
			case CorePackage.SCENARIO__SCENARIO_STEPS:
				getScenarioSteps().clear();
				getScenarioSteps().addAll((Collection<? extends AnySituation>)newValue);
				return;
			case CorePackage.SCENARIO__TRIGGERS:
				getTriggers().clear();
				getTriggers().addAll((Collection<? extends AbstractEvent>)newValue);
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
			case CorePackage.SCENARIO__SCENARIO_STEPS:
				getScenarioSteps().clear();
				return;
			case CorePackage.SCENARIO__TRIGGERS:
				getTriggers().clear();
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
			case CorePackage.SCENARIO__SCENARIO_STEPS:
				return scenarioSteps != null && !scenarioSteps.isEmpty();
			case CorePackage.SCENARIO__TRIGGERS:
				return triggers != null && !triggers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ScenarioImpl
