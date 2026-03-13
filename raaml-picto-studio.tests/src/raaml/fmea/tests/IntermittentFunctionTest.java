/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractFailureModeTest;

import raaml.fmea.FmeaFactory;
import raaml.fmea.IntermittentFunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Intermittent Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntermittentFunctionTest extends AbstractFailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntermittentFunctionTest.class);
	}

	/**
	 * Constructs a new Intermittent Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermittentFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Intermittent Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntermittentFunction getFixture() {
		return (IntermittentFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createIntermittentFunction());
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

} //IntermittentFunctionTest
