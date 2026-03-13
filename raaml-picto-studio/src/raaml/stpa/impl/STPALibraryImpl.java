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

import raaml.core.impl.AbstractLibraryImpl;

import raaml.stpa.ControlAction;
import raaml.stpa.ControlStructure;
import raaml.stpa.STPALibrary;
import raaml.stpa.StpaPackage;
import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STPA Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.STPALibraryImpl#getControlStructures <em>Control Structures</em>}</li>
 *   <li>{@link raaml.stpa.impl.STPALibraryImpl#getControlActions <em>Control Actions</em>}</li>
 *   <li>{@link raaml.stpa.impl.STPALibraryImpl#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STPALibraryImpl extends AbstractLibraryImpl implements STPALibrary {
	/**
	 * The cached value of the '{@link #getControlStructures() <em>Control Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlStructure> controlStructures;

	/**
	 * The cached value of the '{@link #getControlActions() <em>Control Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> controlActions;

	/**
	 * The cached value of the '{@link #getUnsafeControlActions() <em>Unsafe Control Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsafeControlActions()
	 * @generated
	 * @ordered
	 */
	protected EList<UndesiredControlAction> unsafeControlActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STPALibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.STPA_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlStructure> getControlStructures() {
		if (controlStructures == null) {
			controlStructures = new EObjectContainmentEList<ControlStructure>(ControlStructure.class, this, StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES);
		}
		return controlStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlAction> getControlActions() {
		if (controlActions == null) {
			controlActions = new EObjectContainmentEList<ControlAction>(ControlAction.class, this, StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS);
		}
		return controlActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UndesiredControlAction> getUnsafeControlActions() {
		if (unsafeControlActions == null) {
			unsafeControlActions = new EObjectContainmentEList<UndesiredControlAction>(UndesiredControlAction.class, this, StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS);
		}
		return unsafeControlActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES:
				return ((InternalEList<?>)getControlStructures()).basicRemove(otherEnd, msgs);
			case StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS:
				return ((InternalEList<?>)getControlActions()).basicRemove(otherEnd, msgs);
			case StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS:
				return ((InternalEList<?>)getUnsafeControlActions()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES:
				return getControlStructures();
			case StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS:
				return getControlActions();
			case StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS:
				return getUnsafeControlActions();
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
			case StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES:
				getControlStructures().clear();
				getControlStructures().addAll((Collection<? extends ControlStructure>)newValue);
				return;
			case StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS:
				getControlActions().clear();
				getControlActions().addAll((Collection<? extends ControlAction>)newValue);
				return;
			case StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS:
				getUnsafeControlActions().clear();
				getUnsafeControlActions().addAll((Collection<? extends UndesiredControlAction>)newValue);
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
			case StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES:
				getControlStructures().clear();
				return;
			case StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS:
				getControlActions().clear();
				return;
			case StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS:
				getUnsafeControlActions().clear();
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
			case StpaPackage.STPA_LIBRARY__CONTROL_STRUCTURES:
				return controlStructures != null && !controlStructures.isEmpty();
			case StpaPackage.STPA_LIBRARY__CONTROL_ACTIONS:
				return controlActions != null && !controlActions.isEmpty();
			case StpaPackage.STPA_LIBRARY__UNSAFE_CONTROL_ACTIONS:
				return unsafeControlActions != null && !unsafeControlActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //STPALibraryImpl
