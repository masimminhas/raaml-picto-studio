/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.FtaFactory;
import raaml.fta.INHIBIT;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>INHIBIT</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class INHIBITTest extends GateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(INHIBITTest.class);
	}

	/**
	 * Constructs a new INHIBIT test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INHIBITTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this INHIBIT test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected INHIBIT getFixture() {
		return (INHIBIT)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createINHIBIT());
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

} //INHIBITTest
