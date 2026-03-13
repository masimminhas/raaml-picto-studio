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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.fta.Event;
import raaml.fta.FTAElement;
import raaml.fta.FtaPackage;
import raaml.fta.Gate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.impl.GateImpl#getSourceEvent <em>Source Event</em>}</li>
 *   <li>{@link raaml.fta.impl.GateImpl#getTargetEvent <em>Target Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GateImpl extends CoreSafetyElementImpl implements Gate {
	/**
	 * The cached value of the '{@link #getSourceEvent() <em>Source Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<FTAElement> sourceEvent;

	/**
	 * The cached value of the '{@link #getTargetEvent() <em>Target Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEvent()
	 * @generated
	 * @ordered
	 */
	protected Event targetEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtaPackage.Literals.GATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FTAElement> getSourceEvent() {
		if (sourceEvent == null) {
			sourceEvent = new EObjectContainmentWithInverseEList<FTAElement>(FTAElement.class, this, FtaPackage.GATE__SOURCE_EVENT, FtaPackage.FTA_ELEMENT__SOURCE_GATE);
		}
		return sourceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getTargetEvent() {
		if (targetEvent != null && targetEvent.eIsProxy()) {
			InternalEObject oldTargetEvent = (InternalEObject)targetEvent;
			targetEvent = (Event)eResolveProxy(oldTargetEvent);
			if (targetEvent != oldTargetEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtaPackage.GATE__TARGET_EVENT, oldTargetEvent, targetEvent));
			}
		}
		return targetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTargetEvent() {
		return targetEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetEvent(Event newTargetEvent, NotificationChain msgs) {
		Event oldTargetEvent = targetEvent;
		targetEvent = newTargetEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtaPackage.GATE__TARGET_EVENT, oldTargetEvent, newTargetEvent);
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
	public void setTargetEvent(Event newTargetEvent) {
		if (newTargetEvent != targetEvent) {
			NotificationChain msgs = null;
			if (targetEvent != null)
				msgs = ((InternalEObject)targetEvent).eInverseRemove(this, FtaPackage.EVENT__TARGET_GATE, Event.class, msgs);
			if (newTargetEvent != null)
				msgs = ((InternalEObject)newTargetEvent).eInverseAdd(this, FtaPackage.EVENT__TARGET_GATE, Event.class, msgs);
			msgs = basicSetTargetEvent(newTargetEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtaPackage.GATE__TARGET_EVENT, newTargetEvent, newTargetEvent));
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
			case FtaPackage.GATE__SOURCE_EVENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceEvent()).basicAdd(otherEnd, msgs);
			case FtaPackage.GATE__TARGET_EVENT:
				if (targetEvent != null)
					msgs = ((InternalEObject)targetEvent).eInverseRemove(this, FtaPackage.EVENT__TARGET_GATE, Event.class, msgs);
				return basicSetTargetEvent((Event)otherEnd, msgs);
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
			case FtaPackage.GATE__SOURCE_EVENT:
				return ((InternalEList<?>)getSourceEvent()).basicRemove(otherEnd, msgs);
			case FtaPackage.GATE__TARGET_EVENT:
				return basicSetTargetEvent(null, msgs);
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
			case FtaPackage.GATE__SOURCE_EVENT:
				return getSourceEvent();
			case FtaPackage.GATE__TARGET_EVENT:
				if (resolve) return getTargetEvent();
				return basicGetTargetEvent();
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
			case FtaPackage.GATE__SOURCE_EVENT:
				getSourceEvent().clear();
				getSourceEvent().addAll((Collection<? extends FTAElement>)newValue);
				return;
			case FtaPackage.GATE__TARGET_EVENT:
				setTargetEvent((Event)newValue);
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
			case FtaPackage.GATE__SOURCE_EVENT:
				getSourceEvent().clear();
				return;
			case FtaPackage.GATE__TARGET_EVENT:
				setTargetEvent((Event)null);
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
			case FtaPackage.GATE__SOURCE_EVENT:
				return sourceEvent != null && !sourceEvent.isEmpty();
			case FtaPackage.GATE__TARGET_EVENT:
				return targetEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //GateImpl
