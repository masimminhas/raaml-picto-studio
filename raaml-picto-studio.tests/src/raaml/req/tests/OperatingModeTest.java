/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.OperatingMode;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operating Mode</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatingModeTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperatingModeTest.class);
	}

	/**
	 * Constructs a new Operating Mode test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingModeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operating Mode test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperatingMode getFixture() {
		return (OperatingMode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createOperatingMode());
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

} //OperatingModeTest
