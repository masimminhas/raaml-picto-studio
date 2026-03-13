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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.fta.Event;
import raaml.fta.FTATree;
import raaml.fta.FtaPackage;
import raaml.fta.Gate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTA Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.impl.FTATreeImpl#getTopEvent <em>Top Event</em>}</li>
 *   <li>{@link raaml.fta.impl.FTATreeImpl#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTATreeImpl extends CoreSafetyElementImpl implements FTATree {
	/**
	 * The cached value of the '{@link #getTopEvent() <em>Top Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopEvent()
	 * @generated
	 * @ordered
	 */
	protected Event topEvent;

	/**
	 * The cached value of the '{@link #getGates() <em>Gates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGates()
	 * @generated
	 * @ordered
	 */
	protected EList<Gate> gates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FTATreeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtaPackage.Literals.FTA_TREE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event getTopEvent() {
		return topEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTopEvent(Event newTopEvent, NotificationChain msgs) {
		Event oldTopEvent = topEvent;
		topEvent = newTopEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FtaPackage.FTA_TREE__TOP_EVENT, oldTopEvent, newTopEvent);
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
	public void setTopEvent(Event newTopEvent) {
		if (newTopEvent != topEvent) {
			NotificationChain msgs = null;
			if (topEvent != null)
				msgs = ((InternalEObject)topEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FtaPackage.FTA_TREE__TOP_EVENT, null, msgs);
			if (newTopEvent != null)
				msgs = ((InternalEObject)newTopEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FtaPackage.FTA_TREE__TOP_EVENT, null, msgs);
			msgs = basicSetTopEvent(newTopEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtaPackage.FTA_TREE__TOP_EVENT, newTopEvent, newTopEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Gate> getGates() {
		if (gates == null) {
			gates = new EObjectContainmentEList<Gate>(Gate.class, this, FtaPackage.FTA_TREE__GATES);
		}
		return gates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FtaPackage.FTA_TREE__TOP_EVENT:
				return basicSetTopEvent(null, msgs);
			case FtaPackage.FTA_TREE__GATES:
				return ((InternalEList<?>)getGates()).basicRemove(otherEnd, msgs);
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
			case FtaPackage.FTA_TREE__TOP_EVENT:
				return getTopEvent();
			case FtaPackage.FTA_TREE__GATES:
				return getGates();
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
			case FtaPackage.FTA_TREE__TOP_EVENT:
				setTopEvent((Event)newValue);
				return;
			case FtaPackage.FTA_TREE__GATES:
				getGates().clear();
				getGates().addAll((Collection<? extends Gate>)newValue);
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
			case FtaPackage.FTA_TREE__TOP_EVENT:
				setTopEvent((Event)null);
				return;
			case FtaPackage.FTA_TREE__GATES:
				getGates().clear();
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
			case FtaPackage.FTA_TREE__TOP_EVENT:
				return topEvent != null;
			case FtaPackage.FTA_TREE__GATES:
				return gates != null && !gates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FTATreeImpl
