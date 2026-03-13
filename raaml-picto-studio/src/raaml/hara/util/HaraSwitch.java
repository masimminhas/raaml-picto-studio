/**
 */
package raaml.hara.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see raaml.hara.HaraPackage
 * @generated
 */
public class HaraSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HaraPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HaraSwitch() {
		if (modelPackage == null) {
			modelPackage = HaraPackage.eINSTANCE;
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
			case HaraPackage.ISO26262: {
				ISO26262 iso26262 = (ISO26262)theEObject;
				T result = caseISO26262(iso26262);
				if (result == null) result = caseAnalysis(iso26262);
				if (result == null) result = caseNamedElement(iso26262);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.OPERATIONAL_SITUATION: {
				OperationalSituation operationalSituation = (OperationalSituation)theEObject;
				T result = caseOperationalSituation(operationalSituation);
				if (result == null) result = caseSituation(operationalSituation);
				if (result == null) result = caseCoreSafetyElement(operationalSituation);
				if (result == null) result = caseNamedElement(operationalSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.MALFUNCTIONING_BEHAVIOUR: {
				MalfunctioningBehaviour malfunctioningBehaviour = (MalfunctioningBehaviour)theEObject;
				T result = caseMalfunctioningBehaviour(malfunctioningBehaviour);
				if (result == null) result = caseFailureMode(malfunctioningBehaviour);
				if (result == null) result = caseSituation(malfunctioningBehaviour);
				if (result == null) result = caseCoreSafetyElement(malfunctioningBehaviour);
				if (result == null) result = caseNamedElement(malfunctioningBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.VERIFIED: {
				Verified verified = (Verified)theEObject;
				T result = caseVerified(verified);
				if (result == null) result = caseCoreSafetyElement(verified);
				if (result == null) result = caseNamedElement(verified);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.CONFIRMED: {
				Confirmed confirmed = (Confirmed)theEObject;
				T result = caseConfirmed(confirmed);
				if (result == null) result = caseCoreSafetyElement(confirmed);
				if (result == null) result = caseNamedElement(confirmed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.ASIL_ASSIGNMENT: {
				ASILAssignment asilAssignment = (ASILAssignment)theEObject;
				T result = caseASILAssignment(asilAssignment);
				if (result == null) result = caseCoreSafetyElement(asilAssignment);
				if (result == null) result = caseNamedElement(asilAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.OPERATIONAL_CONDITION: {
				OperationalCondition operationalCondition = (OperationalCondition)theEObject;
				T result = caseOperationalCondition(operationalCondition);
				if (result == null) result = caseAbstractEvent(operationalCondition);
				if (result == null) result = caseAnySituation(operationalCondition);
				if (result == null) result = caseSituation(operationalCondition);
				if (result == null) result = caseCoreSafetyElement(operationalCondition);
				if (result == null) result = caseNamedElement(operationalCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.ABSTRACT_OPERATIONAL_SITUATION: {
				AbstractOperationalSituation abstractOperationalSituation = (AbstractOperationalSituation)theEObject;
				T result = caseAbstractOperationalSituation(abstractOperationalSituation);
				if (result == null) result = caseOperationalCondition(abstractOperationalSituation);
				if (result == null) result = caseAbstractEvent(abstractOperationalSituation);
				if (result == null) result = caseAnySituation(abstractOperationalSituation);
				if (result == null) result = caseSituation(abstractOperationalSituation);
				if (result == null) result = caseCoreSafetyElement(abstractOperationalSituation);
				if (result == null) result = caseNamedElement(abstractOperationalSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.ACCIDENT_SCENARIO: {
				AccidentScenario accidentScenario = (AccidentScenario)theEObject;
				T result = caseAccidentScenario(accidentScenario);
				if (result == null) result = caseDysfunctionalEvent(accidentScenario);
				if (result == null) result = caseAbstractEvent(accidentScenario);
				if (result == null) result = caseAnySituation(accidentScenario);
				if (result == null) result = caseSituation(accidentScenario);
				if (result == null) result = caseCoreSafetyElement(accidentScenario);
				if (result == null) result = caseNamedElement(accidentScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.ANY_MALFUNCTION: {
				AnyMalfunction anyMalfunction = (AnyMalfunction)theEObject;
				T result = caseAnyMalfunction(anyMalfunction);
				if (result == null) result = caseUndesiredState(anyMalfunction);
				if (result == null) result = caseDysfunctionalEvent(anyMalfunction);
				if (result == null) result = caseAbstractEvent(anyMalfunction);
				if (result == null) result = caseAnySituation(anyMalfunction);
				if (result == null) result = caseSituation(anyMalfunction);
				if (result == null) result = caseCoreSafetyElement(anyMalfunction);
				if (result == null) result = caseNamedElement(anyMalfunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.HAZARDOUS_EVENT: {
				HazardousEvent hazardousEvent = (HazardousEvent)theEObject;
				T result = caseHazardousEvent(hazardousEvent);
				if (result == null) result = caseAbstractRisk(hazardousEvent);
				if (result == null) result = caseScenario(hazardousEvent);
				if (result == null) result = caseAnySituation(hazardousEvent);
				if (result == null) result = caseSituation(hazardousEvent);
				if (result == null) result = caseCoreSafetyElement(hazardousEvent);
				if (result == null) result = caseNamedElement(hazardousEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.AUTOMOTIVE_EFFECT: {
				AutomotiveEffect automotiveEffect = (AutomotiveEffect)theEObject;
				T result = caseAutomotiveEffect(automotiveEffect);
				if (result == null) result = caseAbstractEffect(automotiveEffect);
				if (result == null) result = caseDysfunctionalEvent(automotiveEffect);
				if (result == null) result = caseAbstractEvent(automotiveEffect);
				if (result == null) result = caseAnySituation(automotiveEffect);
				if (result == null) result = caseSituation(automotiveEffect);
				if (result == null) result = caseCoreSafetyElement(automotiveEffect);
				if (result == null) result = caseNamedElement(automotiveEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.SYSTEM_LEVEL_EFFECT: {
				SystemLevelEffect systemLevelEffect = (SystemLevelEffect)theEObject;
				T result = caseSystemLevelEffect(systemLevelEffect);
				if (result == null) result = caseAutomotiveEffect(systemLevelEffect);
				if (result == null) result = caseAbstractEffect(systemLevelEffect);
				if (result == null) result = caseDysfunctionalEvent(systemLevelEffect);
				if (result == null) result = caseAbstractEvent(systemLevelEffect);
				if (result == null) result = caseAnySituation(systemLevelEffect);
				if (result == null) result = caseSituation(systemLevelEffect);
				if (result == null) result = caseCoreSafetyElement(systemLevelEffect);
				if (result == null) result = caseNamedElement(systemLevelEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.VEHICLE_LEVEL_EFFECT: {
				VehicleLevelEffect vehicleLevelEffect = (VehicleLevelEffect)theEObject;
				T result = caseVehicleLevelEffect(vehicleLevelEffect);
				if (result == null) result = caseAutomotiveEffect(vehicleLevelEffect);
				if (result == null) result = caseAbstractEffect(vehicleLevelEffect);
				if (result == null) result = caseDysfunctionalEvent(vehicleLevelEffect);
				if (result == null) result = caseAbstractEvent(vehicleLevelEffect);
				if (result == null) result = caseAnySituation(vehicleLevelEffect);
				if (result == null) result = caseSituation(vehicleLevelEffect);
				if (result == null) result = caseCoreSafetyElement(vehicleLevelEffect);
				if (result == null) result = caseNamedElement(vehicleLevelEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HaraPackage.ISO26262_LIBRARY: {
				ISO26262Library iso26262Library = (ISO26262Library)theEObject;
				T result = caseISO26262Library(iso26262Library);
				if (result == null) result = caseAbstractLibrary(iso26262Library);
				if (result == null) result = caseNamedElement(iso26262Library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO26262</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO26262</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO26262(ISO26262 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalSituation(OperationalSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Malfunctioning Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Malfunctioning Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMalfunctioningBehaviour(MalfunctioningBehaviour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verified</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verified</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerified(Verified object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confirmed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confirmed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfirmed(Confirmed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASIL Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASIL Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASILAssignment(ASILAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operational Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operational Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationalCondition(OperationalCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Operational Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Operational Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOperationalSituation(AbstractOperationalSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accident Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accident Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccidentScenario(AccidentScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Malfunction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Malfunction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnyMalfunction(AnyMalfunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazardous Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazardous Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardousEvent(HazardousEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automotive Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automotive Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomotiveEffect(AutomotiveEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Level Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Level Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemLevelEffect(SystemLevelEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vehicle Level Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vehicle Level Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVehicleLevelEffect(VehicleLevelEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISO26262 Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISO26262 Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISO26262Library(ISO26262Library object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysis(Analysis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSituation(Situation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureMode(FailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Any Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Any Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnySituation(AnySituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEvent(AbstractEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dysfunctional Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dysfunctional Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDysfunctionalEvent(DysfunctionalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undesired State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undesired State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndesiredState(UndesiredState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenario(Scenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Risk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Risk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractRisk(AbstractRisk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEffect(AbstractEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLibrary(AbstractLibrary object) {
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

} //HaraSwitch
