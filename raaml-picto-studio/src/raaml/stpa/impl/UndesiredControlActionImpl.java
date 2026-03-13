/**
 */
package raaml.stpa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.Factor;
import raaml.core.HarmPotential;
import raaml.core.ProcessModelFlaw;
import raaml.core.Scenario;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.ControlAction;
import raaml.stpa.StpaPackage;
import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undesired Control Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.UndesiredControlActionImpl#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link raaml.stpa.impl.UndesiredControlActionImpl#getUnsafeType <em>Unsafe Type</em>}</li>
 *   <li>{@link raaml.stpa.impl.UndesiredControlActionImpl#getProcessModelFlaw <em>Process Model Flaw</em>}</li>
 *   <li>{@link raaml.stpa.impl.UndesiredControlActionImpl#getHarmPotential <em>Harm Potential</em>}</li>
 *   <li>{@link raaml.stpa.impl.UndesiredControlActionImpl#getCausalFactors <em>Causal Factors</em>}</li>
 *   <li>{@link raaml.stpa.impl.UndesiredControlActionImpl#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UndesiredControlActionImpl extends CoreSafetyElementImpl implements UndesiredControlAction {
	/**
	 * The cached value of the '{@link #getControlAction() <em>Control Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlAction()
	 * @generated
	 * @ordered
	 */
	protected ControlAction controlAction;

	/**
	 * The default value of the '{@link #getUnsafeType() <em>Unsafe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsafeType()
	 * @generated
	 * @ordered
	 */
	protected static final String UNSAFE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnsafeType() <em>Unsafe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsafeType()
	 * @generated
	 * @ordered
	 */
	protected String unsafeType = UNSAFE_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getHarmPotential() <em>Harm Potential</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHarmPotential()
	 * @generated
	 * @ordered
	 */
	protected EList<HarmPotential> harmPotential;

	/**
	 * The cached value of the '{@link #getCausalFactors() <em>Causal Factors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausalFactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Factor> causalFactors;

	/**
	 * The cached value of the '{@link #getScenarios() <em>Scenarios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenarios()
	 * @generated
	 * @ordered
	 */
	protected EList<Scenario> scenarios;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UndesiredControlActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.UNDESIRED_CONTROL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlAction getControlAction() {
		if (controlAction != null && controlAction.eIsProxy()) {
			InternalEObject oldControlAction = (InternalEObject)controlAction;
			controlAction = (ControlAction)eResolveProxy(oldControlAction);
			if (controlAction != oldControlAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StpaPackage.UNDESIRED_CONTROL_ACTION__CONTROL_ACTION, oldControlAction, controlAction));
			}
		}
		return controlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAction basicGetControlAction() {
		return controlAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setControlAction(ControlAction newControlAction) {
		ControlAction oldControlAction = controlAction;
		controlAction = newControlAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.UNDESIRED_CONTROL_ACTION__CONTROL_ACTION, oldControlAction, controlAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnsafeType() {
		return unsafeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsafeType(String newUnsafeType) {
		String oldUnsafeType = unsafeType;
		unsafeType = newUnsafeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StpaPackage.UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE, oldUnsafeType, unsafeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProcessModelFlaw> getProcessModelFlaw() {
		if (processModelFlaw == null) {
			processModelFlaw = new EObjectResolvingEList<ProcessModelFlaw>(ProcessModelFlaw.class, this, StpaPackage.UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW);
		}
		return processModelFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HarmPotential> getHarmPotential() {
		if (harmPotential == null) {
			harmPotential = new EObjectResolvingEList<HarmPotential>(HarmPotential.class, this, StpaPackage.UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL);
		}
		return harmPotential;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Factor> getCausalFactors() {
		if (causalFactors == null) {
			causalFactors = new EObjectContainmentEList<Factor>(Factor.class, this, StpaPackage.UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS);
		}
		return causalFactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Scenario> getScenarios() {
		if (scenarios == null) {
			scenarios = new EObjectContainmentEList<Scenario>(Scenario.class, this, StpaPackage.UNDESIRED_CONTROL_ACTION__SCENARIOS);
		}
		return scenarios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS:
				return ((InternalEList<?>)getCausalFactors()).basicRemove(otherEnd, msgs);
			case StpaPackage.UNDESIRED_CONTROL_ACTION__SCENARIOS:
				return ((InternalEList<?>)getScenarios()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CONTROL_ACTION:
				if (resolve) return getControlAction();
				return basicGetControlAction();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE:
				return getUnsafeType();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW:
				return getProcessModelFlaw();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL:
				return getHarmPotential();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS:
				return getCausalFactors();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__SCENARIOS:
				return getScenarios();
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
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CONTROL_ACTION:
				setControlAction((ControlAction)newValue);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE:
				setUnsafeType((String)newValue);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW:
				getProcessModelFlaw().clear();
				getProcessModelFlaw().addAll((Collection<? extends ProcessModelFlaw>)newValue);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL:
				getHarmPotential().clear();
				getHarmPotential().addAll((Collection<? extends HarmPotential>)newValue);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS:
				getCausalFactors().clear();
				getCausalFactors().addAll((Collection<? extends Factor>)newValue);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__SCENARIOS:
				getScenarios().clear();
				getScenarios().addAll((Collection<? extends Scenario>)newValue);
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
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CONTROL_ACTION:
				setControlAction((ControlAction)null);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE:
				setUnsafeType(UNSAFE_TYPE_EDEFAULT);
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW:
				getProcessModelFlaw().clear();
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL:
				getHarmPotential().clear();
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS:
				getCausalFactors().clear();
				return;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__SCENARIOS:
				getScenarios().clear();
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
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CONTROL_ACTION:
				return controlAction != null;
			case StpaPackage.UNDESIRED_CONTROL_ACTION__UNSAFE_TYPE:
				return UNSAFE_TYPE_EDEFAULT == null ? unsafeType != null : !UNSAFE_TYPE_EDEFAULT.equals(unsafeType);
			case StpaPackage.UNDESIRED_CONTROL_ACTION__PROCESS_MODEL_FLAW:
				return processModelFlaw != null && !processModelFlaw.isEmpty();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__HARM_POTENTIAL:
				return harmPotential != null && !harmPotential.isEmpty();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__CAUSAL_FACTORS:
				return causalFactors != null && !causalFactors.isEmpty();
			case StpaPackage.UNDESIRED_CONTROL_ACTION__SCENARIOS:
				return scenarios != null && !scenarios.isEmpty();
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
		result.append(" (unsafeType: ");
		result.append(unsafeType);
		result.append(')');
		return result.toString();
	}

} //UndesiredControlActionImpl
