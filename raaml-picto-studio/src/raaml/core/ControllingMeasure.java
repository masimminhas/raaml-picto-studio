/**
 */
package raaml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controlling Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for measures that control or mitigate risks
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.ControllingMeasure#getAffects <em>Affects</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getControllingMeasure()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface ControllingMeasure extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Affects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of what the measure affects
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affects</em>' attribute.
	 * @see #setAffects(String)
	 * @see raaml.core.CorePackage#getControllingMeasure_Affects()
	 * @model
	 * @generated
	 */
	String getAffects();

	/**
	 * Sets the value of the '{@link raaml.core.ControllingMeasure#getAffects <em>Affects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affects</em>' attribute.
	 * @see #getAffects()
	 * @generated
	 */
	void setAffects(String value);

} // ControllingMeasure
