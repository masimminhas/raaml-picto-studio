/**
 */
package raaml.hara.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.hara.Confirmed;
import raaml.hara.HaraFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Confirmed</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfirmedTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfirmedTest.class);
	}

	/**
	 * Constructs a new Confirmed test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Confirmed test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Confirmed getFixture() {
		return (Confirmed)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HaraFactory.eINSTANCE.createConfirmed());
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

} //ConfirmedTest
