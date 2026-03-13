/**
 */
package raaml.req.tests;

import junit.textui.TestRunner;

import raaml.req.ASILDecompose;
import raaml.req.ReqFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ASIL Decompose</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASILDecomposeTest extends DeriveRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ASILDecomposeTest.class);
	}

	/**
	 * Constructs a new ASIL Decompose test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILDecomposeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ASIL Decompose test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ASILDecompose getFixture() {
		return (ASILDecompose)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ReqFactory.eINSTANCE.createASILDecompose());
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

} //ASILDecomposeTest
