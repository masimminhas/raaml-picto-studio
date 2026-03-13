/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.FtaFactory;
import raaml.fta.ZeroEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Zero Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZeroEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ZeroEventTest.class);
	}

	/**
	 * Constructs a new Zero Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZeroEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Zero Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ZeroEvent getFixture() {
		return (ZeroEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createZeroEvent());
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

} //ZeroEventTest
