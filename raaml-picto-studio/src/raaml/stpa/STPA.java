/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.Analysis;
import raaml.core.Hazard;
import raaml.core.ProcessModelFlaw;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STPA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for STPA analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.STPA#getControlStructures <em>Control Structures</em>}</li>
 *   <li>{@link raaml.stpa.STPA#getLosses <em>Losses</em>}</li>
 *   <li>{@link raaml.stpa.STPA#getHazards <em>Hazards</em>}</li>
 *   <li>{@link raaml.stpa.STPA#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 *   <li>{@link raaml.stpa.STPA#getControlFlaws <em>Control Flaws</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getSTPA()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='STPA'"
 * @generated
 */
public interface STPA extends Analysis {
	/**
	 * Returns the value of the '<em><b>Control Structures</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.ControlStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control structures in the system
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Structures</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPA_ControlStructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlStructure> getControlStructures();

	/**
	 * Returns the value of the '<em><b>Losses</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.Loss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * System losses to be prevented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Losses</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPA_Losses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Loss> getLosses();

	/**
	 * Returns the value of the '<em><b>Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.Hazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hazards identified in STPA
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hazards</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPA_Hazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Hazard> getHazards();

	/**
	 * Returns the value of the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.UndesiredControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unsafe control actions identified
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsafe Control Actions</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPA_UnsafeControlActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UndesiredControlAction> getUnsafeControlActions();

	/**
	 * Returns the value of the '<em><b>Control Flaws</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.ProcessModelFlaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Control flaws identified
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Flaws</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPA_ControlFlaws()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessModelFlaw> getControlFlaws();

} // STPA
