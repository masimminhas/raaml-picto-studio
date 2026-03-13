/**
 */
package raaml.fta;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reusable library of FTA elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.FTALibrary#getFtaElements <em>Fta Elements</em>}</li>
 *   <li>{@link raaml.fta.FTALibrary#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getFTALibrary()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='FTALibrary'"
 * @generated
 */
public interface FTALibrary extends AbstractLibrary {
	/**
	 * Returns the value of the '<em><b>Fta Elements</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.FTAElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fta Elements</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getFTALibrary_FtaElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTAElement> getFtaElements();

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getFTALibrary_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

} // FTALibrary
