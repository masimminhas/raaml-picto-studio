/**
 */
package raaml.stpa.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AnalysisTest;

import raaml.stpa.STPA;
import raaml.stpa.StpaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>STPA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class STPATest extends AnalysisTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(STPATest.class);
	}

	/**
	 * Constructs a new STPA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this STPA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected STPA getFixture() {
		return (STPA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StpaFactory.eINSTANCE.createSTPA());
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

} //STPATest
