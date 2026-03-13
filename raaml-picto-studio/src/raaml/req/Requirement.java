/**
 */
package raaml.req;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A safety requirement specification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.req.Requirement#getText <em>Text</em>}</li>
 *   <li>{@link raaml.req.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link raaml.req.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link raaml.req.Requirement#getStatus <em>Status</em>}</li>
 *   <li>{@link raaml.req.Requirement#getRelatedElements <em>Related Elements</em>}</li>
 *   <li>{@link raaml.req.Requirement#getParentRequirement <em>Parent Requirement</em>}</li>
 *   <li>{@link raaml.req.Requirement#getChildRequirements <em>Child Requirements</em>}</li>
 * </ul>
 *
 * @see raaml.req.ReqPackage#getRequirement()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='Requirement'"
 * @generated
 */
public interface Requirement extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requirement text
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see raaml.req.ReqPackage#getRequirement_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link raaml.req.Requirement#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Type of requirement (functional, safety, etc.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see raaml.req.ReqPackage#getRequirement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link raaml.req.Requirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Priority level (high, medium, low)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(String)
	 * @see raaml.req.ReqPackage#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	String getPriority();

	/**
	 * Sets the value of the '{@link raaml.req.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Current status (proposed, approved, implemented, verified)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see raaml.req.ReqPackage#getRequirement_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link raaml.req.Requirement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Related Elements</b></em>' reference list.
	 * The list contents are of type {@link raaml.core.CoreSafetyElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elements related to this requirement
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Elements</em>' reference list.
	 * @see raaml.req.ReqPackage#getRequirement_RelatedElements()
	 * @model
	 * @generated
	 */
	EList<CoreSafetyElement> getRelatedElements();

	/**
	 * Returns the value of the '<em><b>Parent Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parent requirement in the hierarchy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Requirement</em>' reference.
	 * @see #setParentRequirement(Requirement)
	 * @see raaml.req.ReqPackage#getRequirement_ParentRequirement()
	 * @model
	 * @generated
	 */
	Requirement getParentRequirement();

	/**
	 * Sets the value of the '{@link raaml.req.Requirement#getParentRequirement <em>Parent Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Requirement</em>' reference.
	 * @see #getParentRequirement()
	 * @generated
	 */
	void setParentRequirement(Requirement value);

	/**
	 * Returns the value of the '<em><b>Child Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.req.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Child requirements in the hierarchy
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child Requirements</em>' containment reference list.
	 * @see raaml.req.ReqPackage#getRequirement_ChildRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getChildRequirements();

} // Requirement
