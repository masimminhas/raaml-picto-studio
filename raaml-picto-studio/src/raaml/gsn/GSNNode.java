/**
 */
package raaml.gsn;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSN Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class for all GSN nodes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.gsn.GSNNode#getNodeId <em>Node Id</em>}</li>
 * </ul>
 *
 * @see raaml.gsn.GsnPackage#getGSNNode()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface GSNNode extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Node Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique identifier for the GSN node (e.g., G1, S1, Sn1)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Id</em>' attribute.
	 * @see #setNodeId(String)
	 * @see raaml.gsn.GsnPackage#getGSNNode_NodeId()
	 * @model
	 * @generated
	 */
	String getNodeId();

	/**
	 * Sets the value of the '{@link raaml.gsn.GSNNode#getNodeId <em>Node Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Id</em>' attribute.
	 * @see #getNodeId()
	 * @generated
	 */
	void setNodeId(String value);

} // GSNNode
