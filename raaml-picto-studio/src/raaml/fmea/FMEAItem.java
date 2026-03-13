/**
 */
package raaml.fmea;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Concrete FMEA item with RPN calculations
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fmea.FMEAItem#getRpnCalculation <em>Rpn Calculation</em>}</li>
 * </ul>
 *
 * @see raaml.fmea.FmeaPackage#getFMEAItem()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='FMEAItem'"
 * @generated
 */
public interface FMEAItem extends AbstractFMEAItem {
	/**
	 * Returns the value of the '<em><b>Rpn Calculation</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fmea.RPNCalculation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpn Calculation</em>' containment reference list.
	 * @see raaml.fmea.FmeaPackage#getFMEAItem_RpnCalculation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RPNCalculation> getRpnCalculation();

} // FMEAItem
