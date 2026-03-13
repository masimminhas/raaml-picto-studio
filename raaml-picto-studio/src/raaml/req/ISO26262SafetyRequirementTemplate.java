/**
 */
package raaml.req;

import raaml.hara.ASIL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO26262 Safety Requirement Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Template for ISO 26262 safety requirements with ASIL and FTTI
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.ISO26262SafetyRequirementTemplate#getASIL <em>ASIL</em>}</li>
 *   <li>{@link raaml.req.ISO26262SafetyRequirementTemplate#getFTTI <em>FTTI</em>}</li>
 * </ul>
 *
 * @see raaml.req.ReqPackage#getISO26262SafetyRequirementTemplate()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ISO26262SafetyRequirementTemplate'"
 * @generated
 */
public interface ISO26262SafetyRequirementTemplate extends DependabilityRequirement {
	/**
	 * Returns the value of the '<em><b>ASIL</b></em>' attribute.
	 * The literals are from the enumeration {@link raaml.hara.ASIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Automotive Safety Integrity Level assigned to this requirement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ASIL</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #setASIL(ASIL)
	 * @see raaml.req.ReqPackage#getISO26262SafetyRequirementTemplate_ASIL()
	 * @model
	 * @generated
	 */
	ASIL getASIL();

	/**
	 * Sets the value of the '{@link raaml.req.ISO26262SafetyRequirementTemplate#getASIL <em>ASIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ASIL</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #getASIL()
	 * @generated
	 */
	void setASIL(ASIL value);

	/**
	 * Returns the value of the '<em><b>FTTI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fault Tolerant Time Interval in milliseconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTTI</em>' attribute.
	 * @see #setFTTI(int)
	 * @see raaml.req.ReqPackage#getISO26262SafetyRequirementTemplate_FTTI()
	 * @model
	 * @generated
	 */
	int getFTTI();

	/**
	 * Sets the value of the '{@link raaml.req.ISO26262SafetyRequirementTemplate#getFTTI <em>FTTI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTTI</em>' attribute.
	 * @see #getFTTI()
	 * @generated
	 */
	void setFTTI(int value);

} // ISO26262SafetyRequirementTemplate
