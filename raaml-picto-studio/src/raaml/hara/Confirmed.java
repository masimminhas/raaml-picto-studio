/**
 */
package raaml.hara;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confirmed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Confirmation status of an element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.Confirmed#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getConfirmed()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Confirmed'"
 * @generated
 */
public interface Confirmed extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see #setResult(String)
	 * @see raaml.hara.HaraPackage#getConfirmed_Result()
	 * @model
	 * @generated
	 */
	String getResult();

	/**
	 * Sets the value of the '{@link raaml.hara.Confirmed#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(String value);

} // Confirmed
