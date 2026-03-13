/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.FunctionalSafetyRequirement;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Functional Safety Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalSafetyRequirementTest extends DependabilityRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FunctionalSafetyRequirementTest.class);
	}

	/**
	 * Constructs a new Functional Safety Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalSafetyRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Functional Safety Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FunctionalSafetyRequirement getFixture() {
		return (FunctionalSafetyRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createFunctionalSafetyRequirement());
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

} //FunctionalSafetyRequirementTest
