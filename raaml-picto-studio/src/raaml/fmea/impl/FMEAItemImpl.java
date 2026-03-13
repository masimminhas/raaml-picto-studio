/**
 */
package raaml.fmea.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.fmea.FMEAItem;
import raaml.fmea.FmeaPackage;
import raaml.fmea.RPNCalculation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMEA Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.impl.FMEAItemImpl#getRpnCalculation <em>Rpn Calculation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMEAItemImpl extends AbstractFMEAItemImpl implements FMEAItem {
	/**
	 * The cached value of the '{@link #getRpnCalculation() <em>Rpn Calculation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpnCalculation()
	 * @generated
	 * @ordered
	 */
	protected EList<RPNCalculation> rpnCalculation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMEAItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.FMEA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RPNCalculation> getRpnCalculation() {
		if (rpnCalculation == null) {
			rpnCalculation = new EObjectContainmentEList<RPNCalculation>(RPNCalculation.class, this, FmeaPackage.FMEA_ITEM__RPN_CALCULATION);
		}
		return rpnCalculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmeaPackage.FMEA_ITEM__RPN_CALCULATION:
				return ((InternalEList<?>)getRpnCalculation()).basicRemove(otherEnd, msgs);
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
			case FmeaPackage.FMEA_ITEM__RPN_CALCULATION:
				return getRpnCalculation();
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
			case FmeaPackage.FMEA_ITEM__RPN_CALCULATION:
				getRpnCalculation().clear();
				getRpnCalculation().addAll((Collection<? extends RPNCalculation>)newValue);
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
			case FmeaPackage.FMEA_ITEM__RPN_CALCULATION:
				getRpnCalculation().clear();
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
			case FmeaPackage.FMEA_ITEM__RPN_CALCULATION:
				return rpnCalculation != null && !rpnCalculation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FMEAItemImpl
