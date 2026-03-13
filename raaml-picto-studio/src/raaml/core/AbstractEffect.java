/**
 */
package raaml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Effect with severity assessment
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AbstractEffect#getSeverity <em>Severity</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAbstractEffect()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractEffect extends DysfunctionalEvent {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Severity level of the effect
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(double)
	 * @see raaml.core.CorePackage#getAbstractEffect_Severity()
	 * @model
	 * @generated
	 */
	double getSeverity();

	/**
	 * Sets the value of the '{@link raaml.core.AbstractEffect#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(double value);

} // AbstractEffect
