/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Model Flaw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A flaw in the control process model (STPA)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.ProcessModelFlaw#getCausalFactor <em>Causal Factor</em>}</li>
 *   <li>{@link raaml.core.ProcessModelFlaw#getUndesiredControlAction <em>Undesired Control Action</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getProcessModelFlaw()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='ProcessModelFlaw'"
 * @generated
 */
public interface ProcessModelFlaw extends AnySituation {
	/**
	 * Returns the value of the '<em><b>Causal Factor</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Causal factors of this process model flaw
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causal Factor</em>' reference list.
	 * @see raaml.core.CorePackage#getProcessModelFlaw_CausalFactor()
	 * @model
	 * @generated
	 */
	EList<Factor> getCausalFactor();

	/**
	 * Returns the value of the '<em><b>Undesired Control Action</b></em>' reference list.
	 * The list contents are of type {@link raaml.stpa.UndesiredControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Undesired control actions resulting from this flaw
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesired Control Action</em>' reference list.
	 * @see raaml.core.CorePackage#getProcessModelFlaw_UndesiredControlAction()
	 * @model
	 * @generated
	 */
	EList<UndesiredControlAction> getUndesiredControlAction();

} // ProcessModelFlaw
