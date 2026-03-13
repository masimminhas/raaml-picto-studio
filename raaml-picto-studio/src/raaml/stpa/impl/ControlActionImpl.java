/**
 */
package raaml.stpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.ControlAction;
import raaml.stpa.ControlledProcess;
import raaml.stpa.Controller;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.ControlActionImpl#getType <em>Type</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControlActionImpl#getSourceController <em>Source Controller</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControlActionImpl#getTargetProcess <em>Target Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlActionImpl extends CoreSafetyElementImpl implements ControlAction {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceController() <em>Source Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceController()
	 * @generated
	 * @ordered
	 */
	protected Controller sourceController;

	/**
	 * The cached value of the '{@link #getTargetProcess() <em>Target Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetProcess()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess targetProcess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.CONTROL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_ACTION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getSourceController() {
		if (sourceController != null && sourceController.eIsProxy()) {
			InternalEObject oldSourceController = (InternalEObject)sourceController;
			sourceController = (Controller)eResolveProxy(oldSourceController);
			if (sourceController != oldSourceController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.CONTROL_ACTION__SOURCE_CONTROLLER, oldSourceController, sourceController));
			}
		}
		return sourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetSourceController() {
		return sourceController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceController(Controller newSourceController) {
		Controller oldSourceController = sourceController;
		sourceController = newSourceController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_ACTION__SOURCE_CONTROLLER, oldSourceController, sourceController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlledProcess getTargetProcess() {
		if (targetProcess != null && targetProcess.eIsProxy()) {
			InternalEObject oldTargetProcess = (InternalEObject)targetProcess;
			targetProcess = (ControlledProcess)eResolveProxy(oldTargetProcess);
			if (targetProcess != oldTargetProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.CONTROL_ACTION__TARGET_PROCESS, oldTargetProcess, targetProcess));
			}
		}
		return targetProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetTargetProcess() {
		return targetProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetProcess(ControlledProcess newTargetProcess) {
		ControlledProcess oldTargetProcess = targetProcess;
		targetProcess = newTargetProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.CONTROL_ACTION__TARGET_PROCESS, oldTargetProcess, targetProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StpaPackage.CONTROL_ACTION__TYPE:
				return getType();
			case StpaPackage.CONTROL_ACTION__SOURCE_CONTROLLER:
				if (resolve) return getSourceController();
				return basicGetSourceController();
			case StpaPackage.CONTROL_ACTION__TARGET_PROCESS:
				if (resolve) return getTargetProcess();
				return basicGetTargetProcess();
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
			case StpaPackage.CONTROL_ACTION__TYPE:
				setType((String)newValue);
				return;
			case StpaPackage.CONTROL_ACTION__SOURCE_CONTROLLER:
				setSourceController((Controller)newValue);
				return;
			case StpaPackage.CONTROL_ACTION__TARGET_PROCESS:
				setTargetProcess((ControlledProcess)newValue);
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
			case StpaPackage.CONTROL_ACTION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StpaPackage.CONTROL_ACTION__SOURCE_CONTROLLER:
				setSourceController((Controller)null);
				return;
			case StpaPackage.CONTROL_ACTION__TARGET_PROCESS:
				setTargetProcess((ControlledProcess)null);
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
			case StpaPackage.CONTROL_ACTION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case StpaPackage.CONTROL_ACTION__SOURCE_CONTROLLER:
				return sourceController != null;
			case StpaPackage.CONTROL_ACTION__TARGET_PROCESS:
				return targetProcess != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ControlActionImpl
