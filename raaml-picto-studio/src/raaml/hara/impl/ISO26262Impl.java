/**
 */
package raaml.hara.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.AnalysisImpl;

import raaml.hara.ASILAssignment;
import raaml.hara.Confirmed;
import raaml.hara.HaraPackage;
import raaml.hara.ISO26262;
import raaml.hara.MalfunctioningBehaviour;
import raaml.hara.OperationalSituation;
import raaml.hara.Verified;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISO26262</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.impl.ISO26262Impl#getMalfunctioningBehaviors <em>Malfunctioning Behaviors</em>}</li>
 *   <li>{@link raaml.hara.impl.ISO26262Impl#getOperationalSituations <em>Operational Situations</em>}</li>
 *   <li>{@link raaml.hara.impl.ISO26262Impl#getConfirmedItems <em>Confirmed Items</em>}</li>
 *   <li>{@link raaml.hara.impl.ISO26262Impl#getVerifiedItems <em>Verified Items</em>}</li>
 *   <li>{@link raaml.hara.impl.ISO26262Impl#getAsilAssignments <em>Asil Assignments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISO26262Impl extends AnalysisImpl implements ISO26262 {
	/**
	 * The cached value of the '{@link #getMalfunctioningBehaviors() <em>Malfunctioning Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMalfunctioningBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<MalfunctioningBehaviour> malfunctioningBehaviors;

	/**
	 * The cached value of the '{@link #getOperationalSituations() <em>Operational Situations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationalSituations()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationalSituation> operationalSituations;

	/**
	 * The cached value of the '{@link #getConfirmedItems() <em>Confirmed Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Confirmed> confirmedItems;

	/**
	 * The cached value of the '{@link #getVerifiedItems() <em>Verified Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerifiedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Verified> verifiedItems;

	/**
	 * The cached value of the '{@link #getAsilAssignments() <em>Asil Assignments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsilAssignments()
	 * @generated
	 * @ordered
	 */
	protected EList<ASILAssignment> asilAssignments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISO26262Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HaraPackage.Literals.ISO26262;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MalfunctioningBehaviour> getMalfunctioningBehaviors() {
		if (malfunctioningBehaviors == null) {
			malfunctioningBehaviors = new EObjectContainmentEList<MalfunctioningBehaviour>(MalfunctioningBehaviour.class, this, HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS);
		}
		return malfunctioningBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationalSituation> getOperationalSituations() {
		if (operationalSituations == null) {
			operationalSituations = new EObjectContainmentEList<OperationalSituation>(OperationalSituation.class, this, HaraPackage.ISO26262__OPERATIONAL_SITUATIONS);
		}
		return operationalSituations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Confirmed> getConfirmedItems() {
		if (confirmedItems == null) {
			confirmedItems = new EObjectContainmentEList<Confirmed>(Confirmed.class, this, HaraPackage.ISO26262__CONFIRMED_ITEMS);
		}
		return confirmedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Verified> getVerifiedItems() {
		if (verifiedItems == null) {
			verifiedItems = new EObjectContainmentEList<Verified>(Verified.class, this, HaraPackage.ISO26262__VERIFIED_ITEMS);
		}
		return verifiedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ASILAssignment> getAsilAssignments() {
		if (asilAssignments == null) {
			asilAssignments = new EObjectContainmentEList<ASILAssignment>(ASILAssignment.class, this, HaraPackage.ISO26262__ASIL_ASSIGNMENTS);
		}
		return asilAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS:
				return ((InternalEList<?>)getMalfunctioningBehaviors()).basicRemove(otherEnd, msgs);
			case HaraPackage.ISO26262__OPERATIONAL_SITUATIONS:
				return ((InternalEList<?>)getOperationalSituations()).basicRemove(otherEnd, msgs);
			case HaraPackage.ISO26262__CONFIRMED_ITEMS:
				return ((InternalEList<?>)getConfirmedItems()).basicRemove(otherEnd, msgs);
			case HaraPackage.ISO26262__VERIFIED_ITEMS:
				return ((InternalEList<?>)getVerifiedItems()).basicRemove(otherEnd, msgs);
			case HaraPackage.ISO26262__ASIL_ASSIGNMENTS:
				return ((InternalEList<?>)getAsilAssignments()).basicRemove(otherEnd, msgs);
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
			case HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS:
				return getMalfunctioningBehaviors();
			case HaraPackage.ISO26262__OPERATIONAL_SITUATIONS:
				return getOperationalSituations();
			case HaraPackage.ISO26262__CONFIRMED_ITEMS:
				return getConfirmedItems();
			case HaraPackage.ISO26262__VERIFIED_ITEMS:
				return getVerifiedItems();
			case HaraPackage.ISO26262__ASIL_ASSIGNMENTS:
				return getAsilAssignments();
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
			case HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS:
				getMalfunctioningBehaviors().clear();
				getMalfunctioningBehaviors().addAll((Collection<? extends MalfunctioningBehaviour>)newValue);
				return;
			case HaraPackage.ISO26262__OPERATIONAL_SITUATIONS:
				getOperationalSituations().clear();
				getOperationalSituations().addAll((Collection<? extends OperationalSituation>)newValue);
				return;
			case HaraPackage.ISO26262__CONFIRMED_ITEMS:
				getConfirmedItems().clear();
				getConfirmedItems().addAll((Collection<? extends Confirmed>)newValue);
				return;
			case HaraPackage.ISO26262__VERIFIED_ITEMS:
				getVerifiedItems().clear();
				getVerifiedItems().addAll((Collection<? extends Verified>)newValue);
				return;
			case HaraPackage.ISO26262__ASIL_ASSIGNMENTS:
				getAsilAssignments().clear();
				getAsilAssignments().addAll((Collection<? extends ASILAssignment>)newValue);
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
			case HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS:
				getMalfunctioningBehaviors().clear();
				return;
			case HaraPackage.ISO26262__OPERATIONAL_SITUATIONS:
				getOperationalSituations().clear();
				return;
			case HaraPackage.ISO26262__CONFIRMED_ITEMS:
				getConfirmedItems().clear();
				return;
			case HaraPackage.ISO26262__VERIFIED_ITEMS:
				getVerifiedItems().clear();
				return;
			case HaraPackage.ISO26262__ASIL_ASSIGNMENTS:
				getAsilAssignments().clear();
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
			case HaraPackage.ISO26262__MALFUNCTIONING_BEHAVIORS:
				return malfunctioningBehaviors != null && !malfunctioningBehaviors.isEmpty();
			case HaraPackage.ISO26262__OPERATIONAL_SITUATIONS:
				return operationalSituations != null && !operationalSituations.isEmpty();
			case HaraPackage.ISO26262__CONFIRMED_ITEMS:
				return confirmedItems != null && !confirmedItems.isEmpty();
			case HaraPackage.ISO26262__VERIFIED_ITEMS:
				return verifiedItems != null && !verifiedItems.isEmpty();
			case HaraPackage.ISO26262__ASIL_ASSIGNMENTS:
				return asilAssignments != null && !asilAssignments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ISO26262Impl
