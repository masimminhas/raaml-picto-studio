/**
 */
package raaml.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Element Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An item that references a single element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.SingleElementItem#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getSingleElementItem()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='SingleElementItem'"
 * @generated
 */
public interface SingleElementItem extends Item {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referenced item element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(Item)
	 * @see raaml.core.CorePackage#getSingleElementItem_ReferencedElement()
	 * @model required="true"
	 * @generated
	 */
	Item getReferencedElement();

	/**
	 * Sets the value of the '{@link raaml.core.SingleElementItem#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(Item value);

} // SingleElementItem
