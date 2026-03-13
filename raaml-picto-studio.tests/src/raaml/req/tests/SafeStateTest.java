/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.ReqFactory;
import raaml.req.SafeState;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Safe State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SafeStateTest extends DependencyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SafeStateTest.class);
	}

	/**
	 * Constructs a new Safe State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafeStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Safe State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SafeState getFixture() {
		return (SafeState)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createSafeState());
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

} //SafeStateTest
