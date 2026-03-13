/**
 */
package raaml.core.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see raaml.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANALYSIS: {
				Analysis analysis = (Analysis)theEObject;
				T result = caseAnalysis(analysis);
				if (result == null) result = caseNamedElement(analysis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_LIBRARY: {
				AbstractLibrary abstractLibrary = (AbstractLibrary)theEObject;
				T result = caseAbstractLibrary(abstractLibrary);
				if (result == null) result = caseNamedElement(abstractLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORE_SAFETY_ELEMENT: {
				CoreSafetyElement coreSafetyElement = (CoreSafetyElement)theEObject;
				T result = caseCoreSafetyElement(coreSafetyElement);
				if (result == null) result = caseNamedElement(coreSafetyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SITUATION: {
				Situation situation = (Situation)theEObject;
				T result = caseSituation(situation);
				if (result == null) result = caseCoreSafetyElement(situation);
				if (result == null) result = caseNamedElement(situation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FAILURE_MODE: {
				FailureMode failureMode = (FailureMode)theEObject;
				T result = caseFailureMode(failureMode);
				if (result == null) result = caseSituation(failureMode);
				if (result == null) result = caseCoreSafetyElement(failureMode);
				if (result == null) result = caseNamedElement(failureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.HAZARD: {
				Hazard hazard = (Hazard)theEObject;
				T result = caseHazard(hazard);
				if (result == null) result = caseSituation(hazard);
				if (result == null) result = caseCoreSafetyElement(hazard);
				if (result == null) result = caseNamedElement(hazard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ERROR: {
				raaml.core.Error error = (raaml.core.Error)theEObject;
				T result = caseError(error);
				if (result == null) result = caseSituation(error);
				if (result == null) result = caseCoreSafetyElement(error);
				if (result == null) result = caseNamedElement(error);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FAULT: {
				Fault fault = (Fault)theEObject;
				T result = caseFault(fault);
				if (result == null) result = caseSituation(fault);
				if (result == null) result = caseCoreSafetyElement(fault);
				if (result == null) result = caseNamedElement(fault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTROLLING_MEASURE: {
				ControllingMeasure controllingMeasure = (ControllingMeasure)theEObject;
				T result = caseControllingMeasure(controllingMeasure);
				if (result == null) result = caseCoreSafetyElement(controllingMeasure);
				if (result == null) result = caseNamedElement(controllingMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DETECTION: {
				Detection detection = (Detection)theEObject;
				T result = caseDetection(detection);
				if (result == null) result = caseControllingMeasure(detection);
				if (result == null) result = caseCoreSafetyElement(detection);
				if (result == null) result = caseNamedElement(detection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RECOMMENDATION: {
				Recommendation recommendation = (Recommendation)theEObject;
				T result = caseRecommendation(recommendation);
				if (result == null) result = caseControllingMeasure(recommendation);
				if (result == null) result = caseCoreSafetyElement(recommendation);
				if (result == null) result = caseNamedElement(recommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MITIGATION: {
				Mitigation mitigation = (Mitigation)theEObject;
				T result = caseMitigation(mitigation);
				if (result == null) result = caseControllingMeasure(mitigation);
				if (result == null) result = caseCoreSafetyElement(mitigation);
				if (result == null) result = caseNamedElement(mitigation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PREVENTION: {
				Prevention prevention = (Prevention)theEObject;
				T result = casePrevention(prevention);
				if (result == null) result = caseControllingMeasure(prevention);
				if (result == null) result = caseCoreSafetyElement(prevention);
				if (result == null) result = caseNamedElement(prevention);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseCoreSafetyElement(state);
				if (result == null) result = caseNamedElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FAILURE_STATE: {
				FailureState failureState = (FailureState)theEObject;
				T result = caseFailureState(failureState);
				if (result == null) result = caseState(failureState);
				if (result == null) result = caseCoreSafetyElement(failureState);
				if (result == null) result = caseNamedElement(failureState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DIRECTED_RELATIONSHIP: {
				DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
				T result = caseDirectedRelationship(directedRelationship);
				if (result == null) result = caseCoreSafetyElement(directedRelationship);
				if (result == null) result = caseNamedElement(directedRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RELEVANT_TO: {
				RelevantTo relevantTo = (RelevantTo)theEObject;
				T result = caseRelevantTo(relevantTo);
				if (result == null) result = caseDirectedRelationship(relevantTo);
				if (result == null) result = caseCoreSafetyElement(relevantTo);
				if (result == null) result = caseNamedElement(relevantTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PRESENT_IN: {
				PresentIn presentIn = (PresentIn)theEObject;
				T result = casePresentIn(presentIn);
				if (result == null) result = caseRelevantTo(presentIn);
				if (result == null) result = caseDirectedRelationship(presentIn);
				if (result == null) result = caseCoreSafetyElement(presentIn);
				if (result == null) result = caseNamedElement(presentIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VIOLATES: {
				Violates violates = (Violates)theEObject;
				T result = caseViolates(violates);
				if (result == null) result = caseDirectedRelationship(violates);
				if (result == null) result = caseCoreSafetyElement(violates);
				if (result == null) result = caseNamedElement(violates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = caseCoreSafetyElement(item);
				if (result == null) result = caseNamedElement(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SINGLE_ELEMENT_ITEM: {
				SingleElementItem singleElementItem = (SingleElementItem)theEObject;
				T result = caseSingleElementItem(singleElementItem);
				if (result == null) result = caseItem(singleElementItem);
				if (result == null) result = caseCoreSafetyElement(singleElementItem);
				if (result == null) result = caseNamedElement(singleElementItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ELEMENT_GROUP: {
				ElementGroup elementGroup = (ElementGroup)theEObject;
				T result = caseElementGroup(elementGroup);
				if (result == null) result = caseCoreSafetyElement(elementGroup);
				if (result == null) result = caseNamedElement(elementGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ELEMENT_GROUP_BASED_ITEM: {
				ElementGroupBasedItem elementGroupBasedItem = (ElementGroupBasedItem)theEObject;
				T result = caseElementGroupBasedItem(elementGroupBasedItem);
				if (result == null) result = caseItem(elementGroupBasedItem);
				if (result == null) result = caseElementGroup(elementGroupBasedItem);
				if (result == null) result = caseCoreSafetyElement(elementGroupBasedItem);
				if (result == null) result = caseNamedElement(elementGroupBasedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ANY_SITUATION: {
				AnySituation anySituation = (AnySituation)theEObject;
				T result = caseAnySituation(anySituation);
				if (result == null) result = caseSituation(anySituation);
				if (result == null) result = caseCoreSafetyElement(anySituation);
				if (result == null) result = caseNamedElement(anySituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACTOR: {
				Factor factor = (Factor)theEObject;
				T result = caseFactor(factor);
				if (result == null) result = caseAnySituation(factor);
				if (result == null) result = caseSituation(factor);
				if (result == null) result = caseCoreSafetyElement(factor);
				if (result == null) result = caseNamedElement(factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROCESS_MODEL_FLAW: {
				ProcessModelFlaw processModelFlaw = (ProcessModelFlaw)theEObject;
				T result = caseProcessModelFlaw(processModelFlaw);
				if (result == null) result = caseAnySituation(processModelFlaw);
				if (result == null) result = caseSituation(processModelFlaw);
				if (result == null) result = caseCoreSafetyElement(processModelFlaw);
				if (result == null) result = caseNamedElement(processModelFlaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.HARM_POTENTIAL: {
				HarmPotential harmPotential = (HarmPotential)theEObject;
				T result = caseHarmPotential(harmPotential);
				if (result == null) result = caseCoreSafetyElement(harmPotential);
				if (result == null) result = caseNamedElement(harmPotential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_EVENT: {
				AbstractEvent abstractEvent = (AbstractEvent)theEObject;
				T result = caseAbstractEvent(abstractEvent);
				if (result == null) result = caseAnySituation(abstractEvent);
				if (result == null) result = caseSituation(abstractEvent);
				if (result == null) result = caseCoreSafetyElement(abstractEvent);
				if (result == null) result = caseNamedElement(abstractEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DYSFUNCTIONAL_EVENT: {
				DysfunctionalEvent dysfunctionalEvent = (DysfunctionalEvent)theEObject;
				T result = caseDysfunctionalEvent(dysfunctionalEvent);
				if (result == null) result = caseAbstractEvent(dysfunctionalEvent);
				if (result == null) result = caseAnySituation(dysfunctionalEvent);
				if (result == null) result = caseSituation(dysfunctionalEvent);
				if (result == null) result = caseCoreSafetyElement(dysfunctionalEvent);
				if (result == null) result = caseNamedElement(dysfunctionalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_EFFECT: {
				AbstractEffect abstractEffect = (AbstractEffect)theEObject;
				T result = caseAbstractEffect(abstractEffect);
				if (result == null) result = caseDysfunctionalEvent(abstractEffect);
				if (result == null) result = caseAbstractEvent(abstractEffect);
				if (result == null) result = caseAnySituation(abstractEffect);
				if (result == null) result = caseSituation(abstractEffect);
				if (result == null) result = caseCoreSafetyElement(abstractEffect);
				if (result == null) result = caseNamedElement(abstractEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNDESIRED_STATE: {
				UndesiredState undesiredState = (UndesiredState)theEObject;
				T result = caseUndesiredState(undesiredState);
				if (result == null) result = caseDysfunctionalEvent(undesiredState);
				if (result == null) result = caseAbstractEvent(undesiredState);
				if (result == null) result = caseAnySituation(undesiredState);
				if (result == null) result = caseSituation(undesiredState);
				if (result == null) result = caseCoreSafetyElement(undesiredState);
				if (result == null) result = caseNamedElement(undesiredState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_FAILURE_MODE: {
				AbstractFailureMode abstractFailureMode = (AbstractFailureMode)theEObject;
				T result = caseAbstractFailureMode(abstractFailureMode);
				if (result == null) result = caseUndesiredState(abstractFailureMode);
				if (result == null) result = caseDysfunctionalEvent(abstractFailureMode);
				if (result == null) result = caseAbstractEvent(abstractFailureMode);
				if (result == null) result = caseAnySituation(abstractFailureMode);
				if (result == null) result = caseSituation(abstractFailureMode);
				if (result == null) result = caseCoreSafetyElement(abstractFailureMode);
				if (result == null) result = caseNamedElement(abstractFailureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_CAUSE: {
				AbstractCause abstractCause = (AbstractCause)theEObject;
				T result = caseAbstractCause(abstractCause);
				if (result == null) result = caseAbstractEvent(abstractCause);
				if (result == null) result = caseFactor(abstractCause);
				if (result == null) result = caseAnySituation(abstractCause);
				if (result == null) result = caseSituation(abstractCause);
				if (result == null) result = caseCoreSafetyElement(abstractCause);
				if (result == null) result = caseNamedElement(abstractCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCENARIO: {
				Scenario scenario = (Scenario)theEObject;
				T result = caseScenario(scenario);
				if (result == null) result = caseAnySituation(scenario);
				if (result == null) result = caseSituation(scenario);
				if (result == null) result = caseCoreSafetyElement(scenario);
				if (result == null) result = caseNamedElement(scenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_RISK: {
				AbstractRisk abstractRisk = (AbstractRisk)theEObject;
				T result = caseAbstractRisk(abstractRisk);
				if (result == null) result = caseScenario(abstractRisk);
				if (result == null) result = caseAnySituation(abstractRisk);
				if (result == null) result = caseSituation(abstractRisk);
				if (result == null) result = caseCoreSafetyElement(abstractRisk);
				if (result == null) result = caseNamedElement(abstractRisk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazard(Hazard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseError(raaml.core.Error object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fault</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFault(Fault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controlling Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controlling Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllingMeasure(ControllingMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Detection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Detection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetection(Detection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendation(Recommendation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMitigation(Mitigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prevention</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prevention</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrevention(Prevention object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureState(FailureState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relevant To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relevant To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelevantTo(RelevantTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Present In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Present In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePresentIn(PresentIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Violates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Violates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViolates(Violates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Element Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Element Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleElementItem(SingleElementItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementGroup(ElementGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Group Based Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Group Based Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementGroupBasedItem(ElementGroupBasedItem object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactor(Factor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process Model Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process Model Flaw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcessModelFlaw(ProcessModelFlaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Harm Potential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Harm Potential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHarmPotential(HarmPotential object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFailureMode(AbstractFailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCause(AbstractCause object) {
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

} //CoreSwitch
