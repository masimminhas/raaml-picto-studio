/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STPA Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reusable library of STPA elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.STPALibrary#getControlStructures <em>Control Structures</em>}</li>
 *   <li>{@link raaml.stpa.STPALibrary#getControlActions <em>Control Actions</em>}</li>
 *   <li>{@link raaml.stpa.STPALibrary#getUnsafeControlActions <em>Unsafe Control Actions</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getSTPALibrary()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='STPALibrary'"
 * @generated
 */
public interface STPALibrary extends AbstractLibrary {
	/**
	 * Returns the value of the '<em><b>Control Structures</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.ControlStructure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Structures</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPALibrary_ControlStructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlStructure> getControlStructures();

	/**
	 * Returns the value of the '<em><b>Control Actions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.ControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Actions</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPALibrary_ControlActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlAction> getControlActions();

	/**
	 * Returns the value of the '<em><b>Unsafe Control Actions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.stpa.UndesiredControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsafe Control Actions</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getSTPALibrary_UnsafeControlActions()
	 * @model containment="true"
	 * @generated
	 */
	EList<UndesiredControlAction> getUnsafeControlActions();

} // STPALibrary
