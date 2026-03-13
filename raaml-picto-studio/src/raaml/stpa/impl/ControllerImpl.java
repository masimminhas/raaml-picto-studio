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

import raaml.stpa.ControlAction;
import raaml.stpa.Controller;
import raaml.stpa.Feedback;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.ControllerImpl#getControlActions <em>Control Actions</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControllerImpl#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends CoreSafetyElementImpl implements Controller {
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
	 * The cached value of the '{@link #getFeedback() <em>Feedback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> feedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlAction> getControlActions() {
		if (controlActions == null) {
			controlActions = new EObjectContainmentEList<ControlAction>(ControlAction.class, this, StpaPackage.CONTROLLER__CONTROL_ACTIONS);
		}
		return controlActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feedback> getFeedback() {
		if (feedback == null) {
			feedback = new EObjectContainmentEList<Feedback>(Feedback.class, this, StpaPackage.CONTROLLER__FEEDBACK);
		}
		return feedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.CONTROLLER__CONTROL_ACTIONS:
				return ((InternalEList<?>)getControlActions()).basicRemove(otherEnd, msgs);
			case StpaPackage.CONTROLLER__FEEDBACK:
				return ((InternalEList<?>)getFeedback()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.CONTROLLER__CONTROL_ACTIONS:
				return getControlActions();
			case StpaPackage.CONTROLLER__FEEDBACK:
				return getFeedback();
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
			case StpaPackage.CONTROLLER__CONTROL_ACTIONS:
				getControlActions().clear();
				getControlActions().addAll((Collection<? extends ControlAction>)newValue);
				return;
			case StpaPackage.CONTROLLER__FEEDBACK:
				getFeedback().clear();
				getFeedback().addAll((Collection<? extends Feedback>)newValue);
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
			case StpaPackage.CONTROLLER__CONTROL_ACTIONS:
				getControlActions().clear();
				return;
			case StpaPackage.CONTROLLER__FEEDBACK:
				getFeedback().clear();
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
			case StpaPackage.CONTROLLER__CONTROL_ACTIONS:
				return controlActions != null && !controlActions.isEmpty();
			case StpaPackage.CONTROLLER__FEEDBACK:
				return feedback != null && !feedback.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControllerImpl
