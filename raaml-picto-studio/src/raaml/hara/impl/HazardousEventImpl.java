/**
 */
package raaml.hara.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.Hazard;

import raaml.core.impl.AbstractRiskImpl;

import raaml.hara.ASIL;
import raaml.hara.AccidentScenario;
import raaml.hara.HaraPackage;
import raaml.hara.HazardousEvent;
import raaml.hara.SystemLevelEffect;
import raaml.hara.VehicleLevelEffect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazardous Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.impl.HazardousEventImpl#getASIL <em>ASIL</em>}</li>
 *   <li>{@link raaml.hara.impl.HazardousEventImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link raaml.hara.impl.HazardousEventImpl#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link raaml.hara.impl.HazardousEventImpl#getVehicleLevelEffects <em>Vehicle Level Effects</em>}</li>
 *   <li>{@link raaml.hara.impl.HazardousEventImpl#getSystemLevelEffects <em>System Level Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class HazardousEventImpl extends AbstractRiskImpl implements HazardousEvent {
	/**
	 * The cached value of the '{@link #getASIL() <em>ASIL</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASIL()
	 * @generated
	 * @ordered
	 */
	protected EList<ASIL> asil;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<AccidentScenario> scenarios;

	/**
	 * The cached value of the '{@link #getVehicleLevelEffects() <em>Vehicle Level Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleLevelEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<VehicleLevelEffect> vehicleLevelEffects;

	/**
	 * The cached value of the '{@link #getSystemLevelEffects() <em>System Level Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemLevelEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemLevelEffect> systemLevelEffects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardousEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HaraPackage.Literals.HAZARDOUS_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASIL> getASIL() {
		if (asil == null) {
			asil = new EDataTypeUniqueEList<ASIL>(ASIL.class, this, HaraPackage.HAZARDOUS_EVENT__ASIL);
		}
		return asil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectContainmentEList<Hazard>(Hazard.class, this, HaraPackage.HAZARDOUS_EVENT__HAZARDS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccidentScenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<AccidentScenario>(AccidentScenario.class, this, HaraPackage.HAZARDOUS_EVENT__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VehicleLevelEffect> getVehicleLevelEffects() {
		if (vehicleLevelEffects == null) {
			vehicleLevelEffects = new EObjectContainmentEList<VehicleLevelEffect>(VehicleLevelEffect.class, this, HaraPackage.HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS);
		}
		return vehicleLevelEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemLevelEffect> getSystemLevelEffects() {
		if (systemLevelEffects == null) {
			systemLevelEffects = new EObjectContainmentEList<SystemLevelEffect>(SystemLevelEffect.class, this, HaraPackage.HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS);
		}
		return systemLevelEffects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HaraPackage.HAZARDOUS_EVENT__HAZARDS:
				return ((InternalEList<?>)getHazards()).basicRemove(otherEnd, msgs);
			case HaraPackage.HAZARDOUS_EVENT__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
			case HaraPackage.HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS:
				return ((InternalEList<?>)getVehicleLevelEffects()).basicRemove(otherEnd, msgs);
			case HaraPackage.HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS:
				return ((InternalEList<?>)getSystemLevelEffects()).basicRemove(otherEnd, msgs);
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
			case HaraPackage.HAZARDOUS_EVENT__ASIL:
				return getASIL();
			case HaraPackage.HAZARDOUS_EVENT__HAZARDS:
				return getHazards();
			case HaraPackage.HAZARDOUS_EVENT__SCENARIOS:
				return getScenarios();
			case HaraPackage.HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS:
				return getVehicleLevelEffects();
			case HaraPackage.HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS:
				return getSystemLevelEffects();
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
			case HaraPackage.HAZARDOUS_EVENT__ASIL:
				getASIL().clear();
				getASIL().addAll((Collection<? extends ASIL>)newValue);
				return;
			case HaraPackage.HAZARDOUS_EVENT__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
				return;
			case HaraPackage.HAZARDOUS_EVENT__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends AccidentScenario>)newValue);
				return;
			case HaraPackage.HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS:
				getVehicleLevelEffects().clear();
				getVehicleLevelEffects().addAll((Collection<? extends VehicleLevelEffect>)newValue);
				return;
			case HaraPackage.HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS:
				getSystemLevelEffects().clear();
				getSystemLevelEffects().addAll((Collection<? extends SystemLevelEffect>)newValue);
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
			case HaraPackage.HAZARDOUS_EVENT__ASIL:
				getASIL().clear();
				return;
			case HaraPackage.HAZARDOUS_EVENT__HAZARDS:
				getHazards().clear();
				return;
			case HaraPackage.HAZARDOUS_EVENT__SCENARIOS:
				getScenarios().clear();
				return;
			case HaraPackage.HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS:
				getVehicleLevelEffects().clear();
				return;
			case HaraPackage.HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS:
				getSystemLevelEffects().clear();
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
			case HaraPackage.HAZARDOUS_EVENT__ASIL:
				return asil != null && !asil.isEmpty();
			case HaraPackage.HAZARDOUS_EVENT__HAZARDS:
				return hazards != null && !hazards.isEmpty();
			case HaraPackage.HAZARDOUS_EVENT__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
			case HaraPackage.HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS:
				return vehicleLevelEffects != null && !vehicleLevelEffects.isEmpty();
			case HaraPackage.HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS:
				return systemLevelEffects != null && !systemLevelEffects.isEmpty();
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
		result.append(" (ASIL: ");
		result.append(asil);
		result.append(')');
		return result.toString();
	}

} //HazardousEventImpl
