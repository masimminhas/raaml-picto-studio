/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import raaml.core.CorePackage;
import raaml.core.CoreSafetyElement;
import raaml.core.Item;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.ItemImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link raaml.core.impl.ItemImpl#getBoundaryMembers <em>Boundary Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ItemImpl extends CoreSafetyElementImpl implements Item {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreSafetyElement> members;

	/**
	 * The cached value of the '{@link #getBoundaryMembers() <em>Boundary Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreSafetyElement> boundaryMembers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoreSafetyElement> getMembers() {
		if (members == null) {
			members = new EObjectResolvingEList<CoreSafetyElement>(CoreSafetyElement.class, this, CorePackage.ITEM__MEMBERS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CoreSafetyElement> getBoundaryMembers() {
		if (boundaryMembers == null) {
			boundaryMembers = new EObjectResolvingEList<CoreSafetyElement>(CoreSafetyElement.class, this, CorePackage.ITEM__BOUNDARY_MEMBERS);
		}
		return boundaryMembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ITEM__MEMBERS:
				return getMembers();
			case CorePackage.ITEM__BOUNDARY_MEMBERS:
				return getBoundaryMembers();
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
			case CorePackage.ITEM__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends CoreSafetyElement>)newValue);
				return;
			case CorePackage.ITEM__BOUNDARY_MEMBERS:
				getBoundaryMembers().clear();
				getBoundaryMembers().addAll((Collection<? extends CoreSafetyElement>)newValue);
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
			case CorePackage.ITEM__MEMBERS:
				getMembers().clear();
				return;
			case CorePackage.ITEM__BOUNDARY_MEMBERS:
				getBoundaryMembers().clear();
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
			case CorePackage.ITEM__MEMBERS:
				return members != null && !members.isEmpty();
			case CorePackage.ITEM__BOUNDARY_MEMBERS:
				return boundaryMembers != null && !boundaryMembers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ItemImpl
