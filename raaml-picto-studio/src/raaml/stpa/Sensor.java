/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sensor that provides feedback
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.Sensor#getProvidedFeedback <em>Provided Feedback</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getSensor()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Sensor'"
 * @generated
 */
public interface Sensor extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Provided Feedback</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Feedback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Feedback provided by this sensor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provided Feedback</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSensor_ProvidedFeedback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feedback> getProvidedFeedback();

} // Sensor
