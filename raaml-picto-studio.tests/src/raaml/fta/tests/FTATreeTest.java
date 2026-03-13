/**
 */
package raaml.fta.tests;

import junit.textui.TestRunner;

import raaml.core.tests.CoreSafetyElementTest;

import raaml.fta.FTATree;
import raaml.fta.FtaFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FTA Tree</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FTATreeTest extends CoreSafetyElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FTATreeTest.class);
	}

	/**
	 * Constructs a new FTA Tree test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTATreeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FTA Tree test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FTATree getFixture() {
		return (FTATree)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FtaFactory.eINSTANCE.createFTATree());
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

} //FTATreeTest
