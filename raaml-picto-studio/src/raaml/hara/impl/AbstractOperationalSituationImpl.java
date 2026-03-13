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

import raaml.hara.AbstractOperationalSituation;
import raaml.hara.Exposure;
import raaml.hara.HaraPackage;
import raaml.hara.OperationalCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Operational Situation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.impl.AbstractOperationalSituationImpl#getExposure <em>Exposure</em>}</li>
 *   <li>{@link raaml.hara.impl.AbstractOperationalSituationImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractOperationalSituationImpl extends OperationalConditionImpl implements AbstractOperationalSituation {
	/**
	 * The default value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected static final Exposure EXPOSURE_EDEFAULT = Exposure.E0;

	/**
	 * The cached value of the '{@link #getExposure() <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposure()
	 * @generated
	 * @ordered
	 */
	protected Exposure exposure = EXPOSURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalCondition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractOperationalSituationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HaraPackage.Literals.ABSTRACT_OPERATIONAL_SITUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exposure getExposure() {
		return exposure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExposure(Exposure newExposure) {
		Exposure oldExposure = exposure;
		exposure = newExposure == null ? EXPOSURE_EDEFAULT : newExposure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE, oldExposure, exposure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalCondition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<OperationalCondition>(OperationalCondition.class, this, HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE:
				return getExposure();
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS:
				return getConditions();
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
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE:
				setExposure((Exposure)newValue);
				return;
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends OperationalCondition>)newValue);
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
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE:
				setExposure(EXPOSURE_EDEFAULT);
				return;
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS:
				getConditions().clear();
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
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE:
				return exposure != EXPOSURE_EDEFAULT;
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
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
		result.append(" (exposure: ");
		result.append(exposure);
		result.append(')');
		return result.toString();
	}

} //AbstractOperationalSituationImpl
