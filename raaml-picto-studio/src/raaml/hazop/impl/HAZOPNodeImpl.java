/**
 */
package raaml.hazop.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.hazop.Deviation;
import raaml.hazop.HAZOPNode;
import raaml.hazop.HazopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HAZOP Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hazop.impl.HAZOPNodeImpl#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link raaml.hazop.impl.HAZOPNodeImpl#getDesignIntent <em>Design Intent</em>}</li>
 *   <li>{@link raaml.hazop.impl.HAZOPNodeImpl#getDeviations <em>Deviations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HAZOPNodeImpl extends CoreSafetyElementImpl implements HAZOPNode {
	/**
	 * The default value of the '{@link #getSubsystem() <em>Subsystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystem()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSYSTEM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubsystem() <em>Subsystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsystem()
	 * @generated
	 * @ordered
	 */
	protected String subsystem = SUBSYSTEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesignIntent() <em>Design Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignIntent()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_INTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignIntent() <em>Design Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignIntent()
	 * @generated
	 * @ordered
	 */
	protected String designIntent = DESIGN_INTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeviations() <em>Deviations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviations()
	 * @generated
	 * @ordered
	 */
	protected EList<Deviation> deviations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HAZOPNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazopPackage.Literals.HAZOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubsystem() {
		return subsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubsystem(String newSubsystem) {
		String oldSubsystem = subsystem;
		subsystem = newSubsystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.HAZOP_NODE__SUBSYSTEM, oldSubsystem, subsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDesignIntent() {
		return designIntent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDesignIntent(String newDesignIntent) {
		String oldDesignIntent = designIntent;
		designIntent = newDesignIntent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.HAZOP_NODE__DESIGN_INTENT, oldDesignIntent, designIntent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Deviation> getDeviations() {
		if (deviations == null) {
			deviations = new EObjectContainmentEList<Deviation>(Deviation.class, this, HazopPackage.HAZOP_NODE__DEVIATIONS);
		}
		return deviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazopPackage.HAZOP_NODE__DEVIATIONS:
				return ((InternalEList<?>)getDeviations()).basicRemove(otherEnd, msgs);
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
			case HazopPackage.HAZOP_NODE__SUBSYSTEM:
				return getSubsystem();
			case HazopPackage.HAZOP_NODE__DESIGN_INTENT:
				return getDesignIntent();
			case HazopPackage.HAZOP_NODE__DEVIATIONS:
				return getDeviations();
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
			case HazopPackage.HAZOP_NODE__SUBSYSTEM:
				setSubsystem((String)newValue);
				return;
			case HazopPackage.HAZOP_NODE__DESIGN_INTENT:
				setDesignIntent((String)newValue);
				return;
			case HazopPackage.HAZOP_NODE__DEVIATIONS:
				getDeviations().clear();
				getDeviations().addAll((Collection<? extends Deviation>)newValue);
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
			case HazopPackage.HAZOP_NODE__SUBSYSTEM:
				setSubsystem(SUBSYSTEM_EDEFAULT);
				return;
			case HazopPackage.HAZOP_NODE__DESIGN_INTENT:
				setDesignIntent(DESIGN_INTENT_EDEFAULT);
				return;
			case HazopPackage.HAZOP_NODE__DEVIATIONS:
				getDeviations().clear();
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
			case HazopPackage.HAZOP_NODE__SUBSYSTEM:
				return SUBSYSTEM_EDEFAULT == null ? subsystem != null : !SUBSYSTEM_EDEFAULT.equals(subsystem);
			case HazopPackage.HAZOP_NODE__DESIGN_INTENT:
				return DESIGN_INTENT_EDEFAULT == null ? designIntent != null : !DESIGN_INTENT_EDEFAULT.equals(designIntent);
			case HazopPackage.HAZOP_NODE__DEVIATIONS:
				return deviations != null && !deviations.isEmpty();
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
		result.append(" (subsystem: ");
		result.append(subsystem);
		result.append(", designIntent: ");
		result.append(designIntent);
		result.append(')');
		return result.toString();
	}

} //HAZOPNodeImpl
