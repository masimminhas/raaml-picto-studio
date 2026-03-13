/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.DormantEvent;
import raaml.fta.FtaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dormant Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DormantEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DormantEventTest.class);
	}

	/**
	 * Constructs a new Dormant Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DormantEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Dormant Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DormantEvent getFixture() {
		return (DormantEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createDormantEvent());
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

} //DormantEventTest
