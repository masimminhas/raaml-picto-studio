/**
 */
package raaml.gsn.tests;

import junit.textui.TestRunner;

import raaml.gsn.GsnFactory;
import raaml.gsn.Strategy;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StrategyTest extends GSNArgumentNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StrategyTest.class);
	}

	/**
	 * Constructs a new Strategy test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrategyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Strategy test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Strategy getFixture() {
		return (Strategy)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GsnFactory.eINSTANCE.createStrategy());
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

} //StrategyTest
