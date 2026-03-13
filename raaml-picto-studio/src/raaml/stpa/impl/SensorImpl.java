/**
 */
package raaml.stpa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.Feedback;
import raaml.stpa.Sensor;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.SensorImpl#getProvidedFeedback <em>Provided Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends CoreSafetyElementImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getProvidedFeedback() <em>Provided Feedback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> providedFeedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feedback> getProvidedFeedback() {
		if (providedFeedback == null) {
			providedFeedback = new EObjectContainmentEList<Feedback>(Feedback.class, this, StpaPackage.SENSOR__PROVIDED_FEEDBACK);
		}
		return providedFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.SENSOR__PROVIDED_FEEDBACK:
				return ((InternalEList<?>)getProvidedFeedback()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.SENSOR__PROVIDED_FEEDBACK:
				return getProvidedFeedback();
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
			case StpaPackage.SENSOR__PROVIDED_FEEDBACK:
				getProvidedFeedback().clear();
				getProvidedFeedback().addAll((Collection<? extends Feedback>)newValue);
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
			case StpaPackage.SENSOR__PROVIDED_FEEDBACK:
				getProvidedFeedback().clear();
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
			case StpaPackage.SENSOR__PROVIDED_FEEDBACK:
				return providedFeedback != null && !providedFeedback.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SensorImpl
