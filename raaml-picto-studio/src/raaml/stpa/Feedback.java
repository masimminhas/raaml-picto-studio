/**
 */
package raaml.stpa;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Feedback provided to a controller
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.Feedback#getType <em>Type</em>}</li>
 *   <li>{@link raaml.stpa.Feedback#getSource <em>Source</em>}</li>
 *   <li>{@link raaml.stpa.Feedback#getTargetController <em>Target Controller</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getFeedback()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Feedback'"
 * @generated
 */
public interface Feedback extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of feedback
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see raaml.stpa.StpaPackage#getFeedback_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link raaml.stpa.Feedback#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source of the feedback
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ControlledProcess)
	 * @see raaml.stpa.StpaPackage#getFeedback_Source()
	 * @model required="true"
	 * @generated
	 */
	ControlledProcess getSource();

	/**
	 * Sets the value of the '{@link raaml.stpa.Feedback#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ControlledProcess value);

	/**
	 * Returns the value of the '<em><b>Target Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Controller that receives this feedback
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Controller</em>' reference.
	 * @see #setTargetController(Controller)
	 * @see raaml.stpa.StpaPackage#getFeedback_TargetController()
	 * @model required="true"
	 * @generated
	 */
	Controller getTargetController();

	/**
	 * Sets the value of the '{@link raaml.stpa.Feedback#getTargetController <em>Target Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Controller</em>' reference.
	 * @see #getTargetController()
	 * @generated
	 */
	void setTargetController(Controller value);

} // Feedback
