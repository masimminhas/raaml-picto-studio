/**
 */
package raaml.stpa;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;
import raaml.core.Factor;
import raaml.core.HarmPotential;
import raaml.core.ProcessModelFlaw;
import raaml.core.Scenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undesired Control Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An unsafe or undesired control action
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.stpa.UndesiredControlAction#getControlAction <em>Control Action</em>}</li>
 *   <li>{@link raaml.stpa.UndesiredControlAction#getUnsafeType <em>Unsafe Type</em>}</li>
 *   <li>{@link raaml.stpa.UndesiredControlAction#getProcessModelFlaw <em>Process Model Flaw</em>}</li>
 *   <li>{@link raaml.stpa.UndesiredControlAction#getHarmPotential <em>Harm Potential</em>}</li>
 *   <li>{@link raaml.stpa.UndesiredControlAction#getCausalFactors <em>Causal Factors</em>}</li>
 *   <li>{@link raaml.stpa.UndesiredControlAction#getScenarios <em>Scenarios</em>}</li>
 * </ul>
 *
 * @see raaml.stpa.StpaPackage#getUndesiredControlAction()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='UndesiredControlAction'"
 * @generated
 */
public interface UndesiredControlAction extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Control Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The control action that is unsafe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Control Action</em>' reference.
	 * @see #setControlAction(ControlAction)
	 * @see raaml.stpa.StpaPackage#getUndesiredControlAction_ControlAction()
	 * @model required="true"
	 * @generated
	 */
	ControlAction getControlAction();

	/**
	 * Sets the value of the '{@link raaml.stpa.UndesiredControlAction#getControlAction <em>Control Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Action</em>' reference.
	 * @see #getControlAction()
	 * @generated
	 */
	void setControlAction(ControlAction value);

	/**
	 * Returns the value of the '<em><b>Unsafe Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of unsafe action (not provided, provided, wrong, etc.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unsafe Type</em>' attribute.
	 * @see #setUnsafeType(String)
	 * @see raaml.stpa.StpaPackage#getUndesiredControlAction_UnsafeType()
	 * @model
	 * @generated
	 */
	String getUnsafeType();

	/**
	 * Sets the value of the '{@link raaml.stpa.UndesiredControlAction#getUnsafeType <em>Unsafe Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsafe Type</em>' attribute.
	 * @see #getUnsafeType()
	 * @generated
	 */
	void setUnsafeType(String value);

	/**
	 * Returns the value of the '<em><b>Process Model Flaw</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.ProcessModelFlaw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Process model flaws causing this unsafe action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Model Flaw</em>' reference list.
	 * @see raaml.stpa.StpaPackage#getUndesiredControlAction_ProcessModelFlaw()
	 * @model
	 * @generated
	 */
	EList<ProcessModelFlaw> getProcessModelFlaw();

	/**
	 * Returns the value of the '<em><b>Harm Potential</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.HarmPotential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Harm potential associated with this unsafe action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Harm Potential</em>' reference list.
	 * @see raaml.stpa.StpaPackage#getUndesiredControlAction_HarmPotential()
	 * @model
	 * @generated
	 */
	EList<HarmPotential> getHarmPotential();

	/**
	 * Returns the value of the '<em><b>Causal Factors</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.Factor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Causal factors leading to this unsafe action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Causal Factors</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getUndesiredControlAction_CausalFactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Factor> getCausalFactors();

	/**
	 * Returns the value of the '<em><b>Scenarios</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.Scenario}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scenarios leading to this unsafe action
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scenarios</em>' containment reference list.
	 * @see raaml.stpa.StpaPackage#getUndesiredControlAction_Scenarios()
	 * @model containment="true"
	 * @generated
	 */
	EList<Scenario> getScenarios();

} // UndesiredControlAction
