/**
 */
package raaml.hara;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASIL Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ASIL assignment and override
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.ASILAssignment#getASIL <em>ASIL</em>}</li>
 *   <li>{@link raaml.hara.ASILAssignment#getASILOverride <em>ASIL Override</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getASILAssignment()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ASILAssignment'"
 * @generated
 */
public interface ASILAssignment extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>ASIL</b></em>' attribute.
	 * The literals are from the enumeration {@link raaml.hara.ASIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASIL</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #setASIL(ASIL)
	 * @see raaml.hara.HaraPackage#getASILAssignment_ASIL()
	 * @model required="true"
	 * @generated
	 */
	ASIL getASIL();

	/**
	 * Sets the value of the '{@link raaml.hara.ASILAssignment#getASIL <em>ASIL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ASIL</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #getASIL()
	 * @generated
	 */
	void setASIL(ASIL value);

	/**
	 * Returns the value of the '<em><b>ASIL Override</b></em>' attribute.
	 * The literals are from the enumeration {@link raaml.hara.ASIL}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ASIL Override</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #setASILOverride(ASIL)
	 * @see raaml.hara.HaraPackage#getASILAssignment_ASILOverride()
	 * @model
	 * @generated
	 */
	ASIL getASILOverride();

	/**
	 * Sets the value of the '{@link raaml.hara.ASILAssignment#getASILOverride <em>ASIL Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ASIL Override</em>' attribute.
	 * @see raaml.hara.ASIL
	 * @see #getASILOverride()
	 * @generated
	 */
	void setASILOverride(ASIL value);

} // ASILAssignment
