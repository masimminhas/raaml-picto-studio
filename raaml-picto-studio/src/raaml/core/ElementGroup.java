/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A logical grouping of safety elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.ElementGroup#getGroupCriterion <em>Group Criterion</em>}</li>
 *   <li>{@link raaml.core.ElementGroup#getOrderedMembers <em>Ordered Members</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getElementGroup()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ElementGroup'"
 * @generated
 */
public interface ElementGroup extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Group Criterion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Criterion used to group elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Criterion</em>' attribute.
	 * @see #setGroupCriterion(String)
	 * @see raaml.core.CorePackage#getElementGroup_GroupCriterion()
	 * @model
	 * @generated
	 */
	String getGroupCriterion();

	/**
	 * Sets the value of the '{@link raaml.core.ElementGroup#getGroupCriterion <em>Group Criterion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Criterion</em>' attribute.
	 * @see #getGroupCriterion()
	 * @generated
	 */
	void setGroupCriterion(String value);

	/**
	 * Returns the value of the '<em><b>Ordered Members</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordered list of group members
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ordered Members</em>' reference list.
	 * @see raaml.core.CorePackage#getElementGroup_OrderedMembers()
	 * @model
	 * @generated
	 */
	EList<CoreSafetyElement> getOrderedMembers();

} // ElementGroup
