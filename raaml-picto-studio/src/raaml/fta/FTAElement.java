/**
 */
package raaml.fta;

import raaml.core.DysfunctionalEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for FTA elements with probability
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.FTAElement#getProbability <em>Probability</em>}</li>
 *   <li>{@link raaml.fta.FTAElement#getSourceGate <em>Source Gate</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getFTAElement()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface FTAElement extends DysfunctionalEvent {
	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Failure probability
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see raaml.fta.FtaPackage#getFTAElement_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link raaml.fta.FTAElement#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>Source Gate</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link raaml.fta.Gate#getSourceEvent <em>Source Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Gate</em>' container reference.
	 * @see #setSourceGate(Gate)
	 * @see raaml.fta.FtaPackage#getFTAElement_SourceGate()
	 * @see raaml.fta.Gate#getSourceEvent
	 * @model opposite="sourceEvent" transient="false"
	 * @generated
	 */
	Gate getSourceGate();

	/**
	 * Sets the value of the '{@link raaml.fta.FTAElement#getSourceGate <em>Source Gate</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Gate</em>' container reference.
	 * @see #getSourceGate()
	 * @generated
	 */
	void setSourceGate(Gate value);

} // FTAElement
