/**
 */
package raaml.fta.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.fta.Event;
import raaml.fta.FtaPackage;
import raaml.fta.Gate;
import raaml.fta.INHIBIT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.impl.EventImpl#getTargetGate <em>Target Gate</em>}</li>
 *   <li>{@link raaml.fta.impl.EventImpl#getInhibitGate <em>Inhibit Gate</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EventImpl extends FTAElementImpl implements Event {
	/**
	 * The cached value of the '{@link #getTargetGate() <em>Target Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetGate()
	 * @generated
	 * @ordered
	 */
	protected Gate targetGate;

	/**
	 * The cached value of the '{@link #getInhibitGate() <em>Inhibit Gate</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhibitGate()
	 * @generated
	 * @ordered
	 */
	protected EList<INHIBIT> inhibitGate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtaPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Gate getTargetGate() {
		if (targetGate != null && targetGate.eIsProxy()) {
			InternalEObject oldTargetGate = (InternalEObject)targetGate;
			targetGate = (Gate)eResolveProxy(oldTargetGate);
			if (targetGate != oldTargetGate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtaPackage.EVENT__TARGET_GATE, oldTargetGate, targetGate));
			}
		}
		return targetGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gate basicGetTargetGate() {
		return targetGate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetGate(Gate newTargetGate, NotificationChain msgs) {
		Gate oldTargetGate = targetGate;
		targetGate = newTargetGate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtaPackage.EVENT__TARGET_GATE, oldTargetGate, newTargetGate);
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
	public void setTargetGate(Gate newTargetGate) {
		if (newTargetGate != targetGate) {
			NotificationChain msgs = null;
			if (targetGate != null)
				msgs = ((InternalEObject)targetGate).eInverseRemove(this, FtaPackage.GATE__TARGET_EVENT, Gate.class, msgs);
			if (newTargetGate != null)
				msgs = ((InternalEObject)newTargetGate).eInverseAdd(this, FtaPackage.GATE__TARGET_EVENT, Gate.class, msgs);
			msgs = basicSetTargetGate(newTargetGate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtaPackage.EVENT__TARGET_GATE, newTargetGate, newTargetGate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<INHIBIT> getInhibitGate() {
		if (inhibitGate == null) {
			inhibitGate = new EObjectWithInverseResolvingEList.ManyInverse<INHIBIT>(INHIBIT.class, this, FtaPackage.EVENT__INHIBIT_GATE, FtaPackage.INHIBIT__CONDITION);
		}
		return inhibitGate;
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
			case FtaPackage.EVENT__TARGET_GATE:
				if (targetGate != null)
					msgs = ((InternalEObject)targetGate).eInverseRemove(this, FtaPackage.GATE__TARGET_EVENT, Gate.class, msgs);
				return basicSetTargetGate((Gate)otherEnd, msgs);
			case FtaPackage.EVENT__INHIBIT_GATE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInhibitGate()).basicAdd(otherEnd, msgs);
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
			case FtaPackage.EVENT__TARGET_GATE:
				return basicSetTargetGate(null, msgs);
			case FtaPackage.EVENT__INHIBIT_GATE:
				return ((InternalEList<?>)getInhibitGate()).basicRemove(otherEnd, msgs);
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
			case FtaPackage.EVENT__TARGET_GATE:
				if (resolve) return getTargetGate();
				return basicGetTargetGate();
			case FtaPackage.EVENT__INHIBIT_GATE:
				return getInhibitGate();
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
			case FtaPackage.EVENT__TARGET_GATE:
				setTargetGate((Gate)newValue);
				return;
			case FtaPackage.EVENT__INHIBIT_GATE:
				getInhibitGate().clear();
				getInhibitGate().addAll((Collection<? extends INHIBIT>)newValue);
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
			case FtaPackage.EVENT__TARGET_GATE:
				setTargetGate((Gate)null);
				return;
			case FtaPackage.EVENT__INHIBIT_GATE:
				getInhibitGate().clear();
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
			case FtaPackage.EVENT__TARGET_GATE:
				return targetGate != null;
			case FtaPackage.EVENT__INHIBIT_GATE:
				return inhibitGate != null && !inhibitGate.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventImpl
