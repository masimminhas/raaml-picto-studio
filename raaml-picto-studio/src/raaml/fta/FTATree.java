/**
 */
package raaml.fta;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA Tree</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Complete fault tree structure
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.FTATree#getTopEvent <em>Top Event</em>}</li>
 *   <li>{@link raaml.fta.FTATree#getGates <em>Gates</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getFTATree()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='FTATree'"
 * @generated
 */
public interface FTATree extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Top Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Event</em>' containment reference.
	 * @see #setTopEvent(Event)
	 * @see raaml.fta.FtaPackage#getFTATree_TopEvent()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getTopEvent();

	/**
	 * Sets the value of the '{@link raaml.fta.FTATree#getTopEvent <em>Top Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Event</em>' containment reference.
	 * @see #getTopEvent()
	 * @generated
	 */
	void setTopEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getFTATree_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

} // FTATree
