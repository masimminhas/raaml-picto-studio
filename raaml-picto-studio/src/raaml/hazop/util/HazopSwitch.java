/**
 */
package raaml.hazop.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import raaml.core.Analysis;
import raaml.core.CoreSafetyElement;
import raaml.core.NamedElement;

import raaml.hazop.*;

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
 * @see raaml.hazop.HazopPackage
 * @generated
 */
public class HazopSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HazopPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazopSwitch() {
		if (modelPackage == null) {
			modelPackage = HazopPackage.eINSTANCE;
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
			case HazopPackage.HAZOP_STUDY: {
				HAZOPStudy hazopStudy = (HAZOPStudy)theEObject;
				T result = caseHAZOPStudy(hazopStudy);
				if (result == null) result = caseAnalysis(hazopStudy);
				if (result == null) result = caseNamedElement(hazopStudy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazopPackage.HAZOP_NODE: {
				HAZOPNode hazopNode = (HAZOPNode)theEObject;
				T result = caseHAZOPNode(hazopNode);
				if (result == null) result = caseCoreSafetyElement(hazopNode);
				if (result == null) result = caseNamedElement(hazopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazopPackage.DEVIATION: {
				Deviation deviation = (Deviation)theEObject;
				T result = caseDeviation(deviation);
				if (result == null) result = caseCoreSafetyElement(deviation);
				if (result == null) result = caseNamedElement(deviation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazopPackage.CAUSE: {
				Cause cause = (Cause)theEObject;
				T result = caseCause(cause);
				if (result == null) result = caseCoreSafetyElement(cause);
				if (result == null) result = caseNamedElement(cause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazopPackage.CONSEQUENCE: {
				Consequence consequence = (Consequence)theEObject;
				T result = caseConsequence(consequence);
				if (result == null) result = caseCoreSafetyElement(consequence);
				if (result == null) result = caseNamedElement(consequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazopPackage.SAFEGUARD: {
				Safeguard safeguard = (Safeguard)theEObject;
				T result = caseSafeguard(safeguard);
				if (result == null) result = caseCoreSafetyElement(safeguard);
				if (result == null) result = caseNamedElement(safeguard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HazopPackage.RECOMMENDATION: {
				Recommendation recommendation = (Recommendation)theEObject;
				T result = caseRecommendation(recommendation);
				if (result == null) result = caseCoreSafetyElement(recommendation);
				if (result == null) result = caseNamedElement(recommendation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAZOP Study</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAZOP Study</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAZOPStudy(HAZOPStudy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HAZOP Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HAZOP Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHAZOPNode(HAZOPNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deviation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviation(Deviation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCause(Cause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsequence(Consequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safeguard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safeguard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafeguard(Safeguard object) {
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

} //HazopSwitch
