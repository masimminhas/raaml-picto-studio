/**
 */
package raaml.stpa.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.stpa.StpaFactory;
import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Undesired Control Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UndesiredControlActionTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UndesiredControlActionTest.class);
	}

	/**
	 * Constructs a new Undesired Control Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UndesiredControlActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Undesired Control Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UndesiredControlAction getFixture() {
		return (UndesiredControlAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StpaFactory.eINSTANCE.createUndesiredControlAction());
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

} //UndesiredControlActionTest
