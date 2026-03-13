/**
 */
package raaml.req.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import raaml.RaamlPackage;

import raaml.core.CorePackage;

import raaml.core.impl.CorePackageImpl;

import raaml.fmea.FmeaPackage;

import raaml.fmea.impl.FmeaPackageImpl;

import raaml.fta.FtaPackage;

import raaml.fta.impl.FtaPackageImpl;

import raaml.gsn.GsnPackage;

import raaml.gsn.impl.GsnPackageImpl;

import raaml.hara.HaraPackage;

import raaml.hara.impl.HaraPackageImpl;

import raaml.impl.RaamlPackageImpl;

import raaml.library.LibraryPackage;

import raaml.library.impl.LibraryPackageImpl;

import raaml.req.ASILDecompose;
import raaml.req.Abstraction;
import raaml.req.DependabilityRequirement;
import raaml.req.Dependency;
import raaml.req.DeriveRequirement;
import raaml.req.FunctionalSafetyRequirement;
import raaml.req.HardwareSafetyRequirement;
import raaml.req.HazardAndRiskAssessment;
import raaml.req.ISO26262SafetyRequirementTemplate;
import raaml.req.IndependenceRequirement;
import raaml.req.OperatingMode;
import raaml.req.RecoveryRequirement;
import raaml.req.ReqFactory;
import raaml.req.ReqPackage;
import raaml.req.Requirement;
import raaml.req.RequirementComponent;
import raaml.req.RequirementsModel;
import raaml.req.SafeState;
import raaml.req.SafetyGoal;
import raaml.req.Satisfy;
import raaml.req.SoftwareSafetyRequirement;
import raaml.req.TechnicalSafetyRequirement;
import raaml.req.UserInfoRequirement;

import raaml.stpa.StpaPackage;

