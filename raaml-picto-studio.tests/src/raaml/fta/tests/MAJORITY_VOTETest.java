/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.FtaFactory;
import raaml.fta.MAJORITY_VOTE;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>MAJORITY VOTE</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MAJORITY_VOTETest extends GateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MAJORITY_VOTETest.class);
	}

	/**
	 * Constructs a new MAJORITY VOTE test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MAJORITY_VOTETest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this MAJORITY VOTE test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MAJORITY_VOTE getFixture() {
		return (MAJORITY_VOTE)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createMAJORITY_VOTE());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MAJORITY_VOTETest
