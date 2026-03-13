/**
 */
package raaml.hara.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.AbstractLibraryImpl;

import raaml.hara.AccidentScenario;
import raaml.hara.HaraPackage;
import raaml.hara.HazardousEvent;
import raaml.hara.ISO26262Library;
import raaml.hara.OperationalCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISO26262 Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.impl.ISO26262LibraryImpl#getOperationalConditions <em>Operational Conditions</em>}</li>
 *   <li>{@link raaml.hara.impl.ISO26262LibraryImpl#getHazardousEvents <em>Hazardous Events</em>}</li>
 *   <li>{@link raaml.hara.impl.ISO26262LibraryImpl#getAccidentScenarios <em>Accident Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISO26262LibraryImpl extends AbstractLibraryImpl implements ISO26262Library {
	/**
	 * The cached value of the '{@link #getOperationalConditions() <em>Operational Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCondition> operationalConditions;

	/**
	 * The cached value of the '{@link #getHazardousEvents() <em>Hazardous Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardousEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardousEvent> hazardousEvents;

	/**
	 * The cached value of the '{@link #getAccidentScenarios() <em>Accident Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<AccidentScenario> accidentScenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISO26262LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HaraPackage.Literals.ISO26262_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalCondition> getOperationalConditions() {
		if (operationalConditions == null) {
			operationalConditions = new EObjectContainmentEList<OperationalCondition>(OperationalCondition.class, this, HaraPackage.ISO26262_LIBRARY__OPERATIONAL_CONDITIONS);
		}
		return operationalConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HazardousEvent> getHazardousEvents() {
		if (hazardousEvents == null) {
			hazardousEvents = new EObjectContainmentEList<HazardousEvent>(HazardousEvent.class, this, HaraPackage.ISO26262_LIBRARY__HAZARDOUS_EVENTS);
		}
		return hazardousEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccidentScenario> getAccidentScenarios() {
		if (accidentScenarios == null) {
			accidentScenarios = new EObjectContainmentEList<AccidentScenario>(AccidentScenario.class, this, HaraPackage.ISO26262_LIBRARY__ACCIDENT_SCENARIOS);
		}
		return accidentScenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HaraPackage.ISO26262_LIBRARY__OPERATIONAL_CONDITIONS:
				return ((InternalEList<?>)getOperationalConditions()).basicRemove(otherEnd, msgs);
			case HaraPackage.ISO26262_LIBRARY__HAZARDOUS_EVENTS:
				return ((InternalEList<?>)getHazardousEvents()).basicRemove(otherEnd, msgs);
			case HaraPackage.ISO26262_LIBRARY__ACCIDENT_SCENARIOS:
				return ((InternalEList<?>)getAccidentScenarios()).basicRemove(otherEnd, msgs);
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
			case HaraPackage.ISO26262_LIBRARY__OPERATIONAL_CONDITIONS:
				return getOperationalConditions();
			case HaraPackage.ISO26262_LIBRARY__HAZARDOUS_EVENTS:
				return getHazardousEvents();
			case HaraPackage.ISO26262_LIBRARY__ACCIDENT_SCENARIOS:
				return getAccidentScenarios();
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
			case HaraPackage.ISO26262_LIBRARY__OPERATIONAL_CONDITIONS:
				getOperationalConditions().clear();
				getOperationalConditions().addAll((Collection<? extends OperationalCondition>)newValue);
				return;
			case HaraPackage.ISO26262_LIBRARY__HAZARDOUS_EVENTS:
				getHazardousEvents().clear();
				getHazardousEvents().addAll((Collection<? extends HazardousEvent>)newValue);
				return;
			case HaraPackage.ISO26262_LIBRARY__ACCIDENT_SCENARIOS:
				getAccidentScenarios().clear();
				getAccidentScenarios().addAll((Collection<? extends AccidentScenario>)newValue);
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
			case HaraPackage.ISO26262_LIBRARY__OPERATIONAL_CONDITIONS:
				getOperationalConditions().clear();
				return;
			case HaraPackage.ISO26262_LIBRARY__HAZARDOUS_EVENTS:
				getHazardousEvents().clear();
				return;
			case HaraPackage.ISO26262_LIBRARY__ACCIDENT_SCENARIOS:
				getAccidentScenarios().clear();
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
			case HaraPackage.ISO26262_LIBRARY__OPERATIONAL_CONDITIONS:
				return operationalConditions != null && !operationalConditions.isEmpty();
			case HaraPackage.ISO26262_LIBRARY__HAZARDOUS_EVENTS:
				return hazardousEvents != null && !hazardousEvents.isEmpty();
			case HaraPackage.ISO26262_LIBRARY__ACCIDENT_SCENARIOS:
				return accidentScenarios != null && !accidentScenarios.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISO26262LibraryImpl
