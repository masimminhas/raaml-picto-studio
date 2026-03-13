/**
 */
package raaml.fta.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import raaml.core.impl.DysfunctionalEventImpl;

import raaml.fta.FTAElement;
import raaml.fta.FtaPackage;
import raaml.fta.Gate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTA Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.impl.FTAElementImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link raaml.fta.impl.FTAElementImpl#getSourceGate <em>Source Gate</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FTAElementImpl extends DysfunctionalEventImpl implements FTAElement {
	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTAElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtaPackage.Literals.FTA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtaPackage.FTA_ELEMENT__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate getSourceGate() {
		if (eContainerFeatureID() != FtaPackage.FTA_ELEMENT__SOURCE_GATE) return null;
		return (Gate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceGate(Gate newSourceGate, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceGate, FtaPackage.FTA_ELEMENT__SOURCE_GATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceGate(Gate newSourceGate) {
		if (newSourceGate != eInternalContainer() || (eContainerFeatureID() != FtaPackage.FTA_ELEMENT__SOURCE_GATE && newSourceGate != null)) {
			if (EcoreUtil.isAncestor(this, newSourceGate))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceGate != null)
				msgs = ((InternalEObject)newSourceGate).eInverseAdd(this, FtaPackage.GATE__SOURCE_EVENT, Gate.class, msgs);
			msgs = basicSetSourceGate(newSourceGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtaPackage.FTA_ELEMENT__SOURCE_GATE, newSourceGate, newSourceGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceGate((Gate)otherEnd, msgs);
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
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				return basicSetSourceGate(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				return eInternalContainer().eInverseRemove(this, FtaPackage.GATE__SOURCE_EVENT, Gate.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtaPackage.FTA_ELEMENT__PROBABILITY:
				return getProbability();
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				return getSourceGate();
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
			case FtaPackage.FTA_ELEMENT__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				setSourceGate((Gate)newValue);
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
			case FtaPackage.FTA_ELEMENT__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				setSourceGate((Gate)null);
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
			case FtaPackage.FTA_ELEMENT__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case FtaPackage.FTA_ELEMENT__SOURCE_GATE:
				return getSourceGate() != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //FTAElementImpl
