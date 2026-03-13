/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Risk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Risk scenario with quantified risk score
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AbstractRisk#getRiskScore <em>Risk Score</em>}</li>
 *   <li>{@link raaml.core.AbstractRisk#getHarmPotentials <em>Harm Potentials</em>}</li>
 *   <li>{@link raaml.core.AbstractRisk#getHarms <em>Harms</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAbstractRisk()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractRisk extends Scenario {
	/**
	 * Returns the value of the '<em><b>Risk Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantified risk score
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Score</em>' attribute.
	 * @see #setRiskScore(double)
	 * @see raaml.core.CorePackage#getAbstractRisk_RiskScore()
	 * @model
	 * @generated
	 */
	double getRiskScore();

	/**
	 * Sets the value of the '{@link raaml.core.AbstractRisk#getRiskScore <em>Risk Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Score</em>' attribute.
	 * @see #getRiskScore()
	 * @generated
	 */
	void setRiskScore(double value);

	/**
	 * Returns the value of the '<em><b>Harm Potentials</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.HarmPotential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Potential harms in this risk
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Harm Potentials</em>' containment reference list.
	 * @see raaml.core.CorePackage#getAbstractRisk_HarmPotentials()
	 * @model containment="true"
	 * @generated
	 */
	EList<HarmPotential> getHarmPotentials();

	/**
	 * Returns the value of the '<em><b>Harms</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AbstractEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Actual harmful effects
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Harms</em>' containment reference list.
	 * @see raaml.core.CorePackage#getAbstractRisk_Harms()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEffect> getHarms();

} // AbstractRisk
