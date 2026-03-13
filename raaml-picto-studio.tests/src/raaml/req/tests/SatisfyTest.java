/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.ReqFactory;
import raaml.req.Satisfy;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Satisfy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SatisfyTest extends AbstractionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SatisfyTest.class);
	}

	/**
	 * Constructs a new Satisfy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Satisfy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Satisfy getFixture() {
		return (Satisfy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createSatisfy());
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

} //SatisfyTest
