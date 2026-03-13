/**
 */
package raaml.req;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.req.ReqPackage
 * @generated
 */
public interface ReqFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReqFactory eINSTANCE = raaml.req.impl.ReqFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Derive Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derive Requirement</em>'.
	 * @generated
	 */
	DeriveRequirement createDeriveRequirement();

	/**
	 * Returns a new object of class '<em>Independence Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Independence Requirement</em>'.
	 * @generated
	 */
	IndependenceRequirement createIndependenceRequirement();

	/**
	 * Returns a new object of class '<em>ASIL Decompose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASIL Decompose</em>'.
	 * @generated
	 */
	ASILDecompose createASILDecompose();

	/**
	 * Returns a new object of class '<em>Satisfy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satisfy</em>'.
	 * @generated
	 */
	Satisfy createSatisfy();

	/**
	 * Returns a new object of class '<em>User Info Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Info Requirement</em>'.
	 * @generated
	 */
	UserInfoRequirement createUserInfoRequirement();

	/**
	 * Returns a new object of class '<em>Recovery Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recovery Requirement</em>'.
	 * @generated
	 */
	RecoveryRequirement createRecoveryRequirement();

	/**
	 * Returns a new object of class '<em>Dependability Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependability Requirement</em>'.
	 * @generated
	 */
	DependabilityRequirement createDependabilityRequirement();

	/**
	 * Returns a new object of class '<em>Functional Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Safety Requirement</em>'.
	 * @generated
	 */
	FunctionalSafetyRequirement createFunctionalSafetyRequirement();

	/**
	 * Returns a new object of class '<em>Software Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software Safety Requirement</em>'.
	 * @generated
	 */
	SoftwareSafetyRequirement createSoftwareSafetyRequirement();

	/**
	 * Returns a new object of class '<em>Hardware Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hardware Safety Requirement</em>'.
	 * @generated
	 */
	HardwareSafetyRequirement createHardwareSafetyRequirement();

	/**
	 * Returns a new object of class '<em>Technical Safety Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technical Safety Requirement</em>'.
	 * @generated
	 */
	TechnicalSafetyRequirement createTechnicalSafetyRequirement();

	/**
	 * Returns a new object of class '<em>Safety Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Goal</em>'.
	 * @generated
	 */
	SafetyGoal createSafetyGoal();

	/**
	 * Returns a new object of class '<em>Safe State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safe State</em>'.
	 * @generated
	 */
	SafeState createSafeState();

	/**
	 * Returns a new object of class '<em>Operating Mode</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operating Mode</em>'.
	 * @generated
	 */
	OperatingMode createOperatingMode();

	/**
	 * Returns a new object of class '<em>Hazard And Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard And Risk Assessment</em>'.
	 * @generated
	 */
	HazardAndRiskAssessment createHazardAndRiskAssessment();

	/**
	 * Returns a new object of class '<em>ISO26262 Safety Requirement Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISO26262 Safety Requirement Template</em>'.
	 * @generated
	 */
	ISO26262SafetyRequirementTemplate createISO26262SafetyRequirementTemplate();

	/**
	 * Returns a new object of class '<em>Requirements Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirements Model</em>'.
	 * @generated
	 */
	RequirementsModel createRequirementsModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReqPackage getReqPackage();

} //ReqFactory
