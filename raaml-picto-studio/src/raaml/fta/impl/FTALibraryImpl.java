/**
 */
package raaml.fta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.AbstractLibraryImpl;

import raaml.fta.FTAElement;
import raaml.fta.FTALibrary;
import raaml.fta.FtaPackage;
import raaml.fta.Gate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTA Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.impl.FTALibraryImpl#getFtaElements <em>Fta Elements</em>}</li>
 *   <li>{@link raaml.fta.impl.FTALibraryImpl#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTALibraryImpl extends AbstractLibraryImpl implements FTALibrary {
	/**
	 * The cached value of the '{@link #getFtaElements() <em>Fta Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtaElements()
	 * @generated
	 * @ordered
	 */
	protected EList<FTAElement> ftaElements;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTALibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtaPackage.Literals.FTA_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FTAElement> getFtaElements() {
		if (ftaElements == null) {
			ftaElements = new EObjectContainmentEList<FTAElement>(FTAElement.class, this, FtaPackage.FTA_LIBRARY__FTA_ELEMENTS);
		}
		return ftaElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, FtaPackage.FTA_LIBRARY__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtaPackage.FTA_LIBRARY__FTA_ELEMENTS:
				return ((InternalEList<?>)getFtaElements()).basicRemove(otherEnd, msgs);
			case FtaPackage.FTA_LIBRARY__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
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
			case FtaPackage.FTA_LIBRARY__FTA_ELEMENTS:
				return getFtaElements();
			case FtaPackage.FTA_LIBRARY__GATES:
				return getGates();
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
			case FtaPackage.FTA_LIBRARY__FTA_ELEMENTS:
				getFtaElements().clear();
				getFtaElements().addAll((Collection<? extends FTAElement>)newValue);
				return;
			case FtaPackage.FTA_LIBRARY__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
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
			case FtaPackage.FTA_LIBRARY__FTA_ELEMENTS:
				getFtaElements().clear();
				return;
			case FtaPackage.FTA_LIBRARY__GATES:
				getGates().clear();
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
			case FtaPackage.FTA_LIBRARY__FTA_ELEMENTS:
				return ftaElements != null && !ftaElements.isEmpty();
			case FtaPackage.FTA_LIBRARY__GATES:
				return gates != null && !gates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FTALibraryImpl
