/**
 */
package raaml.req.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.req.Dependency;
import raaml.req.DeriveRequirement;
import raaml.req.ReqPackage;
import raaml.req.Requirement;
import raaml.req.RequirementsModel;
import raaml.req.Satisfy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.impl.RequirementsModelImpl#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementsModelImpl#getDerivations <em>Derivations</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementsModelImpl#getSatisfactions <em>Satisfactions</em>}</li>
 *   <li>{@link raaml.req.impl.RequirementsModelImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementsModelImpl extends CoreSafetyElementImpl implements RequirementsModel {
	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirements;

	/**
	 * The cached value of the '{@link #getDerivations() <em>Derivations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivations()
	 * @generated
	 * @ordered
	 */
	protected EList<DeriveRequirement> derivations;

	/**
	 * The cached value of the '{@link #getSatisfactions() <em>Satisfactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Satisfy> satisfactions;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqPackage.Literals.REQUIREMENTS_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectContainmentEList<Requirement>(Requirement.class, this, ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeriveRequirement> getDerivations() {
		if (derivations == null) {
			derivations = new EObjectContainmentEList<DeriveRequirement>(DeriveRequirement.class, this, ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS);
		}
		return derivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Satisfy> getSatisfactions() {
		if (satisfactions == null) {
			satisfactions = new EObjectContainmentEList<Satisfy>(Satisfy.class, this, ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS);
		}
		return satisfactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS:
				return ((InternalEList<?>)getRequirements()).basicRemove(otherEnd, msgs);
			case ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS:
				return ((InternalEList<?>)getDerivations()).basicRemove(otherEnd, msgs);
			case ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS:
				return ((InternalEList<?>)getSatisfactions()).basicRemove(otherEnd, msgs);
			case ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS:
				return getRequirements();
			case ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS:
				return getDerivations();
			case ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS:
				return getSatisfactions();
			case ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES:
				return getDependencies();
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
			case ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends Requirement>)newValue);
				return;
			case ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS:
				getDerivations().clear();
				getDerivations().addAll((Collection<? extends DeriveRequirement>)newValue);
				return;
			case ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS:
				getSatisfactions().clear();
				getSatisfactions().addAll((Collection<? extends Satisfy>)newValue);
				return;
			case ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
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
			case ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS:
				getRequirements().clear();
				return;
			case ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS:
				getDerivations().clear();
				return;
			case ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS:
				getSatisfactions().clear();
				return;
			case ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES:
				getDependencies().clear();
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
			case ReqPackage.REQUIREMENTS_MODEL__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
			case ReqPackage.REQUIREMENTS_MODEL__DERIVATIONS:
				return derivations != null && !derivations.isEmpty();
			case ReqPackage.REQUIREMENTS_MODEL__SATISFACTIONS:
				return satisfactions != null && !satisfactions.isEmpty();
			case ReqPackage.REQUIREMENTS_MODEL__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementsModelImpl
