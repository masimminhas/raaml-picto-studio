/**
 */
package raaml.fmea.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.fmea.FmeaPackage;
import raaml.fmea.RPNCalculation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPN Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.impl.RPNCalculationImpl#getRPN <em>RPN</em>}</li>
 *   <li>{@link raaml.fmea.impl.RPNCalculationImpl#getSEV <em>SEV</em>}</li>
 *   <li>{@link raaml.fmea.impl.RPNCalculationImpl#getOCC <em>OCC</em>}</li>
 *   <li>{@link raaml.fmea.impl.RPNCalculationImpl#getDET <em>DET</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPNCalculationImpl extends CoreSafetyElementImpl implements RPNCalculation {
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
	 * The default value of the '{@link #getSEV() <em>SEV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEV()
	 * @generated
	 * @ordered
	 */
	protected static final double SEV_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSEV() <em>SEV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSEV()
	 * @generated
	 * @ordered
	 */
	protected double sev = SEV_EDEFAULT;

	/**
	 * The default value of the '{@link #getOCC() <em>OCC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCC()
	 * @generated
	 * @ordered
	 */
	protected static final double OCC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOCC() <em>OCC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCC()
	 * @generated
	 * @ordered
	 */
	protected double occ = OCC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDET() <em>DET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET()
	 * @generated
	 * @ordered
	 */
	protected static final double DET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDET() <em>DET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDET()
	 * @generated
	 * @ordered
	 */
	protected double det = DET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPNCalculationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.RPN_CALCULATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.RPN_CALCULATION__RPN, oldRPN, rpn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSEV() {
		return sev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSEV(double newSEV) {
		double oldSEV = sev;
		sev = newSEV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.RPN_CALCULATION__SEV, oldSEV, sev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOCC() {
		return occ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOCC(double newOCC) {
		double oldOCC = occ;
		occ = newOCC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.RPN_CALCULATION__OCC, oldOCC, occ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDET() {
		return det;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDET(double newDET) {
		double oldDET = det;
		det = newDET;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FmeaPackage.RPN_CALCULATION__DET, oldDET, det));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FmeaPackage.RPN_CALCULATION__RPN:
				return getRPN();
			case FmeaPackage.RPN_CALCULATION__SEV:
				return getSEV();
			case FmeaPackage.RPN_CALCULATION__OCC:
				return getOCC();
			case FmeaPackage.RPN_CALCULATION__DET:
				return getDET();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FmeaPackage.RPN_CALCULATION__RPN:
				setRPN((Double)newValue);
				return;
			case FmeaPackage.RPN_CALCULATION__SEV:
				setSEV((Double)newValue);
				return;
			case FmeaPackage.RPN_CALCULATION__OCC:
				setOCC((Double)newValue);
				return;
			case FmeaPackage.RPN_CALCULATION__DET:
				setDET((Double)newValue);
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
			case FmeaPackage.RPN_CALCULATION__RPN:
				setRPN(RPN_EDEFAULT);
				return;
			case FmeaPackage.RPN_CALCULATION__SEV:
				setSEV(SEV_EDEFAULT);
				return;
			case FmeaPackage.RPN_CALCULATION__OCC:
				setOCC(OCC_EDEFAULT);
				return;
			case FmeaPackage.RPN_CALCULATION__DET:
				setDET(DET_EDEFAULT);
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
			case FmeaPackage.RPN_CALCULATION__RPN:
				return rpn != RPN_EDEFAULT;
			case FmeaPackage.RPN_CALCULATION__SEV:
				return sev != SEV_EDEFAULT;
			case FmeaPackage.RPN_CALCULATION__OCC:
				return occ != OCC_EDEFAULT;
			case FmeaPackage.RPN_CALCULATION__DET:
				return det != DET_EDEFAULT;
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
		result.append(", SEV: ");
		result.append(sev);
		result.append(", OCC: ");
		result.append(occ);
		result.append(", DET: ");
		result.append(det);
		result.append(')');
		return result.toString();
	}

} //RPNCalculationImpl
