/**
 */
package raaml.hazop.impl;

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

import raaml.hara.HaraPackage;

import raaml.hara.impl.HaraPackageImpl;

import raaml.hazop.Cause;
import raaml.hazop.Consequence;
import raaml.hazop.Deviation;
import raaml.hazop.GuideWord;
import raaml.hazop.HAZOPNode;
import raaml.hazop.HAZOPStudy;
import raaml.hazop.HazopFactory;
import raaml.hazop.HazopPackage;
import raaml.hazop.Recommendation;
import raaml.hazop.RiskLevel;
import raaml.hazop.Safeguard;

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
public class HazopPackageImpl extends EPackageImpl implements HazopPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazopStudyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safeguardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guideWordEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskLevelEEnum = null;

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
	 * @see raaml.hazop.HazopPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HazopPackageImpl() {
		super(eNS_URI, HazopFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link HazopPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HazopPackage init() {
		if (isInited) return (HazopPackage)EPackage.Registry.INSTANCE.getEPackage(HazopPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHazopPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HazopPackageImpl theHazopPackage = registeredHazopPackage instanceof HazopPackageImpl ? (HazopPackageImpl)registeredHazopPackage : new HazopPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HaraPackage.eNS_URI);
		HaraPackageImpl theHaraPackage = (HaraPackageImpl)(registeredPackage instanceof HaraPackageImpl ? registeredPackage : HaraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);
		StpaPackageImpl theStpaPackage = (StpaPackageImpl)(registeredPackage instanceof StpaPackageImpl ? registeredPackage : StpaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GsnPackage.eNS_URI);
		GsnPackageImpl theGsnPackage = (GsnPackageImpl)(registeredPackage instanceof GsnPackageImpl ? registeredPackage : GsnPackage.eINSTANCE);

		// Create package meta-data objects
		theHazopPackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theReqPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFtaPackage.createPackageContents();
		theFmeaPackage.createPackageContents();
		theHaraPackage.createPackageContents();
		theStpaPackage.createPackageContents();
		theGsnPackage.createPackageContents();

		// Initialize created meta-data
		theHazopPackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theReqPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFtaPackage.initializePackageContents();
		theFmeaPackage.initializePackageContents();
		theHaraPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();
		theGsnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHazopPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HazopPackage.eNS_URI, theHazopPackage);
		return theHazopPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAZOPStudy() {
		return hazopStudyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHAZOPStudy_StudyDate() {
		return (EAttribute)hazopStudyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHAZOPStudy_StandardReference() {
		return (EAttribute)hazopStudyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHAZOPStudy_Nodes() {
		return (EReference)hazopStudyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHAZOPNode() {
		return hazopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHAZOPNode_Subsystem() {
		return (EAttribute)hazopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHAZOPNode_DesignIntent() {
		return (EAttribute)hazopNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHAZOPNode_Deviations() {
		return (EReference)hazopNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeviation() {
		return deviationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviation_GuideWord() {
		return (EAttribute)deviationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviation_Parameter() {
		return (EAttribute)deviationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviation_DeviationText() {
		return (EAttribute)deviationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviation_RiskLevel() {
		return (EAttribute)deviationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeviation_Asil() {
		return (EAttribute)deviationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviation_Causes() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviation_Consequences() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviation_Safeguards() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeviation_Recommendations() {
		return (EReference)deviationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCause() {
		return causeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsequence() {
		return consequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafeguard() {
		return safeguardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecommendation() {
		return recommendationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGuideWord() {
		return guideWordEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskLevel() {
		return riskLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazopFactory getHazopFactory() {
		return (HazopFactory)getEFactoryInstance();
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
		hazopStudyEClass = createEClass(HAZOP_STUDY);
		createEAttribute(hazopStudyEClass, HAZOP_STUDY__STUDY_DATE);
		createEAttribute(hazopStudyEClass, HAZOP_STUDY__STANDARD_REFERENCE);
		createEReference(hazopStudyEClass, HAZOP_STUDY__NODES);

		hazopNodeEClass = createEClass(HAZOP_NODE);
		createEAttribute(hazopNodeEClass, HAZOP_NODE__SUBSYSTEM);
		createEAttribute(hazopNodeEClass, HAZOP_NODE__DESIGN_INTENT);
		createEReference(hazopNodeEClass, HAZOP_NODE__DEVIATIONS);

		deviationEClass = createEClass(DEVIATION);
		createEAttribute(deviationEClass, DEVIATION__GUIDE_WORD);
		createEAttribute(deviationEClass, DEVIATION__PARAMETER);
		createEAttribute(deviationEClass, DEVIATION__DEVIATION_TEXT);
		createEAttribute(deviationEClass, DEVIATION__RISK_LEVEL);
		createEAttribute(deviationEClass, DEVIATION__ASIL);
		createEReference(deviationEClass, DEVIATION__CAUSES);
		createEReference(deviationEClass, DEVIATION__CONSEQUENCES);
		createEReference(deviationEClass, DEVIATION__SAFEGUARDS);
		createEReference(deviationEClass, DEVIATION__RECOMMENDATIONS);

		causeEClass = createEClass(CAUSE);

		consequenceEClass = createEClass(CONSEQUENCE);

		safeguardEClass = createEClass(SAFEGUARD);

		recommendationEClass = createEClass(RECOMMENDATION);

		// Create enums
		guideWordEEnum = createEEnum(GUIDE_WORD);
		riskLevelEEnum = createEEnum(RISK_LEVEL);
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
		hazopStudyEClass.getESuperTypes().add(theCorePackage.getAnalysis());
		hazopNodeEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		deviationEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		causeEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		consequenceEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		safeguardEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		recommendationEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(hazopStudyEClass, HAZOPStudy.class, "HAZOPStudy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHAZOPStudy_StudyDate(), ecorePackage.getEString(), "studyDate", null, 0, 1, HAZOPStudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAZOPStudy_StandardReference(), ecorePackage.getEString(), "standardReference", "IEC 61882:2016", 0, 1, HAZOPStudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHAZOPStudy_Nodes(), this.getHAZOPNode(), null, "nodes", null, 0, -1, HAZOPStudy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazopNodeEClass, HAZOPNode.class, "HAZOPNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHAZOPNode_Subsystem(), ecorePackage.getEString(), "subsystem", null, 0, 1, HAZOPNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHAZOPNode_DesignIntent(), ecorePackage.getEString(), "designIntent", null, 0, 1, HAZOPNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHAZOPNode_Deviations(), this.getDeviation(), null, "deviations", null, 0, -1, HAZOPNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviationEClass, Deviation.class, "Deviation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviation_GuideWord(), this.getGuideWord(), "guideWord", "NO", 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviation_Parameter(), ecorePackage.getEString(), "parameter", null, 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviation_DeviationText(), ecorePackage.getEString(), "deviationText", null, 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviation_RiskLevel(), this.getRiskLevel(), "riskLevel", "MEDIUM", 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviation_Asil(), theHaraPackage.getASIL(), "asil", null, 0, 1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviation_Causes(), this.getCause(), null, "causes", null, 0, -1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviation_Consequences(), this.getConsequence(), null, "consequences", null, 0, -1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviation_Safeguards(), this.getSafeguard(), null, "safeguards", null, 0, -1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviation_Recommendations(), this.getRecommendation(), null, "recommendations", null, 0, -1, Deviation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(causeEClass, Cause.class, "Cause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(consequenceEClass, Consequence.class, "Consequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(safeguardEClass, Safeguard.class, "Safeguard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recommendationEClass, Recommendation.class, "Recommendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(guideWordEEnum, GuideWord.class, "GuideWord");
		addEEnumLiteral(guideWordEEnum, GuideWord.NO);
		addEEnumLiteral(guideWordEEnum, GuideWord.MORE);
		addEEnumLiteral(guideWordEEnum, GuideWord.LESS);
		addEEnumLiteral(guideWordEEnum, GuideWord.AS_WELL_AS);
		addEEnumLiteral(guideWordEEnum, GuideWord.PART_OF);
		addEEnumLiteral(guideWordEEnum, GuideWord.REVERSE);
		addEEnumLiteral(guideWordEEnum, GuideWord.OTHER_THAN);
		addEEnumLiteral(guideWordEEnum, GuideWord.EARLY);
		addEEnumLiteral(guideWordEEnum, GuideWord.LATE);
		addEEnumLiteral(guideWordEEnum, GuideWord.BEFORE);
		addEEnumLiteral(guideWordEEnum, GuideWord.AFTER);

		initEEnum(riskLevelEEnum, RiskLevel.class, "RiskLevel");
		addEEnumLiteral(riskLevelEEnum, RiskLevel.LOW);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.MEDIUM);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.HIGH);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.CRITICAL);

		// Create annotations
		// http://edu.kit.sdq/raaml/native-ecore
		createNativeecoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://edu.kit.sdq/raaml/native-ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNativeecoreAnnotations() {
		String source = "http://edu.kit.sdq/raaml/native-ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "rationale", "IEC 61882 is a worksheet-only methodology with no normative OMG UML profile. This package is native to the standalone Ecore (no Pair-1/Pair-2 ETL is provided or possible). Demonstrates that the standalone-Ecore approach delivers value even where no source UML profile exists."
		   });
		addAnnotation
		  (hazopStudyEClass,
		   source,
		   new String[] {
			   "origin", "IEC 61882:2016 -- no UML profile equivalent"
		   });
	}

} //HazopPackageImpl
