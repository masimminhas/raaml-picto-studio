/**
 */
package raaml.core.tests;

import junit.textui.TestRunner;

import raaml.core.CoreFactory;
import raaml.core.ProcessModelFlaw;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Process Model Flaw</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessModelFlawTest extends AnySituationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProcessModelFlawTest.class);
	}

	/**
	 * Constructs a new Process Model Flaw test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessModelFlawTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Process Model Flaw test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProcessModelFlaw getFixture() {
		return (ProcessModelFlaw)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createProcessModelFlaw());
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

} //ProcessModelFlawTest
