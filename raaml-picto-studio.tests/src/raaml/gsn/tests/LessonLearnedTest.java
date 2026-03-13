/**
 */
package raaml.gsn.tests;

import junit.textui.TestRunner;

import raaml.gsn.GsnFactory;
import raaml.gsn.LessonLearned;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lesson Learned</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LessonLearnedTest extends RationaleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LessonLearnedTest.class);
	}

	/**
	 * Constructs a new Lesson Learned test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LessonLearnedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lesson Learned test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LessonLearned getFixture() {
		return (LessonLearned)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GsnFactory.eINSTANCE.createLessonLearned());
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

} //LessonLearnedTest
