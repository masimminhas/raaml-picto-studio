/**
 */
package raaml.fta;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Logical gate combining input events
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.Gate#getSourceEvent <em>Source Event</em>}</li>
 *   <li>{@link raaml.fta.Gate#getTargetEvent <em>Target Event</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getGate()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface Gate extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Source Event</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.FTAElement}.
	 * It is bidirectional and its opposite is '{@link raaml.fta.FTAElement#getSourceGate <em>Source Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Event</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getGate_SourceEvent()
	 * @see raaml.fta.FTAElement#getSourceGate
	 * @model opposite="sourceGate" containment="true"
	 * @generated
	 */
	EList<FTAElement> getSourceEvent();

	/**
	 * Returns the value of the '<em><b>Target Event</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link raaml.fta.Event#getTargetGate <em>Target Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Event</em>' reference.
	 * @see #setTargetEvent(Event)
	 * @see raaml.fta.FtaPackage#getGate_TargetEvent()
	 * @see raaml.fta.Event#getTargetGate
	 * @model opposite="targetGate" required="true"
	 * @generated
	 */
	Event getTargetEvent();

	/**
	 * Sets the value of the '{@link raaml.fta.Gate#getTargetEvent <em>Target Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Event</em>' reference.
	 * @see #getTargetEvent()
	 * @generated
	 */
	void setTargetEvent(Event value);

} // Gate
