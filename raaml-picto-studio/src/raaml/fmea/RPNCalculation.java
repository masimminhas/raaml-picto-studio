/**
 */
package raaml.fmea;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPN Calculation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk Priority Number calculation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.RPNCalculation#getRPN <em>RPN</em>}</li>
 *   <li>{@link raaml.fmea.RPNCalculation#getSEV <em>SEV</em>}</li>
 *   <li>{@link raaml.fmea.RPNCalculation#getOCC <em>OCC</em>}</li>
 *   <li>{@link raaml.fmea.RPNCalculation#getDET <em>DET</em>}</li>
 * </ul>
 *
 * @see raaml.fmea.FmeaPackage#getRPNCalculation()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='RPNCalculation'"
 * @generated
 */
public interface RPNCalculation extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>RPN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk Priority Number (SEV × OCC × DET)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RPN</em>' attribute.
	 * @see #setRPN(double)
	 * @see raaml.fmea.FmeaPackage#getRPNCalculation_RPN()
	 * @model
	 * @generated
	 */
	double getRPN();

	/**
	 * Sets the value of the '{@link raaml.fmea.RPNCalculation#getRPN <em>RPN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPN</em>' attribute.
	 * @see #getRPN()
	 * @generated
	 */
	void setRPN(double value);

	/**
	 * Returns the value of the '<em><b>SEV</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Severity rating (1-10)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SEV</em>' attribute.
	 * @see #setSEV(double)
	 * @see raaml.fmea.FmeaPackage#getRPNCalculation_SEV()
	 * @model
	 * @generated
	 */
	double getSEV();

	/**
	 * Sets the value of the '{@link raaml.fmea.RPNCalculation#getSEV <em>SEV</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SEV</em>' attribute.
	 * @see #getSEV()
	 * @generated
	 */
	void setSEV(double value);

	/**
	 * Returns the value of the '<em><b>OCC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Occurrence rating (1-10)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OCC</em>' attribute.
	 * @see #setOCC(double)
	 * @see raaml.fmea.FmeaPackage#getRPNCalculation_OCC()
	 * @model
	 * @generated
	 */
	double getOCC();

	/**
	 * Sets the value of the '{@link raaml.fmea.RPNCalculation#getOCC <em>OCC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCC</em>' attribute.
	 * @see #getOCC()
	 * @generated
	 */
	void setOCC(double value);

	/**
	 * Returns the value of the '<em><b>DET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Detection rating (1-10)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DET</em>' attribute.
	 * @see #setDET(double)
	 * @see raaml.fmea.FmeaPackage#getRPNCalculation_DET()
	 * @model
	 * @generated
	 */
	double getDET();

	/**
	 * Sets the value of the '{@link raaml.fmea.RPNCalculation#getDET <em>DET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DET</em>' attribute.
	 * @see #getDET()
	 * @generated
	 */
	void setDET(double value);

} // RPNCalculation
