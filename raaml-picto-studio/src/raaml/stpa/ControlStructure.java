/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Control structure diagram showing control loops
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.ControlStructure#getControllers <em>Controllers</em>}</li>
 *   <li>{@link raaml.stpa.ControlStructure#getControlledProcesses <em>Controlled Processes</em>}</li>
 *   <li>{@link raaml.stpa.ControlStructure#getActuators <em>Actuators</em>}</li>
 *   <li>{@link raaml.stpa.ControlStructure#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getControlStructure()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ControlStructure'"
 * @generated
 */
public interface ControlStructure extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Controller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controllers in the control structure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getControlStructure_Controllers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Controlled Processes</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.ControlledProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controlled processes in the structure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Controlled Processes</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getControlStructure_ControlledProcesses()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlledProcess> getControlledProcesses();

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Actuator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actuators in the control structure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getControlStructure_Actuators()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Sensor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sensors in the control structure
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getControlStructure_Sensors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

} // ControlStructure
