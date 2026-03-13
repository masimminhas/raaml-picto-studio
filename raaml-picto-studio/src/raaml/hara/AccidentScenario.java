/**
 */
package raaml.hara;

import org.eclipse.emf.common.util.EList;

import raaml.core.DysfunctionalEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accident Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Scenario leading to an accident
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.AccidentScenario#getControllability <em>Controllability</em>}</li>
 *   <li>{@link raaml.hara.AccidentScenario#getSituations <em>Situations</em>}</li>
 *   <li>{@link raaml.hara.AccidentScenario#getMalfunctioningBehaviors <em>Malfunctioning Behaviors</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getAccidentScenario()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AccidentScenario extends DysfunctionalEvent {
	/**
	 * Returns the value of the '<em><b>Controllability</b></em>' attribute.
	 * The literals are from the enumeration {@link raaml.hara.Controllability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllability</em>' attribute.
	 * @see raaml.hara.Controllability
	 * @see #setControllability(Controllability)
	 * @see raaml.hara.HaraPackage#getAccidentScenario_Controllability()
	 * @model
	 * @generated
	 */
	Controllability getControllability();

	/**
	 * Sets the value of the '{@link raaml.hara.AccidentScenario#getControllability <em>Controllability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controllability</em>' attribute.
	 * @see raaml.hara.Controllability
	 * @see #getControllability()
	 * @generated
	 */
	void setControllability(Controllability value);

	/**
	 * Returns the value of the '<em><b>Situations</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.AbstractOperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Situations</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getAccidentScenario_Situations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractOperationalSituation> getSituations();

	/**
	 * Returns the value of the '<em><b>Malfunctioning Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.AnyMalfunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malfunctioning Behaviors</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getAccidentScenario_MalfunctioningBehaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnyMalfunction> getMalfunctioningBehaviors();

} // AccidentScenario
