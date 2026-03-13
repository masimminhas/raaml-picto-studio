/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for directed relationships between safety elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.DirectedRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link raaml.core.DirectedRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getDirectedRelationship()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Dependency'"
 * @generated
 */
public interface DirectedRelationship extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source elements of the relationship
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see raaml.core.CorePackage#getDirectedRelationship_Source()
	 * @model
	 * @generated
	 */
	EList<CoreSafetyElement> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Target elements of the relationship
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see raaml.core.CorePackage#getDirectedRelationship_Target()
	 * @model
	 * @generated
	 */
	EList<CoreSafetyElement> getTarget();

} // DirectedRelationship
