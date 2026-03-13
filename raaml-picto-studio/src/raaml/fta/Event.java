/**
 */
package raaml.fta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for all FTA events
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.Event#getTargetGate <em>Target Gate</em>}</li>
 *   <li>{@link raaml.fta.Event#getInhibitGate <em>Inhibit Gate</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getEvent()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface Event extends FTAElement {
	/**
	 * Returns the value of the '<em><b>Target Gate</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link raaml.fta.Gate#getTargetEvent <em>Target Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Gate</em>' reference.
	 * @see #setTargetGate(Gate)
	 * @see raaml.fta.FtaPackage#getEvent_TargetGate()
	 * @see raaml.fta.Gate#getTargetEvent
	 * @model opposite="targetEvent"
	 * @generated
	 */
	Gate getTargetGate();

	/**
	 * Sets the value of the '{@link raaml.fta.Event#getTargetGate <em>Target Gate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Gate</em>' reference.
	 * @see #getTargetGate()
	 * @generated
	 */
	void setTargetGate(Gate value);

	/**
	 * Returns the value of the '<em><b>Inhibit Gate</b></em>' reference list.
	 * The list contents are of type {@link raaml.fta.INHIBIT}.
	 * It is bidirectional and its opposite is '{@link raaml.fta.INHIBIT#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhibit Gate</em>' reference list.
	 * @see raaml.fta.FtaPackage#getEvent_InhibitGate()
	 * @see raaml.fta.INHIBIT#getCondition
	 * @model opposite="condition"
	 * @generated
	 */
	EList<INHIBIT> getInhibitGate();

} // Event
