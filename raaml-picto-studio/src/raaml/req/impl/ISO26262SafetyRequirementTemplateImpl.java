/**
 */
package raaml.req.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import raaml.hara.ASIL;

import raaml.req.ISO26262SafetyRequirementTemplate;
import raaml.req.ReqPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISO26262 Safety Requirement Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.impl.ISO26262SafetyRequirementTemplateImpl#getASIL <em>ASIL</em>}</li>
 *   <li>{@link raaml.req.impl.ISO26262SafetyRequirementTemplateImpl#getFTTI <em>FTTI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISO26262SafetyRequirementTemplateImpl extends DependabilityRequirementImpl implements ISO26262SafetyRequirementTemplate {
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
	 * The default value of the '{@link #getFTTI() <em>FTTI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTTI()
	 * @generated
	 * @ordered
	 */
	protected static final int FTTI_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFTTI() <em>FTTI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTTI()
	 * @generated
	 * @ordered
	 */
	protected int ftti = FTTI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISO26262SafetyRequirementTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.ISO26262_SAFETY_REQUIREMENT_TEMPLATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL, oldASIL, asil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getFTTI() {
		return ftti;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFTTI(int newFTTI) {
		int oldFTTI = ftti;
		ftti = newFTTI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI, oldFTTI, ftti));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL:
				return getASIL();
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI:
				return getFTTI();
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
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL:
				setASIL((ASIL)newValue);
				return;
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI:
				setFTTI((Integer)newValue);
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
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL:
				setASIL(ASIL_EDEFAULT);
				return;
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI:
				setFTTI(FTTI_EDEFAULT);
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
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL:
				return asil != ASIL_EDEFAULT;
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI:
				return ftti != FTTI_EDEFAULT;
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
		result.append(", FTTI: ");
		result.append(ftti);
		result.append(')');
		return result.toString();
	}

} //ISO26262SafetyRequirementTemplateImpl
