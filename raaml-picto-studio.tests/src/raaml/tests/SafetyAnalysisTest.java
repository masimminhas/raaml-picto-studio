/**
 */
package raaml.tests;

import junit.textui.TestRunner;

import raaml.RaamlFactory;
import raaml.SafetyAnalysis;

import raaml.core.tests.NamedElementTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safety Analysis</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafetyAnalysisTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafetyAnalysisTest.class);
	}

	/**
	 * Constructs a new Safety Analysis test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyAnalysisTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safety Analysis test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafetyAnalysis getFixture() {
		return (SafetyAnalysis)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RaamlFactory.eINSTANCE.createSafetyAnalysis());
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

} //SafetyAnalysisTest
