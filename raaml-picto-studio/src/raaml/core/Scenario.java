/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sequence of events leading to a particular outcome
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.Scenario#getScenarioSteps <em>Scenario Steps</em>}</li>
 *   <li>{@link raaml.core.Scenario#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getScenario()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Scenario'"
 * @generated
 */
public interface Scenario extends AnySituation {
	/**
	 * Returns the value of the '<em><b>Scenario Steps</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AnySituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered steps in the scenario
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scenario Steps</em>' containment reference list.
	 * @see raaml.core.CorePackage#getScenario_ScenarioSteps()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnySituation> getScenarioSteps();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AbstractEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Events that trigger the scenario
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see raaml.core.CorePackage#getScenario_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEvent> getTriggers();

} // Scenario
