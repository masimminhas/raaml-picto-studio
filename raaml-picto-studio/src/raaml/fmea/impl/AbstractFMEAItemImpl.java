/**
 */
package raaml.fmea.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.AbstractCause;
import raaml.core.AbstractEffect;
import raaml.core.AbstractFailureMode;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.fmea.AbstractFMEAItem;
import raaml.fmea.FmeaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract FMEA Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.impl.AbstractFMEAItemImpl#getRPN <em>RPN</em>}</li>
 *   <li>{@link raaml.fmea.impl.AbstractFMEAItemImpl#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link raaml.fmea.impl.AbstractFMEAItemImpl#getFinalEffect <em>Final Effect</em>}</li>
 *   <li>{@link raaml.fmea.impl.AbstractFMEAItemImpl#getCause <em>Cause</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFMEAItemImpl extends CoreSafetyElementImpl implements AbstractFMEAItem {
	/**
	 * The default value of the '{@link #getRPN() <em>RPN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPN()
	 * @generated
	 * @ordered
	 */
	protected static final double RPN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRPN() <em>RPN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPN()
	 * @generated
	 * @ordered
	 */
	protected double rpn = RPN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFailureMode> failureMode;

	/**
	 * The cached value of the '{@link #getFinalEffect() <em>Final Effect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalEffect()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEffect> finalEffect;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCause> cause;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractFMEAItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.ABSTRACT_FMEA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getRPN() {
		return rpn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRPN(double newRPN) {
		double oldRPN = rpn;
		rpn = newRPN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.ABSTRACT_FMEA_ITEM__RPN, oldRPN, rpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFailureMode> getFailureMode() {
		if (failureMode == null) {
			failureMode = new EObjectContainmentEList<AbstractFailureMode>(AbstractFailureMode.class, this, FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE);
		}
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractEffect> getFinalEffect() {
		if (finalEffect == null) {
			finalEffect = new EObjectContainmentEList<AbstractEffect>(AbstractEffect.class, this, FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT);
		}
		return finalEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCause> getCause() {
		if (cause == null) {
			cause = new EObjectContainmentEList<AbstractCause>(AbstractCause.class, this, FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE);
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE:
				return ((InternalEList<?>)getFailureMode()).basicRemove(otherEnd, msgs);
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT:
				return ((InternalEList<?>)getFinalEffect()).basicRemove(otherEnd, msgs);
			case FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE:
				return ((InternalEList<?>)getCause()).basicRemove(otherEnd, msgs);
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
			case FmeaPackage.ABSTRACT_FMEA_ITEM__RPN:
				return getRPN();
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE:
				return getFailureMode();
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT:
				return getFinalEffect();
			case FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE:
				return getCause();
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
			case FmeaPackage.ABSTRACT_FMEA_ITEM__RPN:
				setRPN((Double)newValue);
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE:
				getFailureMode().clear();
				getFailureMode().addAll((Collection<? extends AbstractFailureMode>)newValue);
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT:
				getFinalEffect().clear();
				getFinalEffect().addAll((Collection<? extends AbstractEffect>)newValue);
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE:
				getCause().clear();
				getCause().addAll((Collection<? extends AbstractCause>)newValue);
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
			case FmeaPackage.ABSTRACT_FMEA_ITEM__RPN:
				setRPN(RPN_EDEFAULT);
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE:
				getFailureMode().clear();
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT:
				getFinalEffect().clear();
				return;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE:
				getCause().clear();
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
			case FmeaPackage.ABSTRACT_FMEA_ITEM__RPN:
				return rpn != RPN_EDEFAULT;
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FAILURE_MODE:
				return failureMode != null && !failureMode.isEmpty();
			case FmeaPackage.ABSTRACT_FMEA_ITEM__FINAL_EFFECT:
				return finalEffect != null && !finalEffect.isEmpty();
			case FmeaPackage.ABSTRACT_FMEA_ITEM__CAUSE:
				return cause != null && !cause.isEmpty();
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
		result.append(" (RPN: ");
		result.append(rpn);
		result.append(')');
		return result.toString();
	}

} //AbstractFMEAItemImpl
