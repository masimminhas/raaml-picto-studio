/**
 */
package raaml.stpa.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractLibraryTest;

import raaml.stpa.STPALibrary;
import raaml.stpa.StpaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>STPA Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class STPALibraryTest extends AbstractLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(STPALibraryTest.class);
	}

	/**
	 * Constructs a new STPA Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STPALibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this STPA Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected STPALibrary getFixture() {
		return (STPALibrary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StpaFactory.eINSTANCE.createSTPALibrary());
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

} //STPALibraryTest
