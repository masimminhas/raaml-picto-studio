/**
 */
package raaml.hara;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Operational Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Operational situation with exposure rating
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link raaml.hara.AbstractOperationalSituation#getExposure <em>Exposure</em>}</li>
 *   <li>{@link raaml.hara.AbstractOperationalSituation#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see raaml.hara.HaraPackage#getAbstractOperationalSituation()
 * @model abstract="true"
 *        annotation="http://edu.kit.sdq/raaml/metaclass base='Class'"
 * @generated
 */
public interface AbstractOperationalSituation extends OperationalCondition {
	/**
	 * Returns the value of the '<em><b>Exposure</b></em>' attribute.
	 * The literals are from the enumeration {@link raaml.hara.Exposure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exposure</em>' attribute.
	 * @see raaml.hara.Exposure
	 * @see #setExposure(Exposure)
	 * @see raaml.hara.HaraPackage#getAbstractOperationalSituation_Exposure()
	 * @model
	 * @generated
	 */
	Exposure getExposure();

	/**
	 * Sets the value of the '{@link raaml.hara.AbstractOperationalSituation#getExposure <em>Exposure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exposure</em>' attribute.
	 * @see raaml.hara.Exposure
	 * @see #getExposure()
	 * @generated
	 */
	void setExposure(Exposure value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link raaml.hara.OperationalCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see raaml.hara.HaraPackage#getAbstractOperationalSituation_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationalCondition> getConditions();

} // AbstractOperationalSituation
