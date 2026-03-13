/**
 */
package raaml.gsn.impl;

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

import raaml.gsn.ASILOverrideRationale;
import raaml.gsn.Assumption;
import raaml.gsn.Context;
import raaml.gsn.ContextualInformation;
import raaml.gsn.Dependency;
import raaml.gsn.GSNArgumentNode;
import raaml.gsn.GSNNode;
import raaml.gsn.Goal;
import raaml.gsn.GsnFactory;
import raaml.gsn.GsnPackage;
import raaml.gsn.InContextOf;
import raaml.gsn.Justification;
import raaml.gsn.LessonLearned;
import raaml.gsn.Rationale;
import raaml.gsn.Solution;
import raaml.gsn.Strategy;
import raaml.gsn.SupportedBy;

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
public class GsnPackageImpl extends EPackageImpl implements GsnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsnNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsnArgumentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

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
	private EClass inContextOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supportedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asilOverrideRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lessonLearnedEClass = null;

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
	 * @see raaml.gsn.GsnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GsnPackageImpl() {
		super(eNS_URI, GsnFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GsnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GsnPackage init() {
		if (isInited) return (GsnPackage)EPackage.Registry.INSTANCE.getEPackage(GsnPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGsnPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GsnPackageImpl theGsnPackage = registeredGsnPackage instanceof GsnPackageImpl ? (GsnPackageImpl)registeredGsnPackage : new GsnPackageImpl();

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

		// Create package meta-data objects
		theGsnPackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theReqPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFtaPackage.createPackageContents();
		theFmeaPackage.createPackageContents();
		theHaraPackage.createPackageContents();
		theStpaPackage.createPackageContents();

		// Initialize created meta-data
		theGsnPackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theReqPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFtaPackage.initializePackageContents();
		theFmeaPackage.initializePackageContents();
		theHaraPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGsnPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GsnPackage.eNS_URI, theGsnPackage);
		return theGsnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGSN() {
		return gsnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGSN_ContextualInformation() {
		return (EReference)gsnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGSN_GsnNodes() {
		return (EReference)gsnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGSN_SupportedBy() {
		return (EReference)gsnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGSN_InContextOf() {
		return (EReference)gsnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGSNNode() {
		return gsnNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGSNNode_NodeId() {
		return (EAttribute)gsnNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGSNArgumentNode() {
		return gsnArgumentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextualInformation() {
		return contextualInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextualInformation_ContextId() {
		return (EAttribute)contextualInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssumption() {
		return assumptionEClass;
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
	public EClass getInContextOf() {
		return inContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupportedBy() {
		return supportedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getASILOverrideRationale() {
		return asilOverrideRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLessonLearned() {
		return lessonLearnedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GsnFactory getGsnFactory() {
		return (GsnFactory)getEFactoryInstance();
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
		gsnEClass = createEClass(GSN);
		createEReference(gsnEClass, GSN__CONTEXTUAL_INFORMATION);
		createEReference(gsnEClass, GSN__GSN_NODES);
		createEReference(gsnEClass, GSN__SUPPORTED_BY);
		createEReference(gsnEClass, GSN__IN_CONTEXT_OF);

		gsnNodeEClass = createEClass(GSN_NODE);
		createEAttribute(gsnNodeEClass, GSN_NODE__NODE_ID);

		gsnArgumentNodeEClass = createEClass(GSN_ARGUMENT_NODE);

		goalEClass = createEClass(GOAL);

		strategyEClass = createEClass(STRATEGY);

		solutionEClass = createEClass(SOLUTION);

		contextualInformationEClass = createEClass(CONTEXTUAL_INFORMATION);
		createEAttribute(contextualInformationEClass, CONTEXTUAL_INFORMATION__CONTEXT_ID);

		contextEClass = createEClass(CONTEXT);

		justificationEClass = createEClass(JUSTIFICATION);

		assumptionEClass = createEClass(ASSUMPTION);

		dependencyEClass = createEClass(DEPENDENCY);

		inContextOfEClass = createEClass(IN_CONTEXT_OF);

		supportedByEClass = createEClass(SUPPORTED_BY);

		rationaleEClass = createEClass(RATIONALE);

		asilOverrideRationaleEClass = createEClass(ASIL_OVERRIDE_RATIONALE);

		lessonLearnedEClass = createEClass(LESSON_LEARNED);
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
		gsnEClass.getESuperTypes().add(theCorePackage.getAnalysis());
		gsnNodeEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		gsnArgumentNodeEClass.getESuperTypes().add(this.getGSNNode());
		goalEClass.getESuperTypes().add(this.getGSNArgumentNode());
		strategyEClass.getESuperTypes().add(this.getGSNArgumentNode());
		solutionEClass.getESuperTypes().add(this.getGSNNode());
		contextualInformationEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		contextEClass.getESuperTypes().add(this.getContextualInformation());
		justificationEClass.getESuperTypes().add(this.getContextualInformation());
		assumptionEClass.getESuperTypes().add(this.getContextualInformation());
		dependencyEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		inContextOfEClass.getESuperTypes().add(this.getDependency());
		supportedByEClass.getESuperTypes().add(this.getDependency());
		rationaleEClass.getESuperTypes().add(theCorePackage.getCoreSafetyElement());
		asilOverrideRationaleEClass.getESuperTypes().add(this.getRationale());
		lessonLearnedEClass.getESuperTypes().add(this.getRationale());

		// Initialize classes, features, and operations; add parameters
		initEClass(gsnEClass, raaml.gsn.GSN.class, "GSN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGSN_ContextualInformation(), this.getContextualInformation(), null, "contextualInformation", null, 0, -1, raaml.gsn.GSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSN_GsnNodes(), this.getGSNNode(), null, "gsnNodes", null, 0, -1, raaml.gsn.GSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSN_SupportedBy(), this.getSupportedBy(), null, "supportedBy", null, 0, -1, raaml.gsn.GSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGSN_InContextOf(), this.getInContextOf(), null, "inContextOf", null, 0, -1, raaml.gsn.GSN.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsnNodeEClass, GSNNode.class, "GSNNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGSNNode_NodeId(), ecorePackage.getEString(), "nodeId", null, 0, 1, GSNNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsnArgumentNodeEClass, GSNArgumentNode.class, "GSNArgumentNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextualInformationEClass, ContextualInformation.class, "ContextualInformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextualInformation_ContextId(), ecorePackage.getEString(), "contextId", null, 0, 1, ContextualInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inContextOfEClass, InContextOf.class, "InContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(supportedByEClass, SupportedBy.class, "SupportedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rationaleEClass, Rationale.class, "Rationale", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asilOverrideRationaleEClass, ASILOverrideRationale.class, "ASILOverrideRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lessonLearnedEClass, LessonLearned.class, "LessonLearned", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (gsnEClass,
		   source,
		   new String[] {
			   "base", "Package",
			   "stereotype", "GSN"
		   });
		addAnnotation
		  (gsnNodeEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (gsnArgumentNodeEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (goalEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Goal"
		   });
		addAnnotation
		  (strategyEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Strategy"
		   });
		addAnnotation
		  (solutionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Solution"
		   });
		addAnnotation
		  (contextualInformationEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (contextEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Context"
		   });
		addAnnotation
		  (justificationEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Justification"
		   });
		addAnnotation
		  (assumptionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Assumption"
		   });
		addAnnotation
		  (dependencyEClass,
		   source,
		   new String[] {
			   "base", "Dependency"
		   });
		addAnnotation
		  (inContextOfEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "InContextOf"
		   });
		addAnnotation
		  (supportedByEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "SupportedBy"
		   });
		addAnnotation
		  (rationaleEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Rationale"
		   });
		addAnnotation
		  (asilOverrideRationaleEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ASILOverrideRationale"
		   });
		addAnnotation
		  (lessonLearnedEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "LessonLearned"
		   });
	}

} //GsnPackageImpl
