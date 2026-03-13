/**
 */
package raaml.req.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.req.HazardAndRiskAssessment;
import raaml.req.ReqPackage;
import raaml.req.RequirementComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.impl.RequirementComponentImpl#getHaraOwner <em>Hara Owner</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementComponentImpl extends CoreSafetyElementImpl implements RequirementComponent {
	/**
	 * The cached value of the '{@link #getHaraOwner() <em>Hara Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaraOwner()
	 * @generated
	 * @ordered
	 */
	protected HazardAndRiskAssessment haraOwner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.REQUIREMENT_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardAndRiskAssessment getHaraOwner() {
		if (haraOwner != null && haraOwner.eIsProxy()) {
			InternalEObject oldHaraOwner = (InternalEObject)haraOwner;
			haraOwner = (HazardAndRiskAssessment)eResolveProxy(oldHaraOwner);
			if (haraOwner != oldHaraOwner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER, oldHaraOwner, haraOwner));
			}
		}
		return haraOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardAndRiskAssessment basicGetHaraOwner() {
		return haraOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHaraOwner(HazardAndRiskAssessment newHaraOwner, NotificationChain msgs) {
		HazardAndRiskAssessment oldHaraOwner = haraOwner;
		haraOwner = newHaraOwner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER, oldHaraOwner, newHaraOwner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHaraOwner(HazardAndRiskAssessment newHaraOwner) {
		if (newHaraOwner != haraOwner) {
			NotificationChain msgs = null;
			if (haraOwner != null)
				msgs = ((InternalEObject)haraOwner).eInverseRemove(this, ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS, HazardAndRiskAssessment.class, msgs);
			if (newHaraOwner != null)
				msgs = ((InternalEObject)newHaraOwner).eInverseAdd(this, ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS, HazardAndRiskAssessment.class, msgs);
			msgs = basicSetHaraOwner(newHaraOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER, newHaraOwner, newHaraOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER:
				if (haraOwner != null)
					msgs = ((InternalEObject)haraOwner).eInverseRemove(this, ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS, HazardAndRiskAssessment.class, msgs);
				return basicSetHaraOwner((HazardAndRiskAssessment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER:
				return basicSetHaraOwner(null, msgs);
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
			case ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER:
				if (resolve) return getHaraOwner();
				return basicGetHaraOwner();
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
			case ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER:
				setHaraOwner((HazardAndRiskAssessment)newValue);
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
			case ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER:
				setHaraOwner((HazardAndRiskAssessment)null);
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
			case ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER:
				return haraOwner != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementComponentImpl
