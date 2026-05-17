/**
 */
package raaml.hazop.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import raaml.core.impl.CoreSafetyElementImpl;

import raaml.hara.ASIL;

import raaml.hazop.Cause;
import raaml.hazop.Consequence;
import raaml.hazop.Deviation;
import raaml.hazop.GuideWord;
import raaml.hazop.HazopPackage;
import raaml.hazop.Recommendation;
import raaml.hazop.RiskLevel;
import raaml.hazop.Safeguard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deviation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getGuideWord <em>Guide Word</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getDeviationText <em>Deviation Text</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getAsil <em>Asil</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getCauses <em>Causes</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getConsequences <em>Consequences</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getSafeguards <em>Safeguards</em>}</li>
 *   <li>{@link raaml.hazop.impl.DeviationImpl#getRecommendations <em>Recommendations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviationImpl extends CoreSafetyElementImpl implements Deviation {
	/**
	 * The default value of the '{@link #getGuideWord() <em>Guide Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideWord()
	 * @generated
	 * @ordered
	 */
	protected static final GuideWord GUIDE_WORD_EDEFAULT = GuideWord.NO;

	/**
	 * The cached value of the '{@link #getGuideWord() <em>Guide Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideWord()
	 * @generated
	 * @ordered
	 */
	protected GuideWord guideWord = GUIDE_WORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected String parameter = PARAMETER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviationText() <em>Deviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviationText()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVIATION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviationText() <em>Deviation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviationText()
	 * @generated
	 * @ordered
	 */
	protected String deviationText = DEVIATION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RiskLevel RISK_LEVEL_EDEFAULT = RiskLevel.MEDIUM;

	/**
	 * The cached value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel riskLevel = RISK_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAsil() <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsil()
	 * @generated
	 * @ordered
	 */
	protected static final ASIL ASIL_EDEFAULT = ASIL.NOASSIGNMENT;

	/**
	 * The cached value of the '{@link #getAsil() <em>Asil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsil()
	 * @generated
	 * @ordered
	 */
	protected ASIL asil = ASIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCauses() <em>Causes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Cause> causes;

	/**
	 * The cached value of the '{@link #getConsequences() <em>Consequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Consequence> consequences;

	/**
	 * The cached value of the '{@link #getSafeguards() <em>Safeguards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafeguards()
	 * @generated
	 * @ordered
	 */
	protected EList<Safeguard> safeguards;

	/**
	 * The cached value of the '{@link #getRecommendations() <em>Recommendations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendations()
	 * @generated
	 * @ordered
	 */
	protected EList<Recommendation> recommendations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HazopPackage.Literals.DEVIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GuideWord getGuideWord() {
		return guideWord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuideWord(GuideWord newGuideWord) {
		GuideWord oldGuideWord = guideWord;
		guideWord = newGuideWord == null ? GUIDE_WORD_EDEFAULT : newGuideWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.DEVIATION__GUIDE_WORD, oldGuideWord, guideWord));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameter(String newParameter) {
		String oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.DEVIATION__PARAMETER, oldParameter, parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeviationText() {
		return deviationText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeviationText(String newDeviationText) {
		String oldDeviationText = deviationText;
		deviationText = newDeviationText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.DEVIATION__DEVIATION_TEXT, oldDeviationText, deviationText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getRiskLevel() {
		return riskLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskLevel(RiskLevel newRiskLevel) {
		RiskLevel oldRiskLevel = riskLevel;
		riskLevel = newRiskLevel == null ? RISK_LEVEL_EDEFAULT : newRiskLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.DEVIATION__RISK_LEVEL, oldRiskLevel, riskLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASIL getAsil() {
		return asil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAsil(ASIL newAsil) {
		ASIL oldAsil = asil;
		asil = newAsil == null ? ASIL_EDEFAULT : newAsil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HazopPackage.DEVIATION__ASIL, oldAsil, asil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cause> getCauses() {
		if (causes == null) {
			causes = new EObjectContainmentEList<Cause>(Cause.class, this, HazopPackage.DEVIATION__CAUSES);
		}
		return causes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Consequence> getConsequences() {
		if (consequences == null) {
			consequences = new EObjectContainmentEList<Consequence>(Consequence.class, this, HazopPackage.DEVIATION__CONSEQUENCES);
		}
		return consequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Safeguard> getSafeguards() {
		if (safeguards == null) {
			safeguards = new EObjectContainmentEList<Safeguard>(Safeguard.class, this, HazopPackage.DEVIATION__SAFEGUARDS);
		}
		return safeguards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Recommendation> getRecommendations() {
		if (recommendations == null) {
			recommendations = new EObjectContainmentEList<Recommendation>(Recommendation.class, this, HazopPackage.DEVIATION__RECOMMENDATIONS);
		}
		return recommendations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HazopPackage.DEVIATION__CAUSES:
				return ((InternalEList<?>)getCauses()).basicRemove(otherEnd, msgs);
			case HazopPackage.DEVIATION__CONSEQUENCES:
				return ((InternalEList<?>)getConsequences()).basicRemove(otherEnd, msgs);
			case HazopPackage.DEVIATION__SAFEGUARDS:
				return ((InternalEList<?>)getSafeguards()).basicRemove(otherEnd, msgs);
			case HazopPackage.DEVIATION__RECOMMENDATIONS:
				return ((InternalEList<?>)getRecommendations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HazopPackage.DEVIATION__GUIDE_WORD:
				return getGuideWord();
			case HazopPackage.DEVIATION__PARAMETER:
				return getParameter();
			case HazopPackage.DEVIATION__DEVIATION_TEXT:
				return getDeviationText();
			case HazopPackage.DEVIATION__RISK_LEVEL:
				return getRiskLevel();
			case HazopPackage.DEVIATION__ASIL:
				return getAsil();
			case HazopPackage.DEVIATION__CAUSES:
				return getCauses();
			case HazopPackage.DEVIATION__CONSEQUENCES:
				return getConsequences();
			case HazopPackage.DEVIATION__SAFEGUARDS:
				return getSafeguards();
			case HazopPackage.DEVIATION__RECOMMENDATIONS:
				return getRecommendations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HazopPackage.DEVIATION__GUIDE_WORD:
				setGuideWord((GuideWord)newValue);
				return;
			case HazopPackage.DEVIATION__PARAMETER:
				setParameter((String)newValue);
				return;
			case HazopPackage.DEVIATION__DEVIATION_TEXT:
				setDeviationText((String)newValue);
				return;
			case HazopPackage.DEVIATION__RISK_LEVEL:
				setRiskLevel((RiskLevel)newValue);
				return;
			case HazopPackage.DEVIATION__ASIL:
				setAsil((ASIL)newValue);
				return;
			case HazopPackage.DEVIATION__CAUSES:
				getCauses().clear();
				getCauses().addAll((Collection<? extends Cause>)newValue);
				return;
			case HazopPackage.DEVIATION__CONSEQUENCES:
				getConsequences().clear();
				getConsequences().addAll((Collection<? extends Consequence>)newValue);
				return;
			case HazopPackage.DEVIATION__SAFEGUARDS:
				getSafeguards().clear();
				getSafeguards().addAll((Collection<? extends Safeguard>)newValue);
				return;
			case HazopPackage.DEVIATION__RECOMMENDATIONS:
				getRecommendations().clear();
				getRecommendations().addAll((Collection<? extends Recommendation>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HazopPackage.DEVIATION__GUIDE_WORD:
				setGuideWord(GUIDE_WORD_EDEFAULT);
				return;
			case HazopPackage.DEVIATION__PARAMETER:
				setParameter(PARAMETER_EDEFAULT);
				return;
			case HazopPackage.DEVIATION__DEVIATION_TEXT:
				setDeviationText(DEVIATION_TEXT_EDEFAULT);
				return;
			case HazopPackage.DEVIATION__RISK_LEVEL:
				setRiskLevel(RISK_LEVEL_EDEFAULT);
				return;
			case HazopPackage.DEVIATION__ASIL:
				setAsil(ASIL_EDEFAULT);
				return;
			case HazopPackage.DEVIATION__CAUSES:
				getCauses().clear();
				return;
			case HazopPackage.DEVIATION__CONSEQUENCES:
				getConsequences().clear();
				return;
			case HazopPackage.DEVIATION__SAFEGUARDS:
				getSafeguards().clear();
				return;
			case HazopPackage.DEVIATION__RECOMMENDATIONS:
				getRecommendations().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HazopPackage.DEVIATION__GUIDE_WORD:
				return guideWord != GUIDE_WORD_EDEFAULT;
			case HazopPackage.DEVIATION__PARAMETER:
				return PARAMETER_EDEFAULT == null ? parameter != null : !PARAMETER_EDEFAULT.equals(parameter);
			case HazopPackage.DEVIATION__DEVIATION_TEXT:
				return DEVIATION_TEXT_EDEFAULT == null ? deviationText != null : !DEVIATION_TEXT_EDEFAULT.equals(deviationText);
			case HazopPackage.DEVIATION__RISK_LEVEL:
				return riskLevel != RISK_LEVEL_EDEFAULT;
			case HazopPackage.DEVIATION__ASIL:
				return asil != ASIL_EDEFAULT;
			case HazopPackage.DEVIATION__CAUSES:
				return causes != null && !causes.isEmpty();
			case HazopPackage.DEVIATION__CONSEQUENCES:
				return consequences != null && !consequences.isEmpty();
			case HazopPackage.DEVIATION__SAFEGUARDS:
				return safeguards != null && !safeguards.isEmpty();
			case HazopPackage.DEVIATION__RECOMMENDATIONS:
				return recommendations != null && !recommendations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (guideWord: ");
		result.append(guideWord);
		result.append(", parameter: ");
		result.append(parameter);
		result.append(", deviationText: ");
		result.append(deviationText);
		result.append(", riskLevel: ");
		result.append(riskLevel);
		result.append(", asil: ");
		result.append(asil);
		result.append(')');
		return result.toString();
	}

} //DeviationImpl
