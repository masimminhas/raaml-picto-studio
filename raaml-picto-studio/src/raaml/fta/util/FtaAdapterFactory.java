/**
 */
package raaml.fta.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import raaml.core.AbstractEvent;
import raaml.core.AbstractLibrary;
import raaml.core.Analysis;
import raaml.core.AnySituation;
import raaml.core.CoreSafetyElement;
import raaml.core.DysfunctionalEvent;
import raaml.core.NamedElement;
import raaml.core.Situation;

import raaml.fta.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see raaml.fta.FtaPackage
 * @generated
 */
public class FtaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FtaPackage.eINSTANCE;
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
	protected FtaSwitch<Adapter> modelSwitch =
		new FtaSwitch<Adapter>() {
			@Override
			public Adapter caseFTA(FTA object) {
				return createFTAAdapter();
			}
			@Override
			public Adapter caseFTAElement(FTAElement object) {
				return createFTAElementAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseBasicEvent(BasicEvent object) {
				return createBasicEventAdapter();
			}
			@Override
			public Adapter caseIntermediateEvent(IntermediateEvent object) {
				return createIntermediateEventAdapter();
			}
			@Override
			public Adapter caseTopEvent(TopEvent object) {
				return createTopEventAdapter();
			}
			@Override
			public Adapter caseConditionalEvent(ConditionalEvent object) {
				return createConditionalEventAdapter();
			}
			@Override
			public Adapter caseDormantEvent(DormantEvent object) {
				return createDormantEventAdapter();
			}
			@Override
			public Adapter caseUndevelopedEvent(UndevelopedEvent object) {
				return createUndevelopedEventAdapter();
			}
			@Override
			public Adapter caseHouseEvent(HouseEvent object) {
				return createHouseEventAdapter();
			}
			@Override
			public Adapter caseZeroEvent(ZeroEvent object) {
				return createZeroEventAdapter();
			}
			@Override
			public Adapter caseGate(Gate object) {
				return createGateAdapter();
			}
			@Override
			public Adapter caseAND(AND object) {
				return createANDAdapter();
			}
			@Override
			public Adapter caseOR(OR object) {
				return createORAdapter();
			}
			@Override
			public Adapter caseNOT(NOT object) {
				return createNOTAdapter();
			}
			@Override
			public Adapter caseXOR(XOR object) {
				return createXORAdapter();
			}
			@Override
			public Adapter caseSEQ(SEQ object) {
				return createSEQAdapter();
			}
			@Override
			public Adapter caseINHIBIT(INHIBIT object) {
				return createINHIBITAdapter();
			}
			@Override
			public Adapter caseMAJORITY_VOTE(MAJORITY_VOTE object) {
				return createMAJORITY_VOTEAdapter();
			}
			@Override
			public Adapter caseFTATree(FTATree object) {
				return createFTATreeAdapter();
			}
			@Override
			public Adapter caseFTALibrary(FTALibrary object) {
				return createFTALibraryAdapter();
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
	 * Creates a new adapter for an object of class '{@link raaml.fta.FTA <em>FTA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.FTA
	 * @generated
	 */
	public Adapter createFTAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.FTAElement <em>FTA Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.FTAElement
	 * @generated
	 */
	public Adapter createFTAElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.BasicEvent <em>Basic Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.BasicEvent
	 * @generated
	 */
	public Adapter createBasicEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.IntermediateEvent
	 * @generated
	 */
	public Adapter createIntermediateEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.TopEvent <em>Top Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.TopEvent
	 * @generated
	 */
	public Adapter createTopEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.ConditionalEvent <em>Conditional Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.ConditionalEvent
	 * @generated
	 */
	public Adapter createConditionalEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.DormantEvent <em>Dormant Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.DormantEvent
	 * @generated
	 */
	public Adapter createDormantEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.UndevelopedEvent <em>Undeveloped Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.UndevelopedEvent
	 * @generated
	 */
	public Adapter createUndevelopedEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.HouseEvent <em>House Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.HouseEvent
	 * @generated
	 */
	public Adapter createHouseEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.ZeroEvent <em>Zero Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.ZeroEvent
	 * @generated
	 */
	public Adapter createZeroEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.Gate
	 * @generated
	 */
	public Adapter createGateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.AND <em>AND</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.AND
	 * @generated
	 */
	public Adapter createANDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.OR <em>OR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.OR
	 * @generated
	 */
	public Adapter createORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.NOT <em>NOT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.NOT
	 * @generated
	 */
	public Adapter createNOTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.XOR <em>XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.XOR
	 * @generated
	 */
	public Adapter createXORAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.SEQ <em>SEQ</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.SEQ
	 * @generated
	 */
	public Adapter createSEQAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.INHIBIT <em>INHIBIT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.INHIBIT
	 * @generated
	 */
	public Adapter createINHIBITAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.MAJORITY_VOTE <em>MAJORITY VOTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.MAJORITY_VOTE
	 * @generated
	 */
	public Adapter createMAJORITY_VOTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.FTATree <em>FTA Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.FTATree
	 * @generated
	 */
	public Adapter createFTATreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.fta.FTALibrary <em>FTA Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.fta.FTALibrary
	 * @generated
	 */
	public Adapter createFTALibraryAdapter() {
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

} //FtaAdapterFactory
