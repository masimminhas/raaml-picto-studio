/**
 */
package raaml.hazop;

import org.eclipse.emf.common.util.EList;

import raaml.core.CoreSafetyElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HAZOP Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A part of the system under analysis (e.g., 'Radar Sensor', 'ECU', 'Brake Actuator'). Holds the design intent and the deviations identified on it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hazop.HAZOPNode#getSubsystem <em>Subsystem</em>}</li>
 *   <li>{@link raaml.hazop.HAZOPNode#getDesignIntent <em>Design Intent</em>}</li>
 *   <li>{@link raaml.hazop.HAZOPNode#getDeviations <em>Deviations</em>}</li>
 * </ul>
 *
 * @see raaml.hazop.HazopPackage#getHAZOPNode()
 * @model
 * @generated
 */
public interface HAZOPNode extends CoreSafetyElement {
	/**
	 * Returns the value of the '<em><b>Subsystem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsystem</em>' attribute.
	 * @see #setSubsystem(String)
	 * @see raaml.hazop.HazopPackage#getHAZOPNode_Subsystem()
	 * @model
	 * @generated
	 */
	String getSubsystem();

	/**
	 * Sets the value of the '{@link raaml.hazop.HAZOPNode#getSubsystem <em>Subsystem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subsystem</em>' attribute.
	 * @see #getSubsystem()
	 * @generated
	 */
	void setSubsystem(String value);

	/**
	 * Returns the value of the '<em><b>Design Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Intent</em>' attribute.
	 * @see #setDesignIntent(String)
	 * @see raaml.hazop.HazopPackage#getHAZOPNode_DesignIntent()
	 * @model
	 * @generated
	 */
	String getDesignIntent();

	/**
	 * Sets the value of the '{@link raaml.hazop.HAZOPNode#getDesignIntent <em>Design Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Intent</em>' attribute.
	 * @see #getDesignIntent()
	 * @generated
	 */
	void setDesignIntent(String value);

	/**
	 * Returns the value of the '<em><b>Deviations</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hazop.Deviation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviations</em>' containment reference list.
	 * @see raaml.hazop.HazopPackage#getHAZOPNode_Deviations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deviation> getDeviations();

} // HAZOPNode
