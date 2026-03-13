/**
 */
package raaml.fmea;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reusable library of FMEA elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.FMEALibrary#getAbstractFMEAItems <em>Abstract FMEA Items</em>}</li>
 * </ul>
 *
 * @see raaml.fmea.FmeaPackage#getFMEALibrary()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='FMEALibrary'"
 * @generated
 */
public interface FMEALibrary extends AbstractLibrary {
	/**
	 * Returns the value of the '<em><b>Abstract FMEA Items</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fmea.AbstractFMEAItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract FMEA Items</em>' containment reference list.
	 * @see raaml.fmea.FmeaPackage#getFMEALibrary_AbstractFMEAItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractFMEAItem> getAbstractFMEAItems();

} // FMEALibrary
