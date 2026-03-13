/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractFailureModeTest;

import raaml.fmea.FmeaFactory;
import raaml.fmea.LossOfFunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loss Of Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LossOfFunctionTest extends AbstractFailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LossOfFunctionTest.class);
	}

	/**
	 * Constructs a new Loss Of Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LossOfFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loss Of Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LossOfFunction getFixture() {
		return (LossOfFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createLossOfFunction());
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

} //LossOfFunctionTest
