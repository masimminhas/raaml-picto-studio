/**
 */
package raaml.hazop;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

import raaml.hara.ASIL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single (guide-word, parameter) cell in a HAZOP worksheet, with its causes, consequences, safeguards, and recommendations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hazop.Deviation#getGuideWord <em>Guide Word</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getDeviationText <em>Deviation Text</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getAsil <em>Asil</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getCauses <em>Causes</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getSafeguards <em>Safeguards</em>}</li>
 *   <li>{@link raaml.hazop.Deviation#getRecommendations <em>Recommendations</em>}</li>
 * </ul>
 *
 * @see raaml.hazop.HazopPackage#getDeviation()
 * @model
 * @generated
 */
public interface Deviation extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Guide Word</b></em>' attribute.
	 * The default value is <code>"NO"</code>.
	 * The literals are from the enumeration {@link raaml.hazop.GuideWord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guide Word</em>' attribute.
	 * @see raaml.hazop.GuideWord
	 * @see #setGuideWord(GuideWord)
	 * @see raaml.hazop.HazopPackage#getDeviation_GuideWord()
	 * @model default="NO"
	 * @generated
	 */
	GuideWord getGuideWord();

	/**
	 * Sets the value of the '{@link raaml.hazop.Deviation#getGuideWord <em>Guide Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guide Word</em>' attribute.
	 * @see raaml.hazop.GuideWord
	 * @see #getGuideWord()
	 * @generated
	 */
	void setGuideWord(GuideWord value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute.
	 * @see #setParameter(String)
	 * @see raaml.hazop.HazopPackage#getDeviation_Parameter()
	 * @model
	 * @generated
	 */
	String getParameter();

	/**
	 * Sets the value of the '{@link raaml.hazop.Deviation#getParameter <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' attribute.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(String value);

	/**
	 * Returns the value of the '<em><b>Deviation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviation Text</em>' attribute.
	 * @see #setDeviationText(String)
	 * @see raaml.hazop.HazopPackage#getDeviation_DeviationText()
	 * @model
	 * @generated
	 */
	String getDeviationText();

	/**
	 * Sets the value of the '{@link raaml.hazop.Deviation#getDeviationText <em>Deviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviation Text</em>' attribute.
	 * @see #getDeviationText()
	 * @generated
	 */
	void setDeviationText(String value);

	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' attribute.
	 * The default value is <code>"MEDIUM"</code>.
	 * The literals are from the enumeration {@link raaml.hazop.RiskLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Level</em>' attribute.
	 * @see raaml.hazop.RiskLevel
	 * @see #setRiskLevel(RiskLevel)
	 * @see raaml.hazop.HazopPackage#getDeviation_RiskLevel()
	 * @model default="MEDIUM"
	 * @generated
	 */
	RiskLevel getRiskLevel();

	/**
	 * Sets the value of the '{@link raaml.hazop.Deviation#getRiskLevel <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' attribute.
	 * @see raaml.hazop.RiskLevel
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Asil</b></em>' attribute.
	 * The literals are from the enumeration {@link raaml.hara.ASIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asil</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #setAsil(ASIL)
	 * @see raaml.hazop.HazopPackage#getDeviation_Asil()
	 * @model
	 * @generated
	 */
	ASIL getAsil();

	/**
	 * Sets the value of the '{@link raaml.hazop.Deviation#getAsil <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asil</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #getAsil()
	 * @generated
	 */
	void setAsil(ASIL value);

	/**
	 * Returns the value of the '<em><b>Causes</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hazop.Cause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' containment reference list.
	 * @see raaml.hazop.HazopPackage#getDeviation_Causes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cause> getCauses();

	/**
	 * Returns the value of the '<em><b>Consequences</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hazop.Consequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consequences</em>' containment reference list.
	 * @see raaml.hazop.HazopPackage#getDeviation_Consequences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Consequence> getConsequences();

	/**
	 * Returns the value of the '<em><b>Safeguards</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hazop.Safeguard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safeguards</em>' containment reference list.
	 * @see raaml.hazop.HazopPackage#getDeviation_Safeguards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Safeguard> getSafeguards();

	/**
	 * Returns the value of the '<em><b>Recommendations</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hazop.Recommendation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommendations</em>' containment reference list.
	 * @see raaml.hazop.HazopPackage#getDeviation_Recommendations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Recommendation> getRecommendations();

} // Deviation
