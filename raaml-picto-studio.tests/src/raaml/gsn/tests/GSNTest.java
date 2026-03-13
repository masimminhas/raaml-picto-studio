/**
 */
package raaml.gsn.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AnalysisTest;

import raaml.gsn.GSN;
import raaml.gsn.GsnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>GSN</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSNTest extends AnalysisTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GSNTest.class);
	}

	/**
	 * Constructs a new GSN test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSNTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this GSN test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GSN getFixture() {
		return (GSN)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GsnFactory.eINSTANCE.createGSN());
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

} //GSNTest
