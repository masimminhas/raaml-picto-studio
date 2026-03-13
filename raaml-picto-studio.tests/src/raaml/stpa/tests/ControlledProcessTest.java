/**
 */
package raaml.stpa.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.stpa.ControlledProcess;
import raaml.stpa.StpaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Controlled Process</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlledProcessTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ControlledProcessTest.class);
	}

	/**
	 * Constructs a new Controlled Process test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlledProcessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Controlled Process test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ControlledProcess getFixture() {
		return (ControlledProcess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StpaFactory.eINSTANCE.createControlledProcess());
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

} //ControlledProcessTest
