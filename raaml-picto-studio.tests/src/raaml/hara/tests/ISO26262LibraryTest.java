/**
 */
package raaml.hara.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractLibraryTest;

import raaml.hara.HaraFactory;
import raaml.hara.ISO26262Library;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ISO26262 Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ISO26262LibraryTest extends AbstractLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ISO26262LibraryTest.class);
	}

	/**
	 * Constructs a new ISO26262 Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISO26262LibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this ISO26262 Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ISO26262Library getFixture() {
		return (ISO26262Library)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HaraFactory.eINSTANCE.createISO26262Library());
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

} //ISO26262LibraryTest
