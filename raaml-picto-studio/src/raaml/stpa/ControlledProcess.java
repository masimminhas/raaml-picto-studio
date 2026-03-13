/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A process that is controlled
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.ControlledProcess#getReceivedActions <em>Received Actions</em>}</li>
 *   <li>{@link raaml.stpa.ControlledProcess#getProvidedFeedback <em>Provided Feedback</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getControlledProcess()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ControlledProcess'"
 * @generated
 */
public interface ControlledProcess extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Received Actions</b></em>' reference list.
	 * The list contents are of type {@link raaml.stpa.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control actions received by this process
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Received Actions</em>' reference list.
	 * @see raaml.stpa.StpaPackage#getControlledProcess_ReceivedActions()
	 * @model
	 * @generated
	 */
	EList<ControlAction> getReceivedActions();

	/**
	 * Returns the value of the '<em><b>Provided Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feedback provided by this process
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Feedback</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getControlledProcess_ProvidedFeedback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getProvidedFeedback();

} // ControlledProcess
