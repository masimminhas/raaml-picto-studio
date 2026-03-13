/**
 */
package raaml.hara.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.hara.ASIL;
import raaml.hara.ASILAssignment;
import raaml.hara.HaraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ASIL Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.impl.ASILAssignmentImpl#getASIL <em>ASIL</em>}</li>
 *   <li>{@link raaml.hara.impl.ASILAssignmentImpl#getASILOverride <em>ASIL Override</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ASILAssignmentImpl extends CoreSafetyElementImpl implements ASILAssignment {
	/**
	 * The default value of the '{@link #getASIL() <em>ASIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASIL()
	 * @generated
	 * @ordered
	 */
	protected static final ASIL ASIL_EDEFAULT = ASIL.NOASSIGNMENT;

	/**
	 * The cached value of the '{@link #getASIL() <em>ASIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASIL()
	 * @generated
	 * @ordered
	 */
	protected ASIL asil = ASIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getASILOverride() <em>ASIL Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASILOverride()
	 * @generated
	 * @ordered
	 */
	protected static final ASIL ASIL_OVERRIDE_EDEFAULT = ASIL.NOASSIGNMENT;

	/**
	 * The cached value of the '{@link #getASILOverride() <em>ASIL Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASILOverride()
	 * @generated
	 * @ordered
	 */
	protected ASIL asilOverride = ASIL_OVERRIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASILAssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HaraPackage.Literals.ASIL_ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASIL getASIL() {
		return asil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setASIL(ASIL newASIL) {
		ASIL oldASIL = asil;
		asil = newASIL == null ? ASIL_EDEFAULT : newASIL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HaraPackage.ASIL_ASSIGNMENT__ASIL, oldASIL, asil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASIL getASILOverride() {
		return asilOverride;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setASILOverride(ASIL newASILOverride) {
		ASIL oldASILOverride = asilOverride;
		asilOverride = newASILOverride == null ? ASIL_OVERRIDE_EDEFAULT : newASILOverride;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HaraPackage.ASIL_ASSIGNMENT__ASIL_OVERRIDE, oldASILOverride, asilOverride));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HaraPackage.ASIL_ASSIGNMENT__ASIL:
				return getASIL();
			case HaraPackage.ASIL_ASSIGNMENT__ASIL_OVERRIDE:
				return getASILOverride();
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
			case HaraPackage.ASIL_ASSIGNMENT__ASIL:
				setASIL((ASIL)newValue);
				return;
			case HaraPackage.ASIL_ASSIGNMENT__ASIL_OVERRIDE:
				setASILOverride((ASIL)newValue);
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
			case HaraPackage.ASIL_ASSIGNMENT__ASIL:
				setASIL(ASIL_EDEFAULT);
				return;
			case HaraPackage.ASIL_ASSIGNMENT__ASIL_OVERRIDE:
				setASILOverride(ASIL_OVERRIDE_EDEFAULT);
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
			case HaraPackage.ASIL_ASSIGNMENT__ASIL:
				return asil != ASIL_EDEFAULT;
			case HaraPackage.ASIL_ASSIGNMENT__ASIL_OVERRIDE:
				return asilOverride != ASIL_OVERRIDE_EDEFAULT;
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
		result.append(" (ASIL: ");
		result.append(asil);
		result.append(", ASILOverride: ");
		result.append(asilOverride);
		result.append(')');
		return result.toString();
	}

} //ASILAssignmentImpl
