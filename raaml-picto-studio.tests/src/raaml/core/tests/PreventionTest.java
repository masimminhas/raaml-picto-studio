/**
 */
package raaml.core.tests;

import junit.textui.TestRunner;

import raaml.core.CoreFactory;
import raaml.core.Prevention;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Prevention</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreventionTest extends ControllingMeasureTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PreventionTest.class);
	}

	/**
	 * Constructs a new Prevention test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreventionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Prevention test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Prevention getFixture() {
		return (Prevention)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createPrevention());
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

} //PreventionTest
