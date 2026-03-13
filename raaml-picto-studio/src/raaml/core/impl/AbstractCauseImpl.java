/**
 */
package raaml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.AbstractCause;
import raaml.core.CorePackage;
import raaml.core.DysfunctionalEvent;
import raaml.core.Factor;
import raaml.core.ProcessModelFlaw;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.impl.AbstractCauseImpl#getProcessModelFlaw <em>Process Model Flaw</em>}</li>
 *   <li>{@link raaml.core.impl.AbstractCauseImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link raaml.core.impl.AbstractCauseImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCauseImpl extends AbstractEventImpl implements AbstractCause {
	/**
	 * The cached value of the '{@link #getProcessModelFlaw() <em>Process Model Flaw</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessModelFlaw()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessModelFlaw> processModelFlaw;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final double OCCURRENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected double occurrence = OCCURRENCE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ABSTRACT_CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModelFlaw> getProcessModelFlaw() {
		if (processModelFlaw == null) {
			processModelFlaw = new EObjectResolvingEList<ProcessModelFlaw>(ProcessModelFlaw.class, this, CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW);
		}
		return processModelFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrence(double newOccurrence) {
		double oldOccurrence = occurrence;
		occurrence = newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ABSTRACT_CAUSE__OCCURRENCE, oldOccurrence, occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DysfunctionalEvent> getError() {
		if (error == null) {
			error = new EObjectWithInverseResolvingEList.ManyInverse<DysfunctionalEvent>(DysfunctionalEvent.class, this, CorePackage.ABSTRACT_CAUSE__ERROR, CorePackage.DYSFUNCTIONAL_EVENT__FAULT);
		}
		return error;
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
			case CorePackage.ABSTRACT_CAUSE__ERROR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getError()).basicAdd(otherEnd, msgs);
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
			case CorePackage.ABSTRACT_CAUSE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW:
				return getProcessModelFlaw();
			case CorePackage.ABSTRACT_CAUSE__OCCURRENCE:
				return getOccurrence();
			case CorePackage.ABSTRACT_CAUSE__ERROR:
				return getError();
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
			case CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW:
				getProcessModelFlaw().clear();
				getProcessModelFlaw().addAll((Collection<? extends ProcessModelFlaw>)newValue);
				return;
			case CorePackage.ABSTRACT_CAUSE__OCCURRENCE:
				setOccurrence((Double)newValue);
				return;
			case CorePackage.ABSTRACT_CAUSE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends DysfunctionalEvent>)newValue);
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
			case CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW:
				getProcessModelFlaw().clear();
				return;
			case CorePackage.ABSTRACT_CAUSE__OCCURRENCE:
				setOccurrence(OCCURRENCE_EDEFAULT);
				return;
			case CorePackage.ABSTRACT_CAUSE__ERROR:
				getError().clear();
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
			case CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW:
				return processModelFlaw != null && !processModelFlaw.isEmpty();
			case CorePackage.ABSTRACT_CAUSE__OCCURRENCE:
				return occurrence != OCCURRENCE_EDEFAULT;
			case CorePackage.ABSTRACT_CAUSE__ERROR:
				return error != null && !error.isEmpty();
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
		if (baseClass == Factor.class) {
			switch (derivedFeatureID) {
				case CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW: return CorePackage.FACTOR__PROCESS_MODEL_FLAW;
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
		if (baseClass == Factor.class) {
			switch (baseFeatureID) {
				case CorePackage.FACTOR__PROCESS_MODEL_FLAW: return CorePackage.ABSTRACT_CAUSE__PROCESS_MODEL_FLAW;
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
		result.append(" (occurrence: ");
		result.append(occurrence);
		result.append(')');
		return result.toString();
	}

} //AbstractCauseImpl
