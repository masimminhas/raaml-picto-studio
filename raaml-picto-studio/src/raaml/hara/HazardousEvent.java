/**
 */
package raaml.hara;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractRisk;
import raaml.core.Hazard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazardous Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Combination of hazard and operational situation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.HazardousEvent#getASIL <em>ASIL</em>}</li>
 *   <li>{@link raaml.hara.HazardousEvent#getHazards <em>Hazards</em>}</li>
 *   <li>{@link raaml.hara.HazardousEvent#getScenarios <em>Scenarios</em>}</li>
 *   <li>{@link raaml.hara.HazardousEvent#getVehicleLevelEffects <em>Vehicle Level Effects</em>}</li>
 *   <li>{@link raaml.hara.HazardousEvent#getSystemLevelEffects <em>System Level Effects</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getHazardousEvent()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface HazardousEvent extends AbstractRisk {
	/**
	 * Returns the value of the '<em><b>ASIL</b></em>' attribute list.
	 * The list contents are of type {@link raaml.hara.ASIL}.
	 * The literals are from the enumeration {@link raaml.hara.ASIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASIL</em>' attribute list.
	 * @see raaml.hara.ASIL
	 * @see raaml.hara.HaraPackage#getHazardousEvent_ASIL()
	 * @model
	 * @generated
	 */
	EList<ASIL> getASIL();

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.Hazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazards</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getHazardousEvent_Hazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hazard> getHazards();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.AccidentScenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getHazardousEvent_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccidentScenario> getScenarios();

	/**
	 * Returns the value of the '<em><b>Vehicle Level Effects</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.VehicleLevelEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle Level Effects</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getHazardousEvent_VehicleLevelEffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<VehicleLevelEffect> getVehicleLevelEffects();

	/**
	 * Returns the value of the '<em><b>System Level Effects</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.SystemLevelEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Level Effects</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getHazardousEvent_SystemLevelEffects()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemLevelEffect> getSystemLevelEffects();

} // HazardousEvent
