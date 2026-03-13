/**
 */
package raaml;

import org.eclipse.emf.common.util.EList;

import raaml.core.AbstractLibrary;
import raaml.core.Analysis;
import raaml.core.NamedElement;

import raaml.req.RequirementsModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root container for all safety analyses, libraries, and requirements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.SafetyAnalysis#getAnalyses <em>Analyses</em>}</li>
 *   <li>{@link raaml.SafetyAnalysis#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link raaml.SafetyAnalysis#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see raaml.RaamlPackage#getSafetyAnalysis()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' profile='RAAML'"
 * @generated
 */
public interface SafetyAnalysis extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Analyses</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.Analysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collection of safety analyses (FTA, FMEA, HARA, STPA, GSN)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Analyses</em>' containment reference list.
	 * @see raaml.RaamlPackage#getSafetyAnalysis_Analyses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Analysis> getAnalyses();

	/**
	 * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.core.AbstractLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reusable libraries of safety elements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Libraries</em>' containment reference list.
	 * @see raaml.RaamlPackage#getSafetyAnalysis_Libraries()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractLibrary> getLibraries();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.req.RequirementsModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Safety requirements and their relationships
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see raaml.RaamlPackage#getSafetyAnalysis_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementsModel> getRequirements();

} // SafetyAnalysis