import raaml.stpa.impl.StpaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReqPackageImpl extends EPackageImpl implements ReqPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deriveRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass independenceRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asilDecomposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userInfoRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recoveryRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependabilityRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalSafetyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSafetyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hardwareSafetyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technicalSafetyRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safeStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatingModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardAndRiskAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso26262SafetyRequirementTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsModelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see raaml.req.ReqPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ReqPackageImpl() {
		super(eNS_URI, ReqFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ReqPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ReqPackage init() {
		if (isInited) return (ReqPackage)EPackage.Registry.INSTANCE.getEPackage(ReqPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredReqPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ReqPackageImpl theReqPackage = registeredReqPackage instanceof ReqPackageImpl ? (ReqPackageImpl)registeredReqPackage : new ReqPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RaamlPackage.eNS_URI);
		RaamlPackageImpl theRaamlPackage = (RaamlPackageImpl)(registeredPackage instanceof RaamlPackageImpl ? registeredPackage : RaamlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(registeredPackage instanceof LibraryPackageImpl ? registeredPackage : LibraryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FtaPackage.eNS_URI);
		FtaPackageImpl theFtaPackage = (FtaPackageImpl)(registeredPackage instanceof FtaPackageImpl ? registeredPackage : FtaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FmeaPackage.eNS_URI);
		FmeaPackageImpl theFmeaPackage = (FmeaPackageImpl)(registeredPackage instanceof FmeaPackageImpl ? registeredPackage : FmeaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HaraPackage.eNS_URI);
		HaraPackageImpl theHaraPackage = (HaraPackageImpl)(registeredPackage instanceof HaraPackageImpl ? registeredPackage : HaraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);
		StpaPackageImpl theStpaPackage = (StpaPackageImpl)(registeredPackage instanceof StpaPackageImpl ? registeredPackage : StpaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GsnPackage.eNS_URI);
		GsnPackageImpl theGsnPackage = (GsnPackageImpl)(registeredPackage instanceof GsnPackageImpl ? registeredPackage : GsnPackage.eINSTANCE);

		// Create package meta-data objects
		theReqPackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFtaPackage.createPackageContents();
		theFmeaPackage.createPackageContents();
		theHaraPackage.createPackageContents();
		theStpaPackage.createPackageContents();
		theGsnPackage.createPackageContents();

		// Initialize created meta-data
		theReqPackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFtaPackage.initializePackageContents();
		theFmeaPackage.initializePackageContents();
		theHaraPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();
		theGsnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theReqPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ReqPackage.eNS_URI, theReqPackage);
		return theReqPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Text() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Type() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Status() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_RelatedElements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_ParentRequirement() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_ChildRequirements() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementComponent() {
		return requirementComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementComponent_HaraOwner() {
		return (EReference)requirementComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstraction() {
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeriveRequirement() {
		return deriveRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeriveRequirement_Source() {
		return (EReference)deriveRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeriveRequirement_Target() {
		return (EReference)deriveRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndependenceRequirement() {
		return independenceRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASILDecompose() {
		return asilDecomposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSatisfy() {
		return satisfyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfy_Source() {
		return (EReference)satisfyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSatisfy_Target() {
		return (EReference)satisfyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserInfoRequirement() {
		return userInfoRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecoveryRequirement() {
		return recoveryRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependabilityRequirement() {
		return dependabilityRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalSafetyRequirement() {
		return functionalSafetyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSoftwareSafetyRequirement() {
		return softwareSafetyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHardwareSafetyRequirement() {
		return hardwareSafetyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnicalSafetyRequirement() {
		return technicalSafetyRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyGoal() {
		return safetyGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Source() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependency_Target() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafeState() {
		return safeStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperatingMode() {
		return operatingModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardAndRiskAssessment() {
		return hazardAndRiskAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardAndRiskAssessment_HaraRequirements() {
		return (EReference)hazardAndRiskAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISO26262SafetyRequirementTemplate() {
		return iso26262SafetyRequirementTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getISO26262SafetyRequirementTemplate_ASIL() {
		return (EAttribute)iso26262SafetyRequirementTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getISO26262SafetyRequirementTemplate_FTTI() {
		return (EAttribute)iso26262SafetyRequirementTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementsModel() {
		return requirementsModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsModel_Requirements() {
		return (EReference)requirementsModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsModel_Derivations() {
		return (EReference)requirementsModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsModel_Satisfactions() {
		return (EReference)requirementsModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementsModel_Dependencies() {
		return (EReference)requirementsModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReqFactory getReqFactory() {
		return (ReqFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__TEXT);
		createEAttribute(requirementEClass, REQUIREMENT__TYPE);
		createEAttribute(requirementEClass, REQUIREMENT__PRIORITY);
		createEAttribute(requirementEClass, REQUIREMENT__STATUS);
		createEReference(requirementEClass, REQUIREMENT__RELATED_ELEMENTS);
		createEReference(requirementEClass, REQUIREMENT__PARENT_REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__CHILD_REQUIREMENTS);

		requirementComponentEClass = createEClass(REQUIREMENT_COMPONENT);
		createEReference(requirementComponentEClass, REQUIREMENT_COMPONENT__HARA_OWNER);

		abstractionEClass = createEClass(ABSTRACTION);

		deriveRequirementEClass = createEClass(DERIVE_REQUIREMENT);
		createEReference(deriveRequirementEClass, DERIVE_REQUIREMENT__SOURCE);
		createEReference(deriveRequirementEClass, DERIVE_REQUIREMENT__TARGET);

		independenceRequirementEClass = createEClass(INDEPENDENCE_REQUIREMENT);

		asilDecomposeEClass = createEClass(ASIL_DECOMPOSE);

		satisfyEClass = createEClass(SATISFY);
		createEReference(satisfyEClass, SATISFY__SOURCE);
		createEReference(satisfyEClass, SATISFY__TARGET);

		userInfoRequirementEClass = createEClass(USER_INFO_REQUIREMENT);

		recoveryRequirementEClass = createEClass(RECOVERY_REQUIREMENT);

		dependabilityRequirementEClass = createEClass(DEPENDABILITY_REQUIREMENT);

		functionalSafetyRequirementEClass = createEClass(FUNCTIONAL_SAFETY_REQUIREMENT);

		softwareSafetyRequirementEClass = createEClass(SOFTWARE_SAFETY_REQUIREMENT);

		hardwareSafetyRequirementEClass = createEClass(HARDWARE_SAFETY_REQUIREMENT);

		technicalSafetyRequirementEClass = createEClass(TECHNICAL_SAFETY_REQUIREMENT);

		safetyGoalEClass = createEClass(SAFETY_GOAL);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__SOURCE);
		createEReference(dependencyEClass, DEPENDENCY__TARGET);

		safeStateEClass = createEClass(SAFE_STATE);

		operatingModeEClass = createEClass(OPERATING_MODE);

		hazardAndRiskAssessmentEClass = createEClass(HAZARD_AND_RISK_ASSESSMENT);
		createEReference(hazardAndRiskAssessmentEClass, HAZARD_AND_RISK_ASSESSMENT__HARA_REQUIREMENTS);

		iso26262SafetyRequirementTemplateEClass = createEClass(ISO26262_SAFETY_REQUIREMENT_TEMPLATE);
		createEAttribute(iso26262SafetyRequirementTemplateEClass, ISO26262_SAFETY_REQUIREMENT_TEMPLATE__ASIL);
		createEAttribute(iso26262SafetyRequirementTemplateEClass, ISO26262_SAFETY_REQUIREMENT_TEMPLATE__FTTI);

		requirementsModelEClass = createEClass(REQUIREMENTS_MODEL);
		createEReference(requirementsModelEClass, REQUIREMENTS_MODEL__REQUIREMENTS);
		createEReference(requirementsModelEClass, REQUIREMENTS_MODEL__DERIVATIONS);
		createEReference(requirementsModelEClass, REQUIREMENTS_MODEL__SATISFACTIONS);
		createEReference(requirementsModelEClass, REQUIREMENTS_MODEL__DEPENDENCIES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		HaraPackage theHaraPackage = (HaraPackage)EPackage.Registry.INSTANCE.getEPackage(HaraPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		requirementComponentEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		abstractionEClass.getESuperTypes().add(this.getRequirementComponent());
		deriveRequirementEClass.getESuperTypes().add(this.getAbstraction());
		independenceRequirementEClass.getESuperTypes().add(this.getDeriveRequirement());
		asilDecomposeEClass.getESuperTypes().add(this.getDeriveRequirement());
		satisfyEClass.getESuperTypes().add(this.getAbstraction());
		userInfoRequirementEClass.getESuperTypes().add(this.getSatisfy());
		recoveryRequirementEClass.getESuperTypes().add(this.getSatisfy());
		dependabilityRequirementEClass.getESuperTypes().add(this.getRequirement());
		functionalSafetyRequirementEClass.getESuperTypes().add(this.getDependabilityRequirement());
		softwareSafetyRequirementEClass.getESuperTypes().add(this.getDependabilityRequirement());
		hardwareSafetyRequirementEClass.getESuperTypes().add(this.getDependabilityRequirement());
		technicalSafetyRequirementEClass.getESuperTypes().add(this.getDependabilityRequirement());
		safetyGoalEClass.getESuperTypes().add(this.getDependabilityRequirement());
		dependencyEClass.getESuperTypes().add(this.getRequirementComponent());
		safeStateEClass.getESuperTypes().add(this.getDependency());
		operatingModeEClass.getESuperTypes().add(this.getDependency());
		hazardAndRiskAssessmentEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		iso26262SafetyRequirementTemplateEClass.getESuperTypes().add(this.getDependabilityRequirement());
		requirementsModelEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Text(), ecorePackage.getEString(), "text", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Type(), ecorePackage.getEString(), "type", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Priority(), ecorePackage.getEString(), "priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Status(), ecorePackage.getEString(), "status", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RelatedElements(), theCorePackage.getCoreSafetyElement(), null, "relatedElements", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_ParentRequirement(), this.getRequirement(), null, "parentRequirement", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_ChildRequirements(), this.getRequirement(), null, "childRequirements", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementComponentEClass, RequirementComponent.class, "RequirementComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementComponent_HaraOwner(), this.getHazardAndRiskAssessment(), this.getHazardAndRiskAssessment_HaraRequirements(), "haraOwner", null, 0, 1, RequirementComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractionEClass, Abstraction.class, "Abstraction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deriveRequirementEClass, DeriveRequirement.class, "DeriveRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeriveRequirement_Source(), this.getRequirement(), null, "source", null, 1, 1, DeriveRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeriveRequirement_Target(), this.getRequirement(), null, "target", null, 1, 1, DeriveRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(independenceRequirementEClass, IndependenceRequirement.class, "IndependenceRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asilDecomposeEClass, ASILDecompose.class, "ASILDecompose", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satisfyEClass, Satisfy.class, "Satisfy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSatisfy_Source(), this.getRequirement(), null, "source", null, 1, 1, Satisfy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSatisfy_Target(), this.getRequirement(), null, "target", null, 1, 1, Satisfy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userInfoRequirementEClass, UserInfoRequirement.class, "UserInfoRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recoveryRequirementEClass, RecoveryRequirement.class, "RecoveryRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependabilityRequirementEClass, DependabilityRequirement.class, "DependabilityRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalSafetyRequirementEClass, FunctionalSafetyRequirement.class, "FunctionalSafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareSafetyRequirementEClass, SoftwareSafetyRequirement.class, "SoftwareSafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hardwareSafetyRequirementEClass, HardwareSafetyRequirement.class, "HardwareSafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(technicalSafetyRequirementEClass, TechnicalSafetyRequirement.class, "TechnicalSafetyRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(safetyGoalEClass, SafetyGoal.class, "SafetyGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Source(), this.getRequirement(), null, "source", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependency_Target(), this.getRequirement(), null, "target", null, 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safeStateEClass, SafeState.class, "SafeState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatingModeEClass, OperatingMode.class, "OperatingMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hazardAndRiskAssessmentEClass, HazardAndRiskAssessment.class, "HazardAndRiskAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardAndRiskAssessment_HaraRequirements(), this.getRequirementComponent(), this.getRequirementComponent_HaraOwner(), "haraRequirements", null, 0, -1, HazardAndRiskAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iso26262SafetyRequirementTemplateEClass, ISO26262SafetyRequirementTemplate.class, "ISO26262SafetyRequirementTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getISO26262SafetyRequirementTemplate_ASIL(), theHaraPackage.getASIL(), "ASIL", null, 0, 1, ISO26262SafetyRequirementTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getISO26262SafetyRequirementTemplate_FTTI(), ecorePackage.getEInt(), "FTTI", null, 0, 1, ISO26262SafetyRequirementTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementsModelEClass, RequirementsModel.class, "RequirementsModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsModel_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, RequirementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsModel_Derivations(), this.getDeriveRequirement(), null, "derivations", null, 0, -1, RequirementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsModel_Satisfactions(), this.getSatisfy(), null, "satisfactions", null, 0, -1, RequirementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsModel_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, RequirementsModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://edu.kit.sdq/raaml/metaclass
		createMetaclassAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://edu.kit.sdq/raaml/metaclass</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createMetaclassAnnotations() {
		String source = "http://edu.kit.sdq/raaml/metaclass";
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Requirement"
		   });
		addAnnotation
		  (requirementComponentEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (abstractionEClass,
		   source,
		   new String[] {
			   "base", "Abstraction"
		   });
		addAnnotation
		  (deriveRequirementEClass,
		   source,
		   new String[] {
			   "base", "Abstraction",
			   "stereotype", "DeriveRequirement"
		   });
		addAnnotation
		  (independenceRequirementEClass,
		   source,
		   new String[] {
			   "base", "Abstraction",
			   "stereotype", "IndependenceRequirement"
		   });
		addAnnotation
		  (asilDecomposeEClass,
		   source,
		   new String[] {
			   "base", "Abstraction",
			   "stereotype", "ASILDecompose"
		   });
		addAnnotation
		  (satisfyEClass,
		   source,
		   new String[] {
			   "base", "Abstraction",
			   "stereotype", "Satisfy"
		   });
		addAnnotation
		  (userInfoRequirementEClass,
		   source,
		   new String[] {
			   "base", "Abstraction",
			   "stereotype", "UserInfoRequirement"
		   });
		addAnnotation
		  (recoveryRequirementEClass,
		   source,
		   new String[] {
			   "base", "Abstraction",
			   "stereotype", "RecoveryRequirement"
		   });
		addAnnotation
		  (dependabilityRequirementEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "DependabilityRequirement"
		   });
		addAnnotation
		  (functionalSafetyRequirementEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "FunctionalSafetyRequirement"
		   });
		addAnnotation
		  (softwareSafetyRequirementEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "SoftwareSafetyRequirement"
		   });
		addAnnotation
		  (hardwareSafetyRequirementEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "HardwareSafetyRequirement"
		   });
		addAnnotation
		  (technicalSafetyRequirementEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "TechnicalSafetyRequirement"
		   });
		addAnnotation
		  (safetyGoalEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "SafetyGoal"
		   });
		addAnnotation
		  (dependencyEClass,
		   source,
		   new String[] {
			   "base", "Dependency"
		   });
		addAnnotation
		  (safeStateEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "SafeState"
		   });
		addAnnotation
		  (operatingModeEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "OperatingMode"
		   });
		addAnnotation
		  (hazardAndRiskAssessmentEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "HazardAndRiskAssessment"
		   });
		addAnnotation
		  (iso26262SafetyRequirementTemplateEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ISO26262SafetyRequirementTemplate"
		   });
	}

} //ReqPackageImpl
