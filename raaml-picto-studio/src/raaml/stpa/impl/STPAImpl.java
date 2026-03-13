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

import raaml.core.Hazard;
import raaml.core.ProcessModelFlaw;

import raaml.core.impl.AnalysisImpl;

import raaml.stpa.ControlStructure;
import raaml.stpa.Loss;
import raaml.stpa.STPA;
import raaml.stpa.StpaPackage;
import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STPA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.STPAImpl#getControlStructures <em>Control Structures</em>}</li>
 *   <li>{@link raaml.stpa.impl.STPAImpl#getLosses <em>Losses</em>}</li>
 *   <li>{@link raaml.stpa.impl.STPAImpl#getHazards <em>Hazards</em>}</li>
 *   <li>{@link raaml.stpa.impl.STPAImpl#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 *   <li>{@link raaml.stpa.impl.STPAImpl#getControlFlaws <em>Control Flaws</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STPAImpl extends AnalysisImpl implements STPA {
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
	 * The cached value of the '{@link #getLosses() <em>Losses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosses()
	 * @generated
	 * @ordered
	 */
	protected EList<Loss> losses;

	/**
	 * The cached value of the '{@link #getHazards() <em>Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<Hazard> hazards;

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
	 * The cached value of the '{@link #getControlFlaws() <em>Control Flaws</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlaws()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModelFlaw> controlFlaws;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected STPAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.STPA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlStructure> getControlStructures() {
		if (controlStructures == null) {
			controlStructures = new EObjectContainmentEList<ControlStructure>(ControlStructure.class, this, StpaPackage.STPA__CONTROL_STRUCTURES);
		}
		return controlStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Loss> getLosses() {
		if (losses == null) {
			losses = new EObjectContainmentEList<Loss>(Loss.class, this, StpaPackage.STPA__LOSSES);
		}
		return losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hazard> getHazards() {
		if (hazards == null) {
			hazards = new EObjectContainmentEList<Hazard>(Hazard.class, this, StpaPackage.STPA__HAZARDS);
		}
		return hazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UndesiredControlAction> getUnsafeControlActions() {
		if (unsafeControlActions == null) {
			unsafeControlActions = new EObjectContainmentEList<UndesiredControlAction>(UndesiredControlAction.class, this, StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS);
		}
		return unsafeControlActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModelFlaw> getControlFlaws() {
		if (controlFlaws == null) {
			controlFlaws = new EObjectContainmentEList<ProcessModelFlaw>(ProcessModelFlaw.class, this, StpaPackage.STPA__CONTROL_FLAWS);
		}
		return controlFlaws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.STPA__CONTROL_STRUCTURES:
				return ((InternalEList<?>)getControlStructures()).basicRemove(otherEnd, msgs);
			case StpaPackage.STPA__LOSSES:
				return ((InternalEList<?>)getLosses()).basicRemove(otherEnd, msgs);
			case StpaPackage.STPA__HAZARDS:
				return ((InternalEList<?>)getHazards()).basicRemove(otherEnd, msgs);
			case StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS:
				return ((InternalEList<?>)getUnsafeControlActions()).basicRemove(otherEnd, msgs);
			case StpaPackage.STPA__CONTROL_FLAWS:
				return ((InternalEList<?>)getControlFlaws()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.STPA__CONTROL_STRUCTURES:
				return getControlStructures();
			case StpaPackage.STPA__LOSSES:
				return getLosses();
			case StpaPackage.STPA__HAZARDS:
				return getHazards();
			case StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS:
				return getUnsafeControlActions();
			case StpaPackage.STPA__CONTROL_FLAWS:
				return getControlFlaws();
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
			case StpaPackage.STPA__CONTROL_STRUCTURES:
				getControlStructures().clear();
				getControlStructures().addAll((Collection<? extends ControlStructure>)newValue);
				return;
			case StpaPackage.STPA__LOSSES:
				getLosses().clear();
				getLosses().addAll((Collection<? extends Loss>)newValue);
				return;
			case StpaPackage.STPA__HAZARDS:
				getHazards().clear();
				getHazards().addAll((Collection<? extends Hazard>)newValue);
				return;
			case StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS:
				getUnsafeControlActions().clear();
				getUnsafeControlActions().addAll((Collection<? extends UndesiredControlAction>)newValue);
				return;
			case StpaPackage.STPA__CONTROL_FLAWS:
				getControlFlaws().clear();
				getControlFlaws().addAll((Collection<? extends ProcessModelFlaw>)newValue);
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
			case StpaPackage.STPA__CONTROL_STRUCTURES:
				getControlStructures().clear();
				return;
			case StpaPackage.STPA__LOSSES:
				getLosses().clear();
				return;
			case StpaPackage.STPA__HAZARDS:
				getHazards().clear();
				return;
			case StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS:
				getUnsafeControlActions().clear();
				return;
			case StpaPackage.STPA__CONTROL_FLAWS:
				getControlFlaws().clear();
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
			case StpaPackage.STPA__CONTROL_STRUCTURES:
				return controlStructures != null && !controlStructures.isEmpty();
			case StpaPackage.STPA__LOSSES:
				return losses != null && !losses.isEmpty();
			case StpaPackage.STPA__HAZARDS:
				return hazards != null && !hazards.isEmpty();
			case StpaPackage.STPA__UNSAFE_CONTROL_ACTIONS:
				return unsafeControlActions != null && !unsafeControlActions.isEmpty();
			case StpaPackage.STPA__CONTROL_FLAWS:
				return controlFlaws != null && !controlFlaws.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //STPAImpl
