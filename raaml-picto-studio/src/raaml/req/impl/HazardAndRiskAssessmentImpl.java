/**
 */
package raaml.req.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.req.HazardAndRiskAssessment;
import raaml.req.ReqPackage;
import raaml.req.RequirementComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard And Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.impl.HazardAndRiskAssessmentImpl#getHaraRequirements <em>Hara Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardAndRiskAssessmentImpl extends CoreSafetyElementImpl implements HazardAndRiskAssessment {
	/**
	 * The cached value of the '{@link #getHaraRequirements() <em>Hara Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHaraRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementComponent> haraRequirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardAndRiskAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.HAZARD_AND_RISK_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementComponent> getHaraRequirements() {
		if (haraRequirements == null) {
			haraRequirements = new EObjectWithInverseResolvingEList<RequirementComponent>(RequirementComponent.class, this, ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS, ReqPackage.REQUIREMENT_COMPONENT__HARA_OWNER);
		}
		return haraRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHaraRequirements()).basicAdd(otherEnd, msgs);
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
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS:
				return ((InternalEList<?>)getHaraRequirements()).basicRemove(otherEnd, msgs);
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
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS:
				return getHaraRequirements();
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
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS:
				getHaraRequirements().clear();
				getHaraRequirements().addAll((Collection<? extends RequirementComponent>)newValue);
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
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS:
				getHaraRequirements().clear();
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
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS:
				return haraRequirements != null && !haraRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HazardAndRiskAssessmentImpl
