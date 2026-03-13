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

import raaml.core.impl.AbstractLibraryImpl;

import raaml.fmea.AbstractFMEAItem;
import raaml.fmea.FMEALibrary;
import raaml.fmea.FmeaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMEA Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.impl.FMEALibraryImpl#getAbstractFMEAItems <em>Abstract FMEA Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMEALibraryImpl extends AbstractLibraryImpl implements FMEALibrary {
	/**
	 * The cached value of the '{@link #getAbstractFMEAItems() <em>Abstract FMEA Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFMEAItems()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractFMEAItem> abstractFMEAItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMEALibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FmeaPackage.Literals.FMEA_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractFMEAItem> getAbstractFMEAItems() {
		if (abstractFMEAItems == null) {
			abstractFMEAItems = new EObjectContainmentEList<AbstractFMEAItem>(AbstractFMEAItem.class, this, FmeaPackage.FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS);
		}
		return abstractFMEAItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FmeaPackage.FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS:
				return ((InternalEList<?>)getAbstractFMEAItems()).basicRemove(otherEnd, msgs);
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
			case FmeaPackage.FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS:
				return getAbstractFMEAItems();
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
			case FmeaPackage.FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS:
				getAbstractFMEAItems().clear();
				getAbstractFMEAItems().addAll((Collection<? extends AbstractFMEAItem>)newValue);
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
			case FmeaPackage.FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS:
				getAbstractFMEAItems().clear();
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
			case FmeaPackage.FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS:
				return abstractFMEAItems != null && !abstractFMEAItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FMEALibraryImpl
