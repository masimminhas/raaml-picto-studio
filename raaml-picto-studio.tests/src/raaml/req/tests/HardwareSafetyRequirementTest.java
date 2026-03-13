/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.HardwareSafetyRequirement;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hardware Safety Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HardwareSafetyRequirementTest extends DependabilityRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HardwareSafetyRequirementTest.class);
	}

	/**
	 * Constructs a new Hardware Safety Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HardwareSafetyRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hardware Safety Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HardwareSafetyRequirement getFixture() {
		return (HardwareSafetyRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createHardwareSafetyRequirement());
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

} //HardwareSafetyRequirementTest
