/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.fmea.FmeaFactory;
import raaml.fmea.RPNCalculation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>RPN Calculation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RPNCalculationTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RPNCalculationTest.class);
	}

	/**
	 * Constructs a new RPN Calculation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPNCalculationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this RPN Calculation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RPNCalculation getFixture() {
		return (RPNCalculation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createRPNCalculation());
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

} //RPNCalculationTest
