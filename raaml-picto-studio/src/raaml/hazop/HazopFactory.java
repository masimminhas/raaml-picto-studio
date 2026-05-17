/**
 */
package raaml.hazop;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.hazop.HazopPackage
 * @generated
 */
public interface HazopFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HazopFactory eINSTANCE = raaml.hazop.impl.HazopFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HAZOP Study</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAZOP Study</em>'.
	 * @generated
	 */
	HAZOPStudy createHAZOPStudy();

	/**
	 * Returns a new object of class '<em>HAZOP Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HAZOP Node</em>'.
	 * @generated
	 */
	HAZOPNode createHAZOPNode();

	/**
	 * Returns a new object of class '<em>Deviation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deviation</em>'.
	 * @generated
	 */
	Deviation createDeviation();

	/**
	 * Returns a new object of class '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause</em>'.
	 * @generated
	 */
	Cause createCause();

	/**
	 * Returns a new object of class '<em>Consequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Consequence</em>'.
	 * @generated
	 */
	Consequence createConsequence();

	/**
	 * Returns a new object of class '<em>Safeguard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safeguard</em>'.
	 * @generated
	 */
	Safeguard createSafeguard();

	/**
	 * Returns a new object of class '<em>Recommendation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recommendation</em>'.
	 * @generated
	 */
	Recommendation createRecommendation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HazopPackage getHazopPackage();

} //HazopFactory
