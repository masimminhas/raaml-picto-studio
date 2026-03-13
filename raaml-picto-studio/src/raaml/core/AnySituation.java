/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Extended situation with causal relationships
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.AnySituation#getFrom <em>From</em>}</li>
 *   <li>{@link raaml.core.AnySituation#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getAnySituation()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AnySituation extends Situation {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.AnySituation}.
	 * It is bidirectional and its opposite is '{@link raaml.core.AnySituation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Situations that lead to this situation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see raaml.core.CorePackage#getAnySituation_From()
	 * @see raaml.core.AnySituation#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<AnySituation> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.AnySituation}.
	 * It is bidirectional and its opposite is '{@link raaml.core.AnySituation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Situations that result from this situation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see raaml.core.CorePackage#getAnySituation_To()
	 * @see raaml.core.AnySituation#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<AnySituation> getTo();

} // AnySituation
