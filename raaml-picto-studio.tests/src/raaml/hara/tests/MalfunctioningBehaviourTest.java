/**
 */
package raaml.hara.tests;

import junit.textui.TestRunner;

import raaml.core.tests.FailureModeTest;

import raaml.hara.HaraFactory;
import raaml.hara.MalfunctioningBehaviour;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Malfunctioning Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MalfunctioningBehaviourTest extends FailureModeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MalfunctioningBehaviourTest.class);
	}

	/**
	 * Constructs a new Malfunctioning Behaviour test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MalfunctioningBehaviourTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Malfunctioning Behaviour test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MalfunctioningBehaviour getFixture() {
		return (MalfunctioningBehaviour)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HaraFactory.eINSTANCE.createMalfunctioningBehaviour());
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

} //MalfunctioningBehaviourTest
