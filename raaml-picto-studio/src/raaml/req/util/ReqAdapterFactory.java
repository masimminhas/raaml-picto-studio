/**
 */
package raaml.req.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import raaml.core.CoreSafetyElement;
import raaml.core.NamedElement;

import raaml.req.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see raaml.req.ReqPackage
 * @generated
 */
public class ReqAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ReqPackage.eINSTANCE;
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
	protected ReqSwitch<Adapter> modelSwitch =
		new ReqSwitch<Adapter>() {
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseRequirementComponent(RequirementComponent object) {
				return createRequirementComponentAdapter();
			}
			@Override
			public Adapter caseAbstraction(Abstraction object) {
				return createAbstractionAdapter();
			}
			@Override
			public Adapter caseDeriveRequirement(DeriveRequirement object) {
				return createDeriveRequirementAdapter();
			}
			@Override
			public Adapter caseIndependenceRequirement(IndependenceRequirement object) {
				return createIndependenceRequirementAdapter();
			}
			@Override
			public Adapter caseASILDecompose(ASILDecompose object) {
				return createASILDecomposeAdapter();
			}
			@Override
			public Adapter caseSatisfy(Satisfy object) {
				return createSatisfyAdapter();
			}
			@Override
			public Adapter caseUserInfoRequirement(UserInfoRequirement object) {
				return createUserInfoRequirementAdapter();
			}
			@Override
			public Adapter caseRecoveryRequirement(RecoveryRequirement object) {
				return createRecoveryRequirementAdapter();
			}
			@Override
			public Adapter caseDependabilityRequirement(DependabilityRequirement object) {
				return createDependabilityRequirementAdapter();
			}
			@Override
			public Adapter caseFunctionalSafetyRequirement(FunctionalSafetyRequirement object) {
				return createFunctionalSafetyRequirementAdapter();
			}
			@Override
			public Adapter caseSoftwareSafetyRequirement(SoftwareSafetyRequirement object) {
				return createSoftwareSafetyRequirementAdapter();
			}
			@Override
			public Adapter caseHardwareSafetyRequirement(HardwareSafetyRequirement object) {
				return createHardwareSafetyRequirementAdapter();
			}
			@Override
			public Adapter caseTechnicalSafetyRequirement(TechnicalSafetyRequirement object) {
				return createTechnicalSafetyRequirementAdapter();
			}
			@Override
			public Adapter caseSafetyGoal(SafetyGoal object) {
				return createSafetyGoalAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseSafeState(SafeState object) {
				return createSafeStateAdapter();
			}
			@Override
			public Adapter caseOperatingMode(OperatingMode object) {
				return createOperatingModeAdapter();
			}
			@Override
			public Adapter caseHazardAndRiskAssessment(HazardAndRiskAssessment object) {
				return createHazardAndRiskAssessmentAdapter();
			}
			@Override
			public Adapter caseISO26262SafetyRequirementTemplate(ISO26262SafetyRequirementTemplate object) {
				return createISO26262SafetyRequirementTemplateAdapter();
			}
			@Override
			public Adapter caseRequirementsModel(RequirementsModel object) {
				return createRequirementsModelAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link raaml.req.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.RequirementComponent <em>Requirement Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.RequirementComponent
	 * @generated
	 */
	public Adapter createRequirementComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.Abstraction <em>Abstraction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.Abstraction
	 * @generated
	 */
	public Adapter createAbstractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.DeriveRequirement <em>Derive Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.DeriveRequirement
	 * @generated
	 */
	public Adapter createDeriveRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.IndependenceRequirement <em>Independence Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.IndependenceRequirement
	 * @generated
	 */
	public Adapter createIndependenceRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.ASILDecompose <em>ASIL Decompose</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.ASILDecompose
	 * @generated
	 */
	public Adapter createASILDecomposeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.Satisfy
	 * @generated
	 */
	public Adapter createSatisfyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.UserInfoRequirement <em>User Info Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.UserInfoRequirement
	 * @generated
	 */
	public Adapter createUserInfoRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.RecoveryRequirement <em>Recovery Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.RecoveryRequirement
	 * @generated
	 */
	public Adapter createRecoveryRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.DependabilityRequirement <em>Dependability Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.DependabilityRequirement
	 * @generated
	 */
	public Adapter createDependabilityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.FunctionalSafetyRequirement <em>Functional Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.FunctionalSafetyRequirement
	 * @generated
	 */
	public Adapter createFunctionalSafetyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.SoftwareSafetyRequirement <em>Software Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.SoftwareSafetyRequirement
	 * @generated
	 */
	public Adapter createSoftwareSafetyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.HardwareSafetyRequirement <em>Hardware Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.HardwareSafetyRequirement
	 * @generated
	 */
	public Adapter createHardwareSafetyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.TechnicalSafetyRequirement <em>Technical Safety Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.TechnicalSafetyRequirement
	 * @generated
	 */
	public Adapter createTechnicalSafetyRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.SafetyGoal <em>Safety Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.SafetyGoal
	 * @generated
	 */
	public Adapter createSafetyGoalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.SafeState <em>Safe State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.SafeState
	 * @generated
	 */
	public Adapter createSafeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.OperatingMode <em>Operating Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.OperatingMode
	 * @generated
	 */
	public Adapter createOperatingModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.HazardAndRiskAssessment <em>Hazard And Risk Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.HazardAndRiskAssessment
	 * @generated
	 */
	public Adapter createHazardAndRiskAssessmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.ISO26262SafetyRequirementTemplate <em>ISO26262 Safety Requirement Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.ISO26262SafetyRequirementTemplate
	 * @generated
	 */
	public Adapter createISO26262SafetyRequirementTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link raaml.req.RequirementsModel <em>Requirements Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see raaml.req.RequirementsModel
	 * @generated
	 */
	public Adapter createRequirementsModelAdapter() {
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

} //ReqAdapterFactory
