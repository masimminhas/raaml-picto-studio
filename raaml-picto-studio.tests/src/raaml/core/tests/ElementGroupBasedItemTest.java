/**
 */
package raaml.core.tests;

import junit.textui.TestRunner;

import raaml.core.CoreFactory;
import raaml.core.ElementGroupBasedItem;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Element Group Based Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementGroupBasedItemTest extends ItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementGroupBasedItemTest.class);
	}

	/**
	 * Constructs a new Element Group Based Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementGroupBasedItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element Group Based Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ElementGroupBasedItem getFixture() {
		return (ElementGroupBasedItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CoreFactory.eINSTANCE.createElementGroupBasedItem());
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

} //ElementGroupBasedItemTest
