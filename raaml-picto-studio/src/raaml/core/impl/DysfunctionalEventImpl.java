/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.AbstractCause;
import raaml.core.CorePackage;
import raaml.core.DysfunctionalEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dysfunctional Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.DysfunctionalEventImpl#getToError <em>To Error</em>}</li>
 *   <li>{@link raaml.core.impl.DysfunctionalEventImpl#getFromError <em>From Error</em>}</li>
 *   <li>{@link raaml.core.impl.DysfunctionalEventImpl#getError <em>Error</em>}</li>
 *   <li>{@link raaml.core.impl.DysfunctionalEventImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link raaml.core.impl.DysfunctionalEventImpl#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DysfunctionalEventImpl extends AbstractEventImpl implements DysfunctionalEvent {
	/**
	 * The cached value of the '{@link #getToError() <em>To Error</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToError()
	 * @generated
	 * @ordered
	 */
	protected EList<DysfunctionalEvent> toError;

	/**
	 * The cached value of the '{@link #getFromError() <em>From Error</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromError()
	 * @generated
	 * @ordered
	 */
	protected EList<DysfunctionalEvent> fromError;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<DysfunctionalEvent> error;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<DysfunctionalEvent> failure;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractCause> fault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DysfunctionalEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DYSFUNCTIONAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DysfunctionalEvent> getToError() {
		if (toError == null) {
			toError = new EObjectWithInverseResolvingEList.ManyInverse<DysfunctionalEvent>(DysfunctionalEvent.class, this, CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR, CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR);
		}
		return toError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DysfunctionalEvent> getFromError() {
		if (fromError == null) {
			fromError = new EObjectWithInverseResolvingEList.ManyInverse<DysfunctionalEvent>(DysfunctionalEvent.class, this, CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR, CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR);
		}
		return fromError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DysfunctionalEvent> getError() {
		if (error == null) {
			error = new EObjectWithInverseResolvingEList.ManyInverse<DysfunctionalEvent>(DysfunctionalEvent.class, this, CorePackage.DYSFUNCTIONAL_EVENT__ERROR, CorePackage.DYSFUNCTIONAL_EVENT__FAILURE);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DysfunctionalEvent> getFailure() {
		if (failure == null) {
			failure = new EObjectWithInverseResolvingEList.ManyInverse<DysfunctionalEvent>(DysfunctionalEvent.class, this, CorePackage.DYSFUNCTIONAL_EVENT__FAILURE, CorePackage.DYSFUNCTIONAL_EVENT__ERROR);
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCause> getFault() {
		if (fault == null) {
			fault = new EObjectWithInverseResolvingEList.ManyInverse<AbstractCause>(AbstractCause.class, this, CorePackage.DYSFUNCTIONAL_EVENT__FAULT, CorePackage.ABSTRACT_CAUSE__ERROR);
		}
		return fault;
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
			case CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToError()).basicAdd(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromError()).basicAdd(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__ERROR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getError()).basicAdd(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__FAILURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFailure()).basicAdd(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__FAULT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFault()).basicAdd(otherEnd, msgs);
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
			case CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR:
				return ((InternalEList<?>)getToError()).basicRemove(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR:
				return ((InternalEList<?>)getFromError()).basicRemove(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case CorePackage.DYSFUNCTIONAL_EVENT__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR:
				return getToError();
			case CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR:
				return getFromError();
			case CorePackage.DYSFUNCTIONAL_EVENT__ERROR:
				return getError();
			case CorePackage.DYSFUNCTIONAL_EVENT__FAILURE:
				return getFailure();
			case CorePackage.DYSFUNCTIONAL_EVENT__FAULT:
				return getFault();
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
			case CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR:
				getToError().clear();
				getToError().addAll((Collection<? extends DysfunctionalEvent>)newValue);
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR:
				getFromError().clear();
				getFromError().addAll((Collection<? extends DysfunctionalEvent>)newValue);
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends DysfunctionalEvent>)newValue);
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends DysfunctionalEvent>)newValue);
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends AbstractCause>)newValue);
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
			case CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR:
				getToError().clear();
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR:
				getFromError().clear();
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__ERROR:
				getError().clear();
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__FAILURE:
				getFailure().clear();
				return;
			case CorePackage.DYSFUNCTIONAL_EVENT__FAULT:
				getFault().clear();
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
			case CorePackage.DYSFUNCTIONAL_EVENT__TO_ERROR:
				return toError != null && !toError.isEmpty();
			case CorePackage.DYSFUNCTIONAL_EVENT__FROM_ERROR:
				return fromError != null && !fromError.isEmpty();
			case CorePackage.DYSFUNCTIONAL_EVENT__ERROR:
				return error != null && !error.isEmpty();
			case CorePackage.DYSFUNCTIONAL_EVENT__FAILURE:
				return failure != null && !failure.isEmpty();
			case CorePackage.DYSFUNCTIONAL_EVENT__FAULT:
				return fault != null && !fault.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DysfunctionalEventImpl
