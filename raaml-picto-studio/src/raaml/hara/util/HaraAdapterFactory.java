/**
 */
package raaml.hara.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import raaml.core.AbstractEffect;
import raaml.core.AbstractEvent;
import raaml.core.AbstractLibrary;
import raaml.core.AbstractRisk;
import raaml.core.Analysis;
import raaml.core.AnySituation;
import raaml.core.CoreSafetyElement;
import raaml.core.DysfunctionalEvent;
import raaml.core.FailureMode;
import raaml.core.NamedElement;
import raaml.core.Scenario;
import raaml.core.Situation;
import raaml.core.UndesiredState;

import raaml.hara.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see raaml.hara.HaraPackage
 * @generated
 */
public class HaraAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HaraPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HaraAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HaraPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HaraSwitch<Adapter> modelSwitch =
		new HaraSwitch<Adapter>() {
			@Override
			public Adapter caseISO26262(ISO26262 object) {
				return createISO26262Adapter();
			}
			@Override
			public Adapter caseOperationalSituation(OperationalSituation object) {
				return createOperationalSituationAdapter();
			}
			@Override
			public Adapter caseMalfunctioningBehaviour(MalfunctioningBehaviour object) {
				return createMalfunctioningBehaviourAdapter();
			}
			@Override
			public Adapter caseVerified(Verified object) {
				return createVerifiedAdapter();
			}
			@Override
			public Adapter caseConfirmed(Confirmed object) {
				return createConfirmedAdapter();
			}
			@Override
			public Adapter caseASILAssignment(ASILAssignment object) {
				return createASILAssignmentAdapter();
			}
			@Override
			public Adapter caseOperationalCondition(OperationalCondition object) {
				return createOperationalConditionAdapter();
			}
			@Override
			public Adapter caseAbstractOperationalSituation(AbstractOperationalSituation object) {
				return createAbstractOperationalSituationAdapter();
			}
			@Override
			public Adapter caseAccidentScenario(AccidentScenario object) {
				return createAccidentScenarioAdapter();
			}
			@Override
			public Adapter caseAnyMalfunction(AnyMalfunction object) {
				return createAnyMalfunctionAdapter();
			}
			@Override
			public Adapter caseHazardousEvent(HazardousEvent object) {
				return createHazardousEventAdapter();
			}
			@Override
			public Adapter caseAutomotiveEffect(AutomotiveEffect object) {
				return createAutomotiveEffectAdapter();
			}
			@Override
			public Adapter caseSystemLevelEffect(SystemLevelEffect object) {
				return createSystemLevelEffectAdapter();
			}
			@Override
			public Adapter caseVehicleLevelEffect(VehicleLevelEffect object) {
				return createVehicleLevelEffectAdapter();
			}
			@Override
			public Adapter caseISO26262Library(ISO26262Library object) {
				return createISO26262LibraryAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAnalysis(Analysis object) {
				return createAnalysisAdapter();
			}
			@Override
			public Adapter caseCoreSafetyElement(CoreSafetyElement object) {
				return createCoreSafetyElementAdapter();
			}
			@Override
			public Adapter caseSituation(Situation object) {
				return createSituationAdapter();
			}
			@Override
			public Adapter caseFailureMode(FailureMode object) {
				return createFailureModeAdapter();
			}
			@Override
			public Adapter caseAnySituation(AnySituation object) {
				return createAnySituationAdapter();
			}
			@Override
			public Adapter caseAbstractEvent(AbstractEvent object) {
				return createAbstractEventAdapter();
			}
			@Override
			public Adapter caseDysfunctionalEvent(DysfunctionalEvent object) {
				return createDysfunctionalEventAdapter();
			}
			@Override
			public Adapter caseUndesiredState(UndesiredState object) {
				return createUndesiredStateAdapter();
			}
			@Override
			public Adapter caseScenario(Scenario object) {
				return createScenarioAdapter();
			}
			@Override
			public Adapter caseAbstractRisk(AbstractRisk object) {
				return createAbstractRiskAdapter();
			}
			@Override
			public Adapter caseAbstractEffect(AbstractEffect object) {
				return createAbstractEffectAdapter();
			}
			@Override
			public Adapter caseAbstractLibrary(AbstractLibrary object) {
				return createAbstractLibraryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.ISO26262 <em>ISO26262</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.ISO26262
	 * @generated
	 */
	public Adapter createISO26262Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.OperationalSituation <em>Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.OperationalSituation
	 * @generated
	 */
	public Adapter createOperationalSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.MalfunctioningBehaviour <em>Malfunctioning Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.MalfunctioningBehaviour
	 * @generated
	 */
	public Adapter createMalfunctioningBehaviourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.Verified <em>Verified</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.Verified
	 * @generated
	 */
	public Adapter createVerifiedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.Confirmed <em>Confirmed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.Confirmed
	 * @generated
	 */
	public Adapter createConfirmedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.ASILAssignment <em>ASIL Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.ASILAssignment
	 * @generated
	 */
	public Adapter createASILAssignmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.OperationalCondition <em>Operational Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.OperationalCondition
	 * @generated
	 */
	public Adapter createOperationalConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.AbstractOperationalSituation <em>Abstract Operational Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.AbstractOperationalSituation
	 * @generated
	 */
	public Adapter createAbstractOperationalSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.AccidentScenario <em>Accident Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.AccidentScenario
	 * @generated
	 */
	public Adapter createAccidentScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.AnyMalfunction <em>Any Malfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.AnyMalfunction
	 * @generated
	 */
	public Adapter createAnyMalfunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.HazardousEvent <em>Hazardous Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.HazardousEvent
	 * @generated
	 */
	public Adapter createHazardousEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.AutomotiveEffect <em>Automotive Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.AutomotiveEffect
	 * @generated
	 */
	public Adapter createAutomotiveEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.SystemLevelEffect <em>System Level Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.SystemLevelEffect
	 * @generated
	 */
	public Adapter createSystemLevelEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.VehicleLevelEffect <em>Vehicle Level Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.VehicleLevelEffect
	 * @generated
	 */
	public Adapter createVehicleLevelEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hara.ISO26262Library <em>ISO26262 Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hara.ISO26262Library
	 * @generated
	 */
	public Adapter createISO26262LibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Analysis
	 * @generated
	 */
	public Adapter createAnalysisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.CoreSafetyElement <em>Safety Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.CoreSafetyElement
	 * @generated
	 */
	public Adapter createCoreSafetyElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Situation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Situation
	 * @generated
	 */
	public Adapter createSituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.FailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.FailureMode
	 * @generated
	 */
	public Adapter createFailureModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.AnySituation <em>Any Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AnySituation
	 * @generated
	 */
	public Adapter createAnySituationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.AbstractEvent <em>Abstract Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AbstractEvent
	 * @generated
	 */
	public Adapter createAbstractEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.DysfunctionalEvent <em>Dysfunctional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.DysfunctionalEvent
	 * @generated
	 */
	public Adapter createDysfunctionalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.UndesiredState <em>Undesired State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.UndesiredState
	 * @generated
	 */
	public Adapter createUndesiredStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Scenario
	 * @generated
	 */
	public Adapter createScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.AbstractRisk <em>Abstract Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AbstractRisk
	 * @generated
	 */
	public Adapter createAbstractRiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.AbstractEffect <em>Abstract Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AbstractEffect
	 * @generated
	 */
	public Adapter createAbstractEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.AbstractLibrary <em>Abstract Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AbstractLibrary
	 * @generated
	 */
	public Adapter createAbstractLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HaraAdapterFactory
