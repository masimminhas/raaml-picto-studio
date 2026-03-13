/**
 */
package raaml.fta;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INHIBIT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Gate with conditional input
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.fta.INHIBIT#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see raaml.fta.FtaPackage#getINHIBIT()
 * @model annotation="http://edu.kit.sdq/raaml/metaclass base='Class' stereotype='INHIBIT'"
 * @generated
 */
public interface INHIBIT extends Gate {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link raaml.fta.Event}.
	 * It is bidirectional and its opposite is '{@link raaml.fta.Event#getInhibitGate <em>Inhibit Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see raaml.fta.FtaPackage#getINHIBIT_Condition()
	 * @see raaml.fta.Event#getInhibitGate
	 * @model opposite="inhibitGate"
	 * @generated
	 */
	EList<Event> getCondition();

} // INHIBIT
