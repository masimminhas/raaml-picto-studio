/**
 */
package raaml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for events with likelihood
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AbstractEvent#getLikelihood <em>Likelihood</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAbstractEvent()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractEvent extends AnySituation {
	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Probability or frequency of occurrence
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(double)
	 * @see raaml.core.CorePackage#getAbstractEvent_Likelihood()
	 * @model
	 * @generated
	 */
	double getLikelihood();

	/**
	 * Sets the value of the '{@link raaml.core.AbstractEvent#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(double value);

} // AbstractEvent
