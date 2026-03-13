/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.core.tests.AbstractLibraryTest;

import raaml.fta.FTALibrary;
import raaml.fta.FtaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FTA Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FTALibraryTest extends AbstractLibraryTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FTALibraryTest.class);
	}

	/**
	 * Constructs a new FTA Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTALibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FTA Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FTALibrary getFixture() {
		return (FTALibrary)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createFTALibrary());
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

} //FTALibraryTest
