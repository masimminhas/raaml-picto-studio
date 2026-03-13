/**
 */
package raaml.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import raaml.core.AbstractCause;
import raaml.core.AbstractEffect;
import raaml.core.AbstractEvent;
import raaml.core.AbstractFailureMode;
import raaml.core.AbstractLibrary;
import raaml.core.AbstractRisk;
import raaml.core.Analysis;
import raaml.core.AnySituation;
import raaml.core.ControllingMeasure;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see raaml.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseAnalysis(Analysis object) {
				return createAnalysisAdapter();
			}
			@Override
			public Adapter caseAbstractLibrary(AbstractLibrary object) {
				return createAbstractLibraryAdapter();
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
			public Adapter caseHazard(Hazard object) {
				return createHazardAdapter();
			}
			@Override
			public Adapter caseError(raaml.core.Error object) {
				return createErrorAdapter();
			}
			@Override
			public Adapter caseFault(Fault object) {
				return createFaultAdapter();
			}
			@Override
			public Adapter caseControllingMeasure(ControllingMeasure object) {
				return createControllingMeasureAdapter();
			}
			@Override
			public Adapter caseDetection(Detection object) {
				return createDetectionAdapter();
			}
			@Override
			public Adapter caseRecommendation(Recommendation object) {
				return createRecommendationAdapter();
			}
			@Override
			public Adapter caseMitigation(Mitigation object) {
				return createMitigationAdapter();
			}
			@Override
			public Adapter casePrevention(Prevention object) {
				return createPreventionAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseFailureState(FailureState object) {
				return createFailureStateAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object) {
				return createDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseRelevantTo(RelevantTo object) {
				return createRelevantToAdapter();
			}
			@Override
			public Adapter casePresentIn(PresentIn object) {
				return createPresentInAdapter();
			}
			@Override
			public Adapter caseViolates(Violates object) {
				return createViolatesAdapter();
			}
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter caseSingleElementItem(SingleElementItem object) {
				return createSingleElementItemAdapter();
			}
			@Override
			public Adapter caseElementGroup(ElementGroup object) {
				return createElementGroupAdapter();
			}
			@Override
			public Adapter caseElementGroupBasedItem(ElementGroupBasedItem object) {
				return createElementGroupBasedItemAdapter();
			}
			@Override
			public Adapter caseAnySituation(AnySituation object) {
				return createAnySituationAdapter();
			}
			@Override
			public Adapter caseFactor(Factor object) {
				return createFactorAdapter();
			}
			@Override
			public Adapter caseProcessModelFlaw(ProcessModelFlaw object) {
				return createProcessModelFlawAdapter();
			}
			@Override
			public Adapter caseHarmPotential(HarmPotential object) {
				return createHarmPotentialAdapter();
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
			public Adapter caseAbstractEffect(AbstractEffect object) {
				return createAbstractEffectAdapter();
			}
			@Override
			public Adapter caseUndesiredState(UndesiredState object) {
				return createUndesiredStateAdapter();
			}
			@Override
			public Adapter caseAbstractFailureMode(AbstractFailureMode object) {
				return createAbstractFailureModeAdapter();
			}
			@Override
			public Adapter caseAbstractCause(AbstractCause object) {
				return createAbstractCauseAdapter();
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
	 * Creates a new adapter for an object of class '{@link raaml.core.Hazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Hazard
	 * @generated
	 */
	public Adapter createHazardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Error <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Error
	 * @generated
	 */
	public Adapter createErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Fault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Fault
	 * @generated
	 */
	public Adapter createFaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.ControllingMeasure <em>Controlling Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.ControllingMeasure
	 * @generated
	 */
	public Adapter createControllingMeasureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Detection <em>Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Detection
	 * @generated
	 */
	public Adapter createDetectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Recommendation
	 * @generated
	 */
	public Adapter createRecommendationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Mitigation <em>Mitigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Mitigation
	 * @generated
	 */
	public Adapter createMitigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Prevention <em>Prevention</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Prevention
	 * @generated
	 */
	public Adapter createPreventionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.FailureState <em>Failure State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.FailureState
	 * @generated
	 */
	public Adapter createFailureStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.RelevantTo <em>Relevant To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.RelevantTo
	 * @generated
	 */
	public Adapter createRelevantToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.PresentIn <em>Present In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.PresentIn
	 * @generated
	 */
	public Adapter createPresentInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Violates <em>Violates</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Violates
	 * @generated
	 */
	public Adapter createViolatesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.SingleElementItem <em>Single Element Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.SingleElementItem
	 * @generated
	 */
	public Adapter createSingleElementItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.ElementGroup <em>Element Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.ElementGroup
	 * @generated
	 */
	public Adapter createElementGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.ElementGroupBasedItem <em>Element Group Based Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.ElementGroupBasedItem
	 * @generated
	 */
	public Adapter createElementGroupBasedItemAdapter() {
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
	 * Creates a new adapter for an object of class '{@link raaml.core.Factor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.Factor
	 * @generated
	 */
	public Adapter createFactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.ProcessModelFlaw <em>Process Model Flaw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.ProcessModelFlaw
	 * @generated
	 */
	public Adapter createProcessModelFlawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.HarmPotential <em>Harm Potential</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.HarmPotential
	 * @generated
	 */
	public Adapter createHarmPotentialAdapter() {
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
	 * Creates a new adapter for an object of class '{@link raaml.core.AbstractFailureMode <em>Abstract Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AbstractFailureMode
	 * @generated
	 */
	public Adapter createAbstractFailureModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.core.AbstractCause <em>Abstract Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.core.AbstractCause
	 * @generated
	 */
	public Adapter createAbstractCauseAdapter() {
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

} //CoreAdapterFactory
