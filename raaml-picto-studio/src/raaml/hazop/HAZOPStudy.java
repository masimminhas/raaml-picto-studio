/**
 */
package raaml.hazop;

import org.eclipse.emf.common.util.EList;

import raaml.core.Analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAZOP Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A complete HAZOP study covering one or more system nodes per IEC 61882:2016
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hazop.HAZOPStudy#getStudyDate <em>Study Date</em>}</li>
 *   <li>{@link raaml.hazop.HAZOPStudy#getStandardReference <em>Standard Reference</em>}</li>
 *   <li>{@link raaml.hazop.HAZOPStudy#getNodes <em>Nodes</em>}</li>
 * </ul>
 *
 * @see raaml.hazop.HazopPackage#getHAZOPStudy()
 * @model annotation="http://edu.kit.sdq/raaml/native-ecore origin='IEC 61882:2016 -- no UML profile equivalent'"
 * @generated
 */
public interface HAZOPStudy extends Analysis {
	/**
	 * Returns the value of the '<em><b>Study Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Date</em>' attribute.
	 * @see #setStudyDate(String)
	 * @see raaml.hazop.HazopPackage#getHAZOPStudy_StudyDate()
	 * @model
	 * @generated
	 */
	String getStudyDate();

	/**
	 * Sets the value of the '{@link raaml.hazop.HAZOPStudy#getStudyDate <em>Study Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Date</em>' attribute.
	 * @see #getStudyDate()
	 * @generated
	 */
	void setStudyDate(String value);

	/**
	 * Returns the value of the '<em><b>Standard Reference</b></em>' attribute.
	 * The default value is <code>"IEC 61882:2016"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Reference</em>' attribute.
	 * @see #setStandardReference(String)
	 * @see raaml.hazop.HazopPackage#getHAZOPStudy_StandardReference()
	 * @model default="IEC 61882:2016"
	 * @generated
	 */
	String getStandardReference();

	/**
	 * Sets the value of the '{@link raaml.hazop.HAZOPStudy#getStandardReference <em>Standard Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Reference</em>' attribute.
	 * @see #getStandardReference()
	 * @generated
	 */
	void setStandardReference(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hazop.HAZOPNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see raaml.hazop.HazopPackage#getHAZOPStudy_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<HAZOPNode> getNodes();

} // HAZOPStudy
