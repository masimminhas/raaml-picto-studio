/**
 */
package raaml.fta;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MAJORITY VOTE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * K-out-of-N voting gate
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.MAJORITY_VOTE#getM <em>M</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getMAJORITY_VOTE()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='MAJORITY_VOTE'"
 * @generated
 */
public interface MAJORITY_VOTE extends Gate {
	/**
	 * Returns the value of the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Threshold m in m-out-of-n voting
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>M</em>' attribute.
	 * @see #setM(int)
	 * @see raaml.fta.FtaPackage#getMAJORITY_VOTE_M()
	 * @model
	 * @generated
	 */
	int getM();

	/**
	 * Sets the value of the '{@link raaml.fta.MAJORITY_VOTE#getM <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>M</em>' attribute.
	 * @see #getM()
	 * @generated
	 */
	void setM(int value);

} // MAJORITY_VOTE
