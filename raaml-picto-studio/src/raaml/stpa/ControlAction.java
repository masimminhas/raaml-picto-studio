/**
 */
package raaml.stpa;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action issued by a controller to control a process
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.ControlAction#getType <em>Type</em>}</li>
 *   <li>{@link raaml.stpa.ControlAction#getSourceController <em>Source Controller</em>}</li>
 *   <li>{@link raaml.stpa.ControlAction#getTargetProcess <em>Target Process</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getControlAction()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ControlAction'"
 * @generated
 */
public interface ControlAction extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of control action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see raaml.stpa.StpaPackage#getControlAction_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link raaml.stpa.ControlAction#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Source Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controller that issues this action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Controller</em>' reference.
	 * @see #setSourceController(Controller)
	 * @see raaml.stpa.StpaPackage#getControlAction_SourceController()
	 * @model required="true"
	 * @generated
	 */
	Controller getSourceController();

	/**
	 * Sets the value of the '{@link raaml.stpa.ControlAction#getSourceController <em>Source Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Controller</em>' reference.
	 * @see #getSourceController()
	 * @generated
	 */
	void setSourceController(Controller value);

	/**
	 * Returns the value of the '<em><b>Target Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Process that receives this action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Process</em>' reference.
	 * @see #setTargetProcess(ControlledProcess)
	 * @see raaml.stpa.StpaPackage#getControlAction_TargetProcess()
	 * @model required="true"
	 * @generated
	 */
	ControlledProcess getTargetProcess();

	/**
	 * Sets the value of the '{@link raaml.stpa.ControlAction#getTargetProcess <em>Target Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Process</em>' reference.
	 * @see #getTargetProcess()
	 * @generated
	 */
	void setTargetProcess(ControlledProcess value);

} // ControlAction
