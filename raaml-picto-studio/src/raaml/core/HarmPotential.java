/**
 */
package raaml.core;

import org.eclipse.emf.common.util.EList;

import raaml.stpa.UndesiredControlAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Harm Potential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Potential for harm or adverse effects
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.core.HarmPotential#getUndesiredControlAction <em>Undesired Control Action</em>}</li>
 * </ul>
 *
 * @see raaml.core.CorePackage#getHarmPotential()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='HarmPotential'"
 * @generated
 */
public interface HarmPotential extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Undesired Control Action</b></em>' reference list.
	 * The list contents are of type {@link raaml.stpa.UndesiredControlAction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Undesired control actions with this harm potential
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Undesired Control Action</em>' reference list.
	 * @see raaml.core.CorePackage#getHarmPotential_UndesiredControlAction()
	 * @model
	 * @generated
	 */
	EList<UndesiredControlAction> getUndesiredControlAction();

} // HarmPotential
