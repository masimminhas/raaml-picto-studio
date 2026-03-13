/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A controller that issues control actions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.Controller#getControlActions <em>Control Actions</em>}</li>
 *   <li>{@link raaml.stpa.Controller#getFeedback <em>Feedback</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getController()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Controller'"
 * @generated
 */
public interface Controller extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Control Actions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control actions issued by this controller
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Actions</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getController_ControlActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlAction> getControlActions();

	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feedback received by this controller
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feedback</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getController_Feedback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getFeedback();

} // Controller
