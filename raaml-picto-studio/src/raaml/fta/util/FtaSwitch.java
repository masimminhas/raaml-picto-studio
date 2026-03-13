/**
 */
package raaml.fta.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see raaml.fta.FtaPackage
 * @generated
 */
public class FtaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtaSwitch() {
		if (modelPackage == null) {
			modelPackage = FtaPackage.eINSTANCE;
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
			case FtaPackage.FTA: {
				FTA fta = (FTA)theEObject;
				T result = caseFTA(fta);
				if (result == null) result = caseAnalysis(fta);
				if (result == null) result = caseNamedElement(fta);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.FTA_ELEMENT: {
				FTAElement ftaElement = (FTAElement)theEObject;
				T result = caseFTAElement(ftaElement);
				if (result == null) result = caseDysfunctionalEvent(ftaElement);
				if (result == null) result = caseAbstractEvent(ftaElement);
				if (result == null) result = caseAnySituation(ftaElement);
				if (result == null) result = caseSituation(ftaElement);
				if (result == null) result = caseCoreSafetyElement(ftaElement);
				if (result == null) result = caseNamedElement(ftaElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseFTAElement(event);
				if (result == null) result = caseDysfunctionalEvent(event);
				if (result == null) result = caseAbstractEvent(event);
				if (result == null) result = caseAnySituation(event);
				if (result == null) result = caseSituation(event);
				if (result == null) result = caseCoreSafetyElement(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.BASIC_EVENT: {
				BasicEvent basicEvent = (BasicEvent)theEObject;
				T result = caseBasicEvent(basicEvent);
				if (result == null) result = caseEvent(basicEvent);
				if (result == null) result = caseFTAElement(basicEvent);
				if (result == null) result = caseDysfunctionalEvent(basicEvent);
				if (result == null) result = caseAbstractEvent(basicEvent);
				if (result == null) result = caseAnySituation(basicEvent);
				if (result == null) result = caseSituation(basicEvent);
				if (result == null) result = caseCoreSafetyElement(basicEvent);
				if (result == null) result = caseNamedElement(basicEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.INTERMEDIATE_EVENT: {
				IntermediateEvent intermediateEvent = (IntermediateEvent)theEObject;
				T result = caseIntermediateEvent(intermediateEvent);
				if (result == null) result = caseEvent(intermediateEvent);
				if (result == null) result = caseFTAElement(intermediateEvent);
				if (result == null) result = caseDysfunctionalEvent(intermediateEvent);
				if (result == null) result = caseAbstractEvent(intermediateEvent);
				if (result == null) result = caseAnySituation(intermediateEvent);
				if (result == null) result = caseSituation(intermediateEvent);
				if (result == null) result = caseCoreSafetyElement(intermediateEvent);
				if (result == null) result = caseNamedElement(intermediateEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.TOP_EVENT: {
				TopEvent topEvent = (TopEvent)theEObject;
				T result = caseTopEvent(topEvent);
				if (result == null) result = caseEvent(topEvent);
				if (result == null) result = caseFTAElement(topEvent);
				if (result == null) result = caseDysfunctionalEvent(topEvent);
				if (result == null) result = caseAbstractEvent(topEvent);
				if (result == null) result = caseAnySituation(topEvent);
				if (result == null) result = caseSituation(topEvent);
				if (result == null) result = caseCoreSafetyElement(topEvent);
				if (result == null) result = caseNamedElement(topEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.CONDITIONAL_EVENT: {
				ConditionalEvent conditionalEvent = (ConditionalEvent)theEObject;
				T result = caseConditionalEvent(conditionalEvent);
				if (result == null) result = caseEvent(conditionalEvent);
				if (result == null) result = caseFTAElement(conditionalEvent);
				if (result == null) result = caseDysfunctionalEvent(conditionalEvent);
				if (result == null) result = caseAbstractEvent(conditionalEvent);
				if (result == null) result = caseAnySituation(conditionalEvent);
				if (result == null) result = caseSituation(conditionalEvent);
				if (result == null) result = caseCoreSafetyElement(conditionalEvent);
				if (result == null) result = caseNamedElement(conditionalEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.DORMANT_EVENT: {
				DormantEvent dormantEvent = (DormantEvent)theEObject;
				T result = caseDormantEvent(dormantEvent);
				if (result == null) result = caseEvent(dormantEvent);
				if (result == null) result = caseFTAElement(dormantEvent);
				if (result == null) result = caseDysfunctionalEvent(dormantEvent);
				if (result == null) result = caseAbstractEvent(dormantEvent);
				if (result == null) result = caseAnySituation(dormantEvent);
				if (result == null) result = caseSituation(dormantEvent);
				if (result == null) result = caseCoreSafetyElement(dormantEvent);
				if (result == null) result = caseNamedElement(dormantEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.UNDEVELOPED_EVENT: {
				UndevelopedEvent undevelopedEvent = (UndevelopedEvent)theEObject;
				T result = caseUndevelopedEvent(undevelopedEvent);
				if (result == null) result = caseEvent(undevelopedEvent);
				if (result == null) result = caseFTAElement(undevelopedEvent);
				if (result == null) result = caseDysfunctionalEvent(undevelopedEvent);
				if (result == null) result = caseAbstractEvent(undevelopedEvent);
				if (result == null) result = caseAnySituation(undevelopedEvent);
				if (result == null) result = caseSituation(undevelopedEvent);
				if (result == null) result = caseCoreSafetyElement(undevelopedEvent);
				if (result == null) result = caseNamedElement(undevelopedEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.HOUSE_EVENT: {
				HouseEvent houseEvent = (HouseEvent)theEObject;
				T result = caseHouseEvent(houseEvent);
				if (result == null) result = caseEvent(houseEvent);
				if (result == null) result = caseFTAElement(houseEvent);
				if (result == null) result = caseDysfunctionalEvent(houseEvent);
				if (result == null) result = caseAbstractEvent(houseEvent);
				if (result == null) result = caseAnySituation(houseEvent);
				if (result == null) result = caseSituation(houseEvent);
				if (result == null) result = caseCoreSafetyElement(houseEvent);
				if (result == null) result = caseNamedElement(houseEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.ZERO_EVENT: {
				ZeroEvent zeroEvent = (ZeroEvent)theEObject;
				T result = caseZeroEvent(zeroEvent);
				if (result == null) result = caseEvent(zeroEvent);
				if (result == null) result = caseFTAElement(zeroEvent);
				if (result == null) result = caseDysfunctionalEvent(zeroEvent);
				if (result == null) result = caseAbstractEvent(zeroEvent);
				if (result == null) result = caseAnySituation(zeroEvent);
				if (result == null) result = caseSituation(zeroEvent);
				if (result == null) result = caseCoreSafetyElement(zeroEvent);
				if (result == null) result = caseNamedElement(zeroEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.GATE: {
				Gate gate = (Gate)theEObject;
				T result = caseGate(gate);
				if (result == null) result = caseCoreSafetyElement(gate);
				if (result == null) result = caseNamedElement(gate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.AND: {
				AND and = (AND)theEObject;
				T result = caseAND(and);
				if (result == null) result = caseGate(and);
				if (result == null) result = caseCoreSafetyElement(and);
				if (result == null) result = caseNamedElement(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.OR: {
				OR or = (OR)theEObject;
				T result = caseOR(or);
				if (result == null) result = caseGate(or);
				if (result == null) result = caseCoreSafetyElement(or);
				if (result == null) result = caseNamedElement(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.NOT: {
				NOT not = (NOT)theEObject;
				T result = caseNOT(not);
				if (result == null) result = caseGate(not);
				if (result == null) result = caseCoreSafetyElement(not);
				if (result == null) result = caseNamedElement(not);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.XOR: {
				XOR xor = (XOR)theEObject;
				T result = caseXOR(xor);
				if (result == null) result = caseGate(xor);
				if (result == null) result = caseCoreSafetyElement(xor);
				if (result == null) result = caseNamedElement(xor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.SEQ: {
				SEQ seq = (SEQ)theEObject;
				T result = caseSEQ(seq);
				if (result == null) result = caseGate(seq);
				if (result == null) result = caseCoreSafetyElement(seq);
				if (result == null) result = caseNamedElement(seq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.INHIBIT: {
				INHIBIT inhibit = (INHIBIT)theEObject;
				T result = caseINHIBIT(inhibit);
				if (result == null) result = caseGate(inhibit);
				if (result == null) result = caseCoreSafetyElement(inhibit);
				if (result == null) result = caseNamedElement(inhibit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.MAJORITY_VOTE: {
				MAJORITY_VOTE majoritY_VOTE = (MAJORITY_VOTE)theEObject;
				T result = caseMAJORITY_VOTE(majoritY_VOTE);
				if (result == null) result = caseGate(majoritY_VOTE);
				if (result == null) result = caseCoreSafetyElement(majoritY_VOTE);
				if (result == null) result = caseNamedElement(majoritY_VOTE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.FTA_TREE: {
				FTATree ftaTree = (FTATree)theEObject;
				T result = caseFTATree(ftaTree);
				if (result == null) result = caseCoreSafetyElement(ftaTree);
				if (result == null) result = caseNamedElement(ftaTree);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FtaPackage.FTA_LIBRARY: {
				FTALibrary ftaLibrary = (FTALibrary)theEObject;
				T result = caseFTALibrary(ftaLibrary);
				if (result == null) result = caseAbstractLibrary(ftaLibrary);
				if (result == null) result = caseNamedElement(ftaLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTA(FTA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTAElement(FTAElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicEvent(BasicEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intermediate Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntermediateEvent(IntermediateEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopEvent(TopEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalEvent(ConditionalEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dormant Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dormant Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDormantEvent(DormantEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undeveloped Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undeveloped Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndevelopedEvent(UndevelopedEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>House Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>House Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHouseEvent(HouseEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zero Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zero Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZeroEvent(ZeroEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGate(Gate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AND</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAND(AND object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOR(OR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NOT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NOT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNOT(NOT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XOR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXOR(XOR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SEQ</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SEQ</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSEQ(SEQ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>INHIBIT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>INHIBIT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseINHIBIT(INHIBIT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MAJORITY VOTE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MAJORITY VOTE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMAJORITY_VOTE(MAJORITY_VOTE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTATree(FTATree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FTA Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FTA Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFTALibrary(FTALibrary object) {
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

} //FtaSwitch
