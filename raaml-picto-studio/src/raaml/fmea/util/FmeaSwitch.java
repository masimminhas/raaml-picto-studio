/**
 */
package raaml.fmea.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see raaml.fmea.FmeaPackage
 * @generated
 */
public class FmeaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FmeaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmeaSwitch() {
		if (modelPackage == null) {
			modelPackage = FmeaPackage.eINSTANCE;
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
			case FmeaPackage.FMEA: {
				FMEA fmea = (FMEA)theEObject;
				T result = caseFMEA(fmea);
				if (result == null) result = caseAnalysis(fmea);
				if (result == null) result = caseNamedElement(fmea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.RPN_CALCULATION: {
				RPNCalculation rpnCalculation = (RPNCalculation)theEObject;
				T result = caseRPNCalculation(rpnCalculation);
				if (result == null) result = caseCoreSafetyElement(rpnCalculation);
				if (result == null) result = caseNamedElement(rpnCalculation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.ABSTRACT_FMEA_ITEM: {
				AbstractFMEAItem abstractFMEAItem = (AbstractFMEAItem)theEObject;
				T result = caseAbstractFMEAItem(abstractFMEAItem);
				if (result == null) result = caseCoreSafetyElement(abstractFMEAItem);
				if (result == null) result = caseNamedElement(abstractFMEAItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.FMEA_ITEM: {
				FMEAItem fmeaItem = (FMEAItem)theEObject;
				T result = caseFMEAItem(fmeaItem);
				if (result == null) result = caseAbstractFMEAItem(fmeaItem);
				if (result == null) result = caseCoreSafetyElement(fmeaItem);
				if (result == null) result = caseNamedElement(fmeaItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.LOSS_OF_FUNCTION: {
				LossOfFunction lossOfFunction = (LossOfFunction)theEObject;
				T result = caseLossOfFunction(lossOfFunction);
				if (result == null) result = caseAbstractFailureMode(lossOfFunction);
				if (result == null) result = caseUndesiredState(lossOfFunction);
				if (result == null) result = caseDysfunctionalEvent(lossOfFunction);
				if (result == null) result = caseAbstractEvent(lossOfFunction);
				if (result == null) result = caseAnySituation(lossOfFunction);
				if (result == null) result = caseSituation(lossOfFunction);
				if (result == null) result = caseCoreSafetyElement(lossOfFunction);
				if (result == null) result = caseNamedElement(lossOfFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.DEGRADATION_OF_FUNCTION: {
				DegradationOfFunction degradationOfFunction = (DegradationOfFunction)theEObject;
				T result = caseDegradationOfFunction(degradationOfFunction);
				if (result == null) result = caseAbstractFailureMode(degradationOfFunction);
				if (result == null) result = caseUndesiredState(degradationOfFunction);
				if (result == null) result = caseDysfunctionalEvent(degradationOfFunction);
				if (result == null) result = caseAbstractEvent(degradationOfFunction);
				if (result == null) result = caseAnySituation(degradationOfFunction);
				if (result == null) result = caseSituation(degradationOfFunction);
				if (result == null) result = caseCoreSafetyElement(degradationOfFunction);
				if (result == null) result = caseNamedElement(degradationOfFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.INTERMITTENT_FUNCTION: {
				IntermittentFunction intermittentFunction = (IntermittentFunction)theEObject;
				T result = caseIntermittentFunction(intermittentFunction);
				if (result == null) result = caseAbstractFailureMode(intermittentFunction);
				if (result == null) result = caseUndesiredState(intermittentFunction);
				if (result == null) result = caseDysfunctionalEvent(intermittentFunction);
				if (result == null) result = caseAbstractEvent(intermittentFunction);
				if (result == null) result = caseAnySituation(intermittentFunction);
				if (result == null) result = caseSituation(intermittentFunction);
				if (result == null) result = caseCoreSafetyElement(intermittentFunction);
				if (result == null) result = caseNamedElement(intermittentFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.PARTIAL_FUNCTION: {
				PartialFunction partialFunction = (PartialFunction)theEObject;
				T result = casePartialFunction(partialFunction);
				if (result == null) result = caseAbstractFailureMode(partialFunction);
				if (result == null) result = caseUndesiredState(partialFunction);
				if (result == null) result = caseDysfunctionalEvent(partialFunction);
				if (result == null) result = caseAbstractEvent(partialFunction);
				if (result == null) result = caseAnySituation(partialFunction);
				if (result == null) result = caseSituation(partialFunction);
				if (result == null) result = caseCoreSafetyElement(partialFunction);
				if (result == null) result = caseNamedElement(partialFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.EXCEEDING_FUNCTION: {
				ExceedingFunction exceedingFunction = (ExceedingFunction)theEObject;
				T result = caseExceedingFunction(exceedingFunction);
				if (result == null) result = caseAbstractFailureMode(exceedingFunction);
				if (result == null) result = caseUndesiredState(exceedingFunction);
				if (result == null) result = caseDysfunctionalEvent(exceedingFunction);
				if (result == null) result = caseAbstractEvent(exceedingFunction);
				if (result == null) result = caseAnySituation(exceedingFunction);
				if (result == null) result = caseSituation(exceedingFunction);
				if (result == null) result = caseCoreSafetyElement(exceedingFunction);
				if (result == null) result = caseNamedElement(exceedingFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.UNINTENDED_FUNCTION: {
				UnintendedFunction unintendedFunction = (UnintendedFunction)theEObject;
				T result = caseUnintendedFunction(unintendedFunction);
				if (result == null) result = caseAbstractFailureMode(unintendedFunction);
				if (result == null) result = caseUndesiredState(unintendedFunction);
				if (result == null) result = caseDysfunctionalEvent(unintendedFunction);
				if (result == null) result = caseAbstractEvent(unintendedFunction);
				if (result == null) result = caseAnySituation(unintendedFunction);
				if (result == null) result = caseSituation(unintendedFunction);
				if (result == null) result = caseCoreSafetyElement(unintendedFunction);
				if (result == null) result = caseNamedElement(unintendedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.DELAYED_FUNCTION: {
				DelayedFunction delayedFunction = (DelayedFunction)theEObject;
				T result = caseDelayedFunction(delayedFunction);
				if (result == null) result = caseAbstractFailureMode(delayedFunction);
				if (result == null) result = caseUndesiredState(delayedFunction);
				if (result == null) result = caseDysfunctionalEvent(delayedFunction);
				if (result == null) result = caseAbstractEvent(delayedFunction);
				if (result == null) result = caseAnySituation(delayedFunction);
				if (result == null) result = caseSituation(delayedFunction);
				if (result == null) result = caseCoreSafetyElement(delayedFunction);
				if (result == null) result = caseNamedElement(delayedFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FmeaPackage.FMEA_LIBRARY: {
				FMEALibrary fmeaLibrary = (FMEALibrary)theEObject;
				T result = caseFMEALibrary(fmeaLibrary);
				if (result == null) result = caseAbstractLibrary(fmeaLibrary);
				if (result == null) result = caseNamedElement(fmeaLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMEA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMEA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMEA(FMEA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RPN Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RPN Calculation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRPNCalculation(RPNCalculation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract FMEA Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract FMEA Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFMEAItem(AbstractFMEAItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMEA Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMEA Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMEAItem(FMEAItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loss Of Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loss Of Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLossOfFunction(LossOfFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Degradation Of Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Degradation Of Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDegradationOfFunction(DegradationOfFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermittent Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermittent Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermittentFunction(IntermittentFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialFunction(PartialFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exceeding Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exceeding Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceedingFunction(ExceedingFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unintended Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unintended Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnintendedFunction(UnintendedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delayed Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delayed Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayedFunction(DelayedFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FMEA Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FMEA Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMEALibrary(FMEALibrary object) {
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

} //FmeaSwitch
