/**
 */
package raaml.fta;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see raaml.fta.FtaPackage
 * @generated
 */
public interface FtaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtaFactory eINSTANCE = raaml.fta.impl.FtaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FTA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTA</em>'.
	 * @generated
	 */
	FTA createFTA();

	/**
	 * Returns a new object of class '<em>Basic Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Event</em>'.
	 * @generated
	 */
	BasicEvent createBasicEvent();

	/**
	 * Returns a new object of class '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Event</em>'.
	 * @generated
	 */
	IntermediateEvent createIntermediateEvent();

	/**
	 * Returns a new object of class '<em>Top Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Top Event</em>'.
	 * @generated
	 */
	TopEvent createTopEvent();

	/**
	 * Returns a new object of class '<em>Conditional Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Event</em>'.
	 * @generated
	 */
	ConditionalEvent createConditionalEvent();

	/**
	 * Returns a new object of class '<em>Dormant Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dormant Event</em>'.
	 * @generated
	 */
	DormantEvent createDormantEvent();

	/**
	 * Returns a new object of class '<em>Undeveloped Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Undeveloped Event</em>'.
	 * @generated
	 */
	UndevelopedEvent createUndevelopedEvent();

	/**
	 * Returns a new object of class '<em>House Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House Event</em>'.
	 * @generated
	 */
	HouseEvent createHouseEvent();

	/**
	 * Returns a new object of class '<em>Zero Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Zero Event</em>'.
	 * @generated
	 */
	ZeroEvent createZeroEvent();

	/**
	 * Returns a new object of class '<em>AND</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND</em>'.
	 * @generated
	 */
	AND createAND();

	/**
	 * Returns a new object of class '<em>OR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR</em>'.
	 * @generated
	 */
	OR createOR();

	/**
	 * Returns a new object of class '<em>NOT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NOT</em>'.
	 * @generated
	 */
	NOT createNOT();

	/**
	 * Returns a new object of class '<em>XOR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XOR</em>'.
	 * @generated
	 */
	XOR createXOR();

	/**
	 * Returns a new object of class '<em>SEQ</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SEQ</em>'.
	 * @generated
	 */
	SEQ createSEQ();

	/**
	 * Returns a new object of class '<em>INHIBIT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>INHIBIT</em>'.
	 * @generated
	 */
	INHIBIT createINHIBIT();

	/**
	 * Returns a new object of class '<em>MAJORITY VOTE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MAJORITY VOTE</em>'.
	 * @generated
	 */
	MAJORITY_VOTE createMAJORITY_VOTE();

	/**
	 * Returns a new object of class '<em>FTA Tree</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTA Tree</em>'.
	 * @generated
	 */
	FTATree createFTATree();

	/**
	 * Returns a new object of class '<em>FTA Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FTA Library</em>'.
	 * @generated
	 */
	FTALibrary createFTALibrary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FtaPackage getFtaPackage();

} //FtaFactory
