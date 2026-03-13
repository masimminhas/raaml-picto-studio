/**
 */
package raaml.hara;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.hara.HaraPackage
 * @generated
 */
public interface HaraFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HaraFactory eINSTANCE = raaml.hara.impl.HaraFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ISO26262</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISO26262</em>'.
	 * @generated
	 */
	ISO26262 createISO26262();

	/**
	 * Returns a new object of class '<em>Operational Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operational Situation</em>'.
	 * @generated
	 */
	OperationalSituation createOperationalSituation();

	/**
	 * Returns a new object of class '<em>Malfunctioning Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Malfunctioning Behaviour</em>'.
	 * @generated
	 */
	MalfunctioningBehaviour createMalfunctioningBehaviour();

	/**
	 * Returns a new object of class '<em>Verified</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verified</em>'.
	 * @generated
	 */
	Verified createVerified();

	/**
	 * Returns a new object of class '<em>Confirmed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confirmed</em>'.
	 * @generated
	 */
	Confirmed createConfirmed();

	/**
	 * Returns a new object of class '<em>ASIL Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASIL Assignment</em>'.
	 * @generated
	 */
	ASILAssignment createASILAssignment();

	/**
	 * Returns a new object of class '<em>ISO26262 Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ISO26262 Library</em>'.
	 * @generated
	 */
	ISO26262Library createISO26262Library();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HaraPackage getHaraPackage();

} //HaraFactory
