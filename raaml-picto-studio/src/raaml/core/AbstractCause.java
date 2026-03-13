/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A root cause with occurrence probability
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AbstractCause#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link raaml.core.AbstractCause#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAbstractCause()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractCause extends AbstractEvent, Factor {
	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability of occurrence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see #setOccurrence(double)
	 * @see raaml.core.CorePackage#getAbstractCause_Occurrence()
	 * @model
	 * @generated
	 */
	double getOccurrence();

	/**
	 * Sets the value of the '{@link raaml.core.AbstractCause#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(double value);

	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.DysfunctionalEvent}.
	 * It is bidirectional and its opposite is '{@link raaml.core.DysfunctionalEvent#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Errors caused by this cause
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' reference list.
	 * @see raaml.core.CorePackage#getAbstractCause_Error()
	 * @see raaml.core.DysfunctionalEvent#getFault
	 * @model opposite="fault"
	 * @generated
	 */
	EList<DysfunctionalEvent> getError();

} // AbstractCause
