/**
 */
package raaml.fta.impl;

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

import raaml.fta.BasicEvent;
import raaml.fta.ConditionalEvent;
import raaml.fta.DormantEvent;
import raaml.fta.Event;
import raaml.fta.FTAElement;
import raaml.fta.FTALibrary;
import raaml.fta.FTATree;
import raaml.fta.FtaFactory;
import raaml.fta.FtaPackage;
import raaml.fta.Gate;
import raaml.fta.HouseEvent;
import raaml.fta.IntermediateEvent;
import raaml.fta.TopEvent;
import raaml.fta.UndevelopedEvent;
import raaml.fta.ZeroEvent;

import raaml.gsn.GsnPackage;

import raaml.gsn.impl.GsnPackageImpl;

import raaml.hara.HaraPackage;

import raaml.hara.impl.HaraPackageImpl;

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
public class FtaPackageImpl extends EPackageImpl implements FtaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dormantEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undevelopedEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeroEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inhibitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass majoritY_VOTEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftaLibraryEClass = null;

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
	 * @see raaml.fta.FtaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FtaPackageImpl() {
		super(eNS_URI, FtaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FtaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FtaPackage init() {
		if (isInited) return (FtaPackage)EPackage.Registry.INSTANCE.getEPackage(FtaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFtaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FtaPackageImpl theFtaPackage = registeredFtaPackage instanceof FtaPackageImpl ? (FtaPackageImpl)registeredFtaPackage : new FtaPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FmeaPackage.eNS_URI);
		FmeaPackageImpl theFmeaPackage = (FmeaPackageImpl)(registeredPackage instanceof FmeaPackageImpl ? registeredPackage : FmeaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HaraPackage.eNS_URI);
		HaraPackageImpl theHaraPackage = (HaraPackageImpl)(registeredPackage instanceof HaraPackageImpl ? registeredPackage : HaraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);
		StpaPackageImpl theStpaPackage = (StpaPackageImpl)(registeredPackage instanceof StpaPackageImpl ? registeredPackage : StpaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GsnPackage.eNS_URI);
		GsnPackageImpl theGsnPackage = (GsnPackageImpl)(registeredPackage instanceof GsnPackageImpl ? registeredPackage : GsnPackage.eINSTANCE);

		// Create package meta-data objects
		theFtaPackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theReqPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFmeaPackage.createPackageContents();
		theHaraPackage.createPackageContents();
		theStpaPackage.createPackageContents();
		theGsnPackage.createPackageContents();

		// Initialize created meta-data
		theFtaPackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theReqPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFmeaPackage.initializePackageContents();
		theHaraPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();
		theGsnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFtaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FtaPackage.eNS_URI, theFtaPackage);
		return theFtaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTA() {
		return ftaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTA_Gates() {
		return (EReference)ftaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTA_Events() {
		return (EReference)ftaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTA_Trees() {
		return (EReference)ftaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTAElement() {
		return ftaElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFTAElement_Probability() {
		return (EAttribute)ftaElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTAElement_SourceGate() {
		return (EReference)ftaElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_TargetGate() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_InhibitGate() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasicEvent() {
		return basicEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermediateEvent() {
		return intermediateEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTopEvent() {
		return topEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionalEvent() {
		return conditionalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDormantEvent() {
		return dormantEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndevelopedEvent() {
		return undevelopedEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHouseEvent() {
		return houseEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeroEvent() {
		return zeroEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGate_SourceEvent() {
		return (EReference)gateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGate_TargetEvent() {
		return (EReference)gateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAND() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOR() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNOT() {
		return notEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXOR() {
		return xorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSEQ() {
		return seqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getINHIBIT() {
		return inhibitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getINHIBIT_Condition() {
		return (EReference)inhibitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMAJORITY_VOTE() {
		return majoritY_VOTEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMAJORITY_VOTE_M() {
		return (EAttribute)majoritY_VOTEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTATree() {
		return ftaTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTATree_TopEvent() {
		return (EReference)ftaTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTATree_Gates() {
		return (EReference)ftaTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFTALibrary() {
		return ftaLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTALibrary_FtaElements() {
		return (EReference)ftaLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFTALibrary_Gates() {
		return (EReference)ftaLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FtaFactory getFtaFactory() {
		return (FtaFactory)getEFactoryInstance();
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
		ftaEClass = createEClass(FTA);
		createEReference(ftaEClass, FTA__GATES);
		createEReference(ftaEClass, FTA__EVENTS);
		createEReference(ftaEClass, FTA__TREES);

		ftaElementEClass = createEClass(FTA_ELEMENT);
		createEAttribute(ftaElementEClass, FTA_ELEMENT__PROBABILITY);
		createEReference(ftaElementEClass, FTA_ELEMENT__SOURCE_GATE);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__TARGET_GATE);
		createEReference(eventEClass, EVENT__INHIBIT_GATE);

		basicEventEClass = createEClass(BASIC_EVENT);

		intermediateEventEClass = createEClass(INTERMEDIATE_EVENT);

		topEventEClass = createEClass(TOP_EVENT);

		conditionalEventEClass = createEClass(CONDITIONAL_EVENT);

		dormantEventEClass = createEClass(DORMANT_EVENT);

		undevelopedEventEClass = createEClass(UNDEVELOPED_EVENT);

		houseEventEClass = createEClass(HOUSE_EVENT);

		zeroEventEClass = createEClass(ZERO_EVENT);

		gateEClass = createEClass(GATE);
		createEReference(gateEClass, GATE__SOURCE_EVENT);
		createEReference(gateEClass, GATE__TARGET_EVENT);

		andEClass = createEClass(AND);

		orEClass = createEClass(OR);

		notEClass = createEClass(NOT);

		xorEClass = createEClass(XOR);

		seqEClass = createEClass(SEQ);

		inhibitEClass = createEClass(INHIBIT);
		createEReference(inhibitEClass, INHIBIT__CONDITION);

		majoritY_VOTEEClass = createEClass(MAJORITY_VOTE);
		createEAttribute(majoritY_VOTEEClass, MAJORITY_VOTE__M);

		ftaTreeEClass = createEClass(FTA_TREE);
		createEReference(ftaTreeEClass, FTA_TREE__TOP_EVENT);
		createEReference(ftaTreeEClass, FTA_TREE__GATES);

		ftaLibraryEClass = createEClass(FTA_LIBRARY);
		createEReference(ftaLibraryEClass, FTA_LIBRARY__FTA_ELEMENTS);
		createEReference(ftaLibraryEClass, FTA_LIBRARY__GATES);
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
		ftaEClass.getESuperTypes().add(theCorePackage.getAnalysis());
		ftaElementEClass.getESuperTypes().add(theCorePackage.getDysfunctionalEvent());
		eventEClass.getESuperTypes().add(this.getFTAElement());
		basicEventEClass.getESuperTypes().add(this.getEvent());
		intermediateEventEClass.getESuperTypes().add(this.getEvent());
		topEventEClass.getESuperTypes().add(this.getEvent());
		conditionalEventEClass.getESuperTypes().add(this.getEvent());
		dormantEventEClass.getESuperTypes().add(this.getEvent());
		undevelopedEventEClass.getESuperTypes().add(this.getEvent());
		houseEventEClass.getESuperTypes().add(this.getEvent());
		zeroEventEClass.getESuperTypes().add(this.getEvent());
		gateEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		andEClass.getESuperTypes().add(this.getGate());
		orEClass.getESuperTypes().add(this.getGate());
		notEClass.getESuperTypes().add(this.getGate());
		xorEClass.getESuperTypes().add(this.getGate());
		seqEClass.getESuperTypes().add(this.getGate());
		inhibitEClass.getESuperTypes().add(this.getGate());
		majoritY_VOTEEClass.getESuperTypes().add(this.getGate());
		ftaTreeEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		ftaLibraryEClass.getESuperTypes().add(theCorePackage.getAbstractLibrary());

		// Initialize classes, features, and operations; add parameters
		initEClass(ftaEClass, raaml.fta.FTA.class, "FTA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFTA_Gates(), this.getGate(), null, "gates", null, 0, -1, raaml.fta.FTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTA_Events(), this.getEvent(), null, "events", null, 0, -1, raaml.fta.FTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTA_Trees(), this.getFTATree(), null, "trees", null, 0, -1, raaml.fta.FTA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftaElementEClass, FTAElement.class, "FTAElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFTAElement_Probability(), ecorePackage.getEDouble(), "probability", null, 0, 1, FTAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTAElement_SourceGate(), this.getGate(), this.getGate_SourceEvent(), "sourceGate", null, 0, 1, FTAElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_TargetGate(), this.getGate(), this.getGate_TargetEvent(), "targetGate", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_InhibitGate(), this.getINHIBIT(), this.getINHIBIT_Condition(), "inhibitGate", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicEventEClass, BasicEvent.class, "BasicEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermediateEventEClass, IntermediateEvent.class, "IntermediateEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topEventEClass, TopEvent.class, "TopEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionalEventEClass, ConditionalEvent.class, "ConditionalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dormantEventEClass, DormantEvent.class, "DormantEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(undevelopedEventEClass, UndevelopedEvent.class, "UndevelopedEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(houseEventEClass, HouseEvent.class, "HouseEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zeroEventEClass, ZeroEvent.class, "ZeroEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gateEClass, Gate.class, "Gate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGate_SourceEvent(), this.getFTAElement(), this.getFTAElement_SourceGate(), "sourceEvent", null, 0, -1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGate_TargetEvent(), this.getEvent(), this.getEvent_TargetGate(), "targetEvent", null, 1, 1, Gate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, raaml.fta.AND.class, "AND", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orEClass, raaml.fta.OR.class, "OR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notEClass, raaml.fta.NOT.class, "NOT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xorEClass, raaml.fta.XOR.class, "XOR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(seqEClass, raaml.fta.SEQ.class, "SEQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inhibitEClass, raaml.fta.INHIBIT.class, "INHIBIT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getINHIBIT_Condition(), this.getEvent(), this.getEvent_InhibitGate(), "condition", null, 0, -1, raaml.fta.INHIBIT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(majoritY_VOTEEClass, raaml.fta.MAJORITY_VOTE.class, "MAJORITY_VOTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMAJORITY_VOTE_M(), ecorePackage.getEInt(), "m", null, 0, 1, raaml.fta.MAJORITY_VOTE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftaTreeEClass, FTATree.class, "FTATree", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFTATree_TopEvent(), this.getEvent(), null, "topEvent", null, 1, 1, FTATree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTATree_Gates(), this.getGate(), null, "gates", null, 0, -1, FTATree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ftaLibraryEClass, FTALibrary.class, "FTALibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFTALibrary_FtaElements(), this.getFTAElement(), null, "ftaElements", null, 0, -1, FTALibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFTALibrary_Gates(), this.getGate(), null, "gates", null, 0, -1, FTALibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (ftaEClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "FTA"
		   });
		addAnnotation
		  (ftaElementEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (basicEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "BasicEvent"
		   });
		addAnnotation
		  (intermediateEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "IntermediateEvent"
		   });
		addAnnotation
		  (topEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "TopEvent"
		   });
		addAnnotation
		  (conditionalEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ConditionalEvent"
		   });
		addAnnotation
		  (dormantEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "DormantEvent"
		   });
		addAnnotation
		  (undevelopedEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "UndevelopedEvent"
		   });
		addAnnotation
		  (houseEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "HouseEvent"
		   });
		addAnnotation
		  (zeroEventEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ZeroEvent"
		   });
		addAnnotation
		  (gateEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (andEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "AND"
		   });
		addAnnotation
		  (orEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "OR"
		   });
		addAnnotation
		  (notEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "NOT"
		   });
		addAnnotation
		  (xorEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "XOR"
		   });
		addAnnotation
		  (seqEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "SEQ"
		   });
		addAnnotation
		  (inhibitEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "INHIBIT"
		   });
		addAnnotation
		  (majoritY_VOTEEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "MAJORITY_VOTE"
		   });
		addAnnotation
		  (ftaTreeEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "FTATree"
		   });
		addAnnotation
		  (ftaLibraryEClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "FTALibrary"
		   });
	}

} //FtaPackageImpl
