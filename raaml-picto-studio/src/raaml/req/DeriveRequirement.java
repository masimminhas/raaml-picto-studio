/**
 */
package raaml.req;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derive Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relationship indicating one requirement is derived from another
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.DeriveRequirement#getSource <em>Source</em>}</li>
 *   <li>{@link raaml.req.DeriveRequirement#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see raaml.req.ReqPackage#getDeriveRequirement()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Abstraction' stereotype='DeriveRequirement'"
 * @generated
 */
public interface DeriveRequirement extends Abstraction {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Requirement)
	 * @see raaml.req.ReqPackage#getDeriveRequirement_Source()
	 * @model required="true"
	 * @generated
	 */
	Requirement getSource();

	/**
	 * Sets the value of the '{@link raaml.req.DeriveRequirement#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Requirement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Requirement)
	 * @see raaml.req.ReqPackage#getDeriveRequirement_Target()
	 * @model required="true"
	 * @generated
	 */
	Requirement getTarget();

	/**
	 * Sets the value of the '{@link raaml.req.DeriveRequirement#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Requirement value);

} // DeriveRequirement
