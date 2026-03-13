/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.ReqFactory;
import raaml.req.SafetyGoal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Goal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyGoalTest extends DependabilityRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyGoalTest.class);
	}

	/**
	 * Constructs a new Safety Goal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyGoalTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Goal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyGoal getFixture() {
		return (SafetyGoal)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createSafetyGoal());
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

} //SafetyGoalTest
