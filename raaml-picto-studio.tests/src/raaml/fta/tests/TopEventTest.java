/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.FtaFactory;
import raaml.fta.TopEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Top Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TopEventTest.class);
	}

	/**
	 * Constructs a new Top Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Top Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TopEvent getFixture() {
		return (TopEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createTopEvent());
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

} //TopEventTest
