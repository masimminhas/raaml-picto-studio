/**
 */
package raaml.req.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.req.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqFactoryImpl extends EFactoryImpl implements ReqFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReqFactory init() {
		try {
			ReqFactory theReqFactory = (ReqFactory)EPackage.Registry.INSTANCE.getEFactory(ReqPackage.eNS_URI);
			if (theReqFactory != null) {
				return theReqFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReqFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqFactoryImpl() {
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
			case ReqPackage.REQUIREMENT: return createRequirement();
			case ReqPackage.DERIVE_REQUIREMENT: return createDeriveRequirement();
			case ReqPackage.INDEPENDENCE_REQUIREMENT: return createIndependenceRequirement();
			case ReqPackage.ASIL_DECOMPOSE: return createASILDecompose();
			case ReqPackage.SATISFY: return createSatisfy();
			case ReqPackage.USER_INFO_REQUIREMENT: return createUserInfoRequirement();
			case ReqPackage.RECOVERY_REQUIREMENT: return createRecoveryRequirement();
			case ReqPackage.DEPENDABILITY_REQUIREMENT: return createDependabilityRequirement();
			case ReqPackage.FUNCTIONAL_SAFETY_REQUIREMENT: return createFunctionalSafetyRequirement();
			case ReqPackage.SOFTWARE_SAFETY_REQUIREMENT: return createSoftwareSafetyRequirement();
			case ReqPackage.HARDWARE_SAFETY_REQUIREMENT: return createHardwareSafetyRequirement();
			case ReqPackage.TECHNICAL_SAFETY_REQUIREMENT: return createTechnicalSafetyRequirement();
			case ReqPackage.SAFETY_GOAL: return createSafetyGoal();
			case ReqPackage.SAFE_STATE: return createSafeState();
			case ReqPackage.OPERATING_MODE: return createOperatingMode();
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT: return createHazardAndRiskAssessment();
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE: return createISO26262SafetyRequirementTemplate();
			case ReqPackage.REQUIREMENTS_MODEL: return createRequirementsModel();
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
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeriveRequirement createDeriveRequirement() {
		DeriveRequirementImpl deriveRequirement = new DeriveRequirementImpl();
		return deriveRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndependenceRequirement createIndependenceRequirement() {
		IndependenceRequirementImpl independenceRequirement = new IndependenceRequirementImpl();
		return independenceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ASILDecompose createASILDecompose() {
		ASILDecomposeImpl asilDecompose = new ASILDecomposeImpl();
		return asilDecompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Satisfy createSatisfy() {
		SatisfyImpl satisfy = new SatisfyImpl();
		return satisfy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserInfoRequirement createUserInfoRequirement() {
		UserInfoRequirementImpl userInfoRequirement = new UserInfoRequirementImpl();
		return userInfoRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RecoveryRequirement createRecoveryRequirement() {
		RecoveryRequirementImpl recoveryRequirement = new RecoveryRequirementImpl();
		return recoveryRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DependabilityRequirement createDependabilityRequirement() {
		DependabilityRequirementImpl dependabilityRequirement = new DependabilityRequirementImpl();
		return dependabilityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalSafetyRequirement createFunctionalSafetyRequirement() {
		FunctionalSafetyRequirementImpl functionalSafetyRequirement = new FunctionalSafetyRequirementImpl();
		return functionalSafetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoftwareSafetyRequirement createSoftwareSafetyRequirement() {
		SoftwareSafetyRequirementImpl softwareSafetyRequirement = new SoftwareSafetyRequirementImpl();
		return softwareSafetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HardwareSafetyRequirement createHardwareSafetyRequirement() {
		HardwareSafetyRequirementImpl hardwareSafetyRequirement = new HardwareSafetyRequirementImpl();
		return hardwareSafetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnicalSafetyRequirement createTechnicalSafetyRequirement() {
		TechnicalSafetyRequirementImpl technicalSafetyRequirement = new TechnicalSafetyRequirementImpl();
		return technicalSafetyRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyGoal createSafetyGoal() {
		SafetyGoalImpl safetyGoal = new SafetyGoalImpl();
		return safetyGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafeState createSafeState() {
		SafeStateImpl safeState = new SafeStateImpl();
		return safeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperatingMode createOperatingMode() {
		OperatingModeImpl operatingMode = new OperatingModeImpl();
		return operatingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardAndRiskAssessment createHazardAndRiskAssessment() {
		HazardAndRiskAssessmentImpl hazardAndRiskAssessment = new HazardAndRiskAssessmentImpl();
		return hazardAndRiskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ISO26262SafetyRequirementTemplate createISO26262SafetyRequirementTemplate() {
		ISO26262SafetyRequirementTemplateImpl iso26262SafetyRequirementTemplate = new ISO26262SafetyRequirementTemplateImpl();
		return iso26262SafetyRequirementTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementsModel createRequirementsModel() {
		RequirementsModelImpl requirementsModel = new RequirementsModelImpl();
		return requirementsModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReqPackage getReqPackage() {
		return (ReqPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReqPackage getPackage() {
		return ReqPackage.eINSTANCE;
	}

} //ReqFactoryImpl
