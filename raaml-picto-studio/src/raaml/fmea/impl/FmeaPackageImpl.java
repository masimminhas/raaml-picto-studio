/**
 */
package raaml.fmea.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import raaml.RaamlPackage;

import raaml.core.CorePackage;

import raaml.core.impl.CorePackageImpl;

import raaml.fmea.AbstractFMEAItem;
import raaml.fmea.DegradationOfFunction;
import raaml.fmea.DelayedFunction;
import raaml.fmea.ExceedingFunction;
import raaml.fmea.FMEAItem;
import raaml.fmea.FMEALibrary;
import raaml.fmea.FmeaFactory;
import raaml.fmea.FmeaPackage;
import raaml.fmea.IntermittentFunction;
import raaml.fmea.LossOfFunction;
import raaml.fmea.PartialFunction;
import raaml.fmea.RPNCalculation;
import raaml.fmea.UnintendedFunction;

import raaml.fta.FtaPackage;

import raaml.fta.impl.FtaPackageImpl;

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
public class FmeaPackageImpl extends EPackageImpl implements FmeaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpnCalculationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFMEAItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lossOfFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass degradationOfFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermittentFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceedingFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unintendedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayedFunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaLibraryEClass = null;

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
	 * @see raaml.fmea.FmeaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FmeaPackageImpl() {
		super(eNS_URI, FmeaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FmeaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FmeaPackage init() {
		if (isInited) return (FmeaPackage)EPackage.Registry.INSTANCE.getEPackage(FmeaPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFmeaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FmeaPackageImpl theFmeaPackage = registeredFmeaPackage instanceof FmeaPackageImpl ? (FmeaPackageImpl)registeredFmeaPackage : new FmeaPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(HaraPackage.eNS_URI);
		HaraPackageImpl theHaraPackage = (HaraPackageImpl)(registeredPackage instanceof HaraPackageImpl ? registeredPackage : HaraPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);
		StpaPackageImpl theStpaPackage = (StpaPackageImpl)(registeredPackage instanceof StpaPackageImpl ? registeredPackage : StpaPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GsnPackage.eNS_URI);
		GsnPackageImpl theGsnPackage = (GsnPackageImpl)(registeredPackage instanceof GsnPackageImpl ? registeredPackage : GsnPackage.eINSTANCE);

		// Create package meta-data objects
		theFmeaPackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theReqPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFtaPackage.createPackageContents();
		theHaraPackage.createPackageContents();
		theStpaPackage.createPackageContents();
		theGsnPackage.createPackageContents();

		// Initialize created meta-data
		theFmeaPackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theReqPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFtaPackage.initializePackageContents();
		theHaraPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();
		theGsnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFmeaPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FmeaPackage.eNS_URI, theFmeaPackage);
		return theFmeaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMEA() {
		return fmeaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMEA_FmeaItems() {
		return (EReference)fmeaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRPNCalculation() {
		return rpnCalculationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRPNCalculation_RPN() {
		return (EAttribute)rpnCalculationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRPNCalculation_SEV() {
		return (EAttribute)rpnCalculationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRPNCalculation_OCC() {
		return (EAttribute)rpnCalculationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRPNCalculation_DET() {
		return (EAttribute)rpnCalculationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractFMEAItem() {
		return abstractFMEAItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractFMEAItem_RPN() {
		return (EAttribute)abstractFMEAItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractFMEAItem_FailureMode() {
		return (EReference)abstractFMEAItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractFMEAItem_FinalEffect() {
		return (EReference)abstractFMEAItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractFMEAItem_Cause() {
		return (EReference)abstractFMEAItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMEAItem() {
		return fmeaItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMEAItem_RpnCalculation() {
		return (EReference)fmeaItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLossOfFunction() {
		return lossOfFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDegradationOfFunction() {
		return degradationOfFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntermittentFunction() {
		return intermittentFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartialFunction() {
		return partialFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExceedingFunction() {
		return exceedingFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnintendedFunction() {
		return unintendedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelayedFunction() {
		return delayedFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMEALibrary() {
		return fmeaLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMEALibrary_AbstractFMEAItems() {
		return (EReference)fmeaLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FmeaFactory getFmeaFactory() {
		return (FmeaFactory)getEFactoryInstance();
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
		fmeaEClass = createEClass(FMEA);
		createEReference(fmeaEClass, FMEA__FMEA_ITEMS);

		rpnCalculationEClass = createEClass(RPN_CALCULATION);
		createEAttribute(rpnCalculationEClass, RPN_CALCULATION__RPN);
		createEAttribute(rpnCalculationEClass, RPN_CALCULATION__SEV);
		createEAttribute(rpnCalculationEClass, RPN_CALCULATION__OCC);
		createEAttribute(rpnCalculationEClass, RPN_CALCULATION__DET);

		abstractFMEAItemEClass = createEClass(ABSTRACT_FMEA_ITEM);
		createEAttribute(abstractFMEAItemEClass, ABSTRACT_FMEA_ITEM__RPN);
		createEReference(abstractFMEAItemEClass, ABSTRACT_FMEA_ITEM__FAILURE_MODE);
		createEReference(abstractFMEAItemEClass, ABSTRACT_FMEA_ITEM__FINAL_EFFECT);
		createEReference(abstractFMEAItemEClass, ABSTRACT_FMEA_ITEM__CAUSE);

		fmeaItemEClass = createEClass(FMEA_ITEM);
		createEReference(fmeaItemEClass, FMEA_ITEM__RPN_CALCULATION);

		lossOfFunctionEClass = createEClass(LOSS_OF_FUNCTION);

		degradationOfFunctionEClass = createEClass(DEGRADATION_OF_FUNCTION);

		intermittentFunctionEClass = createEClass(INTERMITTENT_FUNCTION);

		partialFunctionEClass = createEClass(PARTIAL_FUNCTION);

		exceedingFunctionEClass = createEClass(EXCEEDING_FUNCTION);

		unintendedFunctionEClass = createEClass(UNINTENDED_FUNCTION);

		delayedFunctionEClass = createEClass(DELAYED_FUNCTION);

		fmeaLibraryEClass = createEClass(FMEA_LIBRARY);
		createEReference(fmeaLibraryEClass, FMEA_LIBRARY__ABSTRACT_FMEA_ITEMS);
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
		fmeaEClass.getESuperTypes().add(theCorePackage.getAnalysis());
		rpnCalculationEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		abstractFMEAItemEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		fmeaItemEClass.getESuperTypes().add(this.getAbstractFMEAItem());
		lossOfFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		degradationOfFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		intermittentFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		partialFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		exceedingFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		unintendedFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		delayedFunctionEClass.getESuperTypes().add(theCorePackage.getAbstractFailureMode());
		fmeaLibraryEClass.getESuperTypes().add(theCorePackage.getAbstractLibrary());

		// Initialize classes, features, and operations; add parameters
		initEClass(fmeaEClass, raaml.fmea.FMEA.class, "FMEA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMEA_FmeaItems(), this.getFMEAItem(), null, "fmeaItems", null, 0, -1, raaml.fmea.FMEA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rpnCalculationEClass, RPNCalculation.class, "RPNCalculation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRPNCalculation_RPN(), ecorePackage.getEDouble(), "RPN", null, 0, 1, RPNCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRPNCalculation_SEV(), ecorePackage.getEDouble(), "SEV", null, 0, 1, RPNCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRPNCalculation_OCC(), ecorePackage.getEDouble(), "OCC", null, 0, 1, RPNCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRPNCalculation_DET(), ecorePackage.getEDouble(), "DET", null, 0, 1, RPNCalculation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractFMEAItemEClass, AbstractFMEAItem.class, "AbstractFMEAItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFMEAItem_RPN(), ecorePackage.getEDouble(), "RPN", null, 0, 1, AbstractFMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFMEAItem_FailureMode(), theCorePackage.getAbstractFailureMode(), null, "failureMode", null, 1, -1, AbstractFMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFMEAItem_FinalEffect(), theCorePackage.getAbstractFailureMode(), null, "finalEffect", null, 1, -1, AbstractFMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractFMEAItem_Cause(), theCorePackage.getAbstractFailureMode(), null, "cause", null, 1, -1, AbstractFMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmeaItemEClass, FMEAItem.class, "FMEAItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMEAItem_RpnCalculation(), this.getRPNCalculation(), null, "rpnCalculation", null, 0, -1, FMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lossOfFunctionEClass, LossOfFunction.class, "LossOfFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(degradationOfFunctionEClass, DegradationOfFunction.class, "DegradationOfFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intermittentFunctionEClass, IntermittentFunction.class, "IntermittentFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(partialFunctionEClass, PartialFunction.class, "PartialFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exceedingFunctionEClass, ExceedingFunction.class, "ExceedingFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unintendedFunctionEClass, UnintendedFunction.class, "UnintendedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(delayedFunctionEClass, DelayedFunction.class, "DelayedFunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fmeaLibraryEClass, FMEALibrary.class, "FMEALibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFMEALibrary_AbstractFMEAItems(), this.getAbstractFMEAItem(), null, "abstractFMEAItems", null, 0, -1, FMEALibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (fmeaEClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "FMEA"
		   });
		addAnnotation
		  (rpnCalculationEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "RPNCalculation"
		   });
		addAnnotation
		  (abstractFMEAItemEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (fmeaItemEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "FMEAItem"
		   });
		addAnnotation
		  (lossOfFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "LossOfFunction"
		   });
		addAnnotation
		  (degradationOfFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "DegradationOfFunction"
		   });
		addAnnotation
		  (intermittentFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "IntermittentFunction"
		   });
		addAnnotation
		  (partialFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "PartialFunction"
		   });
		addAnnotation
		  (exceedingFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ExceedingFunction"
		   });
		addAnnotation
		  (unintendedFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "UnintendedFunction"
		   });
		addAnnotation
		  (delayedFunctionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "DelayedFunction"
		   });
		addAnnotation
		  (fmeaLibraryEClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "FMEALibrary"
		   });
	}

} //FmeaPackageImpl
