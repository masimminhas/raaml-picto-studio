/**
 */
package raaml.library;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractLibrary;
import raaml.core.AnySituation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>General Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A general-purpose library that can contain any type of situation elements for reuse across multiple safety analyses
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.library.GeneralLibrary#getAnySituations <em>Any Situations</em>}</li>
 * </ul>
 *
 * @see raaml.library.LibraryPackage#getGeneralLibrary()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='GeneralLibrary'"
 * @generated
 */
public interface GeneralLibrary extends AbstractLibrary {
	/**
	 * Returns the value of the '<em><b>Any Situations</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AnySituation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of reusable situation elements (factors, scenarios, events, etc.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any Situations</em>' containment reference list.
	 * @see raaml.library.LibraryPackage#getGeneralLibrary_AnySituations()
	 * @model containment="true"
	 * @generated
	 */
	EList<AnySituation> getAnySituations();

} // GeneralLibrary
