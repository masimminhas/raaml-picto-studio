/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.DeriveRequirement;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Derive Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeriveRequirementTest extends AbstractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DeriveRequirementTest.class);
	}

	/**
	 * Constructs a new Derive Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeriveRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Derive Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DeriveRequirement getFixture() {
		return (DeriveRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createDeriveRequirement());
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

} //DeriveRequirementTest
