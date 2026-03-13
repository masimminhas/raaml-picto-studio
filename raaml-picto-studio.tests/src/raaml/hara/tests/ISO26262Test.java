/**
 */
package raaml.hara.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AnalysisTest;

import raaml.hara.HaraFactory;
import raaml.hara.ISO26262;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ISO26262</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISO26262Test extends AnalysisTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISO26262Test.class);
	}

	/**
	 * Constructs a new ISO26262 test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO26262Test(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ISO26262 test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISO26262 getFixture() {
		return (ISO26262)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HaraFactory.eINSTANCE.createISO26262());
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

} //ISO26262Test
