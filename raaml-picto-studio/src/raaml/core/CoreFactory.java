/**
 */
package raaml.core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.core.CorePackage
 * @generated
 */
public interface CoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreFactory eINSTANCE = raaml.core.impl.CoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Situation</em>'.
	 * @generated
	 */
	Situation createSituation();

	/**
	 * Returns a new object of class '<em>Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure Mode</em>'.
	 * @generated
	 */
	FailureMode createFailureMode();

	/**
	 * Returns a new object of class '<em>Hazard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard</em>'.
	 * @generated
	 */
	Hazard createHazard();

	/**
	 * Returns a new object of class '<em>Error</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error</em>'.
	 * @generated
	 */
	Error createError();

	/**
	 * Returns a new object of class '<em>Fault</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fault</em>'.
	 * @generated
	 */
	Fault createFault();

	/**
	 * Returns a new object of class '<em>Detection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Detection</em>'.
	 * @generated
	 */
	Detection createDetection();

	/**
	 * Returns a new object of class '<em>Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommendation</em>'.
	 * @generated
	 */
	Recommendation createRecommendation();

	/**
	 * Returns a new object of class '<em>Mitigation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mitigation</em>'.
	 * @generated
	 */
	Mitigation createMitigation();

	/**
	 * Returns a new object of class '<em>Prevention</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prevention</em>'.
	 * @generated
	 */
	Prevention createPrevention();

	/**
	 * Returns a new object of class '<em>Failure State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failure State</em>'.
	 * @generated
	 */
	FailureState createFailureState();

	/**
	 * Returns a new object of class '<em>Relevant To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relevant To</em>'.
	 * @generated
	 */
	RelevantTo createRelevantTo();

	/**
	 * Returns a new object of class '<em>Present In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Present In</em>'.
	 * @generated
	 */
	PresentIn createPresentIn();

	/**
	 * Returns a new object of class '<em>Violates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Violates</em>'.
	 * @generated
	 */
	Violates createViolates();

	/**
	 * Returns a new object of class '<em>Single Element Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Element Item</em>'.
	 * @generated
	 */
	SingleElementItem createSingleElementItem();

	/**
	 * Returns a new object of class '<em>Element Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Group</em>'.
	 * @generated
	 */
	ElementGroup createElementGroup();

	/**
	 * Returns a new object of class '<em>Element Group Based Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Group Based Item</em>'.
	 * @generated
	 */
	ElementGroupBasedItem createElementGroupBasedItem();

	/**
	 * Returns a new object of class '<em>Process Model Flaw</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process Model Flaw</em>'.
	 * @generated
	 */
	ProcessModelFlaw createProcessModelFlaw();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CorePackage getCorePackage();

} //CoreFactory
