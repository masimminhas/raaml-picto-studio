/**
 */
package raaml.stpa.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.stpa.Actuator;
import raaml.stpa.ControlStructure;
import raaml.stpa.ControlledProcess;
import raaml.stpa.Controller;
import raaml.stpa.Sensor;
import raaml.stpa.StpaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.impl.ControlStructureImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControlStructureImpl#getControlledProcesses <em>Controlled Processes</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControlStructureImpl#getActuators <em>Actuators</em>}</li>
 *   <li>{@link raaml.stpa.impl.ControlStructureImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlStructureImpl extends CoreSafetyElementImpl implements ControlStructure {
	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<Controller> controllers;

	/**
	 * The cached value of the '{@link #getControlledProcesses() <em>Controlled Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlledProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlledProcess> controlledProcesses;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuators;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StpaPackage.Literals.CONTROL_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Controller> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentEList<Controller>(Controller.class, this, StpaPackage.CONTROL_STRUCTURE__CONTROLLERS);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlledProcess> getControlledProcesses() {
		if (controlledProcesses == null) {
			controlledProcesses = new EObjectContainmentEList<ControlledProcess>(ControlledProcess.class, this, StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES);
		}
		return controlledProcesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Actuator> getActuators() {
		if (actuators == null) {
			actuators = new EObjectContainmentEList<Actuator>(Actuator.class, this, StpaPackage.CONTROL_STRUCTURE__ACTUATORS);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentEList<Sensor>(Sensor.class, this, StpaPackage.CONTROL_STRUCTURE__SENSORS);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES:
				return ((InternalEList<?>)getControlledProcesses()).basicRemove(otherEnd, msgs);
			case StpaPackage.CONTROL_STRUCTURE__ACTUATORS:
				return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
			case StpaPackage.CONTROL_STRUCTURE__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
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
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLERS:
				return getControllers();
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES:
				return getControlledProcesses();
			case StpaPackage.CONTROL_STRUCTURE__ACTUATORS:
				return getActuators();
			case StpaPackage.CONTROL_STRUCTURE__SENSORS:
				return getSensors();
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
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLERS:
				getControllers().clear();
				getControllers().addAll((Collection<? extends Controller>)newValue);
				return;
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES:
				getControlledProcesses().clear();
				getControlledProcesses().addAll((Collection<? extends ControlledProcess>)newValue);
				return;
			case StpaPackage.CONTROL_STRUCTURE__ACTUATORS:
				getActuators().clear();
				getActuators().addAll((Collection<? extends Actuator>)newValue);
				return;
			case StpaPackage.CONTROL_STRUCTURE__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
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
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLERS:
				getControllers().clear();
				return;
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES:
				getControlledProcesses().clear();
				return;
			case StpaPackage.CONTROL_STRUCTURE__ACTUATORS:
				getActuators().clear();
				return;
			case StpaPackage.CONTROL_STRUCTURE__SENSORS:
				getSensors().clear();
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
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
			case StpaPackage.CONTROL_STRUCTURE__CONTROLLED_PROCESSES:
				return controlledProcesses != null && !controlledProcesses.isEmpty();
			case StpaPackage.CONTROL_STRUCTURE__ACTUATORS:
				return actuators != null && !actuators.isEmpty();
			case StpaPackage.CONTROL_STRUCTURE__SENSORS:
				return sensors != null && !sensors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlStructureImpl
