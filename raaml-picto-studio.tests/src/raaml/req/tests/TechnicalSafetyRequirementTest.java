/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.ReqFactory;
import raaml.req.TechnicalSafetyRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Technical Safety Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TechnicalSafetyRequirementTest extends DependabilityRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TechnicalSafetyRequirementTest.class);
	}

	/**
	 * Constructs a new Technical Safety Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechnicalSafetyRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Technical Safety Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TechnicalSafetyRequirement getFixture() {
		return (TechnicalSafetyRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createTechnicalSafetyRequirement());
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

} //TechnicalSafetyRequirementTest
