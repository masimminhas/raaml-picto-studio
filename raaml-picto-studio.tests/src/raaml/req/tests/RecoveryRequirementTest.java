/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.RecoveryRequirement;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Recovery Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecoveryRequirementTest extends SatisfyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RecoveryRequirementTest.class);
	}

	/**
	 * Constructs a new Recovery Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecoveryRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Recovery Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RecoveryRequirement getFixture() {
		return (RecoveryRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createRecoveryRequirement());
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

} //RecoveryRequirementTest
