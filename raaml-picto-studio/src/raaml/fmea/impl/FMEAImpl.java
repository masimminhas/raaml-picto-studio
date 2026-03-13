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

import raaml.core.impl.AnalysisImpl;

import raaml.fmea.FMEA;
import raaml.fmea.FMEAItem;
import raaml.fmea.FmeaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMEA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.impl.FMEAImpl#getFmeaItems <em>Fmea Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMEAImpl extends AnalysisImpl implements FMEA {
	/**
	 * The cached value of the '{@link #getFmeaItems() <em>Fmea Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmeaItems()
	 * @generated
	 * @ordered
	 */
	protected EList<FMEAItem> fmeaItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMEAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.FMEA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMEAItem> getFmeaItems() {
		if (fmeaItems == null) {
			fmeaItems = new EObjectContainmentEList<FMEAItem>(FMEAItem.class, this, FmeaPackage.FMEA__FMEA_ITEMS);
		}
		return fmeaItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmeaPackage.FMEA__FMEA_ITEMS:
				return ((InternalEList<?>)getFmeaItems()).basicRemove(otherEnd, msgs);
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
			case FmeaPackage.FMEA__FMEA_ITEMS:
				return getFmeaItems();
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
			case FmeaPackage.FMEA__FMEA_ITEMS:
				getFmeaItems().clear();
				getFmeaItems().addAll((Collection<? extends FMEAItem>)newValue);
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
			case FmeaPackage.FMEA__FMEA_ITEMS:
				getFmeaItems().clear();
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
			case FmeaPackage.FMEA__FMEA_ITEMS:
				return fmeaItems != null && !fmeaItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FMEAImpl
