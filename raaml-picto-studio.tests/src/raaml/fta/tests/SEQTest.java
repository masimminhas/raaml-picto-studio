/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.fta.FtaFactory;
import raaml.fta.SEQ;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SEQ</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SEQTest extends GateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SEQTest.class);
	}

	/**
	 * Constructs a new SEQ test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SEQ test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SEQ getFixture() {
		return (SEQ)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createSEQ());
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

} //SEQTest
