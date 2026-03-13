/**
 */
package raaml.fmea;

import org.eclipse.emf.common.util.EList;

import raaml.core.Analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for FMEA analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.FMEA#getFmeaItems <em>Fmea Items</em>}</li>
 * </ul>
 *
 * @see raaml.fmea.FmeaPackage#getFMEA()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='FMEA'"
 * @generated
 */
public interface FMEA extends Analysis {
	/**
	 * Returns the value of the '<em><b>Fmea Items</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fmea.FMEAItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmea Items</em>' containment reference list.
	 * @see raaml.fmea.FmeaPackage#getFMEA_FmeaItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMEAItem> getFmeaItems();

} // FMEA
