/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractFailureModeTest;

import raaml.fmea.DegradationOfFunction;
import raaml.fmea.FmeaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Degradation Of Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DegradationOfFunctionTest extends AbstractFailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DegradationOfFunctionTest.class);
	}

	/**
	 * Constructs a new Degradation Of Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DegradationOfFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Degradation Of Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DegradationOfFunction getFixture() {
		return (DegradationOfFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createDegradationOfFunction());
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

} //DegradationOfFunctionTest
