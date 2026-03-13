/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A causal factor contributing to hazards or failures
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.Factor#getProcessModelFlaw <em>Process Model Flaw</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getFactor()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Factor'"
 * @generated
 */
public interface Factor extends AnySituation {
	/**
	 * Returns the value of the '<em><b>Process Model Flaw</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.ProcessModelFlaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Process model flaws caused by this factor
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Model Flaw</em>' reference list.
	 * @see raaml.core.CorePackage#getFactor_ProcessModelFlaw()
	 * @model
	 * @generated
	 */
	EList<ProcessModelFlaw> getProcessModelFlaw();

} // Factor
