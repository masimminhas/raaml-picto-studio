/**
 */
package raaml.library.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractLibraryTest;

import raaml.library.GeneralLibrary;
import raaml.library.LibraryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>General Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeneralLibraryTest extends AbstractLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GeneralLibraryTest.class);
	}

	/**
	 * Constructs a new General Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralLibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this General Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GeneralLibrary getFixture() {
		return (GeneralLibrary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LibraryFactory.eINSTANCE.createGeneralLibrary());
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

} //GeneralLibraryTest
