/**
 */
package raaml.req;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.RequirementsModel#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link raaml.req.RequirementsModel#getDerivations <em>Derivations</em>}</li>
 *   <li>{@link raaml.req.RequirementsModel#getSatisfactions <em>Satisfactions</em>}</li>
 *   <li>{@link raaml.req.RequirementsModel#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see raaml.req.ReqPackage#getRequirementsModel()
 * @model
 * @generated
 */
public interface RequirementsModel extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.req.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see raaml.req.ReqPackage#getRequirementsModel_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Derivations</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.req.DeriveRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivations</em>' containment reference list.
	 * @see raaml.req.ReqPackage#getRequirementsModel_Derivations()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeriveRequirement> getDerivations();

	/**
	 * Returns the value of the '<em><b>Satisfactions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.req.Satisfy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfactions</em>' containment reference list.
	 * @see raaml.req.ReqPackage#getRequirementsModel_Satisfactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Satisfy> getSatisfactions();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.req.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see raaml.req.ReqPackage#getRequirementsModel_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

} // RequirementsModel
