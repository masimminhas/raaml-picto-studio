/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dysfunctional Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Event representing dysfunctional behavior
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.DysfunctionalEvent#getToError <em>To Error</em>}</li>
 *   <li>{@link raaml.core.DysfunctionalEvent#getFromError <em>From Error</em>}</li>
 *   <li>{@link raaml.core.DysfunctionalEvent#getError <em>Error</em>}</li>
 *   <li>{@link raaml.core.DysfunctionalEvent#getFailure <em>Failure</em>}</li>
 *   <li>{@link raaml.core.DysfunctionalEvent#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getDysfunctionalEvent()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface DysfunctionalEvent extends AbstractEvent {
	/**
	 * Returns the value of the '<em><b>To Error</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.DysfunctionalEvent}.
	 * It is bidirectional and its opposite is '{@link raaml.core.DysfunctionalEvent#getFromError <em>From Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error events propagated to
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Error</em>' reference list.
	 * @see raaml.core.CorePackage#getDysfunctionalEvent_ToError()
	 * @see raaml.core.DysfunctionalEvent#getFromError
	 * @model opposite="fromError"
	 * @generated
	 */
	EList<DysfunctionalEvent> getToError();

	/**
	 * Returns the value of the '<em><b>From Error</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.DysfunctionalEvent}.
	 * It is bidirectional and its opposite is '{@link raaml.core.DysfunctionalEvent#getToError <em>To Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Error events propagated from
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Error</em>' reference list.
	 * @see raaml.core.CorePackage#getDysfunctionalEvent_FromError()
	 * @see raaml.core.DysfunctionalEvent#getToError
	 * @model opposite="toError"
	 * @generated
	 */
	EList<DysfunctionalEvent> getFromError();

	/**
	 * Returns the value of the '<em><b>Error</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.DysfunctionalEvent}.
	 * It is bidirectional and its opposite is '{@link raaml.core.DysfunctionalEvent#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Errors associated with this event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Error</em>' reference list.
	 * @see raaml.core.CorePackage#getDysfunctionalEvent_Error()
	 * @see raaml.core.DysfunctionalEvent#getFailure
	 * @model opposite="failure"
	 * @generated
	 */
	EList<DysfunctionalEvent> getError();

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.DysfunctionalEvent}.
	 * It is bidirectional and its opposite is '{@link raaml.core.DysfunctionalEvent#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Failures associated with this event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Failure</em>' reference list.
	 * @see raaml.core.CorePackage#getDysfunctionalEvent_Failure()
	 * @see raaml.core.DysfunctionalEvent#getError
	 * @model opposite="error"
	 * @generated
	 */
	EList<DysfunctionalEvent> getFailure();

	/**
	 * Returns the value of the '<em><b>Fault</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.AbstractCause}.
	 * It is bidirectional and its opposite is '{@link raaml.core.AbstractCause#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Causal faults for this event
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fault</em>' reference list.
	 * @see raaml.core.CorePackage#getDysfunctionalEvent_Fault()
	 * @see raaml.core.AbstractCause#getError
	 * @model opposite="error"
	 * @generated
	 */
	EList<AbstractCause> getFault();

} // DysfunctionalEvent
