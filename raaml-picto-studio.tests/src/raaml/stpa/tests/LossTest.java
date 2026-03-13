/**
 */
package raaml.stpa.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.stpa.Loss;
import raaml.stpa.StpaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loss</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LossTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LossTest.class);
	}

	/**
	 * Constructs a new Loss test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LossTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loss test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Loss getFixture() {
		return (Loss)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StpaFactory.eINSTANCE.createLoss());
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

} //LossTest
