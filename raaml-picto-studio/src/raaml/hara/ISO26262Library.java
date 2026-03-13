/**
 */
package raaml.hara;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO26262 Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reusable library of ISO 26262 elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.ISO26262Library#getOperationalConditions <em>Operational Conditions</em>}</li>
 *   <li>{@link raaml.hara.ISO26262Library#getHazardousEvents <em>Hazardous Events</em>}</li>
 *   <li>{@link raaml.hara.ISO26262Library#getAccidentScenarios <em>Accident Scenarios</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getISO26262Library()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='ISO26262Library'"
 * @generated
 */
public interface ISO26262Library extends AbstractLibrary {
	/**
	 * Returns the value of the '<em><b>Operational Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.OperationalCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Conditions</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262Library_OperationalConditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalCondition> getOperationalConditions();

	/**
	 * Returns the value of the '<em><b>Hazardous Events</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.HazardousEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazardous Events</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262Library_HazardousEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardousEvent> getHazardousEvents();

	/**
	 * Returns the value of the '<em><b>Accident Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.AccidentScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accident Scenarios</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262Library_AccidentScenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccidentScenario> getAccidentScenarios();

} // ISO26262Library
