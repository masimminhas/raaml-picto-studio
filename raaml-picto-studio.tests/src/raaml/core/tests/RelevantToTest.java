/**
 */
package raaml.core.tests;

import junit.textui.TestRunner;

import raaml.core.CoreFactory;
import raaml.core.RelevantTo;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relevant To</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelevantToTest extends DirectedRelationshipTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelevantToTest.class);
	}

	/**
	 * Constructs a new Relevant To test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelevantToTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Relevant To test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RelevantTo getFixture() {
		return (RelevantTo)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createRelevantTo());
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

} //RelevantToTest
