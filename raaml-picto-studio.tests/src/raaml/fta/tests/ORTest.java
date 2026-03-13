/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.FtaFactory;
import raaml.fta.OR;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OR</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ORTest extends GateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ORTest.class);
	}

	/**
	 * Constructs a new OR test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OR test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OR getFixture() {
		return (OR)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createOR());
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

} //ORTest
