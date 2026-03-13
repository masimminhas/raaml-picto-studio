/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractFailureModeTest;

import raaml.fmea.ExceedingFunction;
import raaml.fmea.FmeaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Exceeding Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExceedingFunctionTest extends AbstractFailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ExceedingFunctionTest.class);
	}

	/**
	 * Constructs a new Exceeding Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceedingFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Exceeding Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ExceedingFunction getFixture() {
		return (ExceedingFunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createExceedingFunction());
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

} //ExceedingFunctionTest
