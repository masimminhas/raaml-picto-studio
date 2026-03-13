/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A system component or element under analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.Item#getMembers <em>Members</em>}</li>
 *   <li>{@link raaml.core.Item#getBoundaryMembers <em>Boundary Members</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getItem()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Item'"
 * @generated
 */
public interface Item extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Internal components of the item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see raaml.core.CorePackage#getItem_Members()
	 * @model
	 * @generated
	 */
	EList<CoreSafetyElement> getMembers();

	/**
	 * Returns the value of the '<em><b>Boundary Members</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements at the boundary of the item
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boundary Members</em>' reference list.
	 * @see raaml.core.CorePackage#getItem_BoundaryMembers()
	 * @model
	 * @generated
	 */
	EList<CoreSafetyElement> getBoundaryMembers();

} // Item
