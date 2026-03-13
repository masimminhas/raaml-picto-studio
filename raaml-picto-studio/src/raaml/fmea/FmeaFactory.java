/**
 */
package raaml.fmea;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.fmea.FmeaPackage
 * @generated
 */
public interface FmeaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmeaFactory eINSTANCE = raaml.fmea.impl.FmeaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FMEA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMEA</em>'.
	 * @generated
	 */
	FMEA createFMEA();

	/**
	 * Returns a new object of class '<em>RPN Calculation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RPN Calculation</em>'.
	 * @generated
	 */
	RPNCalculation createRPNCalculation();

	/**
	 * Returns a new object of class '<em>FMEA Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMEA Item</em>'.
	 * @generated
	 */
	FMEAItem createFMEAItem();

	/**
	 * Returns a new object of class '<em>Loss Of Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loss Of Function</em>'.
	 * @generated
	 */
	LossOfFunction createLossOfFunction();

	/**
	 * Returns a new object of class '<em>Degradation Of Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Degradation Of Function</em>'.
	 * @generated
	 */
	DegradationOfFunction createDegradationOfFunction();

	/**
	 * Returns a new object of class '<em>Intermittent Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermittent Function</em>'.
	 * @generated
	 */
	IntermittentFunction createIntermittentFunction();

	/**
	 * Returns a new object of class '<em>Partial Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partial Function</em>'.
	 * @generated
	 */
	PartialFunction createPartialFunction();

	/**
	 * Returns a new object of class '<em>Exceeding Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exceeding Function</em>'.
	 * @generated
	 */
	ExceedingFunction createExceedingFunction();

	/**
	 * Returns a new object of class '<em>Unintended Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unintended Function</em>'.
	 * @generated
	 */
	UnintendedFunction createUnintendedFunction();

	/**
	 * Returns a new object of class '<em>Delayed Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delayed Function</em>'.
	 * @generated
	 */
	DelayedFunction createDelayedFunction();

	/**
	 * Returns a new object of class '<em>FMEA Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FMEA Library</em>'.
	 * @generated
	 */
	FMEALibrary createFMEALibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FmeaPackage getFmeaPackage();

} //FmeaFactory
