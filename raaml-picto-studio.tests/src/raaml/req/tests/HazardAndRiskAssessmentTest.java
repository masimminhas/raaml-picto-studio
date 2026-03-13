/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.req.HazardAndRiskAssessment;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hazard And Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HazardAndRiskAssessmentTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HazardAndRiskAssessmentTest.class);
	}

	/**
	 * Constructs a new Hazard And Risk Assessment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HazardAndRiskAssessmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hazard And Risk Assessment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HazardAndRiskAssessment getFixture() {
		return (HazardAndRiskAssessment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createHazardAndRiskAssessment());
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

} //HazardAndRiskAssessmentTest
