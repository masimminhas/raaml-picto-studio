/**
 */
package raaml.hazop.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import raaml.core.Analysis;
import raaml.core.CoreSafetyElement;
import raaml.core.NamedElement;

import raaml.hazop.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see raaml.hazop.HazopPackage
 * @generated
 */
public class HazopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HazopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HazopPackage.eINSTANCE;
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
	protected HazopSwitch<Adapter> modelSwitch =
		new HazopSwitch<Adapter>() {
			@Override
			public Adapter caseHAZOPStudy(HAZOPStudy object) {
				return createHAZOPStudyAdapter();
			}
			@Override
			public Adapter caseHAZOPNode(HAZOPNode object) {
				return createHAZOPNodeAdapter();
			}
			@Override
			public Adapter caseDeviation(Deviation object) {
				return createDeviationAdapter();
			}
			@Override
			public Adapter caseCause(Cause object) {
				return createCauseAdapter();
			}
			@Override
			public Adapter caseConsequence(Consequence object) {
				return createConsequenceAdapter();
			}
			@Override
			public Adapter caseSafeguard(Safeguard object) {
				return createSafeguardAdapter();
			}
			@Override
			public Adapter caseRecommendation(Recommendation object) {
				return createRecommendationAdapter();
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
	 * Creates a new adapter for an object of class '{@link raaml.hazop.HAZOPStudy <em>HAZOP Study</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.HAZOPStudy
	 * @generated
	 */
	public Adapter createHAZOPStudyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hazop.HAZOPNode <em>HAZOP Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.HAZOPNode
	 * @generated
	 */
	public Adapter createHAZOPNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hazop.Deviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.Deviation
	 * @generated
	 */
	public Adapter createDeviationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hazop.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.Cause
	 * @generated
	 */
	public Adapter createCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hazop.Consequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.Consequence
	 * @generated
	 */
	public Adapter createConsequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hazop.Safeguard <em>Safeguard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.Safeguard
	 * @generated
	 */
	public Adapter createSafeguardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.hazop.Recommendation <em>Recommendation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.hazop.Recommendation
	 * @generated
	 */
	public Adapter createRecommendationAdapter() {
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

} //HazopAdapterFactory
