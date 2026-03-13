/**
 */
package raaml.req.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import raaml.core.CoreSafetyElement;
import raaml.core.NamedElement;

import raaml.req.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see raaml.req.ReqPackage
 * @generated
 */
public class ReqSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ReqPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqSwitch() {
		if (modelPackage == null) {
			modelPackage = ReqPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ReqPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseCoreSafetyElement(requirement);
				if (result == null) result = caseNamedElement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.REQUIREMENT_COMPONENT: {
				RequirementComponent requirementComponent = (RequirementComponent)theEObject;
				T result = caseRequirementComponent(requirementComponent);
				if (result == null) result = caseCoreSafetyElement(requirementComponent);
				if (result == null) result = caseNamedElement(requirementComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.ABSTRACTION: {
				Abstraction abstraction = (Abstraction)theEObject;
				T result = caseAbstraction(abstraction);
				if (result == null) result = caseRequirementComponent(abstraction);
				if (result == null) result = caseCoreSafetyElement(abstraction);
				if (result == null) result = caseNamedElement(abstraction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.DERIVE_REQUIREMENT: {
				DeriveRequirement deriveRequirement = (DeriveRequirement)theEObject;
				T result = caseDeriveRequirement(deriveRequirement);
				if (result == null) result = caseAbstraction(deriveRequirement);
				if (result == null) result = caseRequirementComponent(deriveRequirement);
				if (result == null) result = caseCoreSafetyElement(deriveRequirement);
				if (result == null) result = caseNamedElement(deriveRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.INDEPENDENCE_REQUIREMENT: {
				IndependenceRequirement independenceRequirement = (IndependenceRequirement)theEObject;
				T result = caseIndependenceRequirement(independenceRequirement);
				if (result == null) result = caseDeriveRequirement(independenceRequirement);
				if (result == null) result = caseAbstraction(independenceRequirement);
				if (result == null) result = caseRequirementComponent(independenceRequirement);
				if (result == null) result = caseCoreSafetyElement(independenceRequirement);
				if (result == null) result = caseNamedElement(independenceRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.ASIL_DECOMPOSE: {
				ASILDecompose asilDecompose = (ASILDecompose)theEObject;
				T result = caseASILDecompose(asilDecompose);
				if (result == null) result = caseDeriveRequirement(asilDecompose);
				if (result == null) result = caseAbstraction(asilDecompose);
				if (result == null) result = caseRequirementComponent(asilDecompose);
				if (result == null) result = caseCoreSafetyElement(asilDecompose);
				if (result == null) result = caseNamedElement(asilDecompose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.SATISFY: {
				Satisfy satisfy = (Satisfy)theEObject;
				T result = caseSatisfy(satisfy);
				if (result == null) result = caseAbstraction(satisfy);
				if (result == null) result = caseRequirementComponent(satisfy);
				if (result == null) result = caseCoreSafetyElement(satisfy);
				if (result == null) result = caseNamedElement(satisfy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.USER_INFO_REQUIREMENT: {
				UserInfoRequirement userInfoRequirement = (UserInfoRequirement)theEObject;
				T result = caseUserInfoRequirement(userInfoRequirement);
				if (result == null) result = caseSatisfy(userInfoRequirement);
				if (result == null) result = caseAbstraction(userInfoRequirement);
				if (result == null) result = caseRequirementComponent(userInfoRequirement);
				if (result == null) result = caseCoreSafetyElement(userInfoRequirement);
				if (result == null) result = caseNamedElement(userInfoRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.RECOVERY_REQUIREMENT: {
				RecoveryRequirement recoveryRequirement = (RecoveryRequirement)theEObject;
				T result = caseRecoveryRequirement(recoveryRequirement);
				if (result == null) result = caseSatisfy(recoveryRequirement);
				if (result == null) result = caseAbstraction(recoveryRequirement);
				if (result == null) result = caseRequirementComponent(recoveryRequirement);
				if (result == null) result = caseCoreSafetyElement(recoveryRequirement);
				if (result == null) result = caseNamedElement(recoveryRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.DEPENDABILITY_REQUIREMENT: {
				DependabilityRequirement dependabilityRequirement = (DependabilityRequirement)theEObject;
				T result = caseDependabilityRequirement(dependabilityRequirement);
				if (result == null) result = caseRequirement(dependabilityRequirement);
				if (result == null) result = caseCoreSafetyElement(dependabilityRequirement);
				if (result == null) result = caseNamedElement(dependabilityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.FUNCTIONAL_SAFETY_REQUIREMENT: {
				FunctionalSafetyRequirement functionalSafetyRequirement = (FunctionalSafetyRequirement)theEObject;
				T result = caseFunctionalSafetyRequirement(functionalSafetyRequirement);
				if (result == null) result = caseDependabilityRequirement(functionalSafetyRequirement);
				if (result == null) result = caseRequirement(functionalSafetyRequirement);
				if (result == null) result = caseCoreSafetyElement(functionalSafetyRequirement);
				if (result == null) result = caseNamedElement(functionalSafetyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.SOFTWARE_SAFETY_REQUIREMENT: {
				SoftwareSafetyRequirement softwareSafetyRequirement = (SoftwareSafetyRequirement)theEObject;
				T result = caseSoftwareSafetyRequirement(softwareSafetyRequirement);
				if (result == null) result = caseDependabilityRequirement(softwareSafetyRequirement);
				if (result == null) result = caseRequirement(softwareSafetyRequirement);
				if (result == null) result = caseCoreSafetyElement(softwareSafetyRequirement);
				if (result == null) result = caseNamedElement(softwareSafetyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.HARDWARE_SAFETY_REQUIREMENT: {
				HardwareSafetyRequirement hardwareSafetyRequirement = (HardwareSafetyRequirement)theEObject;
				T result = caseHardwareSafetyRequirement(hardwareSafetyRequirement);
				if (result == null) result = caseDependabilityRequirement(hardwareSafetyRequirement);
				if (result == null) result = caseRequirement(hardwareSafetyRequirement);
				if (result == null) result = caseCoreSafetyElement(hardwareSafetyRequirement);
				if (result == null) result = caseNamedElement(hardwareSafetyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.TECHNICAL_SAFETY_REQUIREMENT: {
				TechnicalSafetyRequirement technicalSafetyRequirement = (TechnicalSafetyRequirement)theEObject;
				T result = caseTechnicalSafetyRequirement(technicalSafetyRequirement);
				if (result == null) result = caseDependabilityRequirement(technicalSafetyRequirement);
				if (result == null) result = caseRequirement(technicalSafetyRequirement);
				if (result == null) result = caseCoreSafetyElement(technicalSafetyRequirement);
				if (result == null) result = caseNamedElement(technicalSafetyRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.SAFETY_GOAL: {
				SafetyGoal safetyGoal = (SafetyGoal)theEObject;
				T result = caseSafetyGoal(safetyGoal);
				if (result == null) result = caseDependabilityRequirement(safetyGoal);
				if (result == null) result = caseRequirement(safetyGoal);
				if (result == null) result = caseCoreSafetyElement(safetyGoal);
				if (result == null) result = caseNamedElement(safetyGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				T result = caseDependency(dependency);
				if (result == null) result = caseRequirementComponent(dependency);
				if (result == null) result = caseCoreSafetyElement(dependency);
				if (result == null) result = caseNamedElement(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.SAFE_STATE: {
				SafeState safeState = (SafeState)theEObject;
				T result = caseSafeState(safeState);
				if (result == null) result = caseDependency(safeState);
				if (result == null) result = caseRequirementComponent(safeState);
				if (result == null) result = caseCoreSafetyElement(safeState);
				if (result == null) result = caseNamedElement(safeState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.OPERATING_MODE: {
				OperatingMode operatingMode = (OperatingMode)theEObject;
				T result = caseOperatingMode(operatingMode);
				if (result == null) result = caseDependency(operatingMode);
				if (result == null) result = caseRequirementComponent(operatingMode);
				if (result == null) result = caseCoreSafetyElement(operatingMode);
				if (result == null) result = caseNamedElement(operatingMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.HAZARD_AND_RISK_ASSESSMENT: {
				HazardAndRiskAssessment hazardAndRiskAssessment = (HazardAndRiskAssessment)theEObject;
				T result = caseHazardAndRiskAssessment(hazardAndRiskAssessment);
				if (result == null) result = caseCoreSafetyElement(hazardAndRiskAssessment);
				if (result == null) result = caseNamedElement(hazardAndRiskAssessment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.ISO26262_SAFETY_REQUIREMENT_TEMPLATE: {
				ISO26262SafetyRequirementTemplate iso26262SafetyRequirementTemplate = (ISO26262SafetyRequirementTemplate)theEObject;
				T result = caseISO26262SafetyRequirementTemplate(iso26262SafetyRequirementTemplate);
				if (result == null) result = caseDependabilityRequirement(iso26262SafetyRequirementTemplate);
				if (result == null) result = caseRequirement(iso26262SafetyRequirementTemplate);
				if (result == null) result = caseCoreSafetyElement(iso26262SafetyRequirementTemplate);
				if (result == null) result = caseNamedElement(iso26262SafetyRequirementTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ReqPackage.REQUIREMENTS_MODEL: {
				RequirementsModel requirementsModel = (RequirementsModel)theEObject;
				T result = caseRequirementsModel(requirementsModel);
				if (result == null) result = caseCoreSafetyElement(requirementsModel);
				if (result == null) result = caseNamedElement(requirementsModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementComponent(RequirementComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derive Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derive Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeriveRequirement(DeriveRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Independence Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Independence Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndependenceRequirement(IndependenceRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASIL Decompose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASIL Decompose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASILDecompose(ASILDecompose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Satisfy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Satisfy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSatisfy(Satisfy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Info Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Info Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserInfoRequirement(UserInfoRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recovery Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recovery Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecoveryRequirement(RecoveryRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependability Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependabilityRequirement(DependabilityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Safety Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalSafetyRequirement(FunctionalSafetyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software Safety Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSafetyRequirement(SoftwareSafetyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Safety Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareSafetyRequirement(HardwareSafetyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technical Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technical Safety Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnicalSafetyRequirement(TechnicalSafetyRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyGoal(SafetyGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safe State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safe State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafeState(SafeState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operating Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operating Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperatingMode(OperatingMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard And Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard And Risk Assessment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardAndRiskAssessment(HazardAndRiskAssessment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO26262 Safety Requirement Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO26262 Safety Requirement Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO26262SafetyRequirementTemplate(ISO26262SafetyRequirementTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirements Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirements Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementsModel(RequirementsModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreSafetyElement(CoreSafetyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ReqSwitch
