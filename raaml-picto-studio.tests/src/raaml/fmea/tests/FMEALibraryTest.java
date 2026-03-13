/**
 */
package raaml.fmea.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractLibraryTest;

import raaml.fmea.FMEALibrary;
import raaml.fmea.FmeaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FMEA Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FMEALibraryTest extends AbstractLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FMEALibraryTest.class);
	}

	/**
	 * Constructs a new FMEA Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMEALibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FMEA Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FMEALibrary getFixture() {
		return (FMEALibrary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FmeaFactory.eINSTANCE.createFMEALibrary());
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

} //FMEALibraryTest
