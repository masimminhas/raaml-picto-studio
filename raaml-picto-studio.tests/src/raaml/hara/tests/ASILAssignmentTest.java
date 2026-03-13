/**
 */
package raaml.hara.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.hara.ASILAssignment;
import raaml.hara.HaraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ASIL Assignment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASILAssignmentTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ASILAssignmentTest.class);
	}

	/**
	 * Constructs a new ASIL Assignment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASILAssignmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ASIL Assignment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ASILAssignment getFixture() {
		return (ASILAssignment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HaraFactory.eINSTANCE.createASILAssignment());
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

} //ASILAssignmentTest
