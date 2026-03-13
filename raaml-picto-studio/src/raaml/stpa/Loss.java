/**
 */
package raaml.stpa;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A loss representing something of value that could be lost
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.Loss#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getLoss()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Loss'"
 * @generated
 */
public interface Loss extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Category of loss (life, property, mission, etc.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see raaml.stpa.StpaPackage#getLoss_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link raaml.stpa.Loss#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

} // Loss
