/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for reusable libraries of safety elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AbstractLibrary#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAbstractLibrary()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Package'"
 * @generated
 */
public interface AbstractLibrary extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reusable safety elements in this library
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see raaml.core.CorePackage#getAbstractLibrary_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoreSafetyElement> getElements();

} // AbstractLibrary
