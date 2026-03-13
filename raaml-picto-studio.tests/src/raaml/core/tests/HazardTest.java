/**
 */
package raaml.core.tests;

import junit.textui.TestRunner;

import raaml.core.CoreFactory;
import raaml.core.Hazard;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hazard</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardTest extends SituationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HazardTest.class);
	}

	/**
	 * Constructs a new Hazard test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hazard test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Hazard getFixture() {
		return (Hazard)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createHazard());
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

} //HazardTest
