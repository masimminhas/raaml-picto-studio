/**
 */
package raaml.hazop.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.hazop.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazopFactoryImpl extends EFactoryImpl implements HazopFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HazopFactory init() {
		try {
			HazopFactory theHazopFactory = (HazopFactory)EPackage.Registry.INSTANCE.getEFactory(HazopPackage.eNS_URI);
			if (theHazopFactory != null) {
				return theHazopFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HazopFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazopFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HazopPackage.HAZOP_STUDY: return createHAZOPStudy();
			case HazopPackage.HAZOP_NODE: return createHAZOPNode();
			case HazopPackage.DEVIATION: return createDeviation();
			case HazopPackage.CAUSE: return createCause();
			case HazopPackage.CONSEQUENCE: return createConsequence();
			case HazopPackage.SAFEGUARD: return createSafeguard();
			case HazopPackage.RECOMMENDATION: return createRecommendation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HazopPackage.GUIDE_WORD:
				return createGuideWordFromString(eDataType, initialValue);
			case HazopPackage.RISK_LEVEL:
				return createRiskLevelFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HazopPackage.GUIDE_WORD:
				return convertGuideWordToString(eDataType, instanceValue);
			case HazopPackage.RISK_LEVEL:
				return convertRiskLevelToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAZOPStudy createHAZOPStudy() {
		HAZOPStudyImpl hazopStudy = new HAZOPStudyImpl();
		return hazopStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HAZOPNode createHAZOPNode() {
		HAZOPNodeImpl hazopNode = new HAZOPNodeImpl();
		return hazopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Deviation createDeviation() {
		DeviationImpl deviation = new DeviationImpl();
		return deviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cause createCause() {
		CauseImpl cause = new CauseImpl();
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consequence createConsequence() {
		ConsequenceImpl consequence = new ConsequenceImpl();
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Safeguard createSafeguard() {
		SafeguardImpl safeguard = new SafeguardImpl();
		return safeguard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Recommendation createRecommendation() {
		RecommendationImpl recommendation = new RecommendationImpl();
		return recommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuideWord createGuideWordFromString(EDataType eDataType, String initialValue) {
		GuideWord result = GuideWord.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuideWordToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel createRiskLevelFromString(EDataType eDataType, String initialValue) {
		RiskLevel result = RiskLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazopPackage getHazopPackage() {
		return (HazopPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HazopPackage getPackage() {
		return HazopPackage.eINSTANCE;
	}

} //HazopFactoryImpl
