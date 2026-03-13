/**
 */
package raaml.hara;

import org.eclipse.emf.common.util.EList;

import raaml.core.Analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISO26262</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ISO 26262 HARA container
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.ISO26262#getMalfunctioningBehaviors <em>Malfunctioning Behaviors</em>}</li>
 *   <li>{@link raaml.hara.ISO26262#getOperationalSituations <em>Operational Situations</em>}</li>
 *   <li>{@link raaml.hara.ISO26262#getConfirmedItems <em>Confirmed Items</em>}</li>
 *   <li>{@link raaml.hara.ISO26262#getVerifiedItems <em>Verified Items</em>}</li>
 *   <li>{@link raaml.hara.ISO26262#getAsilAssignments <em>Asil Assignments</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getISO26262()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='ISO26262'"
 * @generated
 */
public interface ISO26262 extends Analysis {
	/**
	 * Returns the value of the '<em><b>Malfunctioning Behaviors</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.MalfunctioningBehaviour}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Malfunctioning Behaviors</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262_MalfunctioningBehaviors()
	 * @model containment="true"
	 * @generated
	 */
	EList<MalfunctioningBehaviour> getMalfunctioningBehaviors();

	/**
	 * Returns the value of the '<em><b>Operational Situations</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.OperationalSituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operational Situations</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262_OperationalSituations()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalSituation> getOperationalSituations();

	/**
	 * Returns the value of the '<em><b>Confirmed Items</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.Confirmed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirmed Items</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262_ConfirmedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Confirmed> getConfirmedItems();

	/**
	 * Returns the value of the '<em><b>Verified Items</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.Verified}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified Items</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262_VerifiedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<Verified> getVerifiedItems();

	/**
	 * Returns the value of the '<em><b>Asil Assignments</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.ASILAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asil Assignments</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getISO26262_AsilAssignments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ASILAssignment> getAsilAssignments();

} // ISO26262
