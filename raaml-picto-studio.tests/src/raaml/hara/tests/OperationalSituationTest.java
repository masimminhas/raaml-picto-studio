/**
 */
package raaml.hara.tests;

import junit.textui.TestRunner;

import raaml.core.tests.SituationTest;

import raaml.hara.HaraFactory;
import raaml.hara.OperationalSituation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operational Situation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationalSituationTest extends SituationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationalSituationTest.class);
	}

	/**
	 * Constructs a new Operational Situation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationalSituationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operational Situation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationalSituation getFixture() {
		return (OperationalSituation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HaraFactory.eINSTANCE.createOperationalSituation());
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

} //OperationalSituationTest
