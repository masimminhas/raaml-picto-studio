/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractFailureModeTest;

import raaml.fmea.FmeaFactory;
import raaml.fmea.PartialFunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Partial Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartialFunctionTest extends AbstractFailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PartialFunctionTest.class);
	}

	/**
	 * Constructs a new Partial Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Partial Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PartialFunction getFixture() {
		return (PartialFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createPartialFunction());
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

} //PartialFunctionTest
