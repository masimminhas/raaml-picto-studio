/**
 */
package raaml.hara.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import raaml.hara.ASILAssignment;
import raaml.hara.AbstractOperationalSituation;
import raaml.hara.AccidentScenario;
import raaml.hara.AnyMalfunction;
import raaml.hara.AutomotiveEffect;
import raaml.hara.Confirmed;
import raaml.hara.Controllability;
import raaml.hara.Exposure;
import raaml.hara.HaraFactory;
import raaml.hara.HaraPackage;
import raaml.hara.HazardousEvent;
import raaml.hara.ISO26262Library;
import raaml.hara.MalfunctioningBehaviour;
import raaml.hara.OperationalCondition;
import raaml.hara.OperationalSituation;
import raaml.hara.Severity;
import raaml.hara.SystemLevelEffect;
import raaml.hara.VehicleLevelEffect;
import raaml.hara.Verified;

import raaml.impl.RaamlPackageImpl;

import raaml.library.LibraryPackage;

import raaml.library.impl.LibraryPackageImpl;

import raaml.req.ReqPackage;

import raaml.req.impl.ReqPackageImpl;

import raaml.stpa.StpaPackage;

import raaml.stpa.impl.StpaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HaraPackageImpl extends EPackageImpl implements HaraPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso26262EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass malfunctioningBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asilAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationalConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOperationalSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accidentScenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyMalfunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardousEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automotiveEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemLevelEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleLevelEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iso26262LibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum asilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controllabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exposureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

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
	 * @see raaml.hara.HaraPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HaraPackageImpl() {
		super(eNS_URI, HaraFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HaraPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HaraPackage init() {
		if (isInited) return (HaraPackage)EPackage.Registry.INSTANCE.getEPackage(HaraPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHaraPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HaraPackageImpl theHaraPackage = registeredHaraPackage instanceof HaraPackageImpl ? (HaraPackageImpl)registeredHaraPackage : new HaraPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RaamlPackage.eNS_URI);
		RaamlPackageImpl theRaamlPackage = (RaamlPackageImpl)(registeredPackage instanceof RaamlPackageImpl ? registeredPackage : RaamlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CorePackageImpl theCorePackage = (CorePackageImpl)(registeredPackage instanceof CorePackageImpl ? registeredPackage : CorePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ReqPackage.eNS_URI);
		ReqPackageImpl theReqPackage = (ReqPackageImpl)(registeredPackage instanceof ReqPackageImpl ? registeredPackage : ReqPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI);
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(registeredPackage instanceof LibraryPackageImpl ? registeredPackage : LibraryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FtaPackage.eNS_URI);
		FtaPackageImpl theFtaPackage = (FtaPackageImpl)(registeredPackage instanceof FtaPackageImpl ? registeredPackage : FtaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FmeaPackage.eNS_URI);
		FmeaPackageImpl theFmeaPackage = (FmeaPackageImpl)(registeredPackage instanceof FmeaPackageImpl ? registeredPackage : FmeaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);
		StpaPackageImpl theStpaPackage = (StpaPackageImpl)(registeredPackage instanceof StpaPackageImpl ? registeredPackage : StpaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GsnPackage.eNS_URI);
		GsnPackageImpl theGsnPackage = (GsnPackageImpl)(registeredPackage instanceof GsnPackageImpl ? registeredPackage : GsnPackage.eINSTANCE);

		// Create package meta-data objects
		theHaraPackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theReqPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFtaPackage.createPackageContents();
		theFmeaPackage.createPackageContents();
		theStpaPackage.createPackageContents();
		theGsnPackage.createPackageContents();

		// Initialize created meta-data
		theHaraPackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theReqPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFtaPackage.initializePackageContents();
		theFmeaPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();
		theGsnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHaraPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HaraPackage.eNS_URI, theHaraPackage);
		return theHaraPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISO26262() {
		return iso26262EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262_MalfunctioningBehaviors() {
		return (EReference)iso26262EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262_OperationalSituations() {
		return (EReference)iso26262EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262_ConfirmedItems() {
		return (EReference)iso26262EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262_VerifiedItems() {
		return (EReference)iso26262EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262_AsilAssignments() {
		return (EReference)iso26262EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationalSituation() {
		return operationalSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMalfunctioningBehaviour() {
		return malfunctioningBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerified() {
		return verifiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerified_Result() {
		return (EAttribute)verifiedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfirmed() {
		return confirmedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfirmed_Result() {
		return (EAttribute)confirmedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASILAssignment() {
		return asilAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getASILAssignment_ASIL() {
		return (EAttribute)asilAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getASILAssignment_ASILOverride() {
		return (EAttribute)asilAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationalCondition() {
		return operationalConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractOperationalSituation() {
		return abstractOperationalSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractOperationalSituation_Exposure() {
		return (EAttribute)abstractOperationalSituationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractOperationalSituation_Conditions() {
		return (EReference)abstractOperationalSituationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccidentScenario() {
		return accidentScenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccidentScenario_Controllability() {
		return (EAttribute)accidentScenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccidentScenario_Situations() {
		return (EReference)accidentScenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccidentScenario_MalfunctioningBehaviors() {
		return (EReference)accidentScenarioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnyMalfunction() {
		return anyMalfunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardousEvent() {
		return hazardousEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHazardousEvent_ASIL() {
		return (EAttribute)hazardousEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardousEvent_Hazards() {
		return (EReference)hazardousEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardousEvent_Scenarios() {
		return (EReference)hazardousEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardousEvent_VehicleLevelEffects() {
		return (EReference)hazardousEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardousEvent_SystemLevelEffects() {
		return (EReference)hazardousEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAutomotiveEffect() {
		return automotiveEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemLevelEffect() {
		return systemLevelEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVehicleLevelEffect() {
		return vehicleLevelEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getISO26262Library() {
		return iso26262LibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262Library_OperationalConditions() {
		return (EReference)iso26262LibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262Library_HazardousEvents() {
		return (EReference)iso26262LibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getISO26262Library_AccidentScenarios() {
		return (EReference)iso26262LibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getASIL() {
		return asilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getControllability() {
		return controllabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExposure() {
		return exposureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HaraFactory getHaraFactory() {
		return (HaraFactory)getEFactoryInstance();
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
		iso26262EClass = createEClass(ISO26262);
		createEReference(iso26262EClass, ISO26262__MALFUNCTIONING_BEHAVIORS);
		createEReference(iso26262EClass, ISO26262__OPERATIONAL_SITUATIONS);
		createEReference(iso26262EClass, ISO26262__CONFIRMED_ITEMS);
		createEReference(iso26262EClass, ISO26262__VERIFIED_ITEMS);
		createEReference(iso26262EClass, ISO26262__ASIL_ASSIGNMENTS);

		operationalSituationEClass = createEClass(OPERATIONAL_SITUATION);

		malfunctioningBehaviourEClass = createEClass(MALFUNCTIONING_BEHAVIOUR);

		verifiedEClass = createEClass(VERIFIED);
		createEAttribute(verifiedEClass, VERIFIED__RESULT);

		confirmedEClass = createEClass(CONFIRMED);
		createEAttribute(confirmedEClass, CONFIRMED__RESULT);

		asilAssignmentEClass = createEClass(ASIL_ASSIGNMENT);
		createEAttribute(asilAssignmentEClass, ASIL_ASSIGNMENT__ASIL);
		createEAttribute(asilAssignmentEClass, ASIL_ASSIGNMENT__ASIL_OVERRIDE);

		operationalConditionEClass = createEClass(OPERATIONAL_CONDITION);

		abstractOperationalSituationEClass = createEClass(ABSTRACT_OPERATIONAL_SITUATION);
		createEAttribute(abstractOperationalSituationEClass, ABSTRACT_OPERATIONAL_SITUATION__EXPOSURE);
		createEReference(abstractOperationalSituationEClass, ABSTRACT_OPERATIONAL_SITUATION__CONDITIONS);

		accidentScenarioEClass = createEClass(ACCIDENT_SCENARIO);
		createEAttribute(accidentScenarioEClass, ACCIDENT_SCENARIO__CONTROLLABILITY);
		createEReference(accidentScenarioEClass, ACCIDENT_SCENARIO__SITUATIONS);
		createEReference(accidentScenarioEClass, ACCIDENT_SCENARIO__MALFUNCTIONING_BEHAVIORS);

		anyMalfunctionEClass = createEClass(ANY_MALFUNCTION);

		hazardousEventEClass = createEClass(HAZARDOUS_EVENT);
		createEAttribute(hazardousEventEClass, HAZARDOUS_EVENT__ASIL);
		createEReference(hazardousEventEClass, HAZARDOUS_EVENT__HAZARDS);
		createEReference(hazardousEventEClass, HAZARDOUS_EVENT__SCENARIOS);
		createEReference(hazardousEventEClass, HAZARDOUS_EVENT__VEHICLE_LEVEL_EFFECTS);
		createEReference(hazardousEventEClass, HAZARDOUS_EVENT__SYSTEM_LEVEL_EFFECTS);

		automotiveEffectEClass = createEClass(AUTOMOTIVE_EFFECT);

		systemLevelEffectEClass = createEClass(SYSTEM_LEVEL_EFFECT);

		vehicleLevelEffectEClass = createEClass(VEHICLE_LEVEL_EFFECT);

		iso26262LibraryEClass = createEClass(ISO26262_LIBRARY);
		createEReference(iso26262LibraryEClass, ISO26262_LIBRARY__OPERATIONAL_CONDITIONS);
		createEReference(iso26262LibraryEClass, ISO26262_LIBRARY__HAZARDOUS_EVENTS);
		createEReference(iso26262LibraryEClass, ISO26262_LIBRARY__ACCIDENT_SCENARIOS);

		// Create enums
		asilEEnum = createEEnum(ASIL);
		controllabilityEEnum = createEEnum(CONTROLLABILITY);
		exposureEEnum = createEEnum(EXPOSURE);
		severityEEnum = createEEnum(SEVERITY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iso26262EClass.getESuperTypes().add(theCorePackage.getAnalysis());
		operationalSituationEClass.getESuperTypes().add(theCorePackage.getSituation());
		malfunctioningBehaviourEClass.getESuperTypes().add(theCorePackage.getFailureMode());
		verifiedEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		confirmedEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		asilAssignmentEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		operationalConditionEClass.getESuperTypes().add(theCorePackage.getAbstractEvent());
		abstractOperationalSituationEClass.getESuperTypes().add(this.getOperationalCondition());
		accidentScenarioEClass.getESuperTypes().add(theCorePackage.getDysfunctionalEvent());
		anyMalfunctionEClass.getESuperTypes().add(theCorePackage.getUndesiredState());
		hazardousEventEClass.getESuperTypes().add(theCorePackage.getAbstractRisk());
		automotiveEffectEClass.getESuperTypes().add(theCorePackage.getAbstractEffect());
		systemLevelEffectEClass.getESuperTypes().add(this.getAutomotiveEffect());
		vehicleLevelEffectEClass.getESuperTypes().add(this.getAutomotiveEffect());
		iso26262LibraryEClass.getESuperTypes().add(theCorePackage.getAbstractLibrary());

		// Initialize classes, features, and operations; add parameters
		initEClass(iso26262EClass, raaml.hara.ISO26262.class, "ISO26262", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISO26262_MalfunctioningBehaviors(), this.getMalfunctioningBehaviour(), null, "malfunctioningBehaviors", null, 0, -1, raaml.hara.ISO26262.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISO26262_OperationalSituations(), this.getOperationalSituation(), null, "operationalSituations", null, 0, -1, raaml.hara.ISO26262.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISO26262_ConfirmedItems(), this.getConfirmed(), null, "confirmedItems", null, 0, -1, raaml.hara.ISO26262.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISO26262_VerifiedItems(), this.getVerified(), null, "verifiedItems", null, 0, -1, raaml.hara.ISO26262.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISO26262_AsilAssignments(), this.getASILAssignment(), null, "asilAssignments", null, 0, -1, raaml.hara.ISO26262.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalSituationEClass, OperationalSituation.class, "OperationalSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(malfunctioningBehaviourEClass, MalfunctioningBehaviour.class, "MalfunctioningBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(verifiedEClass, Verified.class, "Verified", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerified_Result(), ecorePackage.getEString(), "result", null, 0, 1, Verified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confirmedEClass, Confirmed.class, "Confirmed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfirmed_Result(), ecorePackage.getEString(), "result", null, 0, 1, Confirmed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asilAssignmentEClass, ASILAssignment.class, "ASILAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASILAssignment_ASIL(), this.getASIL(), "ASIL", null, 1, 1, ASILAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getASILAssignment_ASILOverride(), this.getASIL(), "ASILOverride", null, 0, 1, ASILAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationalConditionEClass, OperationalCondition.class, "OperationalCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractOperationalSituationEClass, AbstractOperationalSituation.class, "AbstractOperationalSituation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractOperationalSituation_Exposure(), this.getExposure(), "exposure", null, 0, 1, AbstractOperationalSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractOperationalSituation_Conditions(), this.getOperationalCondition(), null, "conditions", null, 0, -1, AbstractOperationalSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accidentScenarioEClass, AccidentScenario.class, "AccidentScenario", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccidentScenario_Controllability(), this.getControllability(), "controllability", null, 0, 1, AccidentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccidentScenario_Situations(), this.getAbstractOperationalSituation(), null, "situations", null, 0, -1, AccidentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccidentScenario_MalfunctioningBehaviors(), this.getAnyMalfunction(), null, "malfunctioningBehaviors", null, 0, -1, AccidentScenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anyMalfunctionEClass, AnyMalfunction.class, "AnyMalfunction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hazardousEventEClass, HazardousEvent.class, "HazardousEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazardousEvent_ASIL(), this.getASIL(), "ASIL", null, 0, -1, HazardousEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardousEvent_Hazards(), theCorePackage.getHazard(), null, "hazards", null, 0, -1, HazardousEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardousEvent_Scenarios(), this.getAccidentScenario(), null, "scenarios", null, 0, -1, HazardousEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardousEvent_VehicleLevelEffects(), this.getVehicleLevelEffect(), null, "vehicleLevelEffects", null, 0, -1, HazardousEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardousEvent_SystemLevelEffects(), this.getSystemLevelEffect(), null, "systemLevelEffects", null, 0, -1, HazardousEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automotiveEffectEClass, AutomotiveEffect.class, "AutomotiveEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemLevelEffectEClass, SystemLevelEffect.class, "SystemLevelEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vehicleLevelEffectEClass, VehicleLevelEffect.class, "VehicleLevelEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(iso26262LibraryEClass, ISO26262Library.class, "ISO26262Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getISO26262Library_OperationalConditions(), this.getOperationalCondition(), null, "operationalConditions", null, 0, -1, ISO26262Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISO26262Library_HazardousEvents(), this.getHazardousEvent(), null, "hazardousEvents", null, 0, -1, ISO26262Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getISO26262Library_AccidentScenarios(), this.getAccidentScenario(), null, "accidentScenarios", null, 0, -1, ISO26262Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(asilEEnum, raaml.hara.ASIL.class, "ASIL");
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.NOASSIGNMENT);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.QM);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.A);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.B);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.C);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.D);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.AB);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.AC);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.AD);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.BC);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.CD);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.AA);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.BB);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.CC);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.DD);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.QMA);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.QMB);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.QMC);
		addEEnumLiteral(asilEEnum, raaml.hara.ASIL.QMD);

		initEEnum(controllabilityEEnum, Controllability.class, "Controllability");
		addEEnumLiteral(controllabilityEEnum, Controllability.C0);
		addEEnumLiteral(controllabilityEEnum, Controllability.C1);
		addEEnumLiteral(controllabilityEEnum, Controllability.C2);
		addEEnumLiteral(controllabilityEEnum, Controllability.C3);

		initEEnum(exposureEEnum, Exposure.class, "Exposure");
		addEEnumLiteral(exposureEEnum, Exposure.E0);
		addEEnumLiteral(exposureEEnum, Exposure.E1);
		addEEnumLiteral(exposureEEnum, Exposure.E2);
		addEEnumLiteral(exposureEEnum, Exposure.E3);
		addEEnumLiteral(exposureEEnum, Exposure.E4);

		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.S0);
		addEEnumLiteral(severityEEnum, Severity.S1);
		addEEnumLiteral(severityEEnum, Severity.S2);
		addEEnumLiteral(severityEEnum, Severity.S3);

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
		  (iso26262EClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "ISO26262"
		   });
		addAnnotation
		  (operationalSituationEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "OperationalSituation"
		   });
		addAnnotation
		  (malfunctioningBehaviourEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "MalfunctioningBehaviour"
		   });
		addAnnotation
		  (verifiedEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Verified"
		   });
		addAnnotation
		  (confirmedEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Confirmed"
		   });
		addAnnotation
		  (asilAssignmentEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ASILAssignment"
		   });
		addAnnotation
		  (operationalConditionEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (abstractOperationalSituationEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (accidentScenarioEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (anyMalfunctionEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (hazardousEventEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (automotiveEffectEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (systemLevelEffectEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "SystemLevelEffect"
		   });
		addAnnotation
		  (vehicleLevelEffectEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "VehicleLevelEffect"
		   });
		addAnnotation
		  (iso26262LibraryEClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "ISO26262Library"
		   });
	}

} //HaraPackageImpl
