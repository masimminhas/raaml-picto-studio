/**
 */
package raaml.stpa.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.stpa.Feedback;
import raaml.stpa.StpaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FeedbackTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FeedbackTest.class);
	}

	/**
	 * Constructs a new Feedback test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeedbackTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Feedback test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Feedback getFixture() {
		return (Feedback)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StpaFactory.eINSTANCE.createFeedback());
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

} //FeedbackTest
