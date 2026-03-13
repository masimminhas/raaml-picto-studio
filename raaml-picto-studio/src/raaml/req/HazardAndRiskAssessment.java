/**
 */
package raaml.req;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard And Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container linking hazard analysis to derived requirements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.HazardAndRiskAssessment#getHaraRequirements <em>Hara Requirements</em>}</li>
 * </ul>
 *
 * @see raaml.req.ReqPackage#getHazardAndRiskAssessment()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='HazardAndRiskAssessment'"
 * @generated
 */
public interface HazardAndRiskAssessment extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Hara Requirements</b></em>' reference list.
	 * The list contents are of type {@link raaml.req.RequirementComponent}.
	 * It is bidirectional and its opposite is '{@link raaml.req.RequirementComponent#getHaraOwner <em>Hara Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hara Requirements</em>' reference list.
	 * @see raaml.req.ReqPackage#getHazardAndRiskAssessment_HaraRequirements()
	 * @see raaml.req.RequirementComponent#getHaraOwner
	 * @model opposite="haraOwner"
	 * @generated
	 */
	EList<RequirementComponent> getHaraRequirements();

} // HazardAndRiskAssessment
