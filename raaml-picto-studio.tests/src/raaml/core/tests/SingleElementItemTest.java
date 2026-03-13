/**
 */
package raaml.core.tests;

import junit.textui.TestRunner;

import raaml.core.CoreFactory;
import raaml.core.SingleElementItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Single Element Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SingleElementItemTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SingleElementItemTest.class);
	}

	/**
	 * Constructs a new Single Element Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleElementItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Single Element Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SingleElementItem getFixture() {
		return (SingleElementItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createSingleElementItem());
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

} //SingleElementItemTest
