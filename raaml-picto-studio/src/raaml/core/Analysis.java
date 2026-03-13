/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Base class for all safety analysis types
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.Analysis#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAnalysis()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Package'"
 * @generated
 */
public interface Analysis extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety elements contained in this analysis
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see raaml.core.CorePackage#getAnalysis_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<CoreSafetyElement> getElements();

} // Analysis
