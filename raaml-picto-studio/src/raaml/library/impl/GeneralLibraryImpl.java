/**
 */
package raaml.library.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.AnySituation;

import raaml.core.impl.AbstractLibraryImpl;

import raaml.library.GeneralLibrary;
import raaml.library.LibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>General Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.library.impl.GeneralLibraryImpl#getAnySituations <em>Any Situations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralLibraryImpl extends AbstractLibraryImpl implements GeneralLibrary {
	/**
	 * The cached value of the '{@link #getAnySituations() <em>Any Situations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnySituations()
	 * @generated
	 * @ordered
	 */
	protected EList<AnySituation> anySituations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.GENERAL_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnySituation> getAnySituations() {
		if (anySituations == null) {
			anySituations = new EObjectContainmentEList<AnySituation>(AnySituation.class, this, LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS);
		}
		return anySituations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS:
				return ((InternalEList<?>)getAnySituations()).basicRemove(otherEnd, msgs);
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
			case LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS:
				return getAnySituations();
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
			case LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS:
				getAnySituations().clear();
				getAnySituations().addAll((Collection<? extends AnySituation>)newValue);
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
			case LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS:
				getAnySituations().clear();
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
			case LibraryPackage.GENERAL_LIBRARY__ANY_SITUATIONS:
				return anySituations != null && !anySituations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneralLibraryImpl
