/**
 */
package raaml.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import raaml.core.CoreFactory;
import raaml.core.CorePackage;
import raaml.core.Detection;
import raaml.core.ElementGroup;
import raaml.core.ElementGroupBasedItem;
import raaml.core.FailureMode;
import raaml.core.FailureState;
import raaml.core.Fault;
import raaml.core.Hazard;
import raaml.core.Mitigation;
import raaml.core.PresentIn;
import raaml.core.Prevention;
import raaml.core.ProcessModelFlaw;
import raaml.core.Recommendation;
import raaml.core.RelevantTo;
import raaml.core.SingleElementItem;
import raaml.core.Situation;
import raaml.core.Violates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.SITUATION: return createSituation();
			case CorePackage.FAILURE_MODE: return createFailureMode();
			case CorePackage.HAZARD: return createHazard();
			case CorePackage.ERROR: return createError();
			case CorePackage.FAULT: return createFault();
			case CorePackage.DETECTION: return createDetection();
			case CorePackage.RECOMMENDATION: return createRecommendation();
			case CorePackage.MITIGATION: return createMitigation();
			case CorePackage.PREVENTION: return createPrevention();
			case CorePackage.FAILURE_STATE: return createFailureState();
			case CorePackage.RELEVANT_TO: return createRelevantTo();
			case CorePackage.PRESENT_IN: return createPresentIn();
			case CorePackage.VIOLATES: return createViolates();
			case CorePackage.SINGLE_ELEMENT_ITEM: return createSingleElementItem();
			case CorePackage.ELEMENT_GROUP: return createElementGroup();
			case CorePackage.ELEMENT_GROUP_BASED_ITEM: return createElementGroupBasedItem();
			case CorePackage.PROCESS_MODEL_FLAW: return createProcessModelFlaw();
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
	public Situation createSituation() {
		SituationImpl situation = new SituationImpl();
		return situation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailureMode createFailureMode() {
		FailureModeImpl failureMode = new FailureModeImpl();
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hazard createHazard() {
		HazardImpl hazard = new HazardImpl();
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public raaml.core.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fault createFault() {
		FaultImpl fault = new FaultImpl();
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Detection createDetection() {
		DetectionImpl detection = new DetectionImpl();
		return detection;
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
	@Override
	public Mitigation createMitigation() {
		MitigationImpl mitigation = new MitigationImpl();
		return mitigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Prevention createPrevention() {
		PreventionImpl prevention = new PreventionImpl();
		return prevention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FailureState createFailureState() {
		FailureStateImpl failureState = new FailureStateImpl();
		return failureState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelevantTo createRelevantTo() {
		RelevantToImpl relevantTo = new RelevantToImpl();
		return relevantTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PresentIn createPresentIn() {
		PresentInImpl presentIn = new PresentInImpl();
		return presentIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Violates createViolates() {
		ViolatesImpl violates = new ViolatesImpl();
		return violates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleElementItem createSingleElementItem() {
		SingleElementItemImpl singleElementItem = new SingleElementItemImpl();
		return singleElementItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementGroup createElementGroup() {
		ElementGroupImpl elementGroup = new ElementGroupImpl();
		return elementGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementGroupBasedItem createElementGroupBasedItem() {
		ElementGroupBasedItemImpl elementGroupBasedItem = new ElementGroupBasedItemImpl();
		return elementGroupBasedItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProcessModelFlaw createProcessModelFlaw() {
		ProcessModelFlawImpl processModelFlaw = new ProcessModelFlawImpl();
		return processModelFlaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
