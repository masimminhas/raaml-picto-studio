/**
 */
package raaml.core.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import raaml.RaamlPackage;

import raaml.core.AbstractCause;
import raaml.core.AbstractEffect;
import raaml.core.AbstractEvent;
import raaml.core.AbstractFailureMode;
import raaml.core.AbstractLibrary;
import raaml.core.AbstractRisk;
import raaml.core.Analysis;
import raaml.core.AnySituation;
import raaml.core.ControllingMeasure;
import raaml.core.CoreFactory;
import raaml.core.CorePackage;
import raaml.core.CoreSafetyElement;
import raaml.core.Detection;
import raaml.core.DirectedRelationship;
import raaml.core.DysfunctionalEvent;
import raaml.core.ElementGroup;
import raaml.core.ElementGroupBasedItem;
import raaml.core.Factor;
import raaml.core.FailureMode;
import raaml.core.FailureState;
import raaml.core.Fault;
import raaml.core.HarmPotential;
import raaml.core.Hazard;
import raaml.core.Item;
import raaml.core.Mitigation;
import raaml.core.NamedElement;
import raaml.core.PresentIn;
import raaml.core.Prevention;
import raaml.core.ProcessModelFlaw;
import raaml.core.Recommendation;
import raaml.core.RelevantTo;
import raaml.core.Scenario;
import raaml.core.SingleElementItem;
import raaml.core.Situation;
import raaml.core.State;
import raaml.core.UndesiredState;
import raaml.core.Violates;

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
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreSafetyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass situationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllingMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detectionEClass = null;

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
	private EClass mitigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preventionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relevantToEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass presentInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass violatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleElementItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupBasedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anySituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processModelFlawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass harmPotentialEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dysfunctionalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass undesiredStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFailureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scenarioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRiskEClass = null;

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
	 * @see raaml.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RaamlPackage.eNS_URI);
		RaamlPackageImpl theRaamlPackage = (RaamlPackageImpl)(registeredPackage instanceof RaamlPackageImpl ? registeredPackage : RaamlPackage.eINSTANCE);
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
		theCorePackage.createPackageContents();
		theRaamlPackage.createPackageContents();
		theReqPackage.createPackageContents();
		theLibraryPackage.createPackageContents();
		theFtaPackage.createPackageContents();
		theFmeaPackage.createPackageContents();
		theHaraPackage.createPackageContents();
		theStpaPackage.createPackageContents();
		theGsnPackage.createPackageContents();

		// Initialize created meta-data
		theCorePackage.initializePackageContents();
		theRaamlPackage.initializePackageContents();
		theReqPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();
		theFtaPackage.initializePackageContents();
		theFmeaPackage.initializePackageContents();
		theHaraPackage.initializePackageContents();
		theStpaPackage.initializePackageContents();
		theGsnPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Id() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Description() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Visibility() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnalysis_Elements() {
		return (EReference)analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractLibrary() {
		return abstractLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractLibrary_Elements() {
		return (EReference)abstractLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoreSafetyElement() {
		return coreSafetyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSituation() {
		return situationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFailureMode() {
		return failureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazard() {
		return hazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getError() {
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFault() {
		return faultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControllingMeasure() {
		return controllingMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getControllingMeasure_Affects() {
		return (EAttribute)controllingMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDetection() {
		return detectionEClass;
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
	public EClass getMitigation() {
		return mitigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrevention() {
		return preventionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFailureState() {
		return failureStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelevantTo() {
		return relevantToEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPresentIn() {
		return presentInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getViolates() {
		return violatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Members() {
		return (EReference)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_BoundaryMembers() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleElementItem() {
		return singleElementItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleElementItem_ReferencedElement() {
		return (EReference)singleElementItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementGroup() {
		return elementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElementGroup_GroupCriterion() {
		return (EAttribute)elementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElementGroup_OrderedMembers() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElementGroupBasedItem() {
		return elementGroupBasedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnySituation() {
		return anySituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnySituation_From() {
		return (EReference)anySituationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnySituation_To() {
		return (EReference)anySituationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFactor() {
		return factorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFactor_ProcessModelFlaw() {
		return (EReference)factorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessModelFlaw() {
		return processModelFlawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModelFlaw_CausalFactor() {
		return (EReference)processModelFlawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessModelFlaw_UndesiredControlAction() {
		return (EReference)processModelFlawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHarmPotential() {
		return harmPotentialEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHarmPotential_UndesiredControlAction() {
		return (EReference)harmPotentialEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractEvent() {
		return abstractEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractEvent_Likelihood() {
		return (EAttribute)abstractEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDysfunctionalEvent() {
		return dysfunctionalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDysfunctionalEvent_ToError() {
		return (EReference)dysfunctionalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDysfunctionalEvent_FromError() {
		return (EReference)dysfunctionalEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDysfunctionalEvent_Error() {
		return (EReference)dysfunctionalEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDysfunctionalEvent_Failure() {
		return (EReference)dysfunctionalEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDysfunctionalEvent_Fault() {
		return (EReference)dysfunctionalEventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractEffect() {
		return abstractEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractEffect_Severity() {
		return (EAttribute)abstractEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUndesiredState() {
		return undesiredStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractFailureMode() {
		return abstractFailureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractFailureMode_Detectability() {
		return (EAttribute)abstractFailureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractCause() {
		return abstractCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractCause_Occurrence() {
		return (EAttribute)abstractCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractCause_Error() {
		return (EReference)abstractCauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScenario() {
		return scenarioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_ScenarioSteps() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getScenario_Triggers() {
		return (EReference)scenarioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractRisk() {
		return abstractRiskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractRisk_RiskScore() {
		return (EAttribute)abstractRiskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRisk_HarmPotentials() {
		return (EReference)abstractRiskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractRisk_Harms() {
		return (EReference)abstractRiskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
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
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__ID);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__DESCRIPTION);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);

		analysisEClass = createEClass(ANALYSIS);
		createEReference(analysisEClass, ANALYSIS__ELEMENTS);

		abstractLibraryEClass = createEClass(ABSTRACT_LIBRARY);
		createEReference(abstractLibraryEClass, ABSTRACT_LIBRARY__ELEMENTS);

		coreSafetyElementEClass = createEClass(CORE_SAFETY_ELEMENT);

		situationEClass = createEClass(SITUATION);

		failureModeEClass = createEClass(FAILURE_MODE);

		hazardEClass = createEClass(HAZARD);

		errorEClass = createEClass(ERROR);

		faultEClass = createEClass(FAULT);

		controllingMeasureEClass = createEClass(CONTROLLING_MEASURE);
		createEAttribute(controllingMeasureEClass, CONTROLLING_MEASURE__AFFECTS);

		detectionEClass = createEClass(DETECTION);

		recommendationEClass = createEClass(RECOMMENDATION);

		mitigationEClass = createEClass(MITIGATION);

		preventionEClass = createEClass(PREVENTION);

		stateEClass = createEClass(STATE);

		failureStateEClass = createEClass(FAILURE_STATE);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relevantToEClass = createEClass(RELEVANT_TO);

		presentInEClass = createEClass(PRESENT_IN);

		violatesEClass = createEClass(VIOLATES);

		itemEClass = createEClass(ITEM);
		createEReference(itemEClass, ITEM__MEMBERS);
		createEReference(itemEClass, ITEM__BOUNDARY_MEMBERS);

		singleElementItemEClass = createEClass(SINGLE_ELEMENT_ITEM);
		createEReference(singleElementItemEClass, SINGLE_ELEMENT_ITEM__REFERENCED_ELEMENT);

		elementGroupEClass = createEClass(ELEMENT_GROUP);
		createEAttribute(elementGroupEClass, ELEMENT_GROUP__GROUP_CRITERION);
		createEReference(elementGroupEClass, ELEMENT_GROUP__ORDERED_MEMBERS);

		elementGroupBasedItemEClass = createEClass(ELEMENT_GROUP_BASED_ITEM);

		anySituationEClass = createEClass(ANY_SITUATION);
		createEReference(anySituationEClass, ANY_SITUATION__FROM);
		createEReference(anySituationEClass, ANY_SITUATION__TO);

		factorEClass = createEClass(FACTOR);
		createEReference(factorEClass, FACTOR__PROCESS_MODEL_FLAW);

		processModelFlawEClass = createEClass(PROCESS_MODEL_FLAW);
		createEReference(processModelFlawEClass, PROCESS_MODEL_FLAW__CAUSAL_FACTOR);
		createEReference(processModelFlawEClass, PROCESS_MODEL_FLAW__UNDESIRED_CONTROL_ACTION);

		harmPotentialEClass = createEClass(HARM_POTENTIAL);
		createEReference(harmPotentialEClass, HARM_POTENTIAL__UNDESIRED_CONTROL_ACTION);

		abstractEventEClass = createEClass(ABSTRACT_EVENT);
		createEAttribute(abstractEventEClass, ABSTRACT_EVENT__LIKELIHOOD);

		dysfunctionalEventEClass = createEClass(DYSFUNCTIONAL_EVENT);
		createEReference(dysfunctionalEventEClass, DYSFUNCTIONAL_EVENT__TO_ERROR);
		createEReference(dysfunctionalEventEClass, DYSFUNCTIONAL_EVENT__FROM_ERROR);
		createEReference(dysfunctionalEventEClass, DYSFUNCTIONAL_EVENT__ERROR);
		createEReference(dysfunctionalEventEClass, DYSFUNCTIONAL_EVENT__FAILURE);
		createEReference(dysfunctionalEventEClass, DYSFUNCTIONAL_EVENT__FAULT);

		abstractEffectEClass = createEClass(ABSTRACT_EFFECT);
		createEAttribute(abstractEffectEClass, ABSTRACT_EFFECT__SEVERITY);

		undesiredStateEClass = createEClass(UNDESIRED_STATE);

		abstractFailureModeEClass = createEClass(ABSTRACT_FAILURE_MODE);
		createEAttribute(abstractFailureModeEClass, ABSTRACT_FAILURE_MODE__DETECTABILITY);

		abstractCauseEClass = createEClass(ABSTRACT_CAUSE);
		createEAttribute(abstractCauseEClass, ABSTRACT_CAUSE__OCCURRENCE);
		createEReference(abstractCauseEClass, ABSTRACT_CAUSE__ERROR);

		scenarioEClass = createEClass(SCENARIO);
		createEReference(scenarioEClass, SCENARIO__SCENARIO_STEPS);
		createEReference(scenarioEClass, SCENARIO__TRIGGERS);

		abstractRiskEClass = createEClass(ABSTRACT_RISK);
		createEAttribute(abstractRiskEClass, ABSTRACT_RISK__RISK_SCORE);
		createEReference(abstractRiskEClass, ABSTRACT_RISK__HARM_POTENTIALS);
		createEReference(abstractRiskEClass, ABSTRACT_RISK__HARMS);
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
		StpaPackage theStpaPackage = (StpaPackage)EPackage.Registry.INSTANCE.getEPackage(StpaPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		analysisEClass.getESuperTypes().add(this.getNamedElement());
		abstractLibraryEClass.getESuperTypes().add(this.getNamedElement());
		coreSafetyElementEClass.getESuperTypes().add(this.getNamedElement());
		situationEClass.getESuperTypes().add(this.getCoreSafetyElement());
		failureModeEClass.getESuperTypes().add(this.getSituation());
		hazardEClass.getESuperTypes().add(this.getSituation());
		errorEClass.getESuperTypes().add(this.getSituation());
		faultEClass.getESuperTypes().add(this.getSituation());
		controllingMeasureEClass.getESuperTypes().add(this.getCoreSafetyElement());
		detectionEClass.getESuperTypes().add(this.getControllingMeasure());
		recommendationEClass.getESuperTypes().add(this.getControllingMeasure());
		mitigationEClass.getESuperTypes().add(this.getControllingMeasure());
		preventionEClass.getESuperTypes().add(this.getControllingMeasure());
		stateEClass.getESuperTypes().add(this.getCoreSafetyElement());
		failureStateEClass.getESuperTypes().add(this.getState());
		directedRelationshipEClass.getESuperTypes().add(this.getCoreSafetyElement());
		relevantToEClass.getESuperTypes().add(this.getDirectedRelationship());
		presentInEClass.getESuperTypes().add(this.getRelevantTo());
		violatesEClass.getESuperTypes().add(this.getDirectedRelationship());
		itemEClass.getESuperTypes().add(this.getCoreSafetyElement());
		singleElementItemEClass.getESuperTypes().add(this.getItem());
		elementGroupEClass.getESuperTypes().add(this.getCoreSafetyElement());
		elementGroupBasedItemEClass.getESuperTypes().add(this.getItem());
		elementGroupBasedItemEClass.getESuperTypes().add(this.getElementGroup());
		anySituationEClass.getESuperTypes().add(this.getSituation());
		factorEClass.getESuperTypes().add(this.getAnySituation());
		processModelFlawEClass.getESuperTypes().add(this.getAnySituation());
		harmPotentialEClass.getESuperTypes().add(this.getCoreSafetyElement());
		abstractEventEClass.getESuperTypes().add(this.getAnySituation());
		dysfunctionalEventEClass.getESuperTypes().add(this.getAbstractEvent());
		abstractEffectEClass.getESuperTypes().add(this.getDysfunctionalEvent());
		undesiredStateEClass.getESuperTypes().add(this.getDysfunctionalEvent());
		abstractFailureModeEClass.getESuperTypes().add(this.getUndesiredState());
		abstractCauseEClass.getESuperTypes().add(this.getAbstractEvent());
		abstractCauseEClass.getESuperTypes().add(this.getFactor());
		scenarioEClass.getESuperTypes().add(this.getAnySituation());
		abstractRiskEClass.getESuperTypes().add(this.getScenario());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Visibility(), ecorePackage.getEString(), "visibility", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(analysisEClass, Analysis.class, "Analysis", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysis_Elements(), this.getCoreSafetyElement(), null, "elements", null, 0, -1, Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractLibraryEClass, AbstractLibrary.class, "AbstractLibrary", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractLibrary_Elements(), this.getCoreSafetyElement(), null, "elements", null, 0, -1, AbstractLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coreSafetyElementEClass, CoreSafetyElement.class, "CoreSafetyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(situationEClass, Situation.class, "Situation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureModeEClass, FailureMode.class, "FailureMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hazardEClass, Hazard.class, "Hazard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorEClass, raaml.core.Error.class, "Error", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(faultEClass, Fault.class, "Fault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllingMeasureEClass, ControllingMeasure.class, "ControllingMeasure", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControllingMeasure_Affects(), ecorePackage.getEString(), "affects", null, 0, 1, ControllingMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detectionEClass, Detection.class, "Detection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recommendationEClass, Recommendation.class, "Recommendation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mitigationEClass, Mitigation.class, "Mitigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preventionEClass, Prevention.class, "Prevention", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(failureStateEClass, FailureState.class, "FailureState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Source(), this.getCoreSafetyElement(), null, "source", null, 0, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectedRelationship_Target(), this.getCoreSafetyElement(), null, "target", null, 0, -1, DirectedRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relevantToEClass, RelevantTo.class, "RelevantTo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(presentInEClass, PresentIn.class, "PresentIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(violatesEClass, Violates.class, "Violates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itemEClass, Item.class, "Item", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItem_Members(), this.getCoreSafetyElement(), null, "members", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_BoundaryMembers(), this.getCoreSafetyElement(), null, "boundaryMembers", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleElementItemEClass, SingleElementItem.class, "SingleElementItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleElementItem_ReferencedElement(), this.getItem(), null, "referencedElement", null, 1, 1, SingleElementItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementGroupEClass, ElementGroup.class, "ElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementGroup_GroupCriterion(), ecorePackage.getEString(), "groupCriterion", null, 0, 1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroup_OrderedMembers(), this.getCoreSafetyElement(), null, "orderedMembers", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementGroupBasedItemEClass, ElementGroupBasedItem.class, "ElementGroupBasedItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(anySituationEClass, AnySituation.class, "AnySituation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnySituation_From(), this.getAnySituation(), this.getAnySituation_To(), "from", null, 0, -1, AnySituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnySituation_To(), this.getAnySituation(), this.getAnySituation_From(), "to", null, 0, -1, AnySituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factorEClass, Factor.class, "Factor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactor_ProcessModelFlaw(), this.getProcessModelFlaw(), null, "processModelFlaw", null, 0, -1, Factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processModelFlawEClass, ProcessModelFlaw.class, "ProcessModelFlaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessModelFlaw_CausalFactor(), this.getFactor(), null, "causalFactor", null, 0, -1, ProcessModelFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessModelFlaw_UndesiredControlAction(), theStpaPackage.getUndesiredControlAction(), null, "undesiredControlAction", null, 0, -1, ProcessModelFlaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(harmPotentialEClass, HarmPotential.class, "HarmPotential", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHarmPotential_UndesiredControlAction(), theStpaPackage.getUndesiredControlAction(), null, "undesiredControlAction", null, 0, -1, HarmPotential.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEventEClass, AbstractEvent.class, "AbstractEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEvent_Likelihood(), ecorePackage.getEDouble(), "likelihood", null, 0, 1, AbstractEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dysfunctionalEventEClass, DysfunctionalEvent.class, "DysfunctionalEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDysfunctionalEvent_ToError(), this.getDysfunctionalEvent(), this.getDysfunctionalEvent_FromError(), "toError", null, 0, -1, DysfunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDysfunctionalEvent_FromError(), this.getDysfunctionalEvent(), this.getDysfunctionalEvent_ToError(), "fromError", null, 0, -1, DysfunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDysfunctionalEvent_Error(), this.getDysfunctionalEvent(), this.getDysfunctionalEvent_Failure(), "error", null, 0, -1, DysfunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDysfunctionalEvent_Failure(), this.getDysfunctionalEvent(), this.getDysfunctionalEvent_Error(), "failure", null, 0, -1, DysfunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDysfunctionalEvent_Fault(), this.getAbstractCause(), this.getAbstractCause_Error(), "fault", null, 0, -1, DysfunctionalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractEffectEClass, AbstractEffect.class, "AbstractEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractEffect_Severity(), ecorePackage.getEDouble(), "severity", null, 0, 1, AbstractEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(undesiredStateEClass, UndesiredState.class, "UndesiredState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractFailureModeEClass, AbstractFailureMode.class, "AbstractFailureMode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractFailureMode_Detectability(), ecorePackage.getEDouble(), "detectability", null, 0, 1, AbstractFailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractCauseEClass, AbstractCause.class, "AbstractCause", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractCause_Occurrence(), ecorePackage.getEDouble(), "occurrence", null, 0, 1, AbstractCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractCause_Error(), this.getDysfunctionalEvent(), this.getDysfunctionalEvent_Fault(), "error", null, 0, -1, AbstractCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scenarioEClass, Scenario.class, "Scenario", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScenario_ScenarioSteps(), this.getAnySituation(), null, "scenarioSteps", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScenario_Triggers(), this.getAbstractEvent(), null, "triggers", null, 0, -1, Scenario.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractRiskEClass, AbstractRisk.class, "AbstractRisk", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractRisk_RiskScore(), ecorePackage.getEDouble(), "riskScore", null, 0, 1, AbstractRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRisk_HarmPotentials(), this.getHarmPotential(), null, "harmPotentials", null, 0, -1, AbstractRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRisk_Harms(), this.getAbstractEffect(), null, "harms", null, 0, -1, AbstractRisk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (namedElementEClass,
		   source,
		   new String[] {
			   "base", "NamedElement"
		   });
		addAnnotation
		  (analysisEClass,
		   source,
		   new String[] {
			   "base", "Package"
		   });
		addAnnotation
		  (abstractLibraryEClass,
		   source,
		   new String[] {
			   "base", "Package"
		   });
		addAnnotation
		  (coreSafetyElementEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (situationEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Situation"
		   });
		addAnnotation
		  (failureModeEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "FailureMode"
		   });
		addAnnotation
		  (hazardEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Hazard"
		   });
		addAnnotation
		  (errorEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Error"
		   });
		addAnnotation
		  (faultEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Fault"
		   });
		addAnnotation
		  (controllingMeasureEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (detectionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Detection"
		   });
		addAnnotation
		  (recommendationEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Recommendation"
		   });
		addAnnotation
		  (mitigationEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Mitigation"
		   });
		addAnnotation
		  (preventionEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Prevention"
		   });
		addAnnotation
		  (stateEClass,
		   source,
		   new String[] {
			   "base", "State"
		   });
		addAnnotation
		  (failureStateEClass,
		   source,
		   new String[] {
			   "base", "State",
			   "stereotype", "FailureState"
		   });
		addAnnotation
		  (directedRelationshipEClass,
		   source,
		   new String[] {
			   "base", "Dependency"
		   });
		addAnnotation
		  (relevantToEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "RelevantTo"
		   });
		addAnnotation
		  (presentInEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "PresentIn"
		   });
		addAnnotation
		  (violatesEClass,
		   source,
		   new String[] {
			   "base", "Dependency",
			   "stereotype", "Violates"
		   });
		addAnnotation
		  (itemEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Item"
		   });
		addAnnotation
		  (singleElementItemEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "SingleElementItem"
		   });
		addAnnotation
		  (elementGroupEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ElementGroup"
		   });
		addAnnotation
		  (elementGroupBasedItemEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ElementGroupBasedItem"
		   });
		addAnnotation
		  (anySituationEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (factorEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Factor"
		   });
		addAnnotation
		  (processModelFlawEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "ProcessModelFlaw"
		   });
		addAnnotation
		  (harmPotentialEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "HarmPotential"
		   });
		addAnnotation
		  (abstractEventEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (dysfunctionalEventEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (abstractEffectEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (undesiredStateEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (abstractFailureModeEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (abstractCauseEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
		addAnnotation
		  (scenarioEClass,
		   source,
		   new String[] {
			   "base", "Class",
			   "stereotype", "Scenario"
		   });
		addAnnotation
		  (abstractRiskEClass,
		   source,
		   new String[] {
			   "base", "Class"
		   });
	}

} //CorePackageImpl
