/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.ISO26262SafetyRequirementTemplate;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ISO26262 Safety Requirement Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISO26262SafetyRequirementTemplateTest extends DependabilityRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISO26262SafetyRequirementTemplateTest.class);
	}

	/**
	 * Constructs a new ISO26262 Safety Requirement Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO26262SafetyRequirementTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ISO26262 Safety Requirement Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISO26262SafetyRequirementTemplate getFixture() {
		return (ISO26262SafetyRequirementTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createISO26262SafetyRequirementTemplate());
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

} //ISO26262SafetyRequirementTemplateTest
