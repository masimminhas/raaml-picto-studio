/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractFailureModeTest;

import raaml.fmea.FmeaFactory;
import raaml.fmea.UnintendedFunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Unintended Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnintendedFunctionTest extends AbstractFailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UnintendedFunctionTest.class);
	}

	/**
	 * Constructs a new Unintended Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnintendedFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Unintended Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UnintendedFunction getFixture() {
		return (UnintendedFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createUnintendedFunction());
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

} //UnintendedFunctionTest
