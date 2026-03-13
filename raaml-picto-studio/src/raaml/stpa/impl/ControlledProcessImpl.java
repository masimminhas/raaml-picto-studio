/**
 */
package raaml.stpa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.ControlAction;
import raaml.stpa.ControlledProcess;
import raaml.stpa.Feedback;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.ControlledProcessImpl#getReceivedActions <em>Received Actions</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControlledProcessImpl#getProvidedFeedback <em>Provided Feedback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlledProcessImpl extends CoreSafetyElementImpl implements ControlledProcess {
	/**
	 * The cached value of the '{@link #getReceivedActions() <em>Received Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivedActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlAction> receivedActions;

	/**
	 * The cached value of the '{@link #getProvidedFeedback() <em>Provided Feedback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedFeedback()
	 * @generated
	 * @ordered
	 */
	protected EList<Feedback> providedFeedback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlledProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.CONTROLLED_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlAction> getReceivedActions() {
		if (receivedActions == null) {
			receivedActions = new EObjectResolvingEList<ControlAction>(ControlAction.class, this, StpaPackage.CONTROLLED_PROCESS__RECEIVED_ACTIONS);
		}
		return receivedActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feedback> getProvidedFeedback() {
		if (providedFeedback == null) {
			providedFeedback = new EObjectContainmentEList<Feedback>(Feedback.class, this, StpaPackage.CONTROLLED_PROCESS__PROVIDED_FEEDBACK);
		}
		return providedFeedback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.CONTROLLED_PROCESS__PROVIDED_FEEDBACK:
				return ((InternalEList<?>)getProvidedFeedback()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.CONTROLLED_PROCESS__RECEIVED_ACTIONS:
				return getReceivedActions();
			case StpaPackage.CONTROLLED_PROCESS__PROVIDED_FEEDBACK:
				return getProvidedFeedback();
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
			case StpaPackage.CONTROLLED_PROCESS__RECEIVED_ACTIONS:
				getReceivedActions().clear();
				getReceivedActions().addAll((Collection<? extends ControlAction>)newValue);
				return;
			case StpaPackage.CONTROLLED_PROCESS__PROVIDED_FEEDBACK:
				getProvidedFeedback().clear();
				getProvidedFeedback().addAll((Collection<? extends Feedback>)newValue);
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
			case StpaPackage.CONTROLLED_PROCESS__RECEIVED_ACTIONS:
				getReceivedActions().clear();
				return;
			case StpaPackage.CONTROLLED_PROCESS__PROVIDED_FEEDBACK:
				getProvidedFeedback().clear();
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
			case StpaPackage.CONTROLLED_PROCESS__RECEIVED_ACTIONS:
				return receivedActions != null && !receivedActions.isEmpty();
			case StpaPackage.CONTROLLED_PROCESS__PROVIDED_FEEDBACK:
				return providedFeedback != null && !providedFeedback.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlledProcessImpl
