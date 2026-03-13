/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An actuator that executes control actions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.Actuator#getExecutedActions <em>Executed Actions</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getActuator()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Actuator'"
 * @generated
 */
public interface Actuator extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Executed Actions</b></em>' reference list.
	 * The list contents are of type {@link raaml.stpa.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control actions executed by this actuator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Executed Actions</em>' reference list.
	 * @see raaml.stpa.StpaPackage#getActuator_ExecutedActions()
	 * @model
	 * @generated
	 */
	EList<ControlAction> getExecutedActions();

} // Actuator
