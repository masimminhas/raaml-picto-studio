/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import raaml.core.CorePackage;
import raaml.core.CoreSafetyElement;
import raaml.core.ElementGroup;
import raaml.core.ElementGroupBasedItem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Group Based Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.ElementGroupBasedItemImpl#getGroupCriterion <em>Group Criterion</em>}</li>
 *   <li>{@link raaml.core.impl.ElementGroupBasedItemImpl#getOrderedMembers <em>Ordered Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementGroupBasedItemImpl extends ItemImpl implements ElementGroupBasedItem {
	/**
	 * The default value of the '{@link #getGroupCriterion() <em>Group Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupCriterion()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_CRITERION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroupCriterion() <em>Group Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupCriterion()
	 * @generated
	 * @ordered
	 */
	protected String groupCriterion = GROUP_CRITERION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderedMembers() <em>Ordered Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderedMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreSafetyElement> orderedMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementGroupBasedItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ELEMENT_GROUP_BASED_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroupCriterion() {
		return groupCriterion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroupCriterion(String newGroupCriterion) {
		String oldGroupCriterion = groupCriterion;
		groupCriterion = newGroupCriterion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION, oldGroupCriterion, groupCriterion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoreSafetyElement> getOrderedMembers() {
		if (orderedMembers == null) {
			orderedMembers = new EObjectResolvingEList<CoreSafetyElement>(CoreSafetyElement.class, this, CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS);
		}
		return orderedMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION:
				return getGroupCriterion();
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS:
				return getOrderedMembers();
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
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION:
				setGroupCriterion((String)newValue);
				return;
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS:
				getOrderedMembers().clear();
				getOrderedMembers().addAll((Collection<? extends CoreSafetyElement>)newValue);
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
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION:
				setGroupCriterion(GROUP_CRITERION_EDEFAULT);
				return;
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS:
				getOrderedMembers().clear();
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
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION:
				return GROUP_CRITERION_EDEFAULT == null ? groupCriterion != null : !GROUP_CRITERION_EDEFAULT.equals(groupCriterion);
			case CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS:
				return orderedMembers != null && !orderedMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ElementGroup.class) {
			switch (derivedFeatureID) {
				case CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION: return CorePackage.ELEMENT_GROUP__GROUP_CRITERION;
				case CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS: return CorePackage.ELEMENT_GROUP__ORDERED_MEMBERS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ElementGroup.class) {
			switch (baseFeatureID) {
				case CorePackage.ELEMENT_GROUP__GROUP_CRITERION: return CorePackage.ELEMENT_GROUP_BASED_ITEM__GROUP_CRITERION;
				case CorePackage.ELEMENT_GROUP__ORDERED_MEMBERS: return CorePackage.ELEMENT_GROUP_BASED_ITEM__ORDERED_MEMBERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (groupCriterion: ");
		result.append(groupCriterion);
		result.append(')');
		return result.toString();
	}

} //ElementGroupBasedItemImpl
