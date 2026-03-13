/**
 */
package raaml.gsn;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contextual Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for contextual information in GSN
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.gsn.ContextualInformation#getContextId <em>Context Id</em>}</li>
 * </ul>
 *
 * @see raaml.gsn.GsnPackage#getContextualInformation()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface ContextualInformation extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the contextual element (e.g., C1, J1, A1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context Id</em>' attribute.
	 * @see #setContextId(String)
	 * @see raaml.gsn.GsnPackage#getContextualInformation_ContextId()
	 * @model
	 * @generated
	 */
	String getContextId();

	/**
	 * Sets the value of the '{@link raaml.gsn.ContextualInformation#getContextId <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Id</em>' attribute.
	 * @see #getContextId()
	 * @generated
	 */
	void setContextId(String value);

} // ContextualInformation
