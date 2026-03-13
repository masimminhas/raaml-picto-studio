/**
 */
package raaml.hara.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.DysfunctionalEventImpl;

import raaml.hara.AbstractOperationalSituation;
import raaml.hara.AccidentScenario;
import raaml.hara.AnyMalfunction;
import raaml.hara.Controllability;
import raaml.hara.HaraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accident Scenario</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.impl.AccidentScenarioImpl#getControllability <em>Controllability</em>}</li>
 *   <li>{@link raaml.hara.impl.AccidentScenarioImpl#getSituations <em>Situations</em>}</li>
 *   <li>{@link raaml.hara.impl.AccidentScenarioImpl#getMalfunctioningBehaviors <em>Malfunctioning Behaviors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccidentScenarioImpl extends DysfunctionalEventImpl implements AccidentScenario {
	/**
	 * The default value of the '{@link #getControllability() <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllability()
	 * @generated
	 * @ordered
	 */
	protected static final Controllability CONTROLLABILITY_EDEFAULT = Controllability.C0;

	/**
	 * The cached value of the '{@link #getControllability() <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllability()
	 * @generated
	 * @ordered
	 */
	protected Controllability controllability = CONTROLLABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSituations() <em>Situations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSituations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractOperationalSituation> situations;

	/**
	 * The cached value of the '{@link #getMalfunctioningBehaviors() <em>Malfunctioning Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalfunctioningBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<AnyMalfunction> malfunctioningBehaviors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccidentScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HaraPackage.Literals.ACCIDENT_SCENARIO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controllability getControllability() {
		return controllability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControllability(Controllability newControllability) {
		Controllability oldControllability = controllability;
		controllability = newControllability == null ? CONTROLLABILITY_EDEFAULT : newControllability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HaraPackage.ACCIDENT_SCENARIO__CONTROLLABILITY, oldControllability, controllability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractOperationalSituation> getSituations() {
		if (situations == null) {
			situations = new EObjectContainmentEList<AbstractOperationalSituation>(AbstractOperationalSituation.class, this, HaraPackage.ACCIDENT_SCENARIO__SITUATIONS);
		}
		return situations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnyMalfunction> getMalfunctioningBehaviors() {
		if (malfunctioningBehaviors == null) {
			malfunctioningBehaviors = new EObjectContainmentEList<AnyMalfunction>(AnyMalfunction.class, this, HaraPackage.ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS);
		}
		return malfunctioningBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HaraPackage.ACCIDENT_SCENARIO__SITUATIONS:
				return ((InternalEList<?>)getSituations()).basicRemove(otherEnd, msgs);
			case HaraPackage.ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS:
				return ((InternalEList<?>)getMalfunctioningBehaviors()).basicRemove(otherEnd, msgs);
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
			case HaraPackage.ACCIDENT_SCENARIO__CONTROLLABILITY:
				return getControllability();
			case HaraPackage.ACCIDENT_SCENARIO__SITUATIONS:
				return getSituations();
			case HaraPackage.ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS:
				return getMalfunctioningBehaviors();
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
			case HaraPackage.ACCIDENT_SCENARIO__CONTROLLABILITY:
				setControllability((Controllability)newValue);
				return;
			case HaraPackage.ACCIDENT_SCENARIO__SITUATIONS:
				getSituations().clear();
				getSituations().addAll((Collection<? extends AbstractOperationalSituation>)newValue);
				return;
			case HaraPackage.ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS:
				getMalfunctioningBehaviors().clear();
				getMalfunctioningBehaviors().addAll((Collection<? extends AnyMalfunction>)newValue);
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
			case HaraPackage.ACCIDENT_SCENARIO__CONTROLLABILITY:
				setControllability(CONTROLLABILITY_EDEFAULT);
				return;
			case HaraPackage.ACCIDENT_SCENARIO__SITUATIONS:
				getSituations().clear();
				return;
			case HaraPackage.ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS:
				getMalfunctioningBehaviors().clear();
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
			case HaraPackage.ACCIDENT_SCENARIO__CONTROLLABILITY:
				return controllability != CONTROLLABILITY_EDEFAULT;
			case HaraPackage.ACCIDENT_SCENARIO__SITUATIONS:
				return situations != null && !situations.isEmpty();
			case HaraPackage.ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS:
				return malfunctioningBehaviors != null && !malfunctioningBehaviors.isEmpty();
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
		result.append(" (controllability: ");
		result.append(controllability);
		result.append(')');
		return result.toString();
	}

} //AccidentScenarioImpl
