/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AnalysisTest;

import raaml.fta.FTA;
import raaml.fta.FtaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FTA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FTATest extends AnalysisTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FTATest.class);
	}

	/**
	 * Constructs a new FTA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FTA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FTA getFixture() {
		return (FTA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createFTA());
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

} //FTATest
