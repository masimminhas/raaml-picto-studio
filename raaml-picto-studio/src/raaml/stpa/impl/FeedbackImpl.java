/**
 */
package raaml.stpa.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.ControlledProcess;
import raaml.stpa.Controller;
import raaml.stpa.Feedback;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.FeedbackImpl#getType <em>Type</em>}</li>
 *   <li>{@link raaml.stpa.impl.FeedbackImpl#getSource <em>Source</em>}</li>
 *   <li>{@link raaml.stpa.impl.FeedbackImpl#getTargetController <em>Target Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeedbackImpl extends CoreSafetyElementImpl implements Feedback {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ControlledProcess source;

	/**
	 * The cached value of the '{@link #getTargetController() <em>Target Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetController()
	 * @generated
	 * @ordered
	 */
	protected Controller targetController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.FEEDBACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.FEEDBACK__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlledProcess getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ControlledProcess)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.FEEDBACK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcess basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(ControlledProcess newSource) {
		ControlledProcess oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.FEEDBACK__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Controller getTargetController() {
		if (targetController != null && targetController.eIsProxy()) {
			InternalEObject oldTargetController = (InternalEObject)targetController;
			targetController = (Controller)eResolveProxy(oldTargetController);
			if (targetController != oldTargetController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.FEEDBACK__TARGET_CONTROLLER, oldTargetController, targetController));
			}
		}
		return targetController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller basicGetTargetController() {
		return targetController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetController(Controller newTargetController) {
		Controller oldTargetController = targetController;
		targetController = newTargetController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.FEEDBACK__TARGET_CONTROLLER, oldTargetController, targetController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StpaPackage.FEEDBACK__TYPE:
				return getType();
			case StpaPackage.FEEDBACK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StpaPackage.FEEDBACK__TARGET_CONTROLLER:
				if (resolve) return getTargetController();
				return basicGetTargetController();
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
			case StpaPackage.FEEDBACK__TYPE:
				setType((String)newValue);
				return;
			case StpaPackage.FEEDBACK__SOURCE:
				setSource((ControlledProcess)newValue);
				return;
			case StpaPackage.FEEDBACK__TARGET_CONTROLLER:
				setTargetController((Controller)newValue);
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
			case StpaPackage.FEEDBACK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StpaPackage.FEEDBACK__SOURCE:
				setSource((ControlledProcess)null);
				return;
			case StpaPackage.FEEDBACK__TARGET_CONTROLLER:
				setTargetController((Controller)null);
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
			case StpaPackage.FEEDBACK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case StpaPackage.FEEDBACK__SOURCE:
				return source != null;
			case StpaPackage.FEEDBACK__TARGET_CONTROLLER:
				return targetController != null;
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

} //FeedbackImpl
