/**
 */
package raaml.fmea;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractCause;
import raaml.core.AbstractEffect;
import raaml.core.AbstractFailureMode;
import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract FMEA Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for FMEA analysis items
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.AbstractFMEAItem#getRPN <em>RPN</em>}</li>
 *   <li>{@link raaml.fmea.AbstractFMEAItem#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link raaml.fmea.AbstractFMEAItem#getFinalEffect <em>Final Effect</em>}</li>
 *   <li>{@link raaml.fmea.AbstractFMEAItem#getCause <em>Cause</em>}</li>
 * </ul>
 *
 * @see raaml.fmea.FmeaPackage#getAbstractFMEAItem()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractFMEAItem extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>RPN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aggregated RPN
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RPN</em>' attribute.
	 * @see #setRPN(double)
	 * @see raaml.fmea.FmeaPackage#getAbstractFMEAItem_RPN()
	 * @model
	 * @generated
	 */
	double getRPN();

	/**
	 * Sets the value of the '{@link raaml.fmea.AbstractFMEAItem#getRPN <em>RPN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPN</em>' attribute.
	 * @see #getRPN()
	 * @generated
	 */
	void setRPN(double value);

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AbstractFailureMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode</em>' containment reference list.
	 * @see raaml.fmea.FmeaPackage#getAbstractFMEAItem_FailureMode()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractFailureMode> getFailureMode();

	/**
	 * Returns the value of the '<em><b>Final Effect</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AbstractEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Effect</em>' containment reference list.
	 * @see raaml.fmea.FmeaPackage#getAbstractFMEAItem_FinalEffect()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractEffect> getFinalEffect();

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AbstractCause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' containment reference list.
	 * @see raaml.fmea.FmeaPackage#getAbstractFMEAItem_Cause()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractCause> getCause();

} // AbstractFMEAItem
