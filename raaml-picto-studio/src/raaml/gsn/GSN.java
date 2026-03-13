/**
 */
package raaml.gsn;

import org.eclipse.emf.common.util.EList;

import raaml.core.Analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for Goal Structuring Notation analysis and safety cases
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.gsn.GSN#getContextualInformation <em>Contextual Information</em>}</li>
 *   <li>{@link raaml.gsn.GSN#getGsnNodes <em>Gsn Nodes</em>}</li>
 *   <li>{@link raaml.gsn.GSN#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link raaml.gsn.GSN#getInContextOf <em>In Context Of</em>}</li>
 * </ul>
 *
 * @see raaml.gsn.GsnPackage#getGSN()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='GSN'"
 * @generated
 */
public interface GSN extends Analysis {
	/**
	 * Returns the value of the '<em><b>Contextual Information</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.gsn.ContextualInformation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contextual information elements (context, assumptions, justifications)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contextual Information</em>' containment reference list.
	 * @see raaml.gsn.GsnPackage#getGSN_ContextualInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContextualInformation> getContextualInformation();

	/**
	 * Returns the value of the '<em><b>Gsn Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.gsn.GSNNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * GSN nodes (goals, strategies, solutions)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gsn Nodes</em>' containment reference list.
	 * @see raaml.gsn.GsnPackage#getGSN_GsnNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GSNNode> getGsnNodes();

	/**
	 * Returns the value of the '<em><b>Supported By</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.gsn.SupportedBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SupportedBy relationships between nodes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supported By</em>' containment reference list.
	 * @see raaml.gsn.GsnPackage#getGSN_SupportedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<SupportedBy> getSupportedBy();

	/**
	 * Returns the value of the '<em><b>In Context Of</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.gsn.InContextOf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InContextOf relationships linking nodes to context
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Context Of</em>' containment reference list.
	 * @see raaml.gsn.GsnPackage#getGSN_InContextOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<InContextOf> getInContextOf();

} // GSN
