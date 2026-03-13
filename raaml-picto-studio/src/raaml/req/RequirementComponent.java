/**
 */
package raaml.req;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for all requirement-related components
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.RequirementComponent#getHaraOwner <em>Hara Owner</em>}</li>
 * </ul>
 *
 * @see raaml.req.ReqPackage#getRequirementComponent()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface RequirementComponent extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Hara Owner</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link raaml.req.HazardAndRiskAssessment#getHaraRequirements <em>Hara Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hara Owner</em>' reference.
	 * @see #setHaraOwner(HazardAndRiskAssessment)
	 * @see raaml.req.ReqPackage#getRequirementComponent_HaraOwner()
	 * @see raaml.req.HazardAndRiskAssessment#getHaraRequirements
	 * @model opposite="haraRequirements"
	 * @generated
	 */
	HazardAndRiskAssessment getHaraOwner();

	/**
	 * Sets the value of the '{@link raaml.req.RequirementComponent#getHaraOwner <em>Hara Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hara Owner</em>' reference.
	 * @see #getHaraOwner()
	 * @generated
	 */
	void setHaraOwner(HazardAndRiskAssessment value);

} // RequirementComponent
