/**
 */
package raaml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.RaamlPackage
 * @generated
 */
public interface RaamlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RaamlFactory eINSTANCE = raaml.impl.RaamlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Safety Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Analysis</em>'.
	 * @generated
	 */
	SafetyAnalysis createSafetyAnalysis();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RaamlPackage getRaamlPackage();

} //RaamlFactory
