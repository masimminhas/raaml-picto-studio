/**
 */
package raaml.fta;

import org.eclipse.emf.common.util.EList;

import raaml.core.Analysis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for Fault Tree Analysis
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.FTA#getGates <em>Gates</em>}</li>
 *   <li>{@link raaml.fta.FTA#getEvents <em>Events</em>}</li>
 *   <li>{@link raaml.fta.FTA#getTrees <em>Trees</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getFTA()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Package' stereotype='FTA'"
 * @generated
 */
public interface FTA extends Analysis {
	/**
	 * Returns the value of the '<em><b>Gates</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.Gate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gates</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getFTA_Gates()
	 * @model containment="true"
	 * @generated
	 */
	EList<Gate> getGates();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getFTA_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Trees</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.fta.FTATree}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trees</em>' containment reference list.
	 * @see raaml.fta.FtaPackage#getFTA_Trees()
	 * @model containment="true"
	 * @generated
	 */
	EList<FTATree> getTrees();

} // FTA
