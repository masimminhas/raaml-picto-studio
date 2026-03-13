/**
 */
package raaml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for failure modes with detectability
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AbstractFailureMode#getDetectability <em>Detectability</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAbstractFailureMode()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractFailureMode extends UndesiredState {
	/**
	 * Returns the value of the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How easily the failure mode can be detected
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detectability</em>' attribute.
	 * @see #setDetectability(double)
	 * @see raaml.core.CorePackage#getAbstractFailureMode_Detectability()
	 * @model
	 * @generated
	 */
	double getDetectability();

	/**
	 * Sets the value of the '{@link raaml.core.AbstractFailureMode#getDetectability <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detectability</em>' attribute.
	 * @see #getDetectability()
	 * @generated
	 */
	void setDetectability(double value);

} // AbstractFailureMode
