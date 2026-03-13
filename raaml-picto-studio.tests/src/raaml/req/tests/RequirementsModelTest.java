/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.req.ReqFactory;
import raaml.req.RequirementsModel;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Requirements Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementsModelTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RequirementsModelTest.class);
	}

	/**
	 * Constructs a new Requirements Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Requirements Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RequirementsModel getFixture() {
		return (RequirementsModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createRequirementsModel());
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

} //RequirementsModelTest
