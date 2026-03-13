/**
 */
package raaml.fmea.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import raaml.core.AbstractEvent;
import raaml.core.AbstractFailureMode;
import raaml.core.AbstractLibrary;
import raaml.core.Analysis;
import raaml.core.AnySituation;
import raaml.core.CoreSafetyElement;
import raaml.core.DysfunctionalEvent;
import raaml.core.NamedElement;
import raaml.core.Situation;
import raaml.core.UndesiredState;

import raaml.fmea.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see raaml.fmea.FmeaPackage
 * @generated
 */
public class FmeaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FmeaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmeaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FmeaPackage.eINSTANCE;
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
	protected FmeaSwitch<Adapter> modelSwitch =
		new FmeaSwitch<Adapter>() {
			@Override
			public Adapter caseFMEA(FMEA object) {
				return createFMEAAdapter();
			}
			@Override
			public Adapter caseRPNCalculation(RPNCalculation object) {
				return createRPNCalculationAdapter();
			}
			@Override
			public Adapter caseAbstractFMEAItem(AbstractFMEAItem object) {
				return createAbstractFMEAItemAdapter();
			}
			@Override
			public Adapter caseFMEAItem(FMEAItem object) {
				return createFMEAItemAdapter();
			}
			@Override
			public Adapter caseLossOfFunction(LossOfFunction object) {
				return createLossOfFunctionAdapter();
			}
			@Override
			public Adapter caseDegradationOfFunction(DegradationOfFunction object) {
				return createDegradationOfFunctionAdapter();
			}
			@Override
			public Adapter caseIntermittentFunction(IntermittentFunction object) {
				return createIntermittentFunctionAdapter();
			}
			@Override
			public Adapter casePartialFunction(PartialFunction object) {
				return createPartialFunctionAdapter();
			}
			@Override
			public Adapter caseExceedingFunction(ExceedingFunction object) {
				return createExceedingFunctionAdapter();
			}
			@Override
			public Adapter caseUnintendedFunction(UnintendedFunction object) {
				return createUnintendedFunctionAdapter();
			}
			@Override
			public Adapter caseDelayedFunction(DelayedFunction object) {
				return createDelayedFunctionAdapter();
			}
			@Override
			public Adapter caseFMEALibrary(FMEALibrary object) {
				return createFMEALibraryAdapter();
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
			public Adapter caseAbstractFailureMode(AbstractFailureMode object) {
				return createAbstractFailureModeAdapter();
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
	 * Creates a new adapter for an object of class '{@link raaml.fmea.FMEA <em>FMEA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.FMEA
	 * @generated
	 */
	public Adapter createFMEAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.RPNCalculation <em>RPN Calculation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.RPNCalculation
	 * @generated
	 */
	public Adapter createRPNCalculationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.AbstractFMEAItem <em>Abstract FMEA Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.AbstractFMEAItem
	 * @generated
	 */
	public Adapter createAbstractFMEAItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.FMEAItem <em>FMEA Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.FMEAItem
	 * @generated
	 */
	public Adapter createFMEAItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.LossOfFunction <em>Loss Of Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.LossOfFunction
	 * @generated
	 */
	public Adapter createLossOfFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.DegradationOfFunction <em>Degradation Of Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.DegradationOfFunction
	 * @generated
	 */
	public Adapter createDegradationOfFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.IntermittentFunction <em>Intermittent Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.IntermittentFunction
	 * @generated
	 */
	public Adapter createIntermittentFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.PartialFunction <em>Partial Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.PartialFunction
	 * @generated
	 */
	public Adapter createPartialFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.ExceedingFunction <em>Exceeding Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.ExceedingFunction
	 * @generated
	 */
	public Adapter createExceedingFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.UnintendedFunction <em>Unintended Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.UnintendedFunction
	 * @generated
	 */
	public Adapter createUnintendedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.DelayedFunction <em>Delayed Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.DelayedFunction
	 * @generated
	 */
	public Adapter createDelayedFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fmea.FMEALibrary <em>FMEA Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fmea.FMEALibrary
	 * @generated
	 */
	public Adapter createFMEALibraryAdapter() {
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

} //FmeaAdapterFactory
